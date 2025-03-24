package fr;

import java.util.Objects;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Media{
    private Artist singer;
    private String title;
    private int year;
    private int duration;
    private String lyrics;
    private Artist author;
    private Artist composer;

    /**
     * Constructs a new Song object.
     *
     * @param title    The title of the song.
     * @param singer   The singer of the song.
     * @param title    The title of the song.
     * @param year     The year the song was released.
     * @param duration The duration of the song in seconds.
     * @param lyrics   The lyrics of the song.
     * @param author   The author of the song.
     * @param composer The composer of the song.
     */
    public Song(String title, Artist singer, int year, int duration, String lyrics, Artist author, Artist composer) {
        super(title, duration, year);
        this.singer = singer;
        this.lyrics = lyrics;
        this.author = author;
        this.composer = composer;
    }

    @Override
    public void play() {
        String[] paroles = lyrics.split(" ");

        for (String word : paroles) {

            System.out.println(word);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return "Song " + this.title + " by " + this.singer;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.year == otherSong.year &&
                Objects.equals(this.title, otherSong.title) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.singer, this.year);
    }

}