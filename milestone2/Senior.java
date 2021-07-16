package milestone2;

public class Senior extends Employee{

	// Constructores heredados de Employee
	
	public Senior() {
		super();
	}

	public Senior(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Senior(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario_mensual) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario_mensual);
	}
	
	// Metodo cobrar que reduce un 5% el sueldo base y asegura que haya un minimo y un maximo
	
	public void cobrar(){
		// El metodo cobrar de Employee ya reduce el 5% del sueldo 
		super.cobrar();
		// Nos aseguramos que haya un minimo y un maximo
		if (this.sueldo_final >2700) {
			if (this.sueldo_final>4000) {
				this.sueldo_final=4000;
			}
		}else {
			this.sueldo_final = 2700;
		}
	}
}
