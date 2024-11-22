import dominio.Musica;
import dominio.Artista;
import dominio.Playlist;
import dominio.Album;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("The Beatles");
        Album album = new Album("Abbey Road", artista, 1969);
        artista.addAlbum(album);

        Musica musica1 = new Musica("Come Together", "Rock", 259, "The Beatles");
        Musica musica2 = new Musica("Here Comes the Sun", "Rock", 185, "The Beatles");

        album.addMusica(musica1);
        album.addMusica(musica2);

        Playlist playlist = new Playlist("Clássicos do Rock");
        playlist.addMusica(musica1);
        playlist.addMusica(musica2);

        System.out.println(artista);
        System.out.println(album);
        System.out.println(playlist);

        playlist.tocarPlaylist();
    }
}
