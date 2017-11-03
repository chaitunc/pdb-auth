package org.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientConfig {

	@Value("${info.foo2}")
	private String infoProperty;

	@RequestMapping("/")
	public PropertyModel home() {
		PropertyModel i = new PropertyModel();
		i.setInfoProp("Hello " + infoProperty);
		return i;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientConfig.class, args);

	}

}
