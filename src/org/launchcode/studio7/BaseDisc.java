package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {

    private final String title;
    private final String author;
    private final String discType;
    private final String productionCo;

    private ArrayList<File> files = new ArrayList<>();


    public BaseDisc(String title, String author, String discType, String productionCo) {
        this.title = title;
        this.author = author;
        this.discType = discType;
        this.productionCo = productionCo;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscType() {
        return discType;
    }

    public String getProductionCo() {
        return productionCo;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public String toString() {
        return "\n" + discType + "\n" +
                "\n" + author + "\n" +
                "\n" + productionCo + "\n";
    }
}
