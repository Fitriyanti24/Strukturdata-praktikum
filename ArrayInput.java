
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fitri Yanti
 */
public class ArrayInput {
    public static void main (String[] args){
        String[] Teman = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<Teman.length;i++){
            System.out.println("teman ke- "+i+ ":");
            Teman[i] = scan.nextLine();
        }
        System.out.println("======================");
        for (String x: Teman){
            System.out.println(x);
        }
    }
}
