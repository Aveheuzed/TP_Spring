package A.tp.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Properties {
	public String label;
	public double score;
	public String housenumber;
	public String id;
	public String type;
	public double x;
	public double y;
	public double importance;
	public String name;
	public String postcode;
	public String citycode;
	public String city;
	public String context;
	public String street;
}