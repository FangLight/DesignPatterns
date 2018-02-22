package GOF23.creational.singleton;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 1:23 PM<br/>
 *
 * The choice of many frameworks. JVM won't load the instance in inner class when load the class.
 *
 * Thread safe; lazy load; efficient getInstance() function.
 *
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
