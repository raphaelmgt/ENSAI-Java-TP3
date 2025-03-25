package fr.ensai.mediaplayer;

/**
* Représente un média avec ses attributs principaux.
*/
public abstract class Media {
    // Attributes
    protected String title;
    protected int duration;
    protected int year;

    /**
    * Permet de construire un média.
    */
    // Constructor
    public Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    /**
    * Permet de jouer un média (chanson ou podcast).
    */
    public abstract void play();

    /**
    * Représentation sous forme de chaîne de caractère d'un média.
    */
    public abstract String toString();
}
