package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n;
		
		n = Util.leerInt("Introduzca un número entero: ");
		
		System.out.println("El factorial de: " + n + " es: "+ factorial(n));
	}
	
	public static int factorial(int n) {
		int r;
		if (n == 1) {
			r = 1;
		} else {
			r = n * factorial (n-1);
		}
		return r;
	}

}