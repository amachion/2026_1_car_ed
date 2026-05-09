public class Lista {
    private No primeiro;
    //construtor é o padrão
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int info) {
        No novo = new No(info);
        if (!listaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio() throws Exception {
        if (listaVazia()) 
            throw new ListaVaziaException();
        else {
            int temp = primeiro.getInfo();
            primeiro = primeiro.getProximo();
            return temp;
        }
    }
    public void insereFim (int info) {
        No novo = new No(info);
        if (listaVazia())
            primeiro = novo;
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) {
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
    public int removeFim() throws Exception{
        if (listaVazia())
            throw new ListaVaziaException();
        else if (primeiro.getProximo() == null) { //tem um só
            int temp = primeiro.getInfo();
            primeiro = null; //esvaziou a lista
            return temp;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo().getProximo() != null) { //penúltimo
                runner = runner.getProximo();
            }
            int temp = runner.getProximo().getInfo();
            runner.setProximo(null);
            return temp;
        }
    }
    @Override
    public String toString() {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) { //vai até o fim da lista
            s += runner.getInfo() + "->";
            runner = runner.getProximo();
        }
        return s + "//";
    }
}
class ListaVaziaException extends Exception {
    public ListaVaziaException() {
        super("lista esta vazia");
    }
}