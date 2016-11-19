package fr.paris10.poa.td3;

/**
 * Created by mouna on 19/11/2016.
 */
public class ProductFactory {

    private String language;

    public ProductFactory(String language) {
        this.language = language;
    }

    public Product createProduct(){
        if(language.equals("English"))
            return new ProductEnglish();
        if(language.equals("Francais"))
            return new ProductFrancais();
        if (language.equals("Spanish"))
            return new ProductSpanish();
        return new ProductEnglish();
    }
}
