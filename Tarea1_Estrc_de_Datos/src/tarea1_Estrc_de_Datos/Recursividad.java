package tarea1_Estrc_de_Datos;
import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
while (!salir) {
        System.out.println("Menu");
        System.out.println("1. Serie de Fibonacci");
        System.out.println("2. Calculo de Potencia");
        System.out.println("3. Suma de Digitos");
        System.out.println("4. Salir");
        System.out.print("Ingrese la opcion deseada (1/2/3): ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el numero de terminos de la serie de Fibonacci: ");
                int n = scanner.nextInt();
                System.out.println("Serie de Fibonacci:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                break;

            case 2:
                System.out.print("Ingrese la base: ");
                int base = scanner.nextInt();
                System.out.print("Ingrese el exponente: ");
                int exponente = scanner.nextInt();
                int resultadoPotencia = calcularPotencia(base, exponente);
                System.out.println("Resultado de la potencia: " + resultadoPotencia);
                break;

            case 3:
                System.out.print("Ingrese un numero: ");
                int numero = scanner.nextInt();
                int sumaDigitos = sumaDigitos(numero);
                System.out.println("Suma de los digitos: " + sumaDigitos);
                break;
                
            case 4:
                    salir = true;
                    break;

            default:
                System.out.println("Opcion no valida.");
        }

   
    }
    }
    // Función recursiva para calcular el término n de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Función recursiva para calcular la potencia de un número
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, exponente - 1);
    }

    // Función recursiva para sumar los dígitos de un número
    public static int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero % 10 + sumaDigitos(numero / 10);
    }
}
