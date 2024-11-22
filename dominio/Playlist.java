package dominio;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarPlaylist() {
        System.out.println("Tocando playlist: " + nome);
        for (Musica musica : musicas) {
            musica.tocar();
        }
    }

    @Override
    public String toString() {
        return "Playlist: " + nome + " | Total de Músicas: " + musicas.size();
    }
}
