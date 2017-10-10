/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package logika;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*******************************************************************************
 * Testovací třída VecTest slouží ke komplexnímu otestování třídy ... 
 *
 * @author    Narek Davtyan
 * @version   ZS 2016/17
 */
public class VecTest
{
   
    //== KONSTRUKTORY A TOVÁRNÍ METODY =========================================
    //-- Testovací třída vystačí s prázdným implicitním konstruktorem ----------

    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Before
    public void setUp()
    {
    }

    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každého testu.
     */
    @After
    public void tearDown()
    {
    }

    //== VLASTNÍ TESTY =========================================================
    //
    //     /********************************************************************
    //      *
    //      */
    //     @Test
    //     public void testXxx()
    //     {
    // 
    
    /***************************************************************************
     * Test metody přenositelnosti
     */
    @Test
    public void testPrenositelnost()
    {
        Vec vec1 = new Vec("rané brambory", false);
        Vec vec2 = new Vec("sladké brambory", true);
        assertEquals(false, vec1.jePrenositelna());
        assertEquals(true, vec2.jePrenositelna());
    }
}


