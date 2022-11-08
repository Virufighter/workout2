public class MathFunction {
    int multiply(int a,int b){
        return a*b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    float multiply(int a,float b){
        return a*b;
    }
    public static void main(String[] a){
        MathFunction m=new MathFunction();
        System.out.println(m.multiply(2,4));
        System.out.println(m.multiply(1.1f,1.2f));
        System.out.println(m.multiply(2,2.1f));
    }
}
