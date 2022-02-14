/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentosaritméticosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author raqueldarellimichelon
 */
public class PositivosENegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String linha;
       Double n;
       int positivos, i;
 
       positivos=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       for (i=0; i < 6; i++) {
           linha = br.readLine();
           n = Double.parseDouble(linha);
           if(n >= 0)positivos++;
       }
 
       System.out.println("" + positivos + " valores positivos");

    }
    
}
