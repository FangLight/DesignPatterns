package DesignPatterns.GOF23.structural.proxy;

/**
 * User: Fang Lai<br/>
 */
public class StaticProxy implements Star {
    private Star star;

    public StaticProxy(Star star){
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("StaticProxy is preparing before superstar sings a song");
        star.sing();
    }
}
