package com.wps.toling.mvctest.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wps.toling.mvctest.model.Node;

@RestController
@RequestMapping("/api")
public class DemoController {

	private static final Random RANDOM = new Random();

	@GetMapping("/nodes/{label}")
	public Node getNode(@PathVariable String label) {
		return new Node(label, RANDOM.nextBoolean());
	}

}
