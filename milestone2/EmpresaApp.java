package milestone2;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class EmpresaApp {

	public static void main(String[] args) {
		
		// Creamos un array de Usuarios que contendra los trabajadores de la plantilla
		ArrayList<Usuario> lista = new ArrayList<>();
		
		// Utilizamos un metodo para rellenar esta lista 
		rellenaPlantilla(lista);
		
		// Mostramos por pantalla un menu en el cual el usuario tendra diferentes opciones para realizar
		int eleccion=0;
		String cadena = "Elija una accion:\n1 - Listar Plantilla\n2 - Agregar Usuario\n3 - Implementar bonus\n0 - Salir";
		do {
			eleccion=Integer.parseInt(JOptionPane.showInputDialog(cadena));
			// Dependiendo de que elija el usuario, usamos un switch para realizar la accion correspondiente
			switch(eleccion) {
			case 0:
				// Si elije salir usamos un break para irnos directos a la condicion del while que nos sacara del bucle
				break;
			case 1:
				// Si escoge mostrar la plantilla actual, printearemos el array con los datos de todos los trabajadores
				mostrarPlantilla(lista);
				break;
			case 2:
				// Si elije añadir usuario, preguntamos que tipo de trabajador quiere integrar y le mostraremos las opciones
				String tipo = JOptionPane.showInputDialog("Que tipo de usuario desea agregar\nTipos disponibles: Volunteer, Junior, Mid, Senior, Manager y Boss");
				// Le pasamos por parametro la lista de trabajadores y el tipo
				agregarUsuario(lista, tipo);
			case 3:
				// Si decide implementar el bonus, añadiremos al sueldo anual bruto un 10% a todos los trabajadores excepto a los voluntarios
				bonus(lista);
				break;
			default:
				// Si no introduce ninguna de las anteriores opciones, mostraremos un mensaje de error
				JOptionPane.showMessageDialog(null, "No existe esa opcion");
				break;
			}
		// Mientras el usuario no introduzca un 0 para salir, seguiremos mostrando el menu con las opciones
		}while(eleccion!=0);	
		
	}

	public static void bonus(ArrayList<Usuario> lista) {
		// Recorremos el array con un bucle
		for(int i=0;i<lista.size();i++) {
			// Mientras no sea de tipo voluntario aplicaremos el bonus del 10% sobre el sueldo bruto anual
			if(lista.get(i) instanceof Volunteer== false) {
				lista.get(i).setSueldo_bruto_anual(lista.get(i).getSueldo_bruto_anual()*1.1);
			}
		}
	}
	
	public static void rellenaPlantilla(ArrayList<Usuario> lista) {
		// Creamos la plantilla con algunas instancias por defecto
		Boss jefe = new Boss("Jose Marin", "11111111A", 63647545, 'H', "josemarin@gmail.com", "ES5375629529", 7865.50);
		Manager encargado = new Manager("Mayte Oses", "2222222B", 673894435, 'M', "mayteoses@gmail.com", "ES678646747", 5678.0);
		Volunteer voluntari = new Volunteer("Araceli Araceli", "3333333C", 36546464, 'M', "araceli@gmail.com", "ES6723679", 0.5);
		Junior junior = new Junior("Mark Zuckenberg", "4444444D", 768484, 'M', "markzuckenberg@gmial.com", "ES6738365", 2465);
		Mid mid = new Mid("Bill Gates", "55555E", 6544321, 'H', "billgates@gmail.com", "ES3456778", 3000);
		Senior sen = new Senior("John McAfee", "666666F", 6543367, 'H', "johnmcafe@gmail.com", "ES64893464", 4677.0);
		// Y las añadiremos al array
		lista.add(jefe);
		lista.add(encargado);
		lista.add(voluntari);
		lista.add(junior);
		lista.add(mid);
		lista.add(sen);
	}
	
	public static void mostrarPlantilla(ArrayList<Usuario> lista) {
		// Recorremos el array e iremos printeando cada usuario mediante el metodo toString de cada uno
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("");
	}
	
	public static void agregarUsuario(ArrayList<Usuario> lista, String tipo) {
		// Como todas las clases heredan sus atributos de Usuario pedimos por pantalla estos datos, que seran comunes en todas
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del usuario");
		String dni = JOptionPane.showInputDialog("Introduzca el dni del usuario");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de telefono"));
		char sexo = JOptionPane.showInputDialog("Introduzca el sexo del usuario").charAt(0);
		String mail = JOptionPane.showInputDialog("Introduzca el mail del usuario");
		String cuenta = JOptionPane.showInputDialog("Introduzca la cuenta bancaria del usuario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el salario base del usuario"));
		
		// Dependiendo del tipo de Usuario que se introduzca creamos un objeto u otro y lo añadimos al array
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
			// Si no se ha introducido ningun tipo de trabajador correcto mostramos un mensaje de error
			JOptionPane.showMessageDialog(null, "No has introducido un rol existente");
		}
	}
	
}
