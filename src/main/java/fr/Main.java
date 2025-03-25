package fr;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Artist jacques = new Artist("Jacques", "Brel", "Belgique");
        Song song1 = new Song(
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
                null,
                Set.of(MusicalStyle.POP, MusicalStyle.CLASSICAL));

        // song1.play();

        Artist rihanna = new Artist("Rihanna", "Fenty", "Barbade");
        Song song2 = new Song(
                "Diamonds",
                rihanna,
                2012,
                210,
                "Shine bright like a diamond\n" + //
                        "Shine bright like a diamond\n" + //
                        "Find light in the beautiful sea, I choose to be happy\n" + //
                        "You and I, you and I, we're like diamonds in the sky\n" + //
                        "You're a shooting star I see, a vision of ecstasy\n" + //
                        "When you hold me, I'm alive, we're like diamonds in the sky\n" + //
                        "I knew that we'd become one right away\n" + //
                        "Oh, right away\n" + //
                        "At first sight, I felt the energy of sun rays\n" + //
                        "I saw the life inside your eyes\n" + //
                        "So shine bright, tonight, you and I\n" + //
                        "We're beautiful like diamonds in the sky\n" + //
                        "Eye to eye, so alive\n" + //
                        "We're beautiful like diamonds in the sky",
                null,
                null,
                Set.of(MusicalStyle.POP, MusicalStyle.RNB));

        // song2.play();

        Podcast podcast = new Podcast(
                "The History of English",
                "Kevin W. Stroud",
                "History",
                300,
                2025,
                "Welcome to the History of English Podcast – a podcast about the history of the English language.\n" + //
                        "This is Episode 182: World of Confusion. This time, as we work our way through the story of\n"
                        + //
                        "English, we’re going to continue to look at events in the early 1600s. It was a time when English\n"
                        + //
                        "was starting to spread around the world as speakers searched for new trading partners and new\n"
                        + //
                        "places to settle. And through that process, English started to become an international language.\n"
                        + //
                        "But as English speakers encountered people and languages in far away places, they sometimes\n"
                        + //
                        "became confused. And that confusion and uncertainty shaped the English language during this\n"
                        + //
                        "period, and it still shapes the language to this day. So we’ll also look at how confusion played a\n"
                        + //
                        "role in the development of English in the early modern period.");

        Playlist p1 = new Playlist("Bonne playlist", new ArrayList<Media>(), 0);

        p1.addMedia(song1);
        p1.addMedia(song2);
        p1.addMedia(podcast);

        Playlist p2 = p1.copyPlaylist();

        p1.removeMedia(song2);

        System.out.println(p1.totalDuration);
        System.out.println(p2.totalDuration);

        p2.play(true);
    }
}
