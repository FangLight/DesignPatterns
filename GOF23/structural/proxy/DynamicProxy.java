package GOF23.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: Fang Lai<br/>
 */
public class DynamicProxy implements InvocationHandler {
    private Star star;

    public DynamicProxy(Star star){
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Pre operations
        System.out.println("DynamicProxy is preparing before superstar sings a song");

        Object object = null;
        if("sing".equals(method.getName())){
            object = method.invoke(star, args);
        }

        //post operations
        System.out.println("DynamicProxy is working after superstar sings a song");

        return object;
    }
}
