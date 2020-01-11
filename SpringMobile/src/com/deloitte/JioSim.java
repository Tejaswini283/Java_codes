package com.deloitte;

public  class JioSim implements Sim {
	private float callCharge;
	private float speed;
	private MessageSender ms;
	public void sendSms() {
		ms.sendSms();
		System.out.println("from jio sim");
		
	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("from jio sim");
		
	}
	
	public MessageSender getMs() {
		return ms;
	}
	public void setMs(MessageSender ms) {
		this.ms = ms;
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
//	@Override
//	public void browse() {
//		System.out.println("browsing with jio");
//		
//	}
//	@Override
//	public void call() {
//		System.out.println("calling with jio");


@Override
public void browse() {
	System.out.println("browsing with jio.....with speed"+speed+"mbps");
	
}
@Override
public void call() {
	System.out.println("calling with jio.....with callcharge"+callCharge+"rs");
	
}
}


