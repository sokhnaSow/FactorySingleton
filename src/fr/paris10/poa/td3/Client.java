package fr.paris10.poa.td3;

import java.util.Locale;

/**
 * Created by mouna on 10/10/2016.
 */
public class Client {

    Product prod1;
    ProductFactory factory;

    public Client(){
        String language = Locale.getDefault().getDisplayLanguage(Locale.ENGLISH);
        factory = new ProductFactory(language);
        prod1 = factory.createProduct();
    }

    public void foo(){
        Product myProd1;
        Product myProd2;

        prod1.perform();

        myProd1 = factory.createProduct();
        myProd1.perform();

        myProd2 = factory.createProduct();
        myProd2.perform();
    }
}