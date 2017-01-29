import model.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setIdPersona(1);
        persona.setNombre("Jorge");
        persona.setApellidoPaterno("Atempa");
        persona.setApellidoMaterno("Camacho");
        persona.setEdad(29);
        persona.setDireccion("Av. Siempre Viva");

        System.out.println(persona);

    }
}
