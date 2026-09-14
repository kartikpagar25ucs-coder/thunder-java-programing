import java.util.*;

public class array{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter size of array:");
        int size=sc.nextInt();
        int[]numbers=new int [size];

        for(int i=0 ; i<size ; i++){
            System.out.print("enter values "+i+":");
            numbers[i]=sc.nextInt();
        }

        for(int i=0; i<size ; i++){
            System.out.println("array "+i+":"+numbers[i]);
        }
    }
}