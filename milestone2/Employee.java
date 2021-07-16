package milestone2;

public class Employee extends Usuario{
	
	// Atributo Sueldo para guardar el sueldo final después de las reducciones
	
	protected double sueldo_final;
	
	// Constructores

	public Employee() {
		super();
	}

	public Employee(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Employee(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
	
	// Metodo cobrar que en Employee reduce un 15% su sueldo mensual
	
	public void cobrar() {
		this.sueldo_final=salario_mensual*0.85;
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
		return "Employee [sueldo_final=" + sueldo_final + ", nombre=" + nombre + ", dni=" + dni + ", num_telefono="
				+ num_telefono + ", sexo=" + sexo + ", email=" + email + ", cuenta_bancaria=" + cuenta_bancaria
				+ ", salario_mensual=" + salario_mensual + "]";
	}
	
}
