# Procesador de Datos de Usuarios (Evidencia 2)

Programa desarrollado en Java para la lectura, extracción y validación de datos desde archivos de texto plano (CSV). El sistema procesa información de usuarios aplicando un control robusto de errores mediante el manejo estructurado de múltiples excepciones.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **Lectura de Archivos:** Extrae información línea por línea desde el archivo `datos_usuario.txt` utilizando flujos de lectura optimizados.
- **Mapeo de Datos:** Convierte la información extraída (separada por comas) en objetos de tipo `Usuario`.
- **Validación y Manejo de Excepciones:**
  - `FileNotFoundException` / `IOException`: Protege el sistema si el archivo de datos no existe o no puede leerse.
  - `ArrayIndexOutOfBoundsException`: Verifica que cada línea contenga exactamente las tres columnas requeridas (nombre, edad, correo).
  - `NumberFormatException`: Intercepta errores cuando se ingresan letras o caracteres en el campo numérico de edad.
  - `IllegalArgumentException`: Valida que el campo de correo electrónico tenga un formato básico correcto (debe contener el símbolo `@`).
- **Tolerancia a Fallos:** Si una línea del documento contiene errores, el programa notifica el fallo en consola y continúa procesando el resto del archivo sin detener su ejecución.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Entorno de desarrollo:** Visual Studio Code (VSCode)
- **I/O (Entrada/Salida):** `BufferedReader` y `FileReader` para procesamiento eficiente de archivos de texto.
- **Estructuras de datos:** Colecciones dinámicas (`List`, `ArrayList`).
- **Manejo de Excepciones:** Bloques `try-catch` anidados y captura de múltiples tipos de errores.

## Estructura del Código

- `App.java`: Clase principal que inicializa el procesador, solicita la extracción de datos y despliega en consola los usuarios registrados con éxito.
- `ProcesadorDatos.java`: Contiene la lógica central. Se encarga de abrir el archivo, leer su contenido, separar las cadenas, realizar las validaciones correspondientes y manejar las excepciones específicas.
- `Usuario.java`: Modelo de datos (POJO) que representa a cada individuo. Incluye constructores y sobreescritura del método `toString()` para la presentación de los datos.
- `datos_usuario.txt`: Archivo de texto plano de prueba que incluye intencionalmente registros válidos e inválidos para demostrar la eficiencia del manejo de excepciones.
