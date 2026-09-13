public class Tema54 {
    public static void main(String[] args) {
        int numero = 432; // ejemplo de número
        int suma = sumarDigitos(numero); // llamamos a la función para sumar los dígitos
        System.out.println("La suma de los dígitos es: " + suma); // imprimimos el resultado
    }
    public static int sumarDigitos(int numero) { 
    if (numero < 10) { 
        return numero; // caso base: ya es un solo dígito 
    } 
    // último dígito (numero % 10) + suma recursiva del resto (numero / 10) 
    return (numero % 10) + sumarDigitos(numero / 10); 
}
}
