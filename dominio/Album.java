package dominio;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Artista artista;
    private int ano;
    private List<Musica> musicas;

    public Album(String nome, Artista artista, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public String getNome() {
        return nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
