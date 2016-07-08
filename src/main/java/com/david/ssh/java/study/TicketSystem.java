package com.david.ssh.java.study;

public class TicketSystem {
   public static void main(String[] args) {
	   SellThread st= new SellThread();
	    new Thread(st).start();
	    new Thread(st).start();
	    new Thread(st).start();
   }
}
