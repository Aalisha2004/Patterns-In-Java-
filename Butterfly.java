import java.util.*;
public class Butterfly {
    public static void BeutyButter(int n){

        //star
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //invert star
        for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row+1;col++){
            System.out.print("*");
        }
        System.out.println();
    }


    
}  


public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter:");
    int n=sc.nextInt();

    BeutyButter(n);
}

}

