import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao, x, y;

        do {
            System.out.println(">>> CALCULADORA <<<");
            System.out.println("[1] SOMA");
            System.out.println("[2] SUBTRACAO");
            System.out.println("[3] MULTIPLICACAO");
            System.out.println("[4] DIVISAO");
            System.out.println("[0] SAIR");
            System.out.println("Informe a opcao: ");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe o valor de x: ");
                    x = ler.nextInt();

                    System.out.println("Informe o valor de y: ");
                    y = ler.nextInt();

                    System.out.println("Resultado: " + (x+y));
                break;

                case 2:
                    System.out.println("Informe o valor de x: ");
                    x = ler.nextInt();

                    System.out.println("Informe o valor de y: ");
                    y = ler.nextInt();

                    System.out.println("Resultado: " + (x-y));
                break;

                case 3:
                    System.out.println("Informe o valor de x: ");
                    x = ler.nextInt();

                    System.out.println("Informe o valor de y: ");
                    y = ler.nextInt();

                    System.out.println("Resultado: " + (x*y));
                break;

                case 4:
                    System.out.println("Informe o valor de x: ");
                    x = ler.nextInt();

                    System.out.println("Informe o valor de y: ");
                    y = ler.nextInt();

                    if(y == 0){
                        System.out.println("ERRO! Impossivel dividir por 0");
                    }else{
                        System.out.println("Resultado: " + (x/y));
                    }
                break;

                case 0:
                break;

                default:
                    System.out.println("Opcao invalida! Tente novamente...");
                break;
            }

        }while (opcao != 0);

    }
}
