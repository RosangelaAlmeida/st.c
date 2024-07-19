import java.util.Scanner;

public class ProvasEmedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas provas você fez? ");
        int numeroProvas = scanner.nextInt();

        if (numeroProvas <= 0) {
            System.out.println("Nº de provas tem que ser maior que zero.");
            return;
        }

        int[] notas = new int[numeroProvas];
        int soma = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;

        for (int i = 0; i < numeroProvas; i++) {
            System.out.print("Qual foi sua nota? ");
            int nota = scanner.nextInt();

            while (nota < 0 || nota > 100) {
                System.out.print("Informe uma nota válida " + "(0 a 100): ");
                nota = scanner.nextInt();
            }

            notas[i] = nota;
            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double media = (double) soma / numeroProvas;

        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}