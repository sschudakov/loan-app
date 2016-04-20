package io.fourfinanceit.homework.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class RouteController {

	@RequestMapping(value = "/success", method = GET)
    public String success() {
        return "success";
    }

	@RequestMapping(value = "/reject", method = GET)
	public String reject() {
		return "reject";
	}
}
