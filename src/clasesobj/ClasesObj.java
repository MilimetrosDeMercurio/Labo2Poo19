/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesobj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UCA
 */
public class ClasesObj {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Perro> pList = new ArrayList<>();
        Duenio d = new Duenio();
        
//        p.setNombre("DUKE");
//        p.setEdad(1);
//        p.setColor("Gris");
//        p.setGenero("F");
//        p.setRaza("Waimarener");
//        d.setDireccion("UCA");
//        d.setEdad(12);
//        d.setNombre("DEI");
//        p.setDuenio(d);
//        
    
//        System.out.println(p.setDuenio().p.setNombre());
        boolean flag = true;
        
        while(flag){
            System.out.println("1.Ingresar dueño");
            System.out.println("2.Ingresar perro");
            System.out.println("Ingrese una opcion");
            int op = x.nextInt();
            x.nextLine();
            if(op==1){
                ingresarDuenio(x,d);
                
            }else if(op==2){
                ingresarPerro(x,pList);
                
            }else{
                flag = !flag;
            }
        }
       for(int i=0; i<pList.size();i++){
           System.out.println("Nombre del perro: "+pList.get(i).getNombre());
       }
    }
    public static void ingresarDuenio(Scanner x,Duenio d){
        System.out.println("Ingrese nombre del dueño: ");
        d.setNombre(x.nextLine());
       
        }
    public static void ingresarPerro(Scanner x,ArrayList pList){
        Perro p = new Perro();
        System.out.println("Ingrese nombre del perro: ");
        p.setNombre(x.nextLine());
        pList.add(p);
       
        }
}
