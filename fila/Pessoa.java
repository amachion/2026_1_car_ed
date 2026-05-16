public class Pessoa {
    private String nome;
    private int anoNascimento;
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
    }
    
}
