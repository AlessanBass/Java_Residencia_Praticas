import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    public static void main(String[] args) {
        int[] arrayRandon = arrayAleatorio();
        int[] arrayUser = arrayUsuario();

        System.out.println("Mostrando Dados do Array Aleatorio: ");
        mostraArray(arrayRandon);
        System.out.println("Soma do seus elementos eh = " + somaElementosArray(arrayRandon));
        System.out.println("O menor elemento do array eh: ["+ encontraMenorElemento(arrayRandon) +"]");
        System.out.println("O maior elemento do array eh: ["+ encontraMaiorElemento(arrayRandon) +"]");

        System.out.println("------------------------------------------");

        System.out.println("Mostrando Dados do Array Inserido Pelo Usuario: ");
        mostraArray(arrayUser);
        System.out.println("Soma do seus elementos eh = " + somaElementosArray(arrayUser));
        System.out.println("O menor elemento do array eh: ["+ encontraMenorElemento(arrayUser) +"]");
        System.out.println("O maior elemento do array eh: ["+ encontraMaiorElemento(arrayUser) +"]");
    }

    public static int[] arrayAleatorio(){
        Random gerador = new Random();
        int[] array =  new int[3];

        for(int i = 0; i<3; i++){
            array[i] = gerador.nextInt(100);
        }

        return array;
    }

    public static int[] arrayUsuario(){
        Scanner ler = new Scanner(System.in);
        int[] array =  new int[3];

        for(int i = 0; i<3; i++){
            System.out.println("Informe o valo da posicao ["+i+"] do array: ");
            array[i] = ler.nextInt();
        }

        return array;
    }

    public static void mostraArray(int[] array){
        for(int i = 0; i<3; i++){
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    public static int somaElementosArray(int[] array){
        int soma = 0;
        for(int i = 0; i<3; i++){
            soma+=array[i];
        }
        return soma;
    }

    public static int encontraMenorElemento(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static int encontraMaiorElemento(int[] array){
        Arrays.sort(array);
        return array[2];
    }
}
