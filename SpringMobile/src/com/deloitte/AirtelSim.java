package com.deloitte;

public class AirtelSim implements Sim{
	private float callCharge;
	private float speed;
	private MessageSender ms;
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("from airtel sim");
		
	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("from airtel sim");
		
	}
	

	public float getCallCharge() {
		return callCharge;
	}
	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public MessageSender getMs() {
		return ms;
	}
	public void setMs(MessageSender ms) {
		this.ms = ms;
	}
	@Override
	public void browse() {
		System.out.println("browsing with airtel.....with speed"+speed+"mbps");
		
	}
	@Override
	public void call() {
		System.out.println("calling with airtel.....with callcharge"+callCharge+"rs");

		
}
	
	
	}
	







