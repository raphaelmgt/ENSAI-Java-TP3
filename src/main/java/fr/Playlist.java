package fr;

import java.util.Collections;
import java.util.List;

/**
 * Represente une playlist avec ses attributs principaux.
 */
public class Playlist {
    // Attributes
    protected String name;
    protected List<Media> mediaList;
    protected int totalDuration;

    /**
     * Construction d'une nouvelle playlist.
     */
    // Constructor
    public Playlist(String name, List<Media> medialList, int totalDuration) {
        this.name = name;
        this.mediaList = medialList;
        this.totalDuration = totalDuration;
    }

    /**
     * Permet d'ajouter un média à une playlist.
     */
    public void addMedia(Media media) {
        mediaList.add(media);
        totalDuration += media.duration;
    }

    /**
     * Permet de retirer toutes les occurences d'un média d'une playlist.
     */
    public void removeMedia(Media media) {
        while (mediaList.contains(media)) {
            mediaList.remove(media);
            totalDuration -= media.duration;
        }
    }

    /**
     * Permet de retirer le i-ième élément d'une playlist ou d'afficher un message
     * d'erreur si cet élément n'existe pas.
     */
    public void removeMedia(int i)
            throws IllegalArgumentException {
        if (mediaList.size() < i)
            throw new IllegalArgumentException(
                    "The playlist does not have " + i + "-th element.");
        mediaList.remove(i);
    }

    /**
     * Permet de jouer les médias d'une playlist, éventuellement de façon aléatoire.
     */
    public void play(Boolean random) {
        if (random) {

            Collections.shuffle(mediaList);

            for (Media media : mediaList) {
                media.play();
            }
        } else {
            for (Media media : mediaList) {
                media.play();
            }
        }
    }

    /**
     * Permet de réaliser une copie d'une playlist.
     */
    public Playlist copyPlaylist() {
        Playlist playlist = new Playlist(name, mediaList, totalDuration);
        return playlist;
    }
}
