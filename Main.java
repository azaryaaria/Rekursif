package coba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int hasil = rekursif(x);
        System.out.println("hasil = " + hasil);
        int hasilfaktorial = faktorial(x);
        System.out.println("hasil faktorial = " + hasilfaktorial);
        int hasilfaktorialpenjumlahan = faktorialversipenjumlahan(x);
        System.out.println("hasil faktorial penjumlahan = " + hasilfaktorialpenjumlahan);
    }
    public static int faktorialversipenjumlahan (int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter == 1){
            return parameter;
        }
        return parameter + faktorialversipenjumlahan(parameter-1);
    }
    public static int faktorial (int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter == 1){
            return parameter;
        }
        return parameter * faktorial(parameter-1);
    }
    public static int rekursif (int parameter){
        int eh = 5;
        System.out.println("Parameter = " + parameter);
        if(parameter == 2){
        return eh;
        }
        return 5+rekursif(parameter-1);
    }
}
