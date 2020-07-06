/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Insertionsortama {
 public static void insertionSort (int array[]){
int n= array.length;
for(int j =1; j<n;j++){
 int key = array[j];
 int i= j-1;
 while ((i>-1)&&(array [i] > key)){
     array [i+1] = array [i];
     i--;
    
 }
 array[i+1]= key;
 }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int[]arr1 ={9,14,3,2,34,11,58,22};
        System.out.println("Sebelum memasukkan");
 for (int  i:arr1){
     System.out.print(i+" ");
 
        System.out.print("");
 }                                       
    insertionSort(arr1); 
        System.out.println ("SESUDAH INSERTSORT");
        for (int i :arr1){
            System.out.print (i+" ");
            
        }
        System.out.print("");
    }

  }