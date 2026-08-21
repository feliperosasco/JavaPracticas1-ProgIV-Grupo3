package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		empleado1.setDni("41132459");
		empleado1.setNombre("Lara");
		empleado1.setApellido("Lopez");
		empleado1.setFechaNacimiento(LocalDate.of(1999, 04, 01));
		empleado1.setGenero("Femenino");
		empleado1.setDireccion("Maipu 1300");
		empleado1.setTelefono("11635557"); 
		empleado1.setEmail("lara@gmail.com");
		empleado1.setPuesto("Arquitecta");

		Empleado empleado2 = new Empleado("41123456", "Matias" , "Soubelet", LocalDate.of(1999, 01, 01),"Masculino", 
				"Constitucion 123", "113625142", "matias@gmail.com", "Abogado");
		
		
		Empleado empleado3 = new Empleado();
		empleado3.setDni("41132456");
		empleado3.setNombre("Luis");
		empleado3.setApellido("Perez");
		empleado3.setFechaNacimiento(LocalDate.of(1998, 07, 01));
		empleado3.setDireccion("3 de Febrero 100");
		empleado3.setTelefono("11635247"); 
		empleado3.setEmail("luis@gmail.com");
		empleado3.setPuesto("Contador");
		
		
		Empleado empleado4 = new Empleado("41123457", "Maria" , "Sanabria", LocalDate.of(1998, 03, 01),"Femenino", 
				"Las heras 123", "113625862", "maria@gmail.com", "Administrativa");
		
		
		Empleado empleado5 = new Empleado("41123458", "Marcos" , "Soto", LocalDate.of(1998, 06, 01),"Masculino", 
				"Constitucion 223", "113625153", "marcos@gmail.com", "Vendedor");
		
	}

}
