/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public abstract class Alakzat {
    /*public Alakzat(){
        //akkor használok absztrakt metódust, ha nem tudok értelmes visszatérési értéket megadni
        //absztrakt metódus esetén az osztály is absztrakt kell legyen
    }*/
    public abstract double terulet();
    public abstract double kerulet();
    public void kiir(){
        System.out.println("Alakzat");
    }
    public void kiirTerulet(){
        System.out.println("Terület: "+terulet());
    };
}
