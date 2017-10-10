package logika;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*******************************************************************************
 * Testovací třída HraTest slouží ke komplexnímu otestování
 * třídy Hra
 *
 * @author    Jarmila Pavlíčková, Narek Davtyan
 * @version  pro školní rok 2016/2017
 */
public class HraTest {
    private Hra hra1;

    //== Datové atributy (statické i instancí)======================================

    //== Konstruktory a tovární metody =============================================
    //-- Testovací třída vystačí s prázdným implicitním konstruktorem ----------

    //== Příprava a úklid přípravku ================================================

    /***************************************************************************
     * Metoda se provede před spuštěním každé testovací metody. Používá se
     * k vytvoření tzv. přípravku (fixture), což jsou datové atributy (objekty),
     * s nimiž budou testovací metody pracovat.
     */
    @Before
    public void setUp() {
        hra1 = new Hra();
    }

    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každé testovací metody.
     */
    @After
    public void tearDown() {
    }

    //== Soukromé metody používané v testovacích metodách ==========================

    //== Vlastní testovací metody ==================================================

    /***************************************************************************
     * Testuje průběh hry, po zavolání každěho příkazu testuje, zda hra končí
     * a v jaké aktuální místnosti se hráč nachází.
     * Při dalším rozšiřování hry doporučujeme testovat i jaké věci nebo osoby
     * jsou v místnosti a jaké věci jsou v batohu hráče.
     * 
     */
    @Test
    public void testPrubehHry() {
        hra1.vratUvitani();
        hra1.zpracujPrikaz("jdi hrušeň");
        hra1.zpracujPrikaz("seber hruška");
        hra1.zpracujPrikaz("jdi zahrada");
        hra1.zpracujPrikaz("seber sladké_brambory");
        assertFalse (hra1.getHerniPlan().getAktualniProstor().jeVecVProstoru("sladké_brambory"));
        hra1.zpracujPrikaz("jdi údolí");
        hra1.zpracujPrikaz("igelitka");
        hra1.zpracujPrikaz("ingredience");
        hra1.zpracujPrikaz("konec");
    }
    
     /**
     * Testuje jednu z moznosti prubehu hry.
     */
    @Test
    public void testKChatceBezIngredienci() {
        hra1.zpracujPrikaz("jdi mangovník");
        hra1.zpracujPrikaz("seber mango");
        hra1.zpracujPrikaz("jdi kaktus");
        hra1.zpracujPrikaz("seber pitahaya");
        hra1.zpracujPrikaz("jdi hrušeň");
        hra1.zpracujPrikaz("seber hruška");
        hra1.zpracujPrikaz("jdi zahrada");
        hra1.zpracujPrikaz("seber sladké_brambory");
        hra1.zpracujPrikaz("jdi udoli");
        hra1.zpracujPrikaz("seber pomeranc");
        hra1.zpracujPrikaz("jdi nápadná_chatka");
        hra1.zpracujPrikaz("seber žluté_rajče");
        hra1.zpracujPrikaz("zamixuj");
        hra1.konecHry();
    }
}



