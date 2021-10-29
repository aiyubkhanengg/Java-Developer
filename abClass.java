/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.*/
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor AIYUB KHAN

public class abClass {

    

    public static void main(String[] args) {

        subclass1 s1 = new subclass1();

        s1.message();

        

        subclass2 s2 = new subclass2();

        s2.message();

    }

}

abstract class Parent{



    public abstract void message(); 

} 



class subclass1 extends Parent{

    

    @Override

    public void message(){

        System.out.println("This is first subclass: ");

    }

}



class subclass2 extends Parent{

    @Override

    public void message(){

        System.out.println("This is Second subclass: ");

    }

}