import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double montoPagado = 0;
        System.out.print("Ingrese el monto Pagado: ");
        montoPagado = sc.nextDouble();

        if (montoPagado >= 50000) {
            System.out.println("Pago Completo.");
        } else {
            System.out.println("Pago Insuficiente.");
        }
    }
}
