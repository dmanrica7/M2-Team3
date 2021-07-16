package milestone2;

public class Manager extends Usuario {

	// Atributo sueldo para guardar el sueldo final despues del incremente
	
	private double sueldo_final;
	
	// Constructores
	
	public Manager() {
		super();
	}
	
	public Manager(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
	
	public Manager(String dni, int num_telefono) {
		super(dni, num_telefono);
	}	
	
	// Metodo cobrar que en Manager se incrementa un 10%
	
	public void cobrar() {
		this.sueldo_final = salario_mensual*1.10;
		
	}
	
	// Getter y Setter

	public double getSueldo_final() {
		return sueldo_final;
	}

	public void setSueldo_final(double sueldo_final) {
		this.sueldo_final = sueldo_final;
	}
	
	// Metodo toString

	@Override
	public String toString() {
		return "Manager [sueldo_final=" + sueldo_final + ", nombre=" + nombre + ", dni=" + dni + ", num_telefono="
				+ num_telefono + ", sexo=" + sexo + ", email=" + email + ", cuenta_bancaria=" + cuenta_bancaria
				+ ", salario_mensual=" + salario_mensual + "]";
	}
	
}
