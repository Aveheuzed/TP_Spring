package A.tp.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import A.tp.tp5.model.AdresseEtalab;

@Controller
public class MeteoController {
	
	@PostMapping("/meteo")
	public String servePage(@RequestParam(name="query", required=true) String adresse, Model model) {
		String url = String.format("https://api-adresse.data.gouv.fr/search/?q=\"%s\"&limit=1", adresse);
		double response[] = new RestTemplate().getForObject(url, AdresseEtalab.class).features[0].geometry.coordinates;
		model.addAttribute("gps_x", response[0]);
		model.addAttribute("gps_y", response[1]);
		model.addAttribute("query", adresse);
		return "meteo";
	}
	

}
