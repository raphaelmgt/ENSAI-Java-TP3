package fr;

/**
 * Represente un artiste avec ses attributs principaux.
 */
public class Artist {
    // Attributes
    protected String firstName;
    protected String lastName;
    protected String nationality;

    /**
    * Construit un nouvel artiste.
    */
    // Constructor
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    /**
     * Representation d'un artiste sous forme d'une chaîne de caractère.
     */
    public String toString() {
        return "Artist " + firstName + lastName;
    }
}
