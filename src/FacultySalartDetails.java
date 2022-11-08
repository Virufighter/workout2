import java.util.Scanner;

class Faculty{
    int faculty_id;
    float salary1,salary2;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
    }
    void display(){
        salary1=basic*allowance;
        System.out.println("Salary of full time faculty is "+salary1);
    }
}
class PartTimeFaculty extends Faculty{
    float hour;
    float rate;
    PartTimeFaculty(float hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }
    void display(){
        salary2=hour*rate;
        System.out.println("Salary of part time faculty is "+salary2);
    }
}
class FacultySalaryDetails{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the basic & allowance of first full time faculty");
        FullTimeFaculty f1=new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
        System.out.println("enter the basic & allowance of second full time faculty");
        FullTimeFaculty f2=new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
        System.out.println("enter the hour and rate of first part time faculty");
        PartTimeFaculty p1=new PartTimeFaculty(sc.nextFloat(), sc.nextFloat());
        System.out.println("enter the hour & rate of second part time faculty");
        PartTimeFaculty p2=new PartTimeFaculty(sc.nextFloat(), sc.nextFloat());
        System.out.println("salary details of first full time faculty");
        f1.display();
        System.out.println("salary details of second full time faculty");
        f2.display();
        System.out.println("salary details of first part time faculty");
        p1.display();
        System.out.println("salary details of second parttime faculty");
        p2.display();
    }
}
