package fp2.poo.pfpoofp2.models;

import java.util.List;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.GimnasioAbstracta;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;

public class Gimnasio extends GimnasioAbstracta {
	// List<Integer> ls = new ArrayList<Integer>();
	List<Cliente> listaClientes;
	List<RutinaDeEntrenamientoInterfaz> listaRutinas;
	
	public Gimnasio(List<Cliente> listaClientes, List<Rutina> listaRutinas) {
		this.listaClientes = listaClientes;
		this.listaRutinas = listaRutinas;
	}
	
	public Gimnasio(String clientesPath, String rutinasPath) {
		
	}
	
	public void insertarCliente(ClienteInterfaz cliente) {
		listaClientes.add(cliente);
	}
	
	 public void insertarRutinaEntrenamiento(RutinaDeEntrenamientoInterfaz rut) {
		 listaRutinas.add(rut);
	 }
	 
	 public void mostrarClientes() {
		 System.out.println(listaClientes);
	 }

	
	  public void mostrarRutinas() {
		   System.out.println(listaRutinas);
	   }
	  
	  public void ordenarClientesPorDni() {
		  //Collectors.sort(listaClientes);
		  listaClientes.sort();
	  }

	
	
}