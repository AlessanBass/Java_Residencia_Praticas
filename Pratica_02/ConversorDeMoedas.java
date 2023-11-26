import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float taxaDeCambio = 0;
        float dolares = 0;
        System.out.println("CONVERSOR DE DOLAR PARA REAL");

        System.out.println("Informe o valor em dolar: USD ");
        dolares = ler.nextFloat();

        System.out.println("Informe a taxa de cambio: ");
        taxaDeCambio = ler.nextFloat();

        System.out.println("O valor em USD: " + dolares + " em reais eh: R$" + (dolares * taxaDeCambio));
    }
}
