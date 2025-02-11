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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }
}