package GOF23.structural.adapter;

/**
 * User: Fang Lai<br/>
 *
 * Adapter works as a bridge between two incompatible interfaces
 *
 * There are two ways to implements adapter patter:
 *      1. adapter with inner adaptee object
 *      2. adapter extends old adaptee class
 */
public class Adapter {
    public static void main(String args[]){
        Adaptee adaptee = new Adaptee();
        adaptee.playMp3("mp3");
        Target target = new ClassAdapter();
        target.playHighQualityMusic("high quality");
        target = new ObjectAdapter();
        target.playHighQualityMusic("high quality");
    }
}

class Adaptee{
    void playMp3(Object src){
        System.out.println("Old mp3 plays：" + src);
    }
}

interface Target{
    void playHighQualityMusic(Object src);
}

class ObjectAdapter implements Target{
    private Adaptee adaptee;
    public ObjectAdapter(){
        super();
        adaptee = new Adaptee();
    }
    @Override
    public void playHighQualityMusic(Object src) {
        System.out.println("preprocess in Object Adapter");
        adaptee.playMp3(src);
    }
}

class ClassAdapter extends Adaptee implements Target {
    @Override
    public void playHighQualityMusic(Object src) {
        System.out.println("preprocess in Class Adapter");
        playMp3(src);
    }
}
