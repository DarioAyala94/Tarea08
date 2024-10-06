
package programas;
import java.util.Scanner;
public class tarea3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        
        // Inicializar la variable factorial en 1
        int factorial = 1;
        
        // Estructura repetitiva for para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // factorial = factorial * i
        }
        
        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
