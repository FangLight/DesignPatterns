package DesignPatterns.GOF23.creational.prototype;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Fang Lai<br/>
 *
 * Prototype pattern refers to creating duplicate objects while keeping performance in mind.
 * It involves implementing a prototype interface which tells to create a cline of current object.
 *
 * In Java, we need to implement empty interface Cloneable as a tag and override function clone() in Object class.
 *
 *
 *
 * NOTICE: remember to avoid shallow copy, what we need is DEEP COPY
 *
 *
 */
public class Prototype implements Cloneable{

    private List<Integer> list;

    public Prototype(){
        list = new LinkedList<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Object obj = super.clone();
        Prototype p = (Prototype)obj;
        p.list = new LinkedList<>(this.list);
        return obj;
    }

    public static void main(String[] args){
        Prototype p1 = new Prototype();
        p1.list.add(1);
        try{
            Prototype p2 = (Prototype)p1.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
