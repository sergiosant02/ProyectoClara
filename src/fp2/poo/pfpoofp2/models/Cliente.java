package fp2.poo.pfpoofp2.models;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;

public class Cliente implements ClienteInterfaz {
	private DniInterfaz dni;
	private String nombre;
	private TelefonoInterfaz telefono;
	private DomicilioInterfaz domicilio;
	private CorreoElectronicoInterfaz correoEletronico;
	private String entrenamiento;
	
	
	public Cliente (DniInterfaz dni, String nombre, TelefonoInterfaz telefono, DomicilioInterfaz domicilio, CorreoElectronicoInterfaz correoElectronico, String entrenamiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.correoEletronico = correoElectronico;
		this.entrenamiento = entrenamiento;
	}
		
		
		public DniInterfaz getDni( ) {
			return this.dni;
		}
	    public void setDni( DniInterfaz unDni ) {
	    	this.dni = unDni;

	    } 
	    public TelefonoInterfaz getTelefono( ) {
	    	return this.telefono;
	    }
	    public void setTelefono( TelefonoInterfaz unTelf ) {
	    	this.telefono = unTelf;
	    }
	    public String getNombre( ) {
	    	return this.nombre;
	    }
	    public void setNombre( String nombre ) {
	    	this.nombre = nombre;
	    }
	    public DomicilioInterfaz getDomicilio( ) {
	    	return this.domicilio;
	     }
	    public void setDomicilio( DomicilioInterfaz domicilio ) {
	    	this.domicilio = domicilio;
	    }
	    public CorreoElectronicoInterfaz getCorreoElectronico( ) {
	    	return this.correoEletronico;
	    }
	    public void setCorreoElectronico( CorreoElectronicoInterfaz email ) {
	    	this.correoEletronico = email;
	    }
	    public String getEntrenamiento( ) {
	    return this.entrenamiento;
	    }
	    public void setEntrenamiento( String unEntrenamiento ) {
	    	this.entrenamiento = unEntrenamiento;
	    }
}