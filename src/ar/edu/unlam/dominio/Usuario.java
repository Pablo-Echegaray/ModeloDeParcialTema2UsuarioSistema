package ar.edu.unlam.dominio;

public class Usuario {
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;

	public Usuario(String usuario, String contraseña, String nombre, String apellido, int dni, int edad) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;

	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// 1- En la clase Usuario desarrolle el método “laContraseñaEsValida”. Para eso
	// considera que una contraseña es válida si cumple con las siguientes
	// condiciones:
	public boolean laContraseñaEsValida(String contraseña) {
		int searchNumber[] = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
		boolean validez = false;

		if (contraseña.length() >= 8) {
			for (int i = 0; i < contraseña.length(); i++) {
				char caracter = contraseña.charAt(i);
				// System.out.println("caracter: " + caracter);
				int numero = caracter;
				// System.out.println("numero: " + numero);
				for (int j = 0; j < searchNumber.length; j++) {
					if (searchNumber[j] == numero) {
						validez = true;
					}
				}
			}
		}
		return validez;
	}

	// 2- En la clase Usuario desarrolle el método “esMayorDeEdad”, considerando
	// como mayores aquellos usuarios que tienen al menos 18 años.
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
