package fr.paris10.poa.td3;

/**
 * Created by mouna on 10/10/2016.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
