package GOF23.creational.singleton;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 1:16 PM<br/>
 *
 * Achieve lazy load for singleton. Slower than EasySingleton since getInstance() is synchronized.
 */
public class LazyLoadSingleton {
    private static LazyLoadSingleton s;

    private LazyLoadSingleton(){}

    public static synchronized LazyLoadSingleton getInstance(){
        if(s == null){
            s = new LazyLoadSingleton();
        }
        return s;
    }
}
