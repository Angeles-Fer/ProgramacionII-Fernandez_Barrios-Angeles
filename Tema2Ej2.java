import java.util.Scanner; // importamos la clase Scanner para poder leer datos desde la consola
public class Tema2Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creamos un objeto Scanner para leer datos desde la consola
        int n; // declaramos una variable entera n para almacenar el número ingresado por el usuario
        System.out.println("Ingrese un número entero para saber si es primo o no: ");
        n = sc.nextInt(); // Leemos el numero ingresado.
        if (n < 0) { // Si el número ingresado es negativo.
            System.out.println("El número ingresado es negativo.");
        } else if (n <2) { // Si el número ingresado es menor que 2.
            System.out.println("el numero ingresado no es primo.");
        } else {
            int cont=0; // declaramos la variable para contar la cantidad de 0
            for (int i = 1; i <= n; i++) {// recorremos todos los números desde 1 hasta n
                if (n % i == 0) {// verificamos si n es divisible por i
                    cont++; // si lo es lo contamos
                }
            }
            if (cont == 2) {    // Si el contador es igual a 2, significa que n solo tiene dos divisores por lo tanto es primo
                System.out.println("El número ingresado es primo.");
            } else {
                System.out.println("El número ingresado no es primo.");
            }
        }
    }
}
