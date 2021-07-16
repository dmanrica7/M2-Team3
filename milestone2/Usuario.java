package milestone2;

/*
 *  Clase Usuario que contendra los atributos comunes de Manager, Boss, Employee y Volunteer
 */


public abstract class Usuario implements Cobrable {
	
	// Atributos
	
	protected String nombre;
	protected String dni;
	protected int num_telefono;
	protected char sexo;
	protected String email;
	protected String cuenta_bancaria;
	protected double salario_mensual;
	
	// Constructor por defecto
	
	public Usuario() {
		this.nombre="";
		this.dni="";
		this.num_telefono=0;
		this.sexo='-';
		this.email="";
		this.cuenta_bancaria="";
		this.salario_mensual=0.0;
	}
	
	// Constructor con parametros identificadores (dni y telefono)	
	
	public Usuario(String dni, int num_telefono) {
		this.dni = dni;
		this.num_telefono = num_telefono;
		// El resto por defecto
		this.cuenta_bancaria="";
		this.sexo='-';
		this.email="";
		this.nombre="";
		this.salario_mensual=0.0;
	}

	// Constructor con todos los parametros

	public Usuario(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario_mensual) {
		this.nombre = nombre;
		this.dni = dni;
		this.num_telefono = num_telefono;
		this.sexo = sexo;
		this.email = email;
		this.cuenta_bancaria = cuenta_bancaria;
		this.salario_mensual=salario_mensual;
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNum_telefono() {
		return num_telefono;
	}

	public void setNum_telefono(int num_telefono) {
		this.num_telefono = num_telefono;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", num_telefono=" + num_telefono + ", sexo=" + sexo
				+ ", email=" + email + ", cuenta_bancaria=" + cuenta_bancaria + "]";
	}
	
}
