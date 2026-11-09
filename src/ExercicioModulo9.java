import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioModulo9 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao =0;

        do {
            System.out.println("Digite o numero a ser calculado: ");
            int numero = scanner.nextInt();
            System.out.println("Tabuada do " + numero + ":");

            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }

                System.out.println();
                System.out.println("Digite 1 para continuar ou 2 para sair!");
                opcao = scanner.nextInt();

                if (opcao == 1)
                    scanner.nextLine();
                    System.out.println("Digite uma palavra ou frase:");
                    String frase = scanner.nextLine();
                    System.out.println(frase);

                if (opcao == 2){
                    System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                }

            }while (opcao != 2);




    }

}
