package com.example.concourcedemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConcourseDemoApplicationTests {

	@Test
	public void testGetHello() {
		System.out.println("Hello from test");
	}

}
