package br.com.poo.portugol_lista1;

import java.util.Scanner;

public class Atena {

    static double conversor(int celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        int tempCelsius = sc.nextInt();

        double tempFahrenheit = conversor(tempCelsius);

        System.out.println("Temperatura em graus Celsius: " + tempCelsius + "°");
        System.out.println("Temperatura em graus Fahrenheit: " + tempFahrenheit + "°");

        sc.close();
    }
}
