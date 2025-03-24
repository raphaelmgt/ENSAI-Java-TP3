package fr;

public abstract class Media {
    // Attributes
    protected String title;
    protected int duration;
    protected int year;

    // Constructor
    public Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }
    
    public abstract void play();

    public abstract String toString();
}

