package controller;

import java.util.Scanner;

public class EjerciciosBasicos {
    public static void ej1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número: ");
        int n = scanner.nextInt();
        for(int i = 0; i < 2*n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }

    public static void ej2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar n: ");
        int n = scanner.nextInt();
        System.out.println("Ingresar m: ");
        int m = scanner.nextInt();
        for(int i = 0; i < n; i ++) {
            System.out.println(m * i);
        }
        scanner.close();
    }

    public static boolean esPrimo(int n){
        if (n > 2 && n % 2 == 0) return false;

        for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void ej3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();
        System.out.println(esPrimo(n));
        scanner.close();
    }

    public static void ej4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        int contador = 0;

        for (int i = 2; contador < n; i++){
            if (esPrimo(i)){
                System.out.println(i);
                contador++;
            }
        }

        scanner.close();
    }

    public static void ej5() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese d: ");
        char d = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; contador < n; i++){

            int contadorD = 0;

            for(char c: String.valueOf(i).toCharArray()){
                if (c == d) contadorD++;
            }

            if (contadorD >= m) {
                System.out.println(i);
                contador++;
            }
        }

        scanner.close();
    }
    public static void main(String[] args) {
        ej5();
    }
}
