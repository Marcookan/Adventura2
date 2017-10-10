/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package logika;

import java.util.Map;
import java.util.HashMap;


/*******************************************************************************
 * Instance třídy Vec představují ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
public class Vec
{
    //== Datové atributy (statické i instancí)======================================
    private String nazev;
    private boolean prenositelnost;
    private Map<String,Vec> seznamVeci;
    //== Konstruktory a tovární metody =============================================

    /***************************************************************************
     *  Konstruktor třídy
     */
    public Vec(String nazev, boolean prenositelnost)
    {
        this.nazev = nazev;
        this.prenositelnost = prenositelnost;
        this.seznamVeci = new HashMap<>();
    }

    //== Nesoukromé metody (instancí i třídy) ======================================
    
    
    /*****
     * Metoda vrací název věci
     */
     public String getNazev(){
        return nazev;
    
    }
    /**
     * Metoda vrací true, pokud je věc přenositelná
     */
    public boolean jePrenositelna(){
        return prenositelnost;
    
    }
    /**
     * Metoda vybírá určitou věc
     */
    public Vec vyberVec(String jmeno) {
        Vec vec = null;
        if (seznamVeci.containsKey(jmeno)) {
            vec = seznamVeci.get(jmeno);
            if (vec.jePrenositelna()) {
                seznamVeci.remove(jmeno);
            }
        }
        return vec;
    }
    
    //== Soukromé metody (instancí i třídy) ========================================

}
