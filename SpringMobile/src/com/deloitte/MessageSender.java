package com.deloitte;

public class MessageSender {
	private float mmsCharge;
	private float smsCharge;
	public float getMmsCharge() {
		return mmsCharge;
	}
	public void setMmsCharge(float mmsCharge) {
		this.mmsCharge = mmsCharge;
	}
	public float getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public void sendSms()
	{
		System.out.println("sms sent..........charged"+ smsCharge);
	}
	public void sendMms()
	{
		System.out.println("Mms sent..........charged"+ mmsCharge);
	}
	
}
