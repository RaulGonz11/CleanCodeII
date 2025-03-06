public class MalaPractica {
    public void procesar(String[] datos) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] != null && !datos[i].isEmpty()) {
                System.out.println("Procesando: " + datos[i]);
            }
        }
    }
}

