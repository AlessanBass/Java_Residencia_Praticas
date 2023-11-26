import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(100);
        int respotaUsuario;
        int tenativas = 0;
        boolean controleLoop = true;

        while (controleLoop){
            System.out.println("Tente acertar o numero: ");
            respotaUsuario =  ler.nextInt();

            if(respotaUsuario == numAleatorio){
                tenativas++;
                System.out.println("Parabens vc acertou! O numero era: " + numAleatorio);
                System.out.println("Numero de tentivas: " + tenativas);
                controleLoop = false;
            }else if(respotaUsuario < numAleatorio){
                System.out.println("Errou! Muito Baixo");
                tenativas++;
            }else{
                System.out.println("Errou! Muito Alto");
                tenativas++;
            }
        }

    }
}
