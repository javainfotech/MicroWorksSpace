package com.javainfotech.limits.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

	
	private int maxmum;
	private int minmum;
	
	
	public LimitsConfiguration(int maxmum, int minmum) {
		super();
		this.maxmum = maxmum;
		this.minmum = minmum;
	}

	private LimitsConfiguration() {}
	
	public int getMaxmum() {
		return maxmum;
	}
	public void setMaxmum(int maxmum) {
		this.maxmum = maxmum;
	}
	public int getMinmum() {
		return minmum;
	}
	public void setMinmum(int minmum) {
		this.minmum = minmum;
	}
}
