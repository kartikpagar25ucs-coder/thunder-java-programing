
import java.util.Scanner;

public class sorting_Cheak{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size=sc.nextInt();
        int array[]=new int [size];

        for(int i=0; i<size ;i++){
            System.out.print("enter values of index "+i+" :");
            array[i]=sc.nextInt();
        }

        boolean isAsending = true;
        for(int i=0 ; i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isAsending=false;
            }
        }
        
        if(isAsending){
            System.out.println("order is an asending order");
        }
        else{
            System.out.println("order is not in asending order");
        }

        boolean isDescending =true;
        for(int i=0 ; i<array.length-1 ; i++){
            if(array[i]<array[i+1]){
                isDescending=false;
            }
        }

        if(isDescending){
            System.out.println("order is decending");
        }
        else{
            System.out.println("order is not decending");
        }
        sc.close();
        }
    }
