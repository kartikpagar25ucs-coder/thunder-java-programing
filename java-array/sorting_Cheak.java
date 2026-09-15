
public class sorting_Cheak{
    public static void main(String[]args){
        int sorted[]={11,12,13,16,15};
        // int unsorted[]={12,11,14,13,15};

        boolean isAsending = true;
        for(int i=0 ; i<sorted.length-1;i++){
            if(sorted[i]>sorted[i+1]){
                isAsending=false;
            }
        }
        if(isAsending){
            System.out.print("order is an asending order");
        }
        else{
            System.out.print("order is not in asending order");
        }
        }
    }
