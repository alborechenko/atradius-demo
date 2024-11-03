package com.atradius.demo.coffe;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.atradius.demo.coffe.controller.PaymentsController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CoffeApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	PaymentsController controller;

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	public void getPaymentsTotalByUserAPI() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/payments/getPaymentsTotalByUser").param("userName", "coach")
				.accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.data").exists());
	}

	@Test
	public void getPaymentsTotalByUserAPIError() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/payments/getPaymentsTotalByUser").param("userName", "error")
				.accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isBadRequest())
				.andExpect(MockMvcResultMatchers.jsonPath("$.message").exists());
	}

	@Test
	public void getPaymentsUsersOwesAPI() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/payments/getPaymentsUsersOwes").accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.data").exists());
	}

}
