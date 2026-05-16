public class TesteFila {
    public static void main(String[] args) {
        Fila<Musica> streaming = new Fila<>();

        Musica m = new Musica("Si", "Djavan", 303);

        streaming.enfileira(m);

        streaming.enfileira(new Musica("Azul", "Gal", 400));

        System.out.println("Meu streaming:\n" + streaming);
        try {
            System.out.println (streaming.desenfileira() + " acabou de tocar");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Seu streaming ainda contem:");
        System.out.println(streaming);
    }
}
