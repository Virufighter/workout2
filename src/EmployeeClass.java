//Create a class Employee with fields Name, Emp ID, result and three assessment values (ass1,
//ass2 and ass3 (0-100)). If all the assessment values of the employee are above 75, then the
//result variable should be updated as "Promoted" else "Demoted". Also, calculate and display
//the total and percentage of the employee using functions.

import java.util.Scanner;

public class EmployeeClass {
    Scanner sc=new Scanner(System.in);
    String name,empID,result;
    int a1,a2,a3;
    void gatData(){
        System.out.println("Enter the name of the Student");
        name=sc.next();
        System.out.println("Enter the employee ID of the Student");
        empID=sc.next();
        System.out.println("Enter the 3 assessment scores  of the Student");
        a1= sc.nextInt();
        a2= sc.nextInt();
        a3= sc.nextInt();
    }

    void showData(){
        System.out.println("Employee ID :\t"+empID);
        System.out.println("Name :\t"+name);
        if(a1>=75 && a2>=75 && a3>=75) {
            result = "promoted";
        }else
            result="Demoted";
        System.out.println("Result:\t"+result);
        int total=a1+a2+a3;
        float p=(float)((total*100)/300);
        System.out.println("Total Mark Obtained:\t"+total);
        System.out.println("Percentage:\t"+p);

    }
    public static void main(String[] a){
        EmployeeClass e=new EmployeeClass();
        e.gatData();
        e.showData();
    }
}
