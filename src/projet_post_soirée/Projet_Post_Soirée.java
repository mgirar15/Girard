/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_post_soirée;

/**
 *
 * @author Marc
 */
public class Projet_Post_Soirée {
    static int i=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hello World");
        System.out.println("arrete de toucher ta barbe");
       Lapin lap = new Lapin("Dero", 12);
        
       while (i <= 10) {
           lap.Scream();
           i=i+1;
       }
    }
    
}
