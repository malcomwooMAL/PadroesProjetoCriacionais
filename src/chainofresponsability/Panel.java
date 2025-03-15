package chainofresponsability;

import java.util.ArrayList;

public class Panel extends Container{
    
    static public ArrayList <String> modalHelpText = new ArrayList<String>();

    void showHelp(){
        if (modalHelpText != null);
        else super.showHelp();
    }

}
