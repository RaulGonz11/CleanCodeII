import java.util.List;

public class BuenaPractica {
    public void procesar(List<String> datos) {
        for (String dato : datos) {
            if (esValido(dato)) {
                procesarDato(dato);
            }
        }
    }

    private boolean esValido(String dato) {
        return dato != null && !dato.isEmpty();
    }

    private void procesarDato(String dato) {
        // Lógica clara y concisa...
        System.out.println("Procesando: " + dato);
    }
}
