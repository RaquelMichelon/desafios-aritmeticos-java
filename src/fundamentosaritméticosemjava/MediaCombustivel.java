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
public class MediaCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int  distTotal = leitor.nextInt();
        double  combustivelConsum = leitor.nextDouble();

        double media =  distTotal / combustivelConsum;
        System.out.println(String.format("%.3f km/l", media ));

    }
    
}
