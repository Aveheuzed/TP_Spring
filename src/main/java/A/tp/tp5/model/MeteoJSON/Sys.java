package A.tp.tp5.model.MeteoJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Sys {
	public int type;
	public int id;
	public double message;
	public String country;
	public int sunrise;
	public int sunset;
}
