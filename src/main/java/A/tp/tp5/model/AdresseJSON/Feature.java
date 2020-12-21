package A.tp.tp5.model.AdresseJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Feature {
	public String type;
	public Geometry geometry;
	public Properties properties;
}