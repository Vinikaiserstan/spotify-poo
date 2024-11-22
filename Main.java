import dominio.Musica;
import dominio.Artista;
import dominio.Playlist;
import dominio.Album;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista();
        Album album = new Album();
        artista.addAlbum(album);

        Musica musica1 = new Musica();
        Musica musica2 = new Musica();

        album.addMusica(musica1);
        album.addMusica(musica2);

        Playlist playlist = new Playlist();
        playlist.addMusica(musica1);
        playlist.addMusica(musica2);

        System.out.println(artista);
        System.out.println(album);
        System.out.println(playlist);

        playlist.tocarPlaylist();
    }
}
