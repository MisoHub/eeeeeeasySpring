package org.paulkim.chapter2.userdefinebean;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessagePrinter {

	public Message message;
	public ArrayList<String> receivers;

	public MessagePrinter() {}
	
	public MessagePrinter(Message message) {
		this.message = message;
		this.receivers = new ArrayList<String>();
		receivers.add("anyone");
	}
	
	public MessagePrinter(Message message, ArrayList<String> receivers) {
		this.message = message;
		this.receivers = receivers;
	}
	
	public void setReceivers(ArrayList<String> receivers) {
		this.receivers = receivers;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

	public void printMessage() {
		for(String s : receivers) {
			System.out.println("TO."+ s +" : "+this.message.getText());
		}
	}

}
