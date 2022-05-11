package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.DniInterfaz;

public class Dni implements DniInterfaz {
	String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Dni(String dni) {
		super();
		this.dni = dni;
	}
	
}
