package restaurante;

public class Restaurante {

    public static void main(String[] args) {

        EstimaciónPolbo estimacion = new EstimaciónPolbo();

        estimacion.EngadirPatacas(10);
        estimacion.EngadirPolbo(30);
        estimacion.AmosarPolbo(200);
        estimacion.AmosarPatacas(300);
        estimacion.getClientes();
        estimacion.Mostralotodo();

    }
}
