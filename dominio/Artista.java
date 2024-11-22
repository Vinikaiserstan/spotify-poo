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

    public void addAlbum(Album album) {
        albuns.add(album);
    }

    @Override
    public String toString() {
        return "Artista: " + nome + " | Álbuns: " + albuns.size();
    }

    public List<Album> getAlbuns() {
        return albuns;
    }
}
