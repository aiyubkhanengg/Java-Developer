//DisplayArrayList.java
/* Create a class as below..

Employee {

int empId,

float salary,
*/
//This Program coded by AIYUB KHAN GIT (aiyubkhanengg-Java-Developer)
// SORRY!! SORRY!! SORRY!! SORRY!! SORRY!! SORRY!!
//THIS PROGRAM IS HALF.. I LL COMPLETE LATER
//@uther MOHD AIYUB KHAN..
 
import java.util.*;
 
class Employee{
     int emp_id;
     float salary;
     int m;
     int d;
     int y;
     int dateofjoining;
     String name;
     String deptName;
     String city;
    public static int count = 0;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employee(){}
 
    //Parameterized Constructor
    public Employee(int emp_id, float salary, int m, int d, int y, int dateofjoining, String name, String deptName, String city)
    {
        super();
        this.emp_id = emp_id;
        this.salary = salary;
        //this.dob = dob;
        this.d = d;
        this.m = m;
        this.y = y;
        this.dateofjoining = dateofjoining;
        this.name = name;
        this.deptName=deptName;
        this.city=city;
        count++;
    }
 
    public int getId() {
    return emp_id;
    }
    public float getSalary() {
    return salary;
    }
    
    public int getDay() {
    return d;
    }
    public int getMonth() {
    return m;
    }
    public int getYear() {
    return y;
    }
    public int getDateofjoining() {
    return dateofjoining;
    }
 
    public String getName() {
    return name;
    }
    public String getDepartment() {
    return deptName;
    }
 
    public String getAddress() {
    return city;
    }
}
//testing
/*
 class Department extends Employee{
     String deptName;
     public static int count = 0;
     public Department(){}
     public Department( String deptName){
        super();
        this.deptName = deptName;
        count++;
         
     }
         public String getDepart() {
             return deptName;
         }
         
 }
*/
 //testing
public class employeeDetailsDipart {
public static void main(String[] args) throws Exception 
    {
     //List<Department> account = new ArrayList<Department>();
     List<Employee> list = new ArrayList<Employee>();
     
    list.add(new Employee(1, 15000, 14, 05, 1999, 2016,"Ravi","IT","Delhi."));
     //list.add(new Department("Hi"));
     //list.add(new Employee("1"+ "Ravi" + "14-06-1880" + "2016" + "12000" + "Delhi"));
     
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("             Employeed Details : \n");
            System.out.print("==============================================\n");
            System.out.println("Emaployee Id = " +s.getId()+", " +"Name = " +s.getName()+", " + " Date Of Birth = " +s.getMonth()+" "+s.getDay()+" "+s.getYear()+", " + "Date Of Joining = "+s.getDateofjoining()+", " + "salary = "+s.getSalary()+", " + "Department = "+s.getDepartment()+", " + "Address = " +s.getAddress());
            System.out.print("\n Sorry Sir!! :( This Program Not Completed.. This Is Half Program... Assighnment Time Are lesss So Not Completed Yet.");
        }
    }//End of main() method
}//end of DisplayArrayList class
