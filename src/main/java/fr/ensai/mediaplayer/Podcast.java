package fr.ensai.mediaplayer;

/**
 * Représente un podcast avec ses attributs principaux.
 */
public class Podcast extends Media {
    // Attributes
    private String title;
    private String host;
    private String topic;
    private int duration;
    private int year;
    private String subtitles;

    /**
    * Construit un nouveau podcast.
    */
    // Constructor
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(subtitles, duration, year);
        this.host = host;
        this.topic = topic;
        this.duration = duration;
        this.subtitles = subtitles;
    }

    /**
    * Affiche les sous-titres d'un podcast.
    */
    @Override
    public void play() {
        String[] words = subtitles.split(" ");

        for (String word : words) {

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
    * Représentation sous forme de chaîne de caractère d'un podcast et de son présentateur.
    */
    @Override
    public String toString() {
        return "Podcast " + this.title + " by " + this.host;
    }
}
