/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
<<<<<<< HEAD
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
=======
import logika.Hra;
>>>>>>> 345e3d2123f3bb68129e8b240b7f611c43789c2e
import logika.IHra;
import main.Main;
import utils.Observer;

/**
 *
 * @author davn00
 */
public class Mapa extends AnchorPane implements Observer{
    
    private IHra hra;
    private Circle tecka;
<<<<<<< HEAD
    
     /**
     * Konstruktor mapy.
     * @param hra prave hrana hra
     */
    public Mapa(IHra hra){
            this.hra = hra;
            hra.registerObserver(this);
            init();
    }
    
     /**
     * Nastaveni nadpisu a podkladu mapy.
     */
    private void init(){
        
        Text titulek = new Text("Mapa");
        titulek.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        
        this.setTopAnchor(titulek, 10.0);
        this.setLeftAnchor(titulek, 10.0);

        ImageView obrazekImageView = new ImageView(new Image(Main.class.getResourceAsStream("/zdroje/mapa.gif"),400,400,false,true));
        
        this.setTopAnchor(obrazekImageView, 40.0);
        
        tecka = new Circle(10, Paint.valueOf("red"));
        
        this.getChildren().addAll(titulek, obrazekImageView, tecka);
        
        update();
    }
    
    /**
     * Nastaveni nove hry po restaru.
     * @param novaHra nova hra
     */
    
    public void newGame(IHra novaHra){
        hra.removeObserver(this);
        hra = novaHra;
        hra.registerObserver(this);
        update();
    }
    
    /**
     * Aktualizace pozice hrace.
     */
    @Override
    public void update(){
        this.setTopAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosTop());
        this.setLeftAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosLeft());
=======
    //private double posTop = 0.0;
    //private double posLeft = 0.0;
    
    public Mapa(IHra hra){
            this.hra = hra;
            hra.getHerniPlan().registerObserver(this);
            init();
    }
    
    private void init(){
        
        ImageView obrazekImageView = new ImageView(new Image(Main.class.getResourceAsStream("/zdroje/mapa.jpg"),200,200,false,true));
        
        tecka = new Circle(10, Paint.valueOf("red"));
        
       // this.setTopAnchor(tecka, 0.0);
       // this. setLeftAnchor(tecka, 0.0);
        
        this.getChildren().addAll(obrazekImageView, tecka);
        update();
    }
    
    public void newGame(IHra novaHra){
        hra.getHerniPlan().removeObserver(this);
        hra = novaHra;
        hra.getHerniPlan().registerObserver(this);
        update();
        
    }
    
    @Override
    public void update(){
        this.setTopAnchor(this, hra.getHerniPlan().getAktualniProstor().getPosTop());
        this.setLeftAnchor(this, hra.getHerniPlan().getAktualniProstor().getPosLeft());
>>>>>>> 345e3d2123f3bb68129e8b240b7f611c43789c2e
    }
}
