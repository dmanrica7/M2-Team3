
public class Manager extends Usuario {

	private double salarioF;
	
	public Manager() {
		salarioF =0;
		
		
	}
	
	public Manager(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,double salarios, double salario) {
		super(telefono, nombre,dNI, sexo,email,cuenta,salarios);
		this.salarioF = salario;
	}
	
	public Manager(int telefono, String dNI) {
		super(telefono,dNI);
	}
	
	
	//Metodo cobra un 10% más
	
	public void cobrar() {
		this.salarioF = salarios*1.10;
		
	}
}
