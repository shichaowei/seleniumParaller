package org.wsc.testenum;

import org.omg.Messaging.SyncScopeHelper;

enum Signal {
	GREEN, YELLOW, RED
}
public class TrafficLight {
	Signal color = Signal.RED;
	
	
	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			System.out.println(color);
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
	}
	

}
