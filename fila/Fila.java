public class Fila <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    //construtor padrão
    public boolean filaVazia () {
        return primeiro == null;
    }
    public void enfileira (T info) {
        No<T> novo = new No<>(info);
        if (filaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public T desenfileira () throws Exception {
        if (filaVazia())
            throw new Exception("fila vazia");
        T copia = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null; //evita memory leak
        return copia;
    }
    @Override
    public String toString () {
        if (filaVazia()) return "fila vazia";
        String s = "";
        No<T> runner = primeiro;
        while (runner != null) {
            s += runner + "->";
            runner = runner.getProximo();
        }
        return s + "\\\\";//lembre-se das sequências de scape
    }
}
