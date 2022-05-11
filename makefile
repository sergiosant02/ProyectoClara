###########################################################################################
#
#       makefile para la compilacion de la PFPOO de Fundamentos de Programacion II
#
#
# Este fichero makefile se proporciona para realizar la compilacion y ejecucion de la PFPOO.
# El makefile lo debe usar como referencia, y puede realizar los cambios necesarios
# para realizar la compilacion y prueba del codigo.
#
#  Existen varias opciones de compilacion con este makefile: 
#
#  -Tecleando: "make excepciones" en la linea de comandos, se compilan todas las excepciones.
#
#  -Tecleando: "make interfaces" en la linea de comandos, se compilan todas las interfaces y clase abstracta.
#
#  -Tecleando: "make clases" en la linea de comandos, se compilan todas las clase.
#
#  -Tecleando: "make" se ejecuta el programa con la clase Principal00.java
#
# El makefile se ha hecho con el UVUS fp2. 
# Cada alumno debe sustituir fp2 por el UVUS del alumno en este makefile.
#
###########################################################################################

JAVAC=javac

JAVA=java

OPCIONES= -g -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin 

###########################################################################################

prueba: ./bin/fp2/poo/principal/Principal00.class
	java -classpath ./bin fp2.poo.principal.Principal00 Rutinas.txt Clientes.txt 


excepciones: ./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class \
             ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class \
             ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
             ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class 

clases: ./bin/fp2/poo/pfpoofp2/Domicilio.class                     \
        ./bin/fp2/poo/pfpoofp2/Telefono.class                      \
        ./bin/fp2/poo/pfpoofp2/Dni.class                           \
        ./bin/fp2/poo/pfpoofp2/CorreoElectronico.class             \
        ./bin/fp2/poo/pfpoofp2/Cliente.class                       \
        ./bin/fp2/poo/pfpoofp2/RutinaDeEntrenamiento.class         \
        ./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class       \
        ./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class      \
        ./bin/fp2/poo/pfpoofp2/Gimnasio.class                     


interfaces: ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class \
            ./bin/fp2/poo/utilidades/DniInterfaz.class                   \
            ./bin/fp2/poo/utilidades/TelefonoInterfaz.class              \
            ./bin/fp2/poo/utilidades/DomicilioInterfaz.class             \
            ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class     \
            ./bin/fp2/poo/utilidades/ClienteInterfaz.class               \
            ./bin/fp2/poo/utilidades/GimnasioAbstracta.class

	

#############################
# Principal00.java
# 
#############################             
./bin/fp2/poo/principal/Principal00.class: clases                        \
            ./src/fp2/poo/principal/Principal00.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/principal/Principal00.java



#############################
# DatosDeClientesEntrada.java
# (Dependencias incompletas!!)
#############################	
./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class:                  \
                         ./bin/fp2/poo/pfpoofp2/Cliente.class           \
                         ./bin/fp2/poo/pfpoofp2/CorreoElectronico.class \
                         ./bin/fp2/poo/pfpoofp2/Dni.class               \
                         ./bin/fp2/poo/pfpoofp2/Domicilio.class         \
                         ./bin/fp2/poo/pfpoofp2/Telefono.class          \
                         ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                         ./src/fp2/poo/utilidades/DatosDeClientesEntrada.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DatosDeClientesEntrada.java
	
	
#############################
# DatosDeRutinasEntrada.java
# (Dependencias incompletas!!)
#############################
./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class: ./src/fp2/poo/utilidades/DatosDeRutinasEntrada.java \
                        ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                        ./bin/fp2/poo/pfpoofp2/RutinaDeEntrenamiento.class
	$(JAVAC) $(OPCIONES)  ./src/fp2/poo/utilidades/DatosDeRutinasEntrada.java
	

#############################
# RutinaEntrenamiento.java
#  
#############################	
./bin/fp2/poo/pfpoofp2/RutinaDeEntrenamiento.class:  \
                         ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class\
                         ./src/fp2/poo/pfpoofp2/RutinaDeEntrenamiento.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/RutinaDeEntrenamiento.java

#############################
# Gimnasio.java
# 
#############################             
./bin/fp2/poo/pfpoofp2/Gimnasio.class:  \
            ./src/fp2/poo/pfpoofp2/Gimnasio.java \
            ./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class \
            ./bin/fp2/poo/utilidades/DatosDeClientesEntrada.class \
           ./bin/fp2/poo/utilidades/GimnasioAbstracta.class \
            ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class \
           ./bin/fp2/poo/utilidades/ClienteInterfaz.class \
           ./bin/fp2/poo/pfpoofp2/OrdenacionDni.class   \
           ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/Gimnasio.java


