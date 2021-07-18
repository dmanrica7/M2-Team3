package milestone2;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class EmpresaApp {

	public static void main(String[] args) {
		int eleccion=0;
		ArrayList<Usuario> lista = new ArrayList<>();
		rellenaPlantilla(lista);
		String cadena = "Elija una accion:\n1 - Listar Plantilla\n2 - Agregar Usuario\n3 - Implementar bonus\n0 - Salir";
		do {
			eleccion=Integer.parseInt(JOptionPane.showInputDialog(cadena));
			switch(eleccion) {
			case 0:
				break;
			case 1:
				for(int i=0;i<lista.size();i++) {
					System.out.println(lista.get(i));
				}
				System.out.println("");
				break;
			case 2:
				String tipo = JOptionPane.showInputDialog("Que tipo de usuario desea agregar\nTipos disponibles: Volunteer, Junior, Mid, Senior, Manager y Boss");
				agregarUsuario(lista, tipo);
			case 3:
				bonus(lista);
				break;
			default:
				JOptionPane.showMessageDialog(null, "No existe esa opcion");
				break;
			}
		}while(eleccion!=0);	
		
	}

	public static void bonus(ArrayList<Usuario> lista) {
		
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i) instanceof Volunteer== false) {
				lista.get(i).setSueldo_bruto_anual(lista.get(i).getSueldo_bruto_anual()*1.1);
			}
		}
	}
	
	public static void rellenaPlantilla(ArrayList<Usuario> lista) {
		// Creamos la plantilla
		
		Boss jefe = new Boss("Jose Marin", "11111111A", 63647545, 'H', "josemarin@gmail.com", "ES5375629529", 7865.50);
		Manager encargado = new Manager("Mayte Oses", "2222222B", 673894435, 'M', "mayteoses@gmail.com", "ES678646747", 5678.0);
		Volunteer voluntari = new Volunteer("Araceli Araceli", "3333333C", 36546464, 'M', "araceli@gmail.com", "ES6723679", 0.5);
		Junior junior = new Junior("Mark Zuckenberg", "4444444D", 768484, 'M', "markzuckenberg@gmial.com", "ES6738365", 2465);
		Mid mid = new Mid("Bill Gates", "55555E", 6544321, 'H', "billgates@gmail.com", "ES3456778", 3000);
		Senior sen = new Senior("John McAfee", "666666F", 6543367, 'H', "johnmcafe@gmail.com", "ES64893464", 4677.0);
			
		lista.add(jefe);
		lista.add(encargado);
		lista.add(voluntari);
		lista.add(junior);
		lista.add(mid);
		lista.add(sen);
	}
	
	public static void agregarUsuario(ArrayList<Usuario> lista, String tipo) {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del usuario");
		String dni = JOptionPane.showInputDialog("Introduzca el dni del usuario");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de telefono"));
		char sexo = JOptionPane.showInputDialog("Introduzca el sexo del usuario").charAt(0);
		String mail = JOptionPane.showInputDialog("Introduzca el mail del usuario");
		String cuenta = JOptionPane.showInputDialog("Introduzca la cuenta bancaria del usuario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el salario base del usuario"));
		switch(tipo.toLowerCase()) {
		case "boss":
			Boss jefe = new Boss(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(jefe);
			break;
		case "manager":
			Manager man = new Manager(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(man);
			break;
		case "senior":
			Senior sen = new Senior(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(sen);
			break;
		case "mid":
			Mid mid = new Mid(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(mid);
			break;
		case "junior":
			Junior jun = new Junior(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(jun);
			break;
		case "volunteer":
			Volunteer volun = new Volunteer(nombre, dni, num, sexo, mail, cuenta, salario);
			lista.add(volun);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No has introducido un rol existente");
		}
	}
	
}
