public class Boss extends Usuario{

	public Boss() {
		super();
	}

	public Boss(String dni, int telefono) {
		super(dni, telefono);
	}

	public Boss(String dni, String nombre, int telefono, String email, char sexo, String cBanco, double salario) {
		super(dni, nombre, telefono, email, sexo, cBanco, salario);
	}
	
	public void cobrar()
	{
		this.salario +=0.50*this.salario;
	}
}
