package model;

public class Persona {
     private int id_persona;
     private String nombre;
     private String apellido_paterno;
     private String apellido_materno;
     private int edad;
     private String direccion;

     public Persona() {
     }

     public Persona(int id_persona, String nombre, String apellido_paterno, String apellido_materno, int edad, String direccion) {
          this.id_persona = id_persona;
          this.nombre = nombre;
          this.apellido_paterno = apellido_paterno;
          this.apellido_materno = apellido_materno;
          this.edad = edad;
          this.direccion = direccion;
     }

     public int getIdPersona() {
          return id_persona;
     }

     public void setIdPersona(int id_persona) {
          this.id_persona = id_persona;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getApellidoPaterno() {
          return apellido_paterno;
     }

     public void setApellidoPaterno(String apellido_paterno) {
          this.apellido_paterno = apellido_paterno;
     }

     public String getApellidoMaterno() {
          return apellido_materno;
     }

     public void setApellidoMaterno(String apellido_materno) {
          this.apellido_materno = apellido_materno;
     }

     public int getEdad() {
          return edad;
     }

     public void setEdad(int edad) {
          if(edad >= 18 && edad <= 70) {
               this.edad = edad;
          }
     }

     public String getDireccion() {
          return direccion;
     }

     public void setDireccion(String direccion) {
          this.direccion = direccion;
     }

     @Override
     public String toString() {
          return "La persona ID " + id_persona + " " + nombre + " " + apellido_paterno + " " + apellido_materno +
                  " tiene " + edad + " años y vive en " + direccion;
     }
}
