package com.javademo.jenkinsfortesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsForTestingApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void checking() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);  
	}
}
