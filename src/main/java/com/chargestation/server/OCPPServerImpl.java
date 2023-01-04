package com.chargestation.server;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OCPPServerImpl {
    static Map eventData = new HashMap();

    public static void main(String[] args) throws InterruptedException, IOException {


        Draft_6455 draft_ocppOnly = new Draft_6455(Collections.<IExtension>emptyList(),
                Collections.<IProtocol>singletonList(new Protocol("ocpp2.0")));

        // This draft allows the specific Sec-WebSocket-Protocol and also provides a fallback, if the other endpoint does not accept the specific Sec-WebSocket-Protocol
        ArrayList<IProtocol> protocols = new ArrayList<IProtocol>();
        protocols.add(new Protocol("ocpp2.0"));
        protocols.add(new Protocol(""));
        Draft_6455 draft_ocppAndFallBack = new Draft_6455(Collections.<IExtension>emptyList(),
                protocols);

        OCCPConsumerServer cs = new OCCPConsumerServer(8887, draft_ocppOnly);

        OCCPConsumerServer ps = new OCCPConsumerServer(8888, draft_ocppOnly);


        cs.start();
        ps.start();
        System.out.println("ChatServer started on port: " + cs.getPort());
        System.out.println("ChatServer started on port: " + ps.getPort());
        while (true) {
        }
    }
}
