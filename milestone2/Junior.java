package milestone2;

public class Junior extends Employee{
	
	// Constructores Heredados de Employee
	
	public Junior() {
		super();
	}

	public Junior(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Junior(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria,
		double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
		
	// Metodo cobrar que en el caso de un Junior se rebaja un 15%
		
	public void cobrar() {
		super.cobrar();
		// El metodo cobrar de Employee reduce un 5%, ahora faltaria reducir otro 10%
		this.sueldo_final-=this.salario_mensual*0.1;
		// Ahora nos aseguramos que se cumplan un minimo y un maximo
		if(this.sueldo_final<900.0) {
			// Si es menor le subimos el sueldo al valor minimo
			this.sueldo_final=900.0;
		}else if(this.sueldo_final>1600.0) {
			// Si es mayor le bajamso el sueldo al valor maximo
			this.sueldo_final=1600.0;
		}
	}
}
