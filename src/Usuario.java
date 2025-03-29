public class Usuario {
    private String nombre;
    private int edad;
    private String email;

    public Usuario(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario { Nombre: " + nombre + ", Edad: " + edad + ", Email: " + email + " }";
    }
}
