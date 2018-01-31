package com.wps.toling.mvctest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class DemoControllerTest {

	private static final String RAMEN = "Ramen";
	private MockMvc demoControllerMockMvc;

	@Before
	public void before() {
		demoControllerMockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
	}

	@Test
	public void getNode() throws Exception {
		demoControllerMockMvc.perform(get("/api/nodes/{label}", RAMEN)).andExpect(status().isOk()).andExpect(
				content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)).andExpect(
				jsonPath("$.label").value(RAMEN)).andExpect(jsonPath("$.active").isBoolean());
	}

}
