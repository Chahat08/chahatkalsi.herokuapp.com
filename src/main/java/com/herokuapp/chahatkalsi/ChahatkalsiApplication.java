package com.herokuapp.chahatkalsi;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ChahatkalsiApplication {

	private static String projectUrl = "https://en.wikipedia.org/wiki/Burkhan_Khaldun";

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public void method(HttpServletResponse httpServletResponse) {
		httpServletResponse.setHeader("Location", this.projectUrl);
		httpServletResponse.setStatus(302);
	}

	public static void main(String[] args) {
		SpringApplication.run(ChahatkalsiApplication.class, args);
	}

}
