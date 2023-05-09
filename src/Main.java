import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maior diferença entre dois vetores");
        int y[] = new int[6];
        int maiorDiferenca = 0;
        int menorDiferenca = Integer.MAX_VALUE;
        int opcao;
        Scanner s = new Scanner(System.in);
        do {
            for (int i = 0; i < y.length; i++) {
                System.out.println("Digite um número");
                y[i] = s.nextInt();
            }
            for (int i = 0; i < y.length - 1; i++) {
                int diferenca = (y[i] - y[i + 1]);
                if (diferenca > maiorDiferenca) {
                    maiorDiferenca = diferenca;
                }
                if (diferenca < menorDiferenca) {
                    menorDiferenca = diferenca;
                }
            }
            System.out.println("teste");
            if (menorDiferenca < 0) {
                System.out.println("A maior diferença entre números é de " + menorDiferenca * (-1));
            } else {
                System.out.println("A maior diferença entre números é de " + maiorDiferenca);
            }
            System.out.println("Quer continuar?");
            System.out.println("1 - Não");
            System.out.println("Qualquer outro número- Sim");
            opcao = s.nextInt();
        } while (opcao!=1);
    }
}