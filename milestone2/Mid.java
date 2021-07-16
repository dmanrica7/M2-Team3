package milestone2;

public class Mid extends Employee{

	// Constructores Heredados de Employee
	
	public Mid() {
		super();
	}

	public Mid(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Mid(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria,
			double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
	}
	
	// Metodo cobrar que en el caso de Mid se asegura que haya un minimo y un maximo y rebaja un 10%
	
	public void cobrar() {
		// Ahora nos aseguramos que se cumplan un minimo y un maximo
		if(this.sueldo_base<1800.0) {
			// Si es menor le subimos el sueldo al valor minimo
			this.sueldo_base=1800.0;
		}else if(this.sueldo_base>2500.0) {
			// Si es mayor le bajamso el sueldo al valor maximo
			this.sueldo_base=2500.0;
		}
		super.cobrar();
		// El metodo cobrar de Employee reduce un 5%, y hacemos otro 5% para tener un total de 10%
		this.sueldo_bruto_mensual-=this.sueldo_base*0.05;
		calcularSueldo_neto_mensual();
		calcularSueldo_neto_anual();
		calcularSueldo_bruto_anual();
	}
	
	public void calcularSueldo_neto_mensual() {
		// EL metodo de employee reduce un 2% de IRPF
		super.calcularSueldo_neto_mensual();
		// Reducimos un 13% mas para tener un 15% de IRPF
		this.sueldo_neto_mensual-=0.13*this.sueldo_bruto_mensual;
	}

}
