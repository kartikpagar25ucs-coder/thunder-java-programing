//pattern_4--> hollow_sqr
public class hollow_sqr{
    public static void main(String[]args)
    {
        for(int i = 1; i<=4;i++){
            for(int j = 1; j<=5 ; j++){
                if(i==1||j==1||j==5||i==4){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            } 
            System.out.println();
        }
    }
}
