import dominio.Musica;
import dominio.Artista;
import dominio.Playlist;
import dominio.Album;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayerApp extends JFrame {
    private Playlist playlist;
    private int musicaAtualIndex = 0;

    public MusicPlayerApp() {
        setTitle("Music Player");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Criar Playlist e adicionar músicas
        playlist = new Playlist("Favoritas");
        playlist.adicionarMusica(new Musica("Imagine", "Rock", "John Lennon", 183, "musica1.wav"));
        playlist.adicionarMusica(new Musica("Bohemian Rhapsody", "Rock", "Queen", 354, "musica2.wav"));
        playlist.adicionarMusica(new Musica("Hotel California", "Rock", "Eagles", 390, "musica3.wav"));

        JLabel currentTrackLabel = new JLabel("Tocando: " + playlist.getMusicas().get(musicaAtualIndex).getNome(), SwingConstants.CENTER);
        add(currentTrackLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton nextButton = new JButton("Next");
        JButton prevButton = new JButton("Prev");

        buttonPanel.add(prevButton);
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(nextButton);

        add(buttonPanel, BorderLayout.CENTER);

        playButton.addActionListener(e -> {
            playlist.getMusicas().get(musicaAtualIndex).tocar();
            currentTrackLabel.setText("Tocando: " + playlist.getMusicas().get(musicaAtualIndex).getNome());
        });

        pauseButton.addActionListener(e -> playlist.getMusicas().get(musicaAtualIndex).parar());

        nextButton.addActionListener(e -> {
            playlist.getMusicas().get(musicaAtualIndex).parar();
            musicaAtualIndex = (musicaAtualIndex + 1) % playlist.getMusicas().size();
            playlist.getMusicas().get(musicaAtualIndex).tocar();
            currentTrackLabel.setText("Tocando: " + playlist.getMusicas().get(musicaAtualIndex).getNome());
        });

        prevButton.addActionListener(e -> {
            playlist.getMusicas().get(musicaAtualIndex).parar();
            musicaAtualIndex = (musicaAtualIndex - 1 + playlist.getMusicas().size()) % playlist.getMusicas().size();
            playlist.getMusicas().get(musicaAtualIndex).tocar();
            currentTrackLabel.setText("Tocando: " + playlist.getMusicas().get(musicaAtualIndex).getNome());
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerApp app = new MusicPlayerApp();
            app.setVisible(true);
        });
    }
}