 public class NossoVetor {
    private int[] v;
    private int capacidade;
    private int ocupacao;
    public NossoVetor (int capacidadeInicial) {
        v = new int[capacidadeInicial];
        capacidade = capacidadeInicial;
        ocupacao = 0;
    }
    // public NossoVetor () {
    //     v = new int[10];
    //     capacidade = 10;
    //     ocupacao = 0;
    // }
    public NossoVetor() {
        this(10);
    }
    public boolean estaCheio1 () {
        if (capacidade == ocupacao) return true;
        else return false;
    }
    public boolean estaCheio2 () {
        if (capacidade == ocupacao) return true;
        return false;
    }
    public boolean estaCheio3 () {
        return capacidade == ocupacao;
    }
    public boolean estaCheio4 () {
        return capacidade == ocupacao ? true : false;
    }
    // public boolean adiciona (int e) {
    //     if (estaCheio3()) return false;
    //     v[ocupacao++] = e;
    //     //ocupacao++;
    //     return true;
    // }
    private void dobra () {
        int[] temp = new int[capacidade * 2];
        for (int i=0; i<ocupacao; i++) {
            temp[i] = v[i];
        }
        v = temp;
        capacidade = capacidade * 2;
    }
    public void adiciona (int e) {
        if (estaCheio3()) dobra();
        v[ocupacao++] = e;
    }
    public boolean estaVazio () {
        return ocupacao == 0;
    }
    public int remove () {
        if (estaVazio()) return -1;
        // ocupacao--;
        return v[--ocupacao];
    }

    @Override
    public String toString() {
        if (estaVazio()) return "vetor vazio\n";
        String s = "capacidade = " + capacidade + ", ocupacao = " + ocupacao + "\n";
        for (int i=0; i < ocupacao; i++) 
            s = s + v[i] + " ";
        return s + "\n";
    }
}
