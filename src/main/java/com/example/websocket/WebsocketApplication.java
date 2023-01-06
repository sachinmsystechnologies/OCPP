package com.example.websocket;

import com.chargestation.server.OCCPConsumerServer;
import com.chargestation.server.OCCPProducerServer;
import com.chargestation.server.model.common.OCCPServerMessage;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

@SpringBootApplication

public class WebsocketApplication implements CommandLineRunner {

    public static BlockingQueue<OCCPServerMessage> queue =new LinkedBlockingDeque<OCCPServerMessage >( ) ;

    private static Logger LOG = LoggerFactory
            .getLogger(WebsocketApplication.class);
    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(WebsocketApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }


    @Override
    public void run(String... args) {
        Draft_6455 draft_ocppOnly = new Draft_6455(Collections.<IExtension>emptyList(),
                Collections.<IProtocol>singletonList(new Protocol("ocpp2.0")));

        // This draft allows the specific Sec-WebSocket-Protocol and also provides a fallback, if the other endpoint does not accept the specific Sec-WebSocket-Protocol
        ArrayList<IProtocol> protocols = new ArrayList<IProtocol>();
        protocols.add(new Protocol("ocpp2.0"));
        protocols.add(new Protocol(""));
        Draft_6455 draft_ocppAndFallBack = new Draft_6455(Collections.<IExtension>emptyList(),
                protocols);

        OCCPConsumerServer cs = new OCCPConsumerServer(8887, draft_ocppOnly);

        OCCPProducerServer ps  = new OCCPProducerServer(8888, draft_ocppOnly);


        cs.start();
        ps.start();

        System.out.println("ChatServer started on port: " + cs.getPort());
        System.out.println("ChatServer started on port: " + ps.getPort());



    }
}
