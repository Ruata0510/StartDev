/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task7 {
     private final Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("----- Задача 7 ------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();
        System.out.println("Введите букву: ");
        String letter = sc.nextLine();
        int n = 0;
        if(letter.length() != 0){
                n++;
                for (int i = 0; i < string.length(); i++) {
                    if(string.charAt(i) == ' '){
                        n++;
                    }
                }
        }
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + "раз");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
    }
}
