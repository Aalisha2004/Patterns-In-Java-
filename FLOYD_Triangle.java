import java.util.*;

public class FLOYD_Triangle {
    public static void FloydsTriangle(int n){
        int i=1;
        //outer
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }


public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter:");
    int n=sc.nextInt();

    FloydsTriangle(n);

}
}