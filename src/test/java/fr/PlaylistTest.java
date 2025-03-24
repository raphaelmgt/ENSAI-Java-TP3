package fr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PlaylistTest {

    @Test
    void testAddMediaValid() {
        // GIVEN
        Artist jacques = new Artist("Jacques", "Brel", "Belgique");
        Song song = new Song(
            "Amsterdam",
            jacques,
            1964,
            180, 
            "Dans le port d’Amsterdam\n" + //
            "Y a des marins qui chantent\n" + //
            "Les rêves qui les hantent\n" + //
            "Au large d’Amsterdam\n" + //
            "Dans le port d’Amsterdam ",
            null,
            null
        );
        Playlist playlist = new Playlist("Playlist-1", new ArrayList<Media>(), 0);

        // WHEN
        playlist.addMedia(song);

        // THEN
        assertEquals(1, playlist.mediaList.size());
    }

    @Test
    void testRemoveMediaValid() {
        // GIVEN
        Artist jacques = new Artist("Jacques", "Brel", "Belgique");
        Song song = new Song(
            "Amsterdam",
            jacques,
            1964,
            180, 
            "Dans le port d’Amsterdam\n" + //
            "Y a des marins qui chantent\n" + //
            "Les rêves qui les hantent\n" + //
            "Au large d’Amsterdam\n" + //
            "Dans le port d’Amsterdam ",
            null,
            null
        );
        List<Media> medialList = new ArrayList<Media>();
        medialList.add(song);

        Playlist playlist1 = new Playlist("Playlist-1", medialList, 0);
        medialList.add(song);
        Playlist playlist2 = new Playlist("Playlist-1", medialList, 0);

        // WHEN
        playlist1.removeMedia(song);
        playlist2.removeMedia(song);

        // THEN
        assertEquals(0, playlist1.mediaList.size());
        assertEquals(0, playlist2.mediaList.size());
    }
}
