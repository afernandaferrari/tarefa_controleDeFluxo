import java.util.Scanner;

public class calculoMedia {

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---- Cálculo de Médias ----");
        System.out.println("Digite suas 4 médias para saber o resultado final:");

        System.out.println("1ª nota: "); int nota1 = s.nextInt();
        System.out.println("2ª nota: "); int nota2 = s.nextInt();
        System.out.println("3ª nota: "); int nota3 = s.nextInt();
        System.out.println("4ª nota: "); int nota4 = s.nextInt();

        int quant = 4;

        int media = (nota1 + nota2 + nota3 + nota4) / quant;

        System.out.println("Média final: " + media);

        if (media >= 7) {
                System.out.println("Você está Aprovado");
        } else if (media >= 5) {
                System.out.println("Você está de Recuperação");
        } else {
                System.out.println("Você está Reprovado");
        }

}
}
