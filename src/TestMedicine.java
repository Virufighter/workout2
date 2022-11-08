class Medicine{
    void displayLabel(){
        System.out.println("Name: Laurus Lab");
        System.out.println("Address: xyz");
    }

}
class Tablet extends Medicine{
    @Override
    void displayLabel() {
        System.out.println("store in a cool dry place");

    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel() {
        System.out.println("for external use only");

    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel() {
        System.out.println("Consumption as directed by the physician");

    }
}


public class TestMedicine {
    public static void main(String[] a){
        Medicine m1 = new Medicine();
        Medicine m2 = new Medicine();
        Medicine m3 = new Medicine();
        double i = Math.random()*4;
        int j = (int) i;
        System.out.println(j);
        switch (j){
            case 1:
                Medicine t=new Tablet();
                System.out.println("******\tFor Tablet\t******");
                m1.displayLabel();
                t.displayLabel();
                break;
            case 2:
                Medicine o=new Ointment();
                System.out.println("******\tFor Ointment\t*****");
                m3.displayLabel();
                o.displayLabel();
                break;

            case 3:
                Medicine s=new Syrup();
                System.out.println("******\nFor Syrup\t******");
                m2.displayLabel();
                s.displayLabel();
                break;
            default: System.out.println("Invalid Choice");

        }
    }
    

}
