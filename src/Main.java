import com.github.javafaker.Faker;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();

        Persona persona = new Persona();
        persona.setNombre(faker.name().firstName());
        persona.setApellidoPaterno(faker.name().lastName());
        persona.setApellidoMaterno(faker.name().lastName());
        persona.setEdad(faker.number().numberBetween(18,60));
        persona.setDireccion(faker.address().streetAddress());

        System.out.println(persona);

    }
}
