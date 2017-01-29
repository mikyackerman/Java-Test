package test;

import model.Persona;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by atempa on 29/01/17.
 */
public class PersonaTest {
    Persona persona;

    @Before
    public void initManagedBean() {
        persona = new Persona();

    }

    @Test
    public void testEdad(){
        persona.setEdad(225);
        assertEquals(0, persona.getEdad());
    }
}