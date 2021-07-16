
public class Junior extends Employee{
	
	
	
	public Junior(int telefono, String dni) {
		super(telefono, dni);
	}
	
	public Junior(Integer telefono, String nombre, String dNI, char sexo, String email, String cuenta,double salarios, double salario) {
		super(telefono,nombre,dNI,sexo,email.cuenta,salarios,salario);
	}
	
	public void comprobarPrecio() {
		this.sueldo_final=this.salarios*0.85;
		if (this.sueldo_final > 1600) {
			this.sueldo_final = 1600;
		}else if (this.sueldo_final < 900) {
			this.sueldo_final = 900;
		}
		
	}

}
