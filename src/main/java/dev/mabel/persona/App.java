package dev.mabel.persona;

import java.util.Scanner;

public final class App {
    private App() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String firstName = scanner.nextLine();

        System.out.println("Escribe tu apellido: ");
        String lastName = scanner.nextLine();

        System.out.println("Escribe tu número de identidad: ");
        String idNumber = scanner.nextLine();

        int birthYear;
        while (true) {
            System.out.println("¿Cuál es tu año de nacimiento? ");
            birthYear = scanner.nextInt();
            if (birthYear < 1900 || birthYear > 2023) {
                System.out.println("El año debe estar entre 1900 y 2023");
            } else {
                break;
            }
        }

        Persona persona = new Persona(firstName, lastName, idNumber, birthYear);
        System.out.println(persona);

        scanner.close();


    }
}