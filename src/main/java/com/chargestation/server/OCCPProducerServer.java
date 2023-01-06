package com.chargestation.server;/*
 * Copyright (c) 2010-2020 Nathan Rajlich
 *
 *  Permission is hereby granted, free of charge, to any person
 *  obtaining a copy of this software and associated documentation
 *  files (the "Software"), to deal in the Software without
 *  restriction, including without limitation the rights to use,
 *  copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following
 *  conditions:
 *
 *  The above copyright notice and this permission notice shall be
 *  included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 *  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE.
 */

import com.chargestation.server.model.auth.request.AuthorizeRequest;
import com.chargestation.server.model.common.OCPPRequest;
import com.chargestation.server.model.statusnotification.request.StatusNotificationRequest;
import com.chargestation.server.model.transactionevent.request.TransactionEventRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.chargestation.server.OCPPServerImpl.eventData;

/**
 * A simple WebSocketServer implementation. Keeps track of a "chatroom".
 */


public class OCCPProducerServer extends WebSocketServer {



  public OCCPProducerServer(int port) throws UnknownHostException {
    super(new InetSocketAddress(port));
  }

  public OCCPProducerServer(InetSocketAddress address) {
    super(address);
  }

  public OCCPProducerServer(int port, Draft_6455 draft) {
    super(new InetSocketAddress(port), Collections.<Draft>singletonList(draft));
  }

  @Override
  public void onOpen(WebSocket conn, ClientHandshake handshake) {
    conn.send("Welcome to the server!"); //This method sends a message to the new client
    broadcast("new connection: " + handshake
        .getResourceDescriptor()); //This method sends a message to all clients connected
    System.out.println(
        conn.getRemoteSocketAddress().getAddress().getHostAddress() + " entered the room!");

  }

  @Override
  public void onClose(WebSocket conn, int code, String reason, boolean remote) {
    //broadcast(conn + " has left the room!");
    System.out.println(conn + " has left the room!");
  }


  @Override
  public void onMessage(WebSocket conn, String message) {
  //  broadcast(message);
  while(true)
    conn.send("check response");


  }

  @Override
  public void onMessage(WebSocket conn, ByteBuffer message) {
   broadcast(message.array());
    conn.send("Got It");
    System.out.println(conn + ": " + message);
  }


  public static void main(String[] args) throws InterruptedException, IOException {
/*    int port = 8887; // 843 flash policy port
    try {
      port = Integer.parseInt(args[0]);
    } catch (Exception ex) {
    }
    ChatServer s = new ChatServer(port);*/

  /*  Draft_6455 draft_ocppOnly = new Draft_6455(Collections.<IExtension>emptyList(),
            Collections.<IProtocol>singletonList(new Protocol("ocpp2.0")));

    // This draft allows the specific Sec-WebSocket-Protocol and also provides a fallback, if the other endpoint does not accept the specific Sec-WebSocket-Protocol
    ArrayList<IProtocol> protocols = new ArrayList<IProtocol>();
    protocols.add(new Protocol("ocpp2.0"));
    protocols.add(new Protocol(""));
    Draft_6455 draft_ocppAndFallBack = new Draft_6455(Collections.<IExtension>emptyList(),
            protocols);

    OCCPServer s = new OCCPServer(8887, draft_ocppOnly);

    OCCPServer s = new OCCPServer(8887, draft_ocppOnly);
    s.start();
    System.out.println("ChatServer started on port: " + s.getPort());
    while (true) {
    }*/
  }

  @Override
  public void onError(WebSocket conn, Exception ex) {
    ex.printStackTrace();
    if (conn != null) {
      // some errors like port binding failed may not be assignable to a specific websocket
    }
  }

  @Override
  public void onStart() {
    System.out.println("Server started!");
    setConnectionLostTimeout(0);
    setConnectionLostTimeout(100);
  }

}
