/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n;    // Declaracion de variables
    
    n= pedirDato(); //Declaracion de metodos
    mostrarResultado(n);
    }
    public static int pedirDato() { //Metodo que pide la cantidad de números de datos de la serie F que el usuario desea conocer
        int dato;
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Cuantos numeros de la serie fibonacci desea conocer?");
        dato = entrada.nextInt();
        return dato;
    }
    public static void mostrarResultado(int d) { //Metodo que a partir de un if multiple y un ciclo for calcula la serie de Fibonacci y la muestra
        for(int i=0; i<4 ;++i){
            
            if (i==0){System.out.println(0);}
            if (i==1){System.out.println(1);}
            if (i==2){System.out.println(1);}
            if(i>=3){
                int a= 0,b=1,c=a+b;
                for(int j=3;j<d;++j){
                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
                if(j==d){System.exit(a);}
                }
    }
            
        }}}
    
    

