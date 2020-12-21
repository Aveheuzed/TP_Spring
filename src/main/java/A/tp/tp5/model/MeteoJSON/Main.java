package A.tp.tp5.model.MeteoJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Main {
	public double temp;
	public double feels_like;
	public int pressure;
	public int humidity;
	public int temp_min;
	public int temp_max;
	public int sea_level;
	public int grnd_level;
}
