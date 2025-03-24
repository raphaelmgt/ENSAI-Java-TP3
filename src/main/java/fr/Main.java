package fr;

public class Main {
    
    public static void main(String[] args) {
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

        song.play();

    }
}
