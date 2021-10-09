package ar.edu.unlam.dominio;

public class Usuario {
	private String usuario;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;

	public Usuario(String usuario, String contrase�a, String nombre, String apellido, int dni, int edad) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;

	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getContrase�a() {
		return this.contrase�a;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// 1- En la clase Usuario desarrolle el m�todo �laContrase�aEsValida�. Para eso
	// considera que una contrase�a es v�lida si cumple con las siguientes
	// condiciones:
	public boolean laContrase�aEsValida(String contrase�a) {
		int searchNumber[] = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
		boolean validez = false;

		if (contrase�a.length() >= 8) {
			for (int i = 0; i < contrase�a.length(); i++) {
				char caracter = contrase�a.charAt(i);
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

	// 2- En la clase Usuario desarrolle el m�todo �esMayorDeEdad�, considerando
	// como mayores aquellos usuarios que tienen al menos 18 a�os.
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
