package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1=new Employee("se",500,30,2020);
        
        System.out.println(employee1.raiseSalary());
        System.out.println(employee1.toString());
    }
    
}
