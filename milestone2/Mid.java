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
			double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
	
	// Metodo cobrar que en el caso de Mid se rebaja un 10%
	
	public void cobrar() {
		super.cobrar();
		// El metodo cobrar de Employee reduce un 5%, ahora faltaria reducir otro 5%
		this.sueldo_final-=this.salario_mensual*0.05;
		// Ahora nos aseguramos que se cumplan un minimo y un maximo
		if(this.sueldo_final<1800.0) {
			// Si es menor le subimos el sueldo al valor minimo
			this.sueldo_final=1800.0;
		}else if(this.sueldo_final>2500.0) {
			// Si es mayor le bajamso el sueldo al valor maximo
			this.sueldo_final=2500.0;
		}
	}

}
