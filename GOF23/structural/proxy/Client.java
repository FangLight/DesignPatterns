package GOF23.structural.proxy;

/**
 * User: Fang Lai<br/>
 *
 * In proxy pattern, a class represents functionality of another class. Fundamental concept of Aspect Oriented Programming(AOP)
 *
 * We have two different proxies:
 *          1. Static Client: need to realize all functions twice as both proxy and real class have implemented the interface
 *              Star + SuperStar + StaticProxy
 *
 *          2. Dynamic Client: use Java reflection to achieve it
 *              Star + SuperStar + DynamicProxy
 *
 */
public class Client {

    public static void main(String[] args){
        Star superStar = new SuperStar();

        //static proxy
        Star staticProxy = new StaticProxy(superStar);
        staticProxy.sing();

        System.out.println("\n\n\n");

        //dynamic proxy
        DynamicProxy dynamicProxy = new DynamicProxy(superStar);
        Star proxy = (Star) java.lang.reflect.Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class},
                dynamicProxy
        );
        proxy.sing();
    }

}
