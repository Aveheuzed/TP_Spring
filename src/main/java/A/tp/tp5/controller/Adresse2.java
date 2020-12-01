package A.tp.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Adresse2 {
		
	@GetMapping("/adresse2")
	public String requestForm(Model model) {
		return "adresse2";
	}
}
