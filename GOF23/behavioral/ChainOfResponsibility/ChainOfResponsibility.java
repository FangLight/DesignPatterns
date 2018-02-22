package DesignPatterns.GOF23.behavioral.ChainOfResponsibility;

/**
 * User: Fang Lai<br/>
 *
 * For each handler, if it cannot handle the request, it will forward the request to next handler.
 *
 * Easy to extend and we can modify the handling sequence easily.
 */
public class ChainOfResponsibility {
    public static void main(String args[]){
        Handler h1,h2,h3;
        h1 = new Handler1();
        h2 = new Handler2();
        h3 = new Handler3();
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h1.handleRequest(-1);
        h1.handleRequest(0);
        h1.handleRequest(9999);
    }
}

interface Handler {
    void handleRequest(int n);
    void setNextHandler(Handler next);
}

//First Concrete Handler
class Handler1 implements Handler {
    private Handler next;
    @Override
    public void handleRequest(int n) {
        if(n < 0){
            System.out.println("This is a negative number");
        }
        else{
            if(next==null){
                throw new NullPointerException("next should not be null");
            }
            next.handleRequest(n);
        }
    }
    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}

//Second Concrete Handler
class Handler2 implements Handler {
    private Handler next;
    @Override
    public void handleRequest(int n) {
        if(n == 0){
            System.out.println("This is zero");
        }
        else{
            if(next==null){
                throw new NullPointerException("next should not be null");
            }
            next.handleRequest(n);
        }
    }
    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}

//Third Concrete Handler
class Handler3 implements Handler {
    private Handler next;
    @Override
    public void handleRequest(int n) {
        if(n > 0){
            System.out.println("This is a positive number");
        }
        else{
            if(next==null){
                throw new NullPointerException("next should not be null");
            }
            next.handleRequest(n);
        }
    }
    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}