import java.util.*;

public class zero_one_triangle {
    public static void zero_one(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if((row+col)%2==0){ //even 
                System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
    
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();

        zero_one(n);
    }
}
