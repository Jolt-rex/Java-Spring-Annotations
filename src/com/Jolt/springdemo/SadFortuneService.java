package com.Jolt.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not you're day";
	}

}
