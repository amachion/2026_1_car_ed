import java.util.Scanner;
public class TesteBuscaOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        System.out.print("escolha o tamanho do vetor (0 encerra): ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            // System.out.println(v);
            // System.out.print("digite um valor para busca: ");
            // int x = scanner.nextInt();
            // if (v.buscaLinear(x)) {
            //     System.out.println(x + " foi encontrado no  vetor");
            // }
            // else {
            //     System.out.println(x + " nao foi encontrado no vetor");
            // }
            System.out.println("ordenando...");
            v.bubble();
            System.out.println("\nvetor ordenado:");
            //System.out.println(v);

            System.out.print("escolha o novo tamanho do vetor (0 encerra): ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
