package BloqueV;

public class BuenaPractica {
    public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
}
