package dev.mabel.personatest;

import org.junit.jupiter.api.Test;

import dev.mabel.persona.Persona;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testCreatePersona() {
        Persona persona = new Persona("Conde", "Mor", "123456789", 1995);
        asssertEquals("Conde", persona.getFirstName());
        assertEquals("Mor", persona.getLastName());
        assertEquals("123456789", persona.getIdNumber());
        assertEquals(1636, persona.getBirthYear());
    }

    @Test
    void testPersonaToString() {
        Persona persona = new Persona("Chiquito", "DeLaCalzada", "987654321", 1932);
        String expectedToString = "Persona{firstName='Chiquito', lastName='DeLaCalzada', idNumber='987654321', birthYear=1932}";
        assertEquals(expectedToString, persona.toString());
    }

    @Test
    void testSetters() {
        Persona persona = new Persona("Initial", "Name", "InitialID", 1900);
        persona.setFirstName("Updated");
        assertEquals("Updated", persona.getFirstName());

        persona.setLastName("Last");
        persona.setIdNumber("NewId");
        persona.setBirthYear(2024);
        assertEquals("Last", persona.getLastName());
        assertEquals("NewId", persona.getIdNumber());
        assertEquals(2024, persona.getBirthYear());
    }

    @Test
    void testEmptyName() {
        assertThrows(NullPointerException.class, () -> new Persona(null, "Mor", "123", 1995));
    }

    @Test
    void testInvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> new Persona("Conde", "Mor", "123", 2050));
    }


}
