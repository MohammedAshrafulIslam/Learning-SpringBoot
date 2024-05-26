package io.javabrains.springbootstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class PaymentController {
	
	@GetMapping("/payment")
	public String getForm() {
		return "payment";
	}
	
}
