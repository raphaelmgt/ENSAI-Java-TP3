package fr;

public class Podcast extends Media {
    // Attributes
    private String title;
    private String host;
    private String topic;
    private int duration;
    private int year;
    private String subtitles;

    // Constructor
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(subtitles, duration, year);
        this.host = host;
        this.topic = topic;
        this.duration = duration;
        this.subtitles = subtitles;
    }

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

    @Override
    public String toString() {
        return "Song " + this.title + " by " + this.host;
    }
}
