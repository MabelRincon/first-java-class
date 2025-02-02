package dev.mabel.persona;

public class Persona {
    public String firstName;
    public String lastName;
    public String idNumber;
    public int birthYear;

    public Persona(String firstName, String lastName, String idNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Hola, " +
                "soy " + firstName + " " + lastName +
                ", mi número de identidad es " + idNumber +
                " y nací en el año " + birthYear + " despues de los dolores.";
            }
}