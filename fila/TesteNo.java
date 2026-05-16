public class TesteNo {
    public static void main(String[] args) {
        Musica m1 = new Musica("Si", "Djavan", 300);
        No<Musica> no1 = new No<>(m1);

        Pessoa p1 = new Pessoa("Walt Disney", 1901);
        No<Pessoa> no2 = new No<>(p1);

        System.out.println("no1:\n" + no1);
        System.out.println("no2:\n" + no2);
    }
}
