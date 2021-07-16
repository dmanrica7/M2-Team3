public abstract class Usuario implements Cobrable {

	//atributos
	
	protected String dni;
	protected String nombre;
	protected double salario;
	protected int telefono;
	protected String email;
	protected char sexo;
	protected String cBanco;
	
	//constructores
	
	public Usuario()
	{
		this.dni="";
		this.nombre="";
		this.telefono=0;
		this.email = "";
		this.sexo='-';
		this.cBanco="";
		this.salario = 0;
	}
	
	public Usuario(String dni, int telefono)
	{
		this();
		this.dni=dni;
		this.telefono=telefono;
	}
	
	public Usuario(String dni, String nombre, int telefono, String email, char sexo, String cBanco, double salario)
	{
		this(dni,telefono);
		this.nombre=nombre;
		this.email=email;
		this.sexo=sexo;
		this.cBanco=cBanco;
		this.salario=salario;
	}

	//getters y setters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getcBanco() {
		return cBanco;
	}

	public void setcBanco(String cBanco) {
		this.cBanco = cBanco;
	}

	//toString
	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", sexo="
				+ sexo + ", cBanco=" + cBanco + "]";
	}
}
