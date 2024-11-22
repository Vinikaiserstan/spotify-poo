package dominio;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Artista artista;
    private List<Musica> musicas;
    private int ano;

    public Album(String nome, Artista artista, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public String toString() {
        return "Álbum: " + nome + " | Artista: " + artista + " | Ano: " + ano + " | Total de Músicas: " + musicas.size();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
