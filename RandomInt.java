/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author Tanzim
 */
public class RandomInt {
    public static int sumWithoutSmallest(int[] numbers){
        int smallest = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }   
        }
        return (sum - smallest);
        
    }
    public static void main(String[] args) {
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         int ans = sumWithoutSmallest(numbers);
         System.out.println(ans);
    }
}
    

