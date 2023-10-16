
package tarea1_Estrc_de_Datos;

import java.util.Random;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[15];
        boolean salir = false;
        Random rand = new Random();

        while (!salir) {
            System.out.println("Menu de la Estacion Meteorologica");
            System.out.println("1. Mostrar datos");
            System.out.println("2. Obtener maximos y minimos");
            System.out.println("3. Calcular el promedio de las temperaturas");
            System.out.println("4. Modificar una temperatura");
            System.out.println("5. Eliminar una temperatura");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            for (int i = 0; i < temperaturas.length; i++) {
                temperaturas[i] = rand.nextInt(41); // Números aleatorios entre 0 y 40
            }

            switch (opcion) {
                case 1:
                    mostrarDatos(temperaturas);
                    break;
                case 2:
                    obtenerMaximosYMinimos(temperaturas);
                    break;
                case 3:
                    calcularPromedio(temperaturas);
                    break;
                case 4:
                    modificarTemperatura(temperaturas);
                    break;
                case 5:
                    eliminarTemperatura(temperaturas);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("Hasta luego!!");
    }

    public static void mostrarDatos(int[] temperaturas) {
        System.out.println("Datos almacenados en el vector:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Hora " + (i + 1) + ": " + temperaturas[i] + "C");
        }
    }

    public static void obtenerMaximosYMinimos(int[] temperaturas) {
        int maximo = temperaturas[0];
        int minimo = temperaturas[0];

        for (int temperatura : temperaturas) {
            if (temperatura > maximo) {
                maximo = temperatura;
            }
            if (temperatura < minimo) {
                minimo = temperatura;
            }
        }

        System.out.println("Temperatura maxima del dia: " + maximo + "C");
        System.out.println("Temperatura minima del dia: " + minimo + "C");
    }

    public static void calcularPromedio(int[] temperaturas) {
        int suma = 0;
        for (int temperatura : temperaturas) {
            suma += temperatura;
        }
        double promedio = (double) suma / temperaturas.length;
        System.out.println("Promedio de las temperaturas: " + promedio + "C");
    }

    public static void modificarTemperatura(int[] temperaturas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora a modificar (1-15): ");
        int hora = scanner.nextInt();

        if (hora >= 1 && hora <= 15) {
            System.out.print("Ingrese la nueva temperatura en C (no mayor a 40C): ");
            int nuevaTemperatura = scanner.nextInt();

            if (nuevaTemperatura <= 40) {
                temperaturas[hora - 1] = nuevaTemperatura;
                System.out.println("Temperatura modificada con exito.");
            } else {
                System.out.println("La temperatura no debe superar los 40C.");
            }
        } else {
            System.out.println("Hora no valida. Debe estar entre 1 y 15.");
        }
    }

    public static void eliminarTemperatura(int[] temperaturas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora a eliminar (1-15): ");
        int hora = scanner.nextInt();

        if (hora >= 1 && hora <= 15) {
            temperaturas[hora - 1] = 0;
            System.out.println("Temperatura eliminada con exito.");
        } else {
            System.out.println("Hora no valida. Debe estar entre 1 y 15.");
        }

    }

}