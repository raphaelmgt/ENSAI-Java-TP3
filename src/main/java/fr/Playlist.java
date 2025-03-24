package fr;

import java.util.Collections;
import java.util.List;


public class Playlist {
    // Attributes
    protected String name;
    protected List<Media> mediaList;
    protected int totalDuration;

    // Constructor
    public Playlist(String name, List<Media> medialList, int totalDuration) {
        this.name = name;
        this.mediaList = medialList;
        this.totalDuration = totalDuration;
    }
    
    public void addMedia(Media media) {
        mediaList.add(media);
        totalDuration += media.duration;
    }

    public void removeMedia(Media media) {
        while (mediaList.contains(media)) {
            mediaList.remove(media);
            totalDuration -= media.duration;
        }
    }

    public void removeMedia(int i)
            throws IllegalArgumentException {
        if (mediaList.size() < i) 
            throw new IllegalArgumentException(
                "The playlist does not have " + i + "-th element."
            );
        mediaList.remove(i);
    }

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

    public Playlist copyPlaylist() {
        Playlist playlist = new Playlist(name, mediaList, totalDuration);
        return playlist;
    }
}
