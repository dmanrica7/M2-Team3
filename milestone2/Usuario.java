package milestone2;

/*
 *  Clase Usuario que contendra los atributos comunes de Manager, Boss, Employee y Volunteer
 */


public abstract class Usuario{
	
	// Atributos
	
	protected String nombre;
	protected String dni;
	protected int num_telefono;
	protected char sexo;
	protected String email;
	protected String cuenta_bancaria;
	protected double sueldo_base;
	protected double sueldo_neto_anual;
	protected double sueldo_neto_mensual;
	protected double sueldo_bruto_anual;
	protected double sueldo_bruto_mensual;
	
	// Constructor por defecto
	
	public Usuario() {
		this.nombre="";
		this.dni="";
		this.num_telefono=0;
		this.sexo='-';
		this.email="";
		this.cuenta_bancaria="";
		this.sueldo_base=0.0;
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
		this.sueldo_base=0.0;
	}

	// Constructor con todos los parametros

	public Usuario(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double sueldo_base) {
		this.nombre = nombre;
		this.dni = dni;
		this.num_telefono = num_telefono;
		this.sexo = sexo;
		this.email = email;
		this.cuenta_bancaria = cuenta_bancaria;
		this.sueldo_base=sueldo_base;
	}

	// Metodos abtractos
	
	public abstract void cobrar();
	
	public abstract void calcularSueldo_bruto_anual();
	
	public abstract void calcularSueldo_neto_anual();
	
	public abstract void calcularSueldo_neto_mensual();
	
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

	public double getSueldo_base() {
		return sueldo_base;
	}

	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}

	public double getSueldo_neto_anual() {
		return sueldo_neto_anual;
	}

	public void setSueldo_neto_anual(double sueldo_neto_anual) {
		this.sueldo_neto_anual = sueldo_neto_anual;
	}

	public double getSueldo_neto_mensual() {
		return sueldo_neto_mensual;
	}

	public void setSueldo_neto_mensual(double sueldo_neto_mensual) {
		this.sueldo_neto_mensual = sueldo_neto_mensual;
	}

	public double getSueldo_bruto_anual() {
		return sueldo_bruto_anual;
	}

	public void setSueldo_bruto_anual(double sueldo_bruto_anual) {
		this.sueldo_bruto_anual = sueldo_bruto_anual;
	}

	public double getSueldo_bruto_mensual() {
		return sueldo_bruto_mensual;
	}

	public void setSueldo_bruto_mensual(double sueldo_bruto_mensual) {
		this.sueldo_bruto_mensual = sueldo_bruto_mensual;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return " [nombre=" + nombre + ", dni=" + dni + ", num_telefono=" + num_telefono + ", sexo=" + sexo
				+ ", email=" + email + ", cuenta_bancaria=" + cuenta_bancaria + ", sueldo_base=" + sueldo_base
				+ ", sueldo_neto_anual=" + sueldo_neto_anual + ", sueldo_neto_mensual=" + sueldo_neto_mensual
				+ ", sueldo_bruto_anual=" + sueldo_bruto_anual + ", sueldo_bruto_mensual=" + sueldo_bruto_mensual + "]";
	}
	
	
}
