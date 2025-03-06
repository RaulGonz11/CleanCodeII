package BloqueV;

public class MalaPractica {
    public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
            return 0; 
        }
    }
}
