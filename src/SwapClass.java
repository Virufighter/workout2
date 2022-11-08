import java.util.Scanner;

public class SwapClass {
    int a,b;
    void callByValue(int a,int b){
        int temp;
        System.out.println("Before the swap:\t"+a+"\t"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After the swap:\t"+a+"\t"+b);

    }
    void callByReference(SwapClass s){
        int temp,a,b;
        System.out.println("Before the swap:\t"+s.a+"\t"+s.b);
        temp=s.a;
        s.a=s.b;
        s.b=temp;
        System.out.println("After the swap:\t"+s.a+"\t"+s.b);
    }
    public static void main(String[] a){
        SwapClass s=new SwapClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for call by value ");
        s.callByValue(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the values for call by reference ");
        s.a=sc.nextInt();
        s.b=sc.nextInt();
        s.callByReference(s);

    }
}
