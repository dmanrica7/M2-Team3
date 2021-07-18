package milestone2;

public class Junior extends Employee{
	
	// Constructores Heredados de Employee
	
	public Junior() {
		super();
		cobrar();
	}

	public Junior(String dni, int num_telefono) {
		super(dni, num_telefono);
		cobrar();
	}

	public Junior(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
		cobrar();
	}
		
	// Metodo cobrar que en el caso de un Junior se asegura que haya un minimo y calcula los diferentes sueldos
		
	public void cobrar() {
		// Nos aseguramos que se cumplan un minimo y un maximo
		if(this.sueldo_base<900.0) {
			// Si es menor le subimos el sueldo al valor minimo
			this.sueldo_base=900.0;
		}else if(this.sueldo_base>1600.0) {
			// Si es mayor le bajamso el sueldo al valor maximo
			this.sueldo_base=1600.0;
		}
		// El metodo cobrar de Employee reduce un 5%, luego reducimos otro 10% para que sea un 15% en total
		super.cobrar();
		this.sueldo_bruto_mensual-=this.sueldo_base*0.1;
		// Reducimos un 2% de IRPF
		calcularSueldo_neto_mensual();
		calcularSueldo_neto_anual();
		calcularSueldo_bruto_anual();
	}
	
}
