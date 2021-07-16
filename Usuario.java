
public class Usuario {
	
protected Integer Telefono;
	
	protected String Nombre;
	
	protected String DNI;
	
	protected String Sexo;
	
	protected String Email;
	
	protected String Cuenta;
	
	protected double salarios;
	
	
	//VARIABLES
	public Usuario () {
		this.Telefono = 0;
		this.Nombre = "";
		this.DNI = "";
		this.Sexo= "";
		this.Email = "";
		this.Cuenta = "";
		this.salarios = 0;
	}


	


	public Usuario(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,
			double salario) {
		Telefono = telefono;
		Nombre = nombre;
		DNI = dNI;
		Sexo = sexo;
		Email = email;
		Cuenta = cuenta;
		this.salarios = salario;
	}





	public Usuario(Integer telefono, String dNI) {
		Telefono = telefono;
		DNI = dNI;
	}
	
	public Integer Cobrar() {
		return Telefono;
		
	}


	@Override
	public Integer cobrar(Integer cobrar) {
		// TODO Auto-generated method stub
		return null;
	}





	public Integer getTelefono() {
		return Telefono;
	}





	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}





	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
	}





	public String getDNI() {
		return DNI;
	}





	public void setDNI(String dNI) {
		DNI = dNI;
	}





	public String getSexo() {
		return Sexo;
	}





	public void setSexo(String sexo) {
		Sexo = sexo;
	}





	public String getEmail() {
		return Email;
	}





	public void setEmail(String email) {
		Email = email;
	}





	public String getCuenta() {
		return Cuenta;
	}





	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}





	public double getSalario() {
		return salarios;
	}





	public void setSalario(double salario) {
		this.salarios = salario;
	}

	
	
}
