package milestone2;

public class Manager extends Usuario {
	
	// Constructores
	
	public Manager() {
		super();
		cobrar();
	}
	
	public Manager(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
		cobrar();
	}
	
	public Manager(String dni, int num_telefono) {
		super(dni, num_telefono);
		cobrar();
	}	
	
	// Metodo cobrar que en Manager se asugura un minimo y un maximo y luego incrementa calcula los diferentes sueldos
	
	public void cobrar() {
		// Ahora nos aseguramos que se cumplan un minimo y un maximo
		if(this.sueldo_base<3000.0) {
		// Si es menor le subimos el sueldo al valor minimo
			this.sueldo_base=3000.0;
		}else if(this.sueldo_base>5000.0) {
			this.sueldo_base=5000.0;
		}
		this.sueldo_bruto_mensual = sueldo_base*1.10;
		calcularSueldo_neto_mensual();
		calcularSueldo_neto_anual();
		calcularSueldo_bruto_anual();
	}
	
	public void calcularSueldo_bruto_anual() {
		// Multiplicmaos por 12 el sueldo bruto mensual
		this.sueldo_bruto_anual=12*this.sueldo_bruto_mensual;
	}
	
	public void calcularSueldo_neto_anual() {
		// Multiplicmaos por 12 el sueldo neto mensual
		this.sueldo_neto_anual=12*this.sueldo_neto_mensual;
	}
	
	public void calcularSueldo_neto_mensual() {
		// Restamos un 26% de IRPF
		this.sueldo_neto_mensual=0.74*this.sueldo_bruto_mensual;
	}
	
	// Metodo toString

	public String toString() {
		return "Manager:"+super.toString();
	}
	
}