#############################
# Cliente.java
# 
#############################
./bin/fp2/poo/pfpoofp2/Cliente.class:                                     \
                          ./bin/fp2/poo/utilidades/DniInterfaz.class       \
                          ./bin/fp2/poo/utilidades/DomicilioInterfaz.class \
                          ./bin/fp2/poo/utilidades/ClienteInterfaz.class   \
                          ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class \
                          ./src/fp2/poo/pfpoofp2/Cliente.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/Cliente.java

#############################
# CorreoElectronico.java
# depende de su interfaz CorreoElectronico.java 
#############################
./bin/fp2/poo/pfpoofp2/CorreoElectronico.class: \
                       ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class\
                       ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class \
                       ./src/fp2/poo/pfpoofp2/CorreoElectronico.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/CorreoElectronico.java

#############################
# Dni.java
# depende de su interfaz DniIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/pfpoofp2/Dni.class: \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class\
                       ./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class \
                       ./src/fp2/poo/pfpoofp2/Dni.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/Dni.java

#############################
# Telefono.java
# depende de su interfaz Telefono.java 
#############################
./bin/fp2/poo/pfpoofp2/Telefono.class: \
                         ./src/fp2/poo/pfpoofp2/Telefono.java \
                         ./bin/fp2/poo/utilidades/TelefonoInterfaz.class \
                         ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/Telefono.java

#############################
# Domicilio.java
# 
#############################
./bin/fp2/poo/pfpoofp2/Domicilio.class:  \
                         ./bin/fp2/poo/utilidades/DomicilioInterfaz.class  \
                         ./src/fp2/poo/pfpoofp2/Domicilio.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/Domicilio.java
	
	
	
	

#############################
# RutinaEntrenamientoInterfaz.java
# 
#############################	
./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class:  \
                         ./src/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.java   	
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.java
	

#############################
# DniInterfaz.java
# depende de su interfaz DniIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/DniInterfaz.class: \
                       ./src/fp2/poo/utilidades/DniInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DniInterfaz.java	
	

#############################
# TelefonoInterfaz.java
# depende de su interfaz TelefonoIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/TelefonoInterfaz.class: \
                       ./src/fp2/poo/utilidades/TelefonoInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/TelefonoInterfaz.java

#############################
# DomicilioInterfaz.java
# 
#############################
./bin/fp2/poo/utilidades/DomicilioInterfaz.class: ./src/fp2/poo/utilidades/DomicilioInterfaz.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/DomicilioInterfaz.java
	
#############################
# CorreoElectronicoInterfaz.java
# depende de su interfaz CorreoElectronicoIncorrectoExcepcion.java 
#############################
./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class: \
                       ./src/fp2/poo/utilidades/CorreoElectronicoInterfaz.java \
                       ./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/CorreoElectronicoInterfaz.java

#############################
# ClienteInterfaz.java
# 
#############################
./bin/fp2/poo/utilidades/ClienteInterfaz.class: \
                       ./bin/fp2/poo/utilidades/DomicilioInterfaz.class \
                       ./bin/fp2/poo/utilidades/CorreoElectronicoInterfaz.class \
                       ./bin/fp2/poo/utilidades/TelefonoInterfaz.class \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class \
                       ./src/fp2/poo/utilidades/ClienteInterfaz.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/ClienteInterfaz.java
	
#############################
# GimnasioAbstracta.java                   
# 
#############################
./bin/fp2/poo/utilidades/GimnasioAbstracta.class: \
                       ./bin/fp2/poo/utilidades/DatosDeRutinasEntrada.class\
                       ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                       ./bin/fp2/poo/utilidades/ClienteInterfaz.class \
                       ./bin/fp2/poo/utilidades/DniInterfaz.class \
                       ./bin/fp2/poo/utilidades/RutinaDeEntrenamientoInterfaz.class \
                       ./src/fp2/poo/utilidades/GimnasioAbstracta.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/GimnasioAbstracta.java	
	
	
#############################
# DniIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.class: \
                             ./src/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/DniIncorrectoExcepcion.java
	
#############################
# TelefonoIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.class: \
                             ./src/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/TelefonoIncorrectoExcepcion.java

#############################
# CorreoElectronicoIncorrectoExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.class: \
                       ./src/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/CorreoElectronicoIncorrectoExcepcion.java
		
#############################
# OperacionNoPermitidaExcepcion.java
# 
#############################
./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class: \
                         ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java


#############################
# OrdenacionDni.java
# 
############################# 
./bin/fp2/poo/pfpoofp2/OrdenacionDni.class: ./bin/fp2/poo/utilidades/ClienteInterfaz.class \
                                            ./src/fp2/poo/pfpoofp2/OrdenacionDni.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/pfpoofp2/OrdenacionDni.java


	





