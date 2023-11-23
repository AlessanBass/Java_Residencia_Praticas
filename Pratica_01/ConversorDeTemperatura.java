import java.util.Scanner;

public class ConversorDeTemperatura {
    public static float celsiusForFah(float temp){
        return (temp *9/5) + 32;
    }

    public static float fahForCelsius(float temp){
        return (float) ((temp -32) / 1.8);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = -1;
        float temperadura = 0;
        do {
            System.out.println("[1] CONVERTER CELSIUS PARA FAHRENHEIT");
            System.out.println("[2] CONVERTER FAHRENHEIT PARA CELSIUS");
            System.out.println("[3] SAIR");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe a temperatura em Celsius: ");
                    temperadura = ler.nextFloat();
                    System.out.println(temperadura + " Celsius em Fahrenheit eh: " + celsiusForFah(temperadura));
                    break;

                case 2:
                    System.out.println("Informe a temperatura em Fahrenheit: ");
                    temperadura = ler.nextFloat();
                    System.out.println(temperadura + " Fahrenheit em Celsius eh: " + fahForCelsius(temperadura));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while(opcao != 0);
    }
}
