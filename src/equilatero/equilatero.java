/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equilatero;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class equilatero {
    private int lado,perimetro;
    private float altura,area;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public float getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }
    public void hequ(){
        altura=(float)(lado*(Math.sqrt(3)/2));
    }
    public void per(){
        perimetro=3*lado;
    }
    public void arr(){
        area=(float)(Math.pow(lado,2)*(Math.sqrt(3)/4));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int l=0,p=0;
        float h=0,a=0;
        Scanner keyboard= new Scanner(System.in);
        equilatero triangulo=new equilatero();
        System.out.print("Ingrese el lado del triangulo: ");
        l=keyboard.nextInt();
        triangulo.setLado(l);
        triangulo.hequ();
        h=triangulo.getAltura();
        System.out.print("La altura es: "+h+'\n');
        triangulo.per();
        p=triangulo.getPerimetro();
        System.out.print("El perimetro es: "+p+'\n');
        triangulo.arr();
        a=triangulo.getArea();
        System.out.print("El area es: "+a+'\n');
    }
    
}
