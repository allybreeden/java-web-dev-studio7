package org.launchcode.studio7;

public class CD extends BaseDisc {

    private final String genre;

    public CD(String title, String author, String discType, String productionCo, String genre) {
        super(title, author, discType, productionCo);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
