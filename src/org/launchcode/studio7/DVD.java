package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Collections;

public class DVD extends BaseDisc {

    private final ArrayList<String> leadActors = new ArrayList<>();

    public DVD(String title, String author, String discType, String productionCo, String[] actorArray) {
        super(title, author, discType, productionCo);
        Collections.addAll(leadActors, actorArray);
    }

    public ArrayList<String> getLeadActors() {
        return leadActors;
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
