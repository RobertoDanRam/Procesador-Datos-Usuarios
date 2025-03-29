import java.util.List;

public class App {
    public static void main(String[] args) {
        ProcesadorDatos procesador = new ProcesadorDatos();
        List<Usuario> usuarios = procesador.procesarDatos("datos_usuario.txt");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
