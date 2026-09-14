//pattern 9 --> Inverted half pyramid with numbers.
public class inverted_Half_Pyr_No{
    public static void main(String[]args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
