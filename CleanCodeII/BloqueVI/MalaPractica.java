package BloqueVI;

public class MalaPractica {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MalaPractica calc = new MalaPractica();
        int resultado = calc.sumar(2, 3);
        
        if (resultado == 5) {
            System.out.println("Test aprobado");
        } else {
            System.out.println("Test fallido");
        }
    }
}

