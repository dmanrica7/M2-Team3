package milestone2;

public class Volunteer extends Usuario{

	// Constructores
	
	public Volunteer() {
		super();
	}

	public Volunteer(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Volunteer(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
	}
	
	// Metodo cobrar que en el caso de Volunteer se impondra un sueldo final de 0.0 ya que no cobra
	
	public void cobrar() {
		this.sueldo_bruto_mensual=0.0;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return "Volunteer:"+super.toString();
	}
	
}
