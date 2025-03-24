package fr;

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
    }

    public void removeMedia(Media media) {
        while (mediaList.contains(media)) {
            mediaList.remove(media);
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
}
