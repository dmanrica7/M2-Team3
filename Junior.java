
public class Junior extends Employee{
	
	
	
	public Junior(int telefono, String dni) {
		super(telefono, dni);
	}
	
	public Junior(Integer telefono, String nombre, String dNI, char sexo, String email, String cuenta,double salarios, double salario) {
		super(telefono,nombre,dNI,sexo,email.cuenta,salarios,salario);
	}
	
	public void comprobarPrecio() {
		
		if (this.salarios > 1600) {
			this.salarios = 1600;
		}else if (this.salarios < 900) {
			this.salarios= 900;
		}
		super.cobrar();
		this.salarios=this.salarios*0.85;
		
	}

}
