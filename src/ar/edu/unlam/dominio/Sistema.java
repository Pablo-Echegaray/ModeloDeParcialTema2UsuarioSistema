package ar.edu.unlam.dominio;

public class Sistema {
	private String nombreDelSistema;
	private Usuario usuarios[];

	// 3- Desarrolle un constructor de la clase Sistem
	public Sistema(String nombreDelSistema, int cantidadDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.usuarios = new Usuario[cantidadDeUsuarios];
	}

	// 4- Desarrolle un método en la clase Sistema que le permita incorporar un
	// usuario a su lista de usuarios
	public boolean ingresarUsuario(Usuario nuevoUsuario) {
		boolean insertarUsuario = false;
		// String nombre = nuevoUsuario.getUsuario();
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				if (usuarios[i].getUsuario().equals(nuevoUsuario.getUsuario())) {
					insertarUsuario = false;
					break;
				}
			}
			if (usuarios[i] == null) {
				usuarios[i] = nuevoUsuario;
				insertarUsuario = true;
				break;
			}
		}
		return insertarUsuario;

	}

	// 5- Desarrolle el método calcularCantidadDeUsuariosMenores en la clase Sistema

	public int calcularCantidadDeUsuariosMenores() {
		int cantidadDeUsuarios = 0;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				if (!(usuarios[i].esMayorDeEdad())) {
					cantidadDeUsuarios++;
				}
			}
		}
		return cantidadDeUsuarios;
	}

	// 6- Desarrolle el método calcularCantidadDeMayores en la clase Sistema
	public int calcularCantidadDeUsuariosMayores() {
		int cantidadDeUsuarios = 0;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				if (usuarios[i].esMayorDeEdad()) {
					cantidadDeUsuarios++;
				}
			}
		}
		return cantidadDeUsuarios;
	}

	// 7- Desarrolle el método calcularEdadPromedio en la clase Sistema
	public int calcularEdadPromedio() {
		int sumaDeEdades = 0;
		double promedio = 0;
		double redondeo = 0;
		int cantidadEntera = 0;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				sumaDeEdades += usuarios[i].getEdad();
			}
		}
		promedio = (double) sumaDeEdades / usuarios.length;
		// System.out.println("La variable promedio vale: " + promedio);
		redondeo = Math.round(promedio);
		// System.out.println("La variable redondeo vale: " + redondeo);
		cantidadEntera = (int) redondeo;
		return cantidadEntera;
	}

	// 8- En la clase Sistema desarrolle el método loguearUsuario
	public boolean loguearUsuario(String usuario, String contraseña) {
		boolean logueo = false;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				if (usuarios[i].getUsuario().equals(usuario)) {
					if (usuarios[i].getContraseña().equals(contraseña)) {
						logueo = true;
						System.out.println("Usted ha iniciado sesion correctamente");
					}
				}
			}
		}
		return logueo;
	}

	// 9) devuelva los usuarios ordenados por el campo usuario
	// Número positivo: la cadena 1 es mayor que la cadena 2.
	// 0: las cadenas son iguales.
	// Número negativo: la cadena 1 es menor que la cadena 2.
	// Recuerda que no sigue el alfabeto original sino según la tabla ASCII, es
	// decir, que a es menor que z.
	// ***************************************************
//	public Usuario[] listarUsuarios() {
//		Usuario auxiliar;
//		int i, j;
//		for (i = 1; i <= usuarios.length; i++) {
//			for (j = 0; j < usuarios.length - 1; j++) {
//				if (usuarios[j] != null) {
//					if (usuarios[j].getUsuario().compareTo(usuarios[j + 1].getUsuario()) > 0) {
//						auxiliar = usuarios[j + 1];
//						usuarios[j + 1] = usuarios[j];
//						usuarios[j] = auxiliar;
//					}
//				}
//			}
//		}
//		return usuarios;
//	}
	// ***************************************************

	public Usuario[] listarUsuarios() {
		Usuario[] lista = new Usuario[usuarios.length];
		int x = 0;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				lista[x] = usuarios[i];
				x++;
			}
		} // hasta acá crea una nueva lista con los null al final;
		Usuario aux = null;
		for (int i = 1; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] != null && lista[j + 1] != null) {
					if (lista[j].getUsuario().compareTo(lista[j + 1].getUsuario()) >= 0) {
						aux = lista[j];
						lista[j] = lista[j + 1];
						lista[j + 1] = aux;
					}
				}
			}
		} // ordena de menor a mayor
		return lista;
	}

//	for (int k = 0; k < usuarios.length; k++) {
//		for (int j = 0; j < usuarios.length - 1; j++) {
//			if (usuarios[i - 1] != null) {
//				primerLetraAnt = usuarios[i - 1].getUsuario().charAt(0);
//				numeroLetraAnt = (int) primerLetraAnt;
//				
//
//			}
	// evaluar si usuarios[i-1] es menor a usuarios[i]
	// si es menor usuarios[i-1] mantiene su posicion
	// caso contrario, intercambia la posicion con usuarios[i]
}
