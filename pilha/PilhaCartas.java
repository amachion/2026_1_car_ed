public class PilhaCartas {
    private Carta[] dados;
    private int capacidade;
    private int topo;
    public PilhaCartas(int capacidade) {
        this.capacidade = capacidade;
        this.topo = 0;
        this.dados = new Carta[capacidade];
    }
    public boolean estaVazia() {
        return topo == 0;
    }
    public boolean estaCheia() {
        return topo == capacidade;
    }
    public int tamanho() {
        return topo;
    }
    public boolean empilha (Carta carta) {
        if (estaCheia()) return false;
        dados[topo++] = carta;
        return true;
    }
    public Carta desempilha () {
        if (estaVazia()) return null;
        return dados[--topo];
    }
}
