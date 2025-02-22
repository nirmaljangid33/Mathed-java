
public class A2 {
    public static int fact(int a){
        int f =1;
        for (int i = 1; i <= a; i++) {
         f =  f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int factN= fact(n);
        int factR= fact(r);
        int factnr= fact(n-r);
         
        return factN/(factR*factnr);
        
    }
    public static void main(String args[]){
        int n =5;
        int r = 3;
        
        System.out.println(binCoeff(n,r));
    }
}
