package com.Jolt.springdemo;

import org.springframework.stereotype.Component;


// default bean id will be tennisCoach
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
