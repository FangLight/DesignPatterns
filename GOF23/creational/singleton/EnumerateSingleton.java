package GOF23.creational.singleton;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 1:27 PM<br/>
 *
 * Take the advantages of JVM enumerate type which is singleton naturally.
 *
 * JVM supports and ensures security and thread sage. But not lazy load
 *
 */
public enum EnumerateSingleton {
    INSTANCE;
    public void singletonOperation(){}
}
