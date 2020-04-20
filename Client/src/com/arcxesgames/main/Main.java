package com.arcxesgames.main;

import com.arcxesgames.packets.AddConnectionPacket;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("87.164.159.1",5000);
		client.connect();
		
		AddConnectionPacket packet = new AddConnectionPacket();
		client.sendObject(packet);
		
		client.sendObject("hallo");
	}

}
