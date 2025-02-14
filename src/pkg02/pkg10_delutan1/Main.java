/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.pkg10_delutan1;

import java.util.Scanner;

/**
 *
 * @author szebb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // logikai érték
        boolean igaz = true;
        boolean hamis = false;
        
        System.out.println("Kérek egy sor szöveget: ");
        Scanner be = new Scanner(System.in); // Beolvasó létrehozása
        String adat = be.nextLine();
        System.out.println(adat);
        
        System.out.println("Kérek egy egész számot");
        int a = be.nextInt();
        System.out.println(a);
        
        System.out.println("Kérek egy szót");
        String szo = be.next();
        System.out.println(szo);
        
        // Konverzió
        String szam = "12";
        System.out.println(szam + 10); // 1210
        // Inteer.pasreInt(STRING)
        Integer szamInt = Integer.parseInt(szam);
        System.out.println(szamInt + 10); // 22
        
        // Implicit - kisebből nagyobbra --> nics adatvesztés
        int num = 100; // 100
        double doubleNum = num; // 100.0
        System.out.println(doubleNum);
        
        // Explicit - nagyobbról kisebbre --> adatvesztés
        doubleNum = 100.5;
        num = (int) doubleNum;
        System.out.println(num);
        
        // String immutábilis
        String sz1 = "alma";
        sz1 = "almafa";
        
        be.close();
        
        // komment
    }
    
}
