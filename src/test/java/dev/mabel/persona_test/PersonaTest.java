package dev.mabel.persona_test;

import org.junit.jupiter.api.Test;
import dev.mabel.persona.Persona;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testPersonaAttributes() {
        Persona testPersona = new Persona("Conde", "Mor", "123456789", 1995);
        assertEquals("Conde", testPersona.firstName);
        assertEquals("Mor", testPersona.lastName);
        assertEquals("123456789", testPersona.idNumber);
        assertEquals(1995, testPersona.birthYear);
    }

    @Test
    void testPersonaToString() {
        Persona testPersona = new Persona("Chiquito", "De La Calzada", "987654321", 1932);
        String expectedToString = "Hola, soy Chiquito De La Calzada, mi número de identidad es 987654321 y nací en el año 1932 despues de los dolores.";
        assertEquals(expectedToString, testPersona.toString());
    }
}
