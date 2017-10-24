package logika;

/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova, Narek Davtyan
 *@version    pro školní rok 2016/2017
 */
public class HerniPlan {

    private Prostor aktualniProstor;    
    private boolean vyhra = false;
    private boolean prohra = false;
    private Hra hra;

    /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public HerniPlan() {
        zalozProstoryHry();

    }

    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void zalozProstoryHry() {
        // vytvářejí se jednotlivé prostory
        Prostor rozcesti = new Prostor("rozcestí","rozcestí, na kterém se Dobroslav probudí", 110, 50);
        Prostor hrusen = new Prostor("hrušeň", "hrušeň, na kterém jsou hrušky", 115, 55);
        Prostor mangovnik = new Prostor("mangovník","mangovník s mangem", 120, 60);
        Prostor kaktus = new Prostor("kaktus","kaktus s podivuhodným plodem", 125, 65);
        Prostor rybnik = new Prostor("rybník", "rybník", 130, 70); 
        Prostor udoli = new Prostor("údolí", "údolí které vede ke konečným chatkám", 135, 80);
        Prostor zahrada = new Prostor("zahrada", "zahrada s bramborama", 140, 85);
        Prostor napadnaChatka = new Prostor("nápadná_chatka", "nápadná chatka, kde uviděl muže v černém na židli.\n" 
        +"\nMuž v černém: 'Jsi tady správně, ale je tu ještě poslední úkol,'" + "\n'Chceš červené nebo žluté rajče?'\n", 145, 90);
        Prostor nenapadnaChatka = new Prostor("nenápadná_chatka", "nenápadná chatka", 150, 40);

        // přiřazují se průchody mezi prostory (sousedící prostory)

        rozcesti.setVychod(mangovnik);
        rozcesti.setVychod(hrusen);
        hrusen.setVychod(kaktus);
        hrusen.setVychod(zahrada);
        hrusen.setVychod(rozcesti);
        mangovnik.setVychod(rozcesti);
        mangovnik.setVychod(kaktus);
        kaktus.setVychod(rybnik);
        kaktus.setVychod(udoli);
        kaktus.setVychod(hrusen);
        kaktus.setVychod(mangovnik);
        kaktus.setVychod(zahrada);
        zahrada.setVychod(udoli);
        zahrada.setVychod(hrusen);
        zahrada.setVychod(hrusen);
        udoli.setVychod(kaktus);
        udoli.setVychod(kaktus);
        udoli.setVychod(napadnaChatka);
        udoli.setVychod(nenapadnaChatka);

        Vec hruska = new Vec("hruška", true);
        Vec sladke_brambory = new Vec("sladké_brambory", true);
        Vec rane_brambory = new Vec("rané_brambory", false);
        Vec zluta_koule = new Vec("žluté_rajče", true);
        Vec cervena_koule = new Vec("červené_rajče", true);
        Vec mango = new Vec("mango", true);
        Vec pitahaya = new Vec("pitahaya", true);
        Vec pomeranc = new Vec("pomeranč", true);

        hrusen.vlozVec(hruska);
        zahrada.vlozVec(sladke_brambory);
        zahrada.vlozVec(rane_brambory);
        mangovnik.vlozVec(mango);
        kaktus.vlozVec(pitahaya);
        napadnaChatka.vlozVec(zluta_koule);
        napadnaChatka.vlozVec(cervena_koule);
        udoli.vlozVec(pomeranc);

        aktualniProstor = rozcesti;  
    }

    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */

    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }

    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setAktualniProstor(Prostor prostor) {
        aktualniProstor = prostor;
    }

    /**
     * Metoda zjišťující stav booleanu vyhry.
     * 
     * @return      vrací true pokud je Vyhra
     */
    public boolean jeVyhra(){
        return vyhra;    
    }

    /**
     *  Metoda vrací odkaz na prohru.
     *
     *@return     prohra
     */
    public boolean jeProhra() {
        return prohra;
    }

    /*
     * metody nastavující stavy booleanu výhry a prohry
     */
    public void setProhra(boolean stav){
        this.prohra = stav;
    }

    public void setVyhra(boolean stav){
        this.vyhra = stav;
    }

}
