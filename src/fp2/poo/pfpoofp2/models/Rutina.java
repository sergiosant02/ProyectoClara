package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;

public class Rutina implements RutinaDeEntrenamientoInterfaz{
	private String identificador;
	private String descripcion;
	private Integer frecuencia;
	private Integer tiempo;
	private String idEntrenamiento;
	
	public Rutina(String identificador, String descripcion, Integer frecuencia, Integer tiempo) {
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.frecuencia = frecuencia;
		this.tiempo = tiempo;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	 public int getFrecuencia () {
		 return this.frecuencia;
	 }
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;

	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
		
	}
	public int getTiempo() {
		return this.tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getIdEntrenamiento() {
		// TODO Auto-generated method stub
		return this.idEntrenamiento;
	}

	public void setIdEntrenamiento(String id) {
		this.idEntrenamiento = id;
		
	}

	
}



//rutina.identificador esto no se puede