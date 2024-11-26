package dominio;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private List<Album> albuns;

    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public void adicionarAlbum(Album album) {
        albuns.add(album);
    }

    public String getNome() {
        return nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }
}
