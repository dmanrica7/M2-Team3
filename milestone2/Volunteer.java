package milestone2;

public class Volunteer extends Usuario{
	
	// Atributo que indica si el Volunteer tiene una alguna ayuda o no
	
	private boolean ayuda;

	// Constructores
	
	public Volunteer() {
		super();
		// Inicializamos a false
		this.ayuda=false;
	}

	public Volunteer(String dni, int num_telefono) {
		super(dni, num_telefono);
		// Inicializamos a false
		this.ayuda=false;
	}

	public Volunteer(String nombre, String dni, int num_telefono, char sexo, String email, String cuenta_bancaria, double salario) {
		super(nombre, dni, num_telefono, sexo, email, cuenta_bancaria, salario);
		// Inicializamos a false
		this.ayuda=false;
	}
	
	// Metodo cobrar que en el caso de Volunteer guardara en sueldo la ayuda que pueda tener del gobierno
	
	public void cobrar() {
		// Si pasa de 300 euros asignamos 300 al sueldo y seteamos ayudaa a true
		if(this.sueldo_base>300) {
			this.sueldo_base=300.0;
			this.ayuda=true;
		}else if(this.sueldo_base<=0.0) {
			// Si es negativo o cero es que no tiene ayudas y dejamos el sueldo en 0
			this.sueldo_base=0.0;
			this.ayuda=false;
		}else {
			// Si esta entre 0 y 300 dejamos el sueldo como esta y seteamos ayuda a true
			this.ayuda=true;
		}
		this.sueldo_bruto_mensual=this.sueldo_base;
		calcularSueldo_neto_mensual();
		calcularSueldo_neto_anual();
		calcularSueldo_bruto_anual();
	}
	
	public void calcularSueldo_bruto_anual() {
		// Multiplicmaos por 12 el sueldo bruto mensual
		this.sueldo_bruto_anual=12*this.sueldo_bruto_mensual;
	}
	
	public void calcularSueldo_neto_anual() {
		// Multiplicmaos por 12 el sueldo neto mensual
		this.sueldo_neto_anual=12*this.sueldo_neto_mensual;
	}
	
	public void calcularSueldo_neto_mensual() {
		// No se le aplica ningun impuesto ya que es una ayuda
		this.sueldo_neto_mensual=this.sueldo_bruto_mensual;
	}
	
	// Getter y Setter del atributo ayuda
	
	public boolean isAyuda() {
		return ayuda;
	}

	public void setAyuda(boolean ayuda) {
		this.ayuda = ayuda;
	}

	// Metodo toString
	
	public String toString() {
		return "Volunteer:"+super.toString();
	}
	
}
