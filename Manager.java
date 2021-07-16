
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
	//Getter y Setters

		public double getSalarioF() {
			return salarioF;
		}

		public void setSalarioF(double salarioF) {
			this.salarioF = salarioF;
		}

		
		@Override
		public String toString() {
			return "Manager [salarioF=" + salarioF + ", Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI
					+ ", Sexo=" + Sexo + ", Email=" + Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios + "]";
		}
}
