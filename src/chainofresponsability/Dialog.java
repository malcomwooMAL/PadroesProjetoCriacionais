package chainofresponsability;

import java.util.ArrayList;

public class Dialog extends Container{
    static public ArrayList <String> wikiPageUrRL = new ArrayList<String>();

    void shoeHelp(){
        if (wikiPageUrRL != null) {
            // faz alguma coisa
        } else {
            super.showHelp();
        }
    }
}
