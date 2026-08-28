public class tema57 {
    public static void main(String[] args) {
        int nume = 54; // ejemplo de número
        int num = 432; // ejemplo de número
        int suma = sumarDigitosIterativo(num); // llamamos a la función para sumar
        long f = factorialIterativo(nume); // llamamos a la función para calcular el factorial
        System.out.println("El factorial de " + nume + " es: " + f);
        System.out.println("La suma de los dígitos  es: " + suma); // imprimimos el resultado
    
}
public static long factorialIterativo(int n) { 
    long resultado = 1; 
    for (int i = 2; i <= n; i++) { 
        resultado *= i; 
    } 
    return resultado; 
} 
// El caso base "número < 10" se reemplaza por la condición de corte del while 
public static int sumarDigitosIterativo(int numero) { 
    int suma = 0; 
    while (numero > 0) { 
        suma += numero % 10;  // último dígito 
        numero /= 10;         // se le quita ese dígito al número 
    } 
    return suma; 
} 
}