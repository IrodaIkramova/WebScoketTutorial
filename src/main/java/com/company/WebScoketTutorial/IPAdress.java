package com.company.WebScoketTutorial;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAdress {
    public static void main(String[] args) {
        try {
            InetAddress myId= InetAddress.getLocalHost();
            System.out.println(myId);
            System.out.println(myId.getHostName());
            System.out.println(myId.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
