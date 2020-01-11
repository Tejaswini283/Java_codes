package com.deloitte;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("ms")
	public MessageSender getMsBean() {
		MessageSender ms=new MessageSender();
		ms.setMmsCharge(5.2f);
		ms.setMmsCharge(2.5f);
		return ms;
	}
	@Bean("airtel")
	public AirtelSim getAirtelSimBean() {
		AirtelSim sim=new AirtelSim();
		sim.setCallCharge(1.5f);
		sim.setSpeed(10f);
		sim.setMs(getMsBean());
		return sim;
	}
	@Bean("jio")
	public JioSim getJioSimBean() {
		JioSim sim=new JioSim();
		sim.setCallCharge(1.5f);
		sim.setSpeed(20f);
		sim.setMs(getMsBean());
		return sim;
}
}
