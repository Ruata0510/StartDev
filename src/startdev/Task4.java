/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

/**
 *
 * @author Comp
 */
class Task4 {
    public void run(){
    int[] array = new int[10];
        int sum = 0;
            for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 0);

            System.out.printf("%-3d",array[i]);
            sum=sum+array[i];
}
            System.out.println("\nСумма всех ЧЁТНЫХ рандомных чисел:\n" + sum);
}
}
