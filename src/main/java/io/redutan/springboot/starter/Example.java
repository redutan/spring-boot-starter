package io.redutan.springboot.starter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by redutan on 15. 9. 10..
 */
@RestController
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
