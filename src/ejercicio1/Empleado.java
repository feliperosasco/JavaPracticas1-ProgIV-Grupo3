package ejercicio1;

public class Empleado extends Persona{

	private static int contadorLegajo = 1000;
	private final int legajo;
	private String puesto;
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + ", datosPersona=" + super.toString() + "]";
	}
}
