package fr;

public class Artist {
    // Attributes
    protected String firstName;
    protected String lastName;
    protected String nationality;

    // Constructor
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String toString() {
        return "Artist " + firstName + lastName;
    }
}
