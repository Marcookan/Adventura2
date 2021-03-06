package logika;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*******************************************************************************
 * Testovací třída ProstorTest slouží ke komplexnímu otestování
 * třídy Prostor
 *
 * @author    Jarmila Pavlíčková, Narek Davtyan
 * @version   pro skolní rok 2016/2017
 */
public class ProstorTest
{
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
    }

    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každé testovací metody.
     */
    @After
    public void tearDown() {
    }

    //== Soukromé metody používané v testovacích metodách ==========================

    //== Vlastní testovací metody ==================================================

    /**
     * Testuje, zda jsou správně nastaveny průchody mezi prostory hry. Prostory
     * nemusí odpovídat vlastní hře, 
     */
    //@Test
    //public  void testLzeProjit() {      
    //    Prostor prostor1 = new Prostor("hala", "vstupní hala budovy VŠE na Jižním městě");
    //    Prostor prostor2 = new Prostor("bufet", "bufet, kam si můžete zajít na svačinku");
      //  prostor1.setVychod(prostor2);
      //  prostor2.setVychod(prostor1);
      //  assertEquals(prostor2, prostor1.vratSousedniProstor("bufet"));
      //  assertEquals(null, prostor2.vratSousedniProstor("pokoj"));
    //}
    /**
     * Testuje vkládání věcí do prostoru
     */
    //@Test 
    //public void testVlozVec()
    //{
    //    Vec vec1 = new Vec("nuz", true);       
    //    Vec vec2 = new Vec("stul", false);
    //    Prostor prostor1 = new Prostor("kuchyn", "tady se vaří");
    //    prostor1.vlozVec(vec1);
    //    prostor1.vlozVec(vec2);
    //    assertEquals(true, prostor1.jeVecVProstoru("nuz"));
    //    assertEquals(true, prostor1.jeVecVProstoru("stul"));
    //    assertEquals(false, prostor1.jeVecVProstoru("hrnec"));
    //}

}
