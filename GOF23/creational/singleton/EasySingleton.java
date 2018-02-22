package DesignPatterns.GOF23.creational.singleton;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 1:16 PM<br/>
 *
 * Easiest way to create singleton. Threadsafe
 * Create instance when code starts to run. May cause memory waste when no one use the singleton
 */
public class EasySingleton {

    private static EasySingleton s = new EasySingleton();

    private EasySingleton(){}

    public static EasySingleton getInstance(){return s;}

}
