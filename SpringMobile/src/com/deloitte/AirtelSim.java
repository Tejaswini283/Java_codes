package com.deloitte;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;



@Component("airtel")

public class AirtelSim implements Sim {



	@Value("${airtel.callCharge}")

	private float callCharge;

	@Value("${airtel.speed}")

	private float speed;

	@Autowired

	@Qualifier("alternateMS")

	private MessageSender ms;

	

	public void sendSms() {

		ms.sendSms();

		System.out.println("From Airtel");

	}

	public void sendMms() {

		ms.sendMms();

		System.out.println("From Airtel");

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

	@Override

	public void browse() {

		System.out.println("Browing with Airtel...Speed "+speed+" mb/s");

		

	}

	@Override

	public void call() {

		System.out.println("Calling with Airtel...Charges "+callCharge+" /min");

		

	}

}