/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.*/

//This Program Coded By AIYUB KHAN..

//package marksCalculateClass3;

 //@author AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)



public class marksCalculateClass3 {



    public static void main(String[] args) {

        A marksA = new A(70f, 80f, 75f);

        System.out.println("Student 1 Percentage: " +marksA .getPercentage());

                

        B marksB = new B(70f , 75f , 80f , 70f);

        System.out.println("Student 2 Percentage: " +marksB.getPercentage());

        

    }   

}



abstract class Mark{



    abstract float getPercentage();

}



class A extends Mark{

    float sub1 , sub2 , sub3;

    float Percentage=0;

        

    A(float a , float b, float c){

    sub1 = a;

    sub2 = b;

    sub3 = c;    

    }

    @Override

    public float getPercentage(){

    Percentage = (sub1 + sub2 + sub3 )/300* 100; 

        return Percentage;

    }

}



class B extends Mark{

    float sub1 , sub2 , sub3 , sub4;

    float Percentage=0;

        

    B(float a , float b, float c,float d){

    sub1 = a ;

    sub2 = b;

    sub3 = c;    

    sub4 = d;

    }

    

    @Override

    public float getPercentage(){

    Percentage = (sub1 + sub2 + sub3 + sub4 )/400* 100; 

    

        return Percentage;

    }

}

