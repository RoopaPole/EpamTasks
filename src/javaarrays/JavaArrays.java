/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;

/**
 *
 * @author RGUKT
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int[] arr={1,2,3};
            for(int i=0;i<3;i++)
         System.out.print(arr[i]+" ");
     arr=doubleCapacity(arr);
     System.out.println();
     
     for(int i=0;i<6;i++)
         System.out.print(arr[i]+" ");
   //arr points to new array Object whose size is 6.But there is no way to increase the size of same array once declared.that is the one create in line1
}
public static int[] doubleCapacity(int[] list){
     int[] arr1=new int[list.length*2];
     return arr1;
    }
    
}
