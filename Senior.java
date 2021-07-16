<<<<<<< Updated upstream
public class Senior extends Employee{

=======
/***
 * 
 * clase senior que hereda de empleado
 *
 */
public class Senior extends Employee{

	//constructores
	
>>>>>>> Stashed changes
	public Senior() {
		super();
	}

	public Senior(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Senior(String dni, String nombre, int telefono, String email, char sexo, String cBanco, double salario) {
		super(dni, nombre, telefono, email, sexo, cBanco, salario);
	}
	
<<<<<<< Updated upstream
	public void cobrar()
=======
	public void cobrar() //metodo que modifica el sueldo a partir de un porcentaje y comprueba que el sueldo final este entre el intervalo que debe 
>>>>>>> Stashed changes
	{
		super.cobrar();
		if (this.salario >=2700) {
			if (this.salario>4000)
				this.salario=4000;
		}
		else
			this.salario = 2700;
	}
}
