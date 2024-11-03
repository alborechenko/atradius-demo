package com.atradius.demo.coffe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;

import com.atradius.demo.coffe.controller.PaymentsController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CoffeApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	PaymentsController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
