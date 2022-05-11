package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.TelefonoInterfaz;

public class Telefono implements TelefonoInterfaz{
	String telefono;

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Telefono(String telefono) {
		super();
		this.telefono = telefono;
	}
	
	
}
