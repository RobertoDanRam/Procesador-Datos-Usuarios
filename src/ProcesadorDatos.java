import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcesadorDatos {
    public List<Usuario> procesarDatos(String rutaArchivo) {
        List<Usuario> usuarios = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                try {
                    String[] datos = linea.split(",");
                    if (datos.length != 3) {
                        throw new ArrayIndexOutOfBoundsException("Formato de línea inválido: " + linea);
                    }

                    String nombre = datos[0];
                    int edad = Integer.parseInt(datos[1]);
                    String email = datos[2];

                    if (!email.contains("@")) {
                        throw new IllegalArgumentException("Email inválido: " + email);
                    }

                    usuarios.add(new Usuario(nombre, edad, email));
                } catch (NumberFormatException e) {
                    System.out.println("Error al convertir la edad a número: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return usuarios;
    }
}
