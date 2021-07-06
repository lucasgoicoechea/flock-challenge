package flock.challenge.provincias.consumingrest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataArg {

	private String type;
	private List<Provincia> provincias;
	
	public static DataArg instance;

	public DataArg() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> value) {
		this.provincias = value;
	}

	@Override
	public String toString() {
		return "Provincias{" +
				"type='" + type + '\'' +
				", value=" + provincias +
				'}';
	}
}