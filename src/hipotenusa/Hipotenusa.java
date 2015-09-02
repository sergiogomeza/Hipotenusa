/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;

public class Hipotenusa {
    private double cateto1,cateto2,hipotenusa;

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }
    
    public void hipo(){
        hipotenusa=Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c1=0;
        double c2=0;
        double h=0;
        Hipotenusa hip=new Hipotenusa();
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        System.out.print("Ingrese el cateto 1: ");
        c1=keyboard.nextInt();
        hip.setCateto1(c1);
        System.out.print("Ingrese el cateto 2: ");
        c2=keyboard.nextInt();
        hip.setCateto2(c2);
        hip.hipo();
        h=hip.getHipotenusa();
        System.out.print("El valor de la hipotenusa es: "+h+'\n');
    }
    
}
