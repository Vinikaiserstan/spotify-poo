package dominio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Musica {
    private String nome;
    private String genero;
    private String artista;
    private int duracao; 
    private String arquivoAudio;
    private Clip clip;

    public Musica(String nome, String genero, String artista, int duracao, String arquivoAudio) {
        this.nome = nome;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
        this.arquivoAudio = arquivoAudio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void tocar() {
        try {
            File audioFile = new File(arquivoAudio);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Erro ao tocar música: " + e.getMessage());
        }
    }

    public void parar() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
