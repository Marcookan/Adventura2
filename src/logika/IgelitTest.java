/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package logika;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;



/*******************************************************************************
 * Testovací třída {@code IgelitTest} slouží ke komplexnímu otestování
 * třídy {@link IgelitTest}.
 *
 * @author    Narek Davtyan
 * @version   ZS 2016/17
 */
public class IgelitTest
{
    private Vec vec1;
    private Vec vec2;
    private Vec vec3;
    private Vec vec4;
    private Igelit igelit1;
    //== KONSTANTNÍ ATRIBUTY TŘÍDY =============================================
    //== PROMĚNNÉ ATRIBUTY TŘÍDY ===============================================
    //== STATICKÝ INICIALIZAČNÍ BLOK - STATICKÝ KONSTRUKTOR ====================
    //== KONSTANTNÍ ATRIBUTY INSTANCÍ ==========================================
    //== PROMĚNNÉ ATRIBUTY INSTANCÍ ============================================
    //== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ====================================
    //== OSTATNÍ NESOUKROMÉ METODY TŘÍDY =======================================

    //##########################################################################
    //== KONSTRUKTORY A TOVÁRNÍ METODY =========================================
    //-- Testovací třída vystačí s prázdným implicitním konstruktorem ----------
    //== PŘÍPRAVA A ÚKLID PŘÍPRAVKU ============================================

    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Before
    public void setUp()
    {
        vec1 = new Vec("jabko", true);
        vec2 = new Vec("hruska", true);
        vec3 = new Vec("citron", true);
        vec4 = new Vec("limon", false);
        igelit1 = new Igelit();
    }


    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každého testu.
     */
    @After
    public void tearDown()
    {
    }
    


    //== PŘÍSTUPOVÉ METODY VLASTNOSTÍ INSTANCÍ =================================
    //== OSTATNÍ NESOUKROMÉ METODY INSTANCÍ ====================================
    //== SOUKROMÉ A POMOCNÉ METODY TŘÍDY =======================================
    //== SOUKROMÉ A POMOCNÉ METODY INSTANCÍ ====================================
    //== INTERNÍ DATOVÉ TYPY ===================================================
    //== VLASTNÍ TESTY =========================================================
    /**
     * Testuje metody vlozVecDoIgelitu a obsahujeVec
     */
    @Test
    public void testVlozVecDoIgelitu()
    {
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec1));
        assertEquals(true, igelit1.obsahujeVecVIgelitu("jabko"));
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec2));
        assertEquals(true, igelit1.obsahujeVecVIgelitu("hruska"));
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec3));
        assertEquals(true, igelit1.obsahujeVecVIgelitu("citron"));
        assertEquals(false, igelit1.vlozVecDoIgelitu(vec4));
        
    }
    /**
     * Testuje výpis názvů věcí
     */
    @Test
    public void testNazevVeciVIgelitu()
    {
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec1));
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec2));
        assertEquals(true, igelit1.vlozVecDoIgelitu(vec3));
        assertEquals(false, igelit1.vlozVecDoIgelitu(vec4));
        igelit1.nazvyVeciVIgelitu();
    }
}






