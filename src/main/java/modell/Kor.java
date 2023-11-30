/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Kor extends Alakzat{
    private double r;
    public Kor(){
        this.r=2;
    }
    public Kor(int atmero) {
        this.r=atmero;
    }
    @Override
    public double terulet(){
        return Math.pow(r, 2)*Math.PI;      
    }
    @Override
    public double kerulet(){
        
        return 0;
        
    }
    @Override
   public void kiir(){
       
   }
/*kódduplikálás
    @Override
    public void kiirTerulet() {
        System.out.println("Terület: "+terulet());
    }
    */
}
