/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package absztrakt;

import modell.Alakzat;
import modell.Tegla;
import modell.Kor;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class AbsztraktOrok {

    public static void main(String[] args) {
        Alakzat[] alakzatok=new Alakzat[5];
        Kor k = new Kor(1);
        //Kor kor2 = new Kor();
        Tegla t =new Tegla(1,1);
        //Tegla tegla2 =new Tegla();
        //alakzatok[0]=new Alakzat();
        alakzatok[0]=new Kor();
        alakzatok[1]=k;
        alakzatok[2]=t;
        alakzatok[3]=new Kor(2);
        alakzatok[4]=new Tegla(2,2);
        
        for(int i=1;i<alakzatok.length;i++){
            alakzatok[i].kiir();
            System.out.println(" területe: "+alakzatok[i].terulet());
        }
    }
}
