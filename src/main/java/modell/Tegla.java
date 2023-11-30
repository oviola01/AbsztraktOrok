/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Tegla extends Alakzat{
    private int a, b;
    
    public Tegla() {
        this(1,2);
    }

    public Tegla(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a <= 0){ a = 1; }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b <= 0){ b = 1; }
        this.b = b;
    }
    
    @Override
    public double terulet(){
        return a*b;
    }
    
    @Override
    public double kerulet(){
        return 2*(a+b);
    }
    
    @Override
    public void kiir(){
        
    }
/*kódduplikálás
    @Override
    public void kiirTerulet() {
        System.out.println("Terület: "+terulet());
    }*/
    
    
}
