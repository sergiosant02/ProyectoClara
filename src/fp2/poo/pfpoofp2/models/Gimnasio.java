package fp2.poo.pfpoofp2.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.DatosDeClientesEntrada;
import fp2.poo.utilidades.DatosDeRutinasEntrada;
import fp2.poo.utilidades.GimnasioAbstracta;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;

public class Gimnasio extends GimnasioAbstracta {
	// List<Integer> ls = new ArrayList<Integer>();
	List<ClienteInterfaz> listaClientes;
	List<RutinaDeEntrenamientoInterfaz> listaRutinas;
	
	public Gimnasio(List<ClienteInterfaz> listaClientes, List<RutinaDeEntrenamientoInterfaz> listaRutinas) {
		this.listaClientes = listaClientes;
		this.listaRutinas = listaRutinas;
	}
	
	public Gimnasio(String clientesPath, String rutinasPath) throws OperacionNoPermitidaExcepcion {
		DatosDeClientesEntrada datosClientes = new DatosDeClientesEntrada(clientesPath);
		List<ClienteInterfaz> ls = new ArrayList<>();
		while(datosClientes.hasNext()) {
			ls.add(datosClientes.next());
		}
		DatosDeRutinasEntrada datosRutina = new DatosDeRutinasEntrada(rutinasPath);
		List<RutinaDeEntrenamientoInterfaz> ls2 = new ArrayList <>();
			while(datosRutina.hasNext()) {
				ls2.add(datosRutina.next());
			}
		this.listaClientes = ls;
		this.listaRutinas = ls2;
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
		  listaClientes.sort(Comparator.comparing(c -> ((Cliente)c).getDni().getDni()));
	  }
	  
	  public void ordenarClientesPorDomicilio() {
		  //Collectors.sort(listaClientes);
		  listaClientes.sort(Comparator.comparing(c -> ((Cliente)c).getDomicilio().getDomicilio()));
	  }
	  
	  /*
	   * int getTiempo( int ejercicio) {
	   * return ejercicio + 7;
	   * }
	   * 
	   * e -> e+7
	   */

	
	
}