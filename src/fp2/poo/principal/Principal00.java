/*
 *  @(#)Principal00.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.principal;

import fp2.poo.pfpoofp2.models.Cliente;
import fp2.poo.pfpoofp2.models.CorreoElectronico;
import fp2.poo.pfpoofp2.models.Dni;
import fp2.poo.pfpoofp2.models.Domicilio;
import fp2.poo.pfpoofp2.models.Gimnasio;
import fp2.poo.pfpoofp2.models.Telefono;
import  fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import  fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import  fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;
import  fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public class Principal00 {
    public static void main(String args[]) {
    	
    	//RutinaModel rutina = new RutinaModel("","",8,9);
    	//rutina.getIdentificador();
    	//rutina.identificador
        Gimnasio g = null;
       // g.insertCliente(nuevoCliente);

        Cliente           nuevoCliente    = null;
        Dni               unDni           = null;
        String            nombre          = null;
        Telefono          unTelf          = null;
        Domicilio         unDomicilio     = null;
        CorreoElectronico unEMail         = null;
        String            unEntrenamiento = null;

        try {
        
            if ( args.length != 2 ) {
               throw new OperacionNoPermitidaExcepcion("Numero de argumentos incorrecto");
            } else {
            
                g = new Gimnasio( args[0] /* ficheroRutinas  */ ,
                                  args[1] /* ficheroClientes */ ); 
                //g.mostrarClientes();
                //g.mostrarRutinas();

            /*
             *  Se crean los objetos y se crea un nuevo cliente.
             */                 
            unDni           = new Dni("11111112J");
            nombre          = new String ("Pepe Garcia Lopez");
            unTelf          = new Telefono("123456789");
            unDomicilio     = new Domicilio ( "C/Camino de los Descubrimientos s/n Sevilla");
            unEMail         = new CorreoElectronico( "pepe.garcia@lopez.us.es" );
            unEntrenamiento = new String("Rutina3 "); 
            nuevoCliente    = new Cliente( unDni , nombre, unTelf, unDomicilio, unEMail, unEntrenamiento);
            
            g.insertarCliente ( nuevoCliente );
           
            /*
             *  Se crean los objetos y se crea un nuevo cliente.
             */                 
            unDni           = new Dni("11111113J");
            nombre          = new String ("Manuel Garcia Lopez");
            unTelf          = new Telefono("123456789");
            unDomicilio     = new Domicilio ( "C/Camino de los Descubrimientos s/n Sevilla");
            /* El siguiente correo electronico es incorrecto 
             * debido a que tiene dos caracteres '@'
             */
            unEMail         = new CorreoElectronico( "manuel.garcia@lopez@us.es" );
            unEntrenamiento = new String("Rutina3 "); 
            nuevoCliente    = new Cliente( unDni , nombre, unTelf, unDomicilio, unEMail, unEntrenamiento);

            g.insertarCliente ( nuevoCliente );
            System.out.println("======================================\n");
            g.mostrarClientes();
            System.out.println("======================================\n");           

            }
        } catch ( OperacionNoPermitidaExcepcion e) {
            System.err.println(e);
        } catch (CorreoElectronicoIncorrectoExcepcion e) {
            System.err.println("Correo Electronico Incorrecto en Principal00.");
        } catch (DniIncorrectoExcepcion e) {
            System.err.println("Dni Incorrecto en Principal00.");
        } catch (TelefonoIncorrectoExcepcion e) {
            System.err.println("Telefono Incorrecto en Principal00.");
        }
        
        System.out.println("\nSe muestran los clientes.\n==============================\n");        
        g.mostrarClientes();
        System.out.println("\nSe muestran las rutinas.\n==============================\n");        
        g.mostrarRutinas();   
        System.out.println("Se realiza la ordenacion por dni de los clientes.\n==============================\n");
        g.ordenarClientesPorDni();
        g.mostrarClientes();
        
     
    }
}


