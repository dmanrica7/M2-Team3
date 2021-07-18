package milestone2;

public abstract class Employee extends Usuario{
	
	// Constructores

	public Employee() {
		super();
	}

	public Employee(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Employee(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
	}
	
	// Metodo cobrar que en Employee reduce un 5% su sueldo base, luego dependiendo de si es Junior, Mid o Senior se aplicara otro %
	
	public void cobrar() {
		this.sueldo_bruto_mensual=this.sueldo_base*0.95;
	}
	
	// Metodo que guarda el sueldo neto mensual
	
	public void calcularSueldo_neto_mensual() {
		// Como el minimo de IRPF que se ha de añadir es 2% implementamos eso aqui y en las clases hijas sumamos el correcpondiente exta
		this.sueldo_neto_mensual=this.sueldo_bruto_mensual*0.98;
	}
	
	public void calcularSueldo_bruto_anual() {
		// Multiplicmaos por 12 el sueldo bruto mensual
		this.sueldo_bruto_anual=12*this.sueldo_bruto_mensual;
	}
	
	public void calcularSueldo_neto_anual() {
		// Multiplicmaos por 12 el sueldo neto mensual
		this.sueldo_neto_anual=12*this.sueldo_neto_mensual;
	}
	
	// Metodo toString

	public String toString() {
		String cadena="Empleado:"+super.toString();
		return cadena;
	}
	
}
