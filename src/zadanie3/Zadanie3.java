/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите 3-х значное число:  ");
        int Usernum = scanner.nextInt();
        int a = Usernum/100;
        int b = Usernum/10%10;
        int c = Usernum%10;
        int sum = a+b+c;
        
        System.out.println("Сумма числа " + sum);
        
    }
    
}
