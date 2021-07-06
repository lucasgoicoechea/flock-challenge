package flock.challenge.provincias.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Provincia {

	private Long id;
	private String nombre;
	private Centroide centroide;

	public Provincia() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Centroide getCentroide() {
		return centroide;
	}

	public void setCentroide(Centroide centroide) {
		this.centroide = centroide;
	}

	@Override
	public String toString() {
		return "Provincia{" +
				"nombre=" + nombre +
				", centroide='" + centroide + '\'' +
				'}';
	}
}