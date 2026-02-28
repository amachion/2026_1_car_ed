public class NossoVetor {
    private int[] v;
    private int capacidade;
    private int ocupacao;
    public NossoVetor (int capacidadeInicial) {
        v = new int[capacidadeInicial];
        capacidade = capacidadeInicial;
        ocupacao = 0;
    }
    public NossoVetor () {
        v = new int[10];
        capacidade = 10;
        ocupacao = 0;
    }
    
}
