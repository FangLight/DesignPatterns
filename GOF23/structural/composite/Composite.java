package GOF23.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Fang Lai<br/>
 *
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object.
 *
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy
 *
 * Core: component + leaf + composite
 *
 * since leaf and composite implements the same interface - component, we can use recursion to manipulate all components
 *
 * Example: File System(folder + file)
 */
public class Composite {
    public static void main(String[] args){
        CompositeOfComponents root = new CompositeOfComponents();
        CompositeOfComponents subFolder = new CompositeOfComponents();
        root.addComponent(new Leaf(1));
        root.addComponent(new Leaf(2));
        root.addComponent(subFolder);
        subFolder.addComponent(new Leaf(3));
        subFolder.addComponent(new Leaf(4));
        subFolder.addComponent(new Leaf(5));

        //loop through all components inside root.
        root.operate();
    }
}

//interface implemented by "Composite" and "Leaf"
interface Component{
    void operate();
}

//this is the "Composite"
class CompositeOfComponents implements Component{
    private List<Component> list = new LinkedList<>();

    public void addComponent(Component c){
        list.add(c);
    }

    @Override
    public void operate() {
        System.out.println("This is a composite, it contains " + list.size() + " components");
        for(Component component : list){
            component.operate();
        }
    }
}

class Leaf implements Component{
    private int num;

    public Leaf(int num){
        this.num = num;
    }

    @Override
    public void operate() {
        System.out.println("This is leaf No."+num);
    }
}
