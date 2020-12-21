package A.tp.tp5.model.AdresseJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Geometry {
	public String type;
	public double coordinates[];
}