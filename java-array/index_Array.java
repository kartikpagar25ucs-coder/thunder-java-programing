import java.util.*;

public class index_Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array:");
        int size=sc.nextInt();
        int[]number=new int[size];

        for(int i=0; i<size ; i++){
            System.out.print("enter value of "+i+":");
            number[i]=sc.nextInt();
        }

        for(int i =0 ; i<size ; i++){
            System.out.print("index "+i+":");
            System.out.println(number[i]);
        }

        System.out.print("enter number you want to find index:");
        int x= sc.nextInt();

        boolean found = false;

        for(int i =0; i<number.length;i++){
            if(number[i]==x){
                System.out.println("number "+x+" found at index:"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.print("number "+x+" is not found in aaray");
        }

    }
}