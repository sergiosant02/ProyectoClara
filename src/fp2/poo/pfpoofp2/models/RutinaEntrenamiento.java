package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;

public class RutinaEntrenamiento implements RutinaDeEntrenamientoInterfaz {
	String id;
	String descripcion;
	int frecuencia;
	int tiempo;
	
	
	
	public RutinaEntrenamiento(String id, String descripcion, int frecuencia, int tiempo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.frecuencia = frecuencia;
		this.tiempo = tiempo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public String getIdEntrenamiento() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public void setIdEntrenamiento(String id) {
		this.id = id;
	}
	
	
}
