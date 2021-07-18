package milestone2;

public class Senior extends Employee{

	// Constructores heredados de Employee
	
	public Senior() {
		super();
		cobrar();
	}

	public Senior(String dni, int num_telefono) {
		super(dni, num_telefono);
		cobrar();
	}

	public Senior(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
		cobrar();
	}
	
	// Metodo cobrar que reduce un 5% el sueldo base y asegura que haya un minimo y un maximo
	
	public void cobrar(){
		// Nos aseguramos que haya un minimo y un maximo
		if (this.sueldo_base >2700) {
			if (this.sueldo_base>4000) {
				this.sueldo_base=4000;
			}
		}else {
			this.sueldo_base = 2700;
		}
		// El metodo cobrar de Employee ya reduce el 5% del sueldo 
		super.cobrar();
		calcularSueldo_neto_mensual();
		calcularSueldo_neto_anual();
		calcularSueldo_bruto_anual();
	}
	
	public void calcularSueldo_neto_mensual() {
		// EL metodo de employee reduce un 2% de IRPF
		super.calcularSueldo_neto_mensual();
		// Reducimos un 22% mas para tener un 24% de IRPF
		this.sueldo_neto_mensual-=0.22*this.sueldo_bruto_mensual;
	}
}
