package chainofresponsability;

import java.util.ArrayList;

abstract class Container extends Component{

    static protected ArrayList <Component> children = new ArrayList<Component>();

    public void add (Component child){
        children.add(child);
        child.container = this;
    }

}
