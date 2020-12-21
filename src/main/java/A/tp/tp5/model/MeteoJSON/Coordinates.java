package A.tp.tp5.model.MeteoJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Coordinates {
	public double lat;
	public double lon;
}
