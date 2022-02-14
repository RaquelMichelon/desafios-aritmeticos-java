/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentosaritméticosemjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class ContaTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int  countPar = 0;
        int  countImpar = 0;
        int  countPos = 0;
        int  countNeg = 0;
        int  i;

        for(i=0; i < 5; i++) {
          
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
              countPar++;
            } else {
              countImpar++;
            }
            
            if (numero > 0) {
              countPos++;
            } else if (numero < 0) {
              countNeg++;
            }
    
          }
          
          System.out.println(countPar + " par(es)");
          System.out.println(countImpar + " impar(es)");
          System.out.println(countPos + " positivo(s)");
          System.out.println(countNeg + " negativo(s)");

    }
    
}
