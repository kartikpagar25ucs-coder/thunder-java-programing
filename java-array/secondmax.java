import java.util.*;
public class secondmax{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size ; i++){
            System.out.println("enter value at index "+i+":");
            arr[i]=sc.nextInt();
        }

        for(int i = 0 ; i<size ; i++){
            System.out.println("the vales at index "+i+":"+arr[i]);
        }

        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for(int i=0 ; i<size ; i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        }
        System.out.println("second maximum value is:" +second_max);
    }
}