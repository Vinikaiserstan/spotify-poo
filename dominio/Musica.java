package dominio;
public class Musica {
    private String nome;
    private String genero;
    private int duracao; // em segundos
    private String artista;

    public Musica(String nome, String genero, int duracao, String artista) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.artista = artista;
    }

    public void tocar() {
        System.out.println("Tocando: " + nome + " por " + artista);
    }

    public void parar() {
        System.out.println("Música pausada: " + nome);
    }

    @Override
    public String toString() {
        return "Música: " + nome + " | Artista: " + artista + " | Gênero: " + genero + " | Duração: " + duracao + "s";
    }
}
