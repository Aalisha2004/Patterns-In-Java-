import java.util.*;

public class Invert_Half_Pyramid_Number {

    public static void PyramNumber(int n){
        //outer loop
        for(int row=1;row<=n;row++){
            //inner loop
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col+"");
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n= sc.nextInt();

        PyramNumber(n);
    }
    
}
