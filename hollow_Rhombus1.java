//pattern 6 --> hollow rhombus
public class hollow_Rhombus1{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                    if(j==1||i==1||j==n||i==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}