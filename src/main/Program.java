package main;

import java.util.Random;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        int[] hely = new int[3];
        int i = 0;
        while(hely.length!=i) {
            int rnd = (int)(Math.random() * 7) + 1;
            hely[i] = rnd;
            i++;
        }
        Hajo hajo = new Hajo(hely);
        boolean sullyedt = false;
        int találat = 0;
        do {
            if(hajo.talalat(jatekosLoves()).equals("talált")){
                találat++;
                System.out.println("talált");
            }else{
                System.out.println("nem talált");
            }
            if(találat==3){
                sullyedt=true;
                System.out.println("A hajó elsüllyedt");
            }
        } while (!sullyedt);
//        
    }

    
    public static int jatekosLoves(){
        Scanner src = new Scanner(System.in);
        System.out.println("Tüzelj: ");
        return src.nextInt();
    }
    
    
    
}
