public class Senior extends Employee{

	public Senior() {
		super();
	}

	public Senior(String dni, int num_telefono) {
		super(dni, num_telefono);
	}

	public Senior(String dni, String nombre, int telefono, String email, char sexo, String cBanco, double salario) {
		super(dni, nombre, telefono, email, sexo, cBanco, salario);
	}
	
	public void cobrar()
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
