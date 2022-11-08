public class GarbageCollection {
    public static int c;
    GarbageCollection(){
        c++;
    }
    public static void main(String[] a){
        GarbageCollection b1,b2;
        b1=new GarbageCollection();
        b2=new GarbageCollection();
        b1=null;
        b2=b1;
        System.gc();
        System.out.println(c);

    }
    protected void finalize(){
        c--;
        System.out.println("grabage value"+ this);
        System.out.println(c);



    }
}
