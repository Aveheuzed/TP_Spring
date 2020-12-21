package A.tp.tp5.model.MeteoJSON;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherResult {
	public Coordinates coord;
	public Weather[] weather;
	public String base;
	public Main main;
	public int visibility;
	public Wind wind;
	public HashMap<String, Double> rain;
	public HashMap<String, Double> snow;
	public HashMap<String, Integer> clouds;
	public int dt;
	public Sys sys;
	public int timezone;
	public int id;
	public String name;
	public int cod;
}
