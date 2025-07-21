import java.util.*;

public class Half_Pyram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
