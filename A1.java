import java.util.*;
public class A1{
    public static int prodect(int a,int b){
        return a*b;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a= sc.nextInt();
        System.out.print("Enter the b : ");
        int b= sc.nextInt();


        System.out.println("Prodect of = " +prodect(a,b));
    }
}