package A.tp.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import A.tp.tp5.model.AdresseJSON.AdresseEtalab;
import A.tp.tp5.model.MeteoJSON.WeatherResult;

@Controller
public class MeteoController {
	
	private final static String APIKey = "058ce7f157a747fa866fe6e6004808bc";
	
	@PostMapping("/meteo")
	public String servePage(@RequestParam(name="query", required=true) String adresse, Model model) {
		String url = String.format("https://api-adresse.data.gouv.fr/search/?q=\"%s\"&limit=1", adresse);
		double reponse_gps[] = new RestTemplate().getForObject(url, AdresseEtalab.class).features[0].geometry.coordinates;
		
		url = String.format("http://api.openweathermap.org/data/2.5/weather?lon=%f&lat=%f&appid=%s&lang=fr&units=metric", reponse_gps[0], reponse_gps[1], MeteoController.APIKey );
		WeatherResult reponse_meteo = new RestTemplate().getForObject(url, WeatherResult.class);
		
		String prevision = reponse_meteo.weather[0].description;
		double temperature = reponse_meteo.main.temp; 
		
		model.addAttribute("gps_x", reponse_gps[0]);
		model.addAttribute("gps_y", reponse_gps[1]);
		model.addAttribute("prevision", prevision);
		model.addAttribute("temperature", temperature);
		model.addAttribute("query", adresse);
		return "meteo";
	}
	

}
