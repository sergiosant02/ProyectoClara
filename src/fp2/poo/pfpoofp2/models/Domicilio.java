package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.DomicilioInterfaz;

public class Domicilio implements DomicilioInterfaz {
	String domicilio;

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Domicilio(String domicilio) {
		super();
		this.domicilio = domicilio;
	}
	
}
