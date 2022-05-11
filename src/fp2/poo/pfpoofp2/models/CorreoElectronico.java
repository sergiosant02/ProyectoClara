package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

public class CorreoElectronico implements CorreoElectronicoInterfaz {
	
	private String correoElectronico;
	
	public CorreoElectronico(String correoElectronico) {
		super();
		this.correoElectronico = correoElectronico;
	}


	@Override
	public String getCorreoElectronico() {
		// TODO Auto-generated method stub
		return this.correoElectronico;
	}

	
	@Override
	public void setCorreoElectronico(String eMail) throws CorreoElectronicoIncorrectoExcepcion {
		this.correoElectronico = eMail;
		
	}

}
