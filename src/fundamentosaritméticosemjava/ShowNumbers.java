/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentosaritméticosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author raqueldarellimichelon
 */
public class ShowNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int i;
    	
    	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    	
    	String linha = entrada.readLine();

        // StringTokenizer st = new StringTokenizer(entrada.readLine()); // Lê a linha de entrada
        int numero = Integer.parseInt(linha);
      
        for (i=1; i <= numero; i++) {
        
            if(i % 2 == 0) {
            System.out.println(i);
            }
        
        }

    }
    
}
