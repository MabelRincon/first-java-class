package dev.mabel.persona;

public final class App {
    private App() {}

    public static void main(String[] args) {
        System.out.println("My First Java Class");

        Persona chiquito = new Persona(
            "Chiquito",
            "De La Calzada",
            "987654321",
            1932
            );
        System.out.println(chiquito.toString());
    }
}