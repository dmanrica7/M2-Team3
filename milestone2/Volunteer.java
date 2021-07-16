package milestone2;

public class Volunteer extends Usuario{
	
	// Atributo Sueldo final para asegurarnos que no cobre
	
	private double sueldo_final;

	// Constructores
	
	public Volunteer() {
		super();
	}

	public Volunteer(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Volunteer(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria,
			double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
	
	// Metodo cobrar que en el caso de Volunteer se impondra un sueldo final de 0.0 ya que no cobra
	
	public void cobrar() {
		this.sueldo_final=0.0;
	}

	public double getSueldo_final() {
		return sueldo_final;
	}

	public void setSueldo_final(double sueldo_final) {
		this.sueldo_final = sueldo_final;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return "Volunteer [sueldo_final=" + sueldo_final + ", nombre=" + nombre + ", dni=" + dni + ", num_telefono="
				+ num_telefono + ", sexo=" + sexo + ", email=" + email + ", cuenta_bancaria=" + cuenta_bancaria
				+ ", salario_mensual=" + salario_mensual + "]";
	}
	
}
