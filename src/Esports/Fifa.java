/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esports;

/**
 *
 * @author muham
 */
public class Fifa extends Esport {
   // Constructor
   public Fifa(String genre, int jumlah, String platform) {
      super(genre, jumlah, platform);
   }
   
   // Method
   @Override
   public void info() {
      System.out.println("Genre: " + genre);
      System.out.println("Jumlah pemain: " + jumlah);
      System.out.println("Platform: " + platform);
   }
}

