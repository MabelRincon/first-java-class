package dev.mabel.persona_test;

import org.junit.jupiter.api.Test;

import dev.mabel.persona.App;
import dev.mabel.persona.Persona;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(new String[0]);

        String expectedOutput = "My First Java Class\n" +
        "dev.mabel.persona.Persona{firstName='Chiquito', lastName='De La Calzada', idNumber='987654321', birthYear=1932}\n";

        Persona chiquito = new Persona (
            "Chiquito",
            "De La Calzada",
            "987654321",
            1932
    );
    expectedOutput = "My First Java Class\n" + chiquito.toString() + "\n";

    System.setOut(System.out);
    assertEquals(expectedOutput, outContent.toString());
    }
}
