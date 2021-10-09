package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Sistema;
import ar.edu.unlam.dominio.Usuario;

public class PruebaParcialT2 {

	public static void main(String[] args) {
		// char a = 2;
		// String numero = "0123456789";
		// int b = a;
		// System.out.println(b);

		// System.out.println(Usuario.laContraseñaEsValida("abcde55e"));

//		for (int i = 0; i < numero.length(); i++) {
//			char n = numero.charAt(i);
//			int c = n;
//			System.out.println(c);
//		}

		Sistema logueo = new Sistema("Insta", 4);
		Usuario pablo = new Usuario("negro", "abcdefg123", "Pablo", "Echegaray", 3888888, 25);
		Usuario vladi = new Usuario("vla", "b3bbbbbb", "Vladimir", "Echegaray", 455555, 8);
		Usuario sofia = new Usuario("sofi", "acccc4cc", "Sofia", "Zapata", 387777, 26);
		Usuario ali = new Usuario("Ali", "pitbull123", "Ali", "Perruno", 202020, 8);
		// Usuario cacho = new Usuario("negro", "aaaaaa77", "nanan", "jjjj", 141414,
		// 45);

		boolean agregarOtro = logueo.ingresarUsuario(sofia);
		boolean agregar = logueo.ingresarUsuario(vladi);
		boolean agregarUsuario = logueo.ingresarUsuario(pablo);
		boolean agregarAli = logueo.ingresarUsuario(ali);

		// boolean agregarIncorrecto = logueo.ingresarUsuario(cacho);

		if (agregar) {
			System.out.println("El usuario se agrego correctamente.");
		} else {
			System.out.println("El usuario no se pudo agregar, posiblemente ya exista.");
		}

		System.out.println("La cantidad de Usuarios menores de 18 es: " + logueo.calcularCantidadDeUsuariosMenores());
		System.out.println("La cantidad de Usuarios mayores de edad es: " + logueo.calcularCantidadDeUsuariosMayores());
		System.out.println("La edad promedio de los Usuarios es: " + logueo.calcularEdadPromedio());

		boolean loguearPablo = logueo.loguearUsuario("negro", "abcdefg123");
		System.out.println("EL logueo fue " + loguearPablo);

		boolean loguearSofia = logueo.loguearUsuario("sofi", "acccc4cc");
		System.out.println("EL logueo fue " + loguearSofia);

		Usuario usuariosLista[] = logueo.listarUsuarios();

		for (int i = 0; i < usuariosLista.length; i++) {
			System.out.println(usuariosLista[i].getUsuario());
		}

	}

}
