package org.paulkim.chapter2.javaprofileconfig;


public class Message {
	public String text;
	
	public Message() {}
	
	public Message(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
}