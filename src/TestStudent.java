/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinit
 */

//Program: Basic use of constructor, class, object, final variabel,static method and variable.
class Student
{  
   int rollno;
   String name;
   final int courseDuration = 1; //1 year and cannot change the value
   static String college ="BVB"; //shared by all students
   
   
   //parameter constructor  
   Student(int r, String n)
   {  
        rollno = r;  
        name = n;  
   }  
   
   //static method
   public static String getCollgeName()
   {
       return college;
   }
   
   //method to display  
   void display()
   {
       System.out.println("ROLLNO->"+rollno+"  NAME->"+name+"  DURATION->"+courseDuration);
   }  
}  


public class TestStudent {
    
    public static void main(String args[])
     {  
        Student s1 = new Student(111,"Vinit");  
        Student s2 = new Student(222,"Kishan");  
 
        s1.display();  
        s2.display();  
        
        String getCollege = Student.getCollgeName();
        System.out.println("College Name is :"+getCollege);
    }  
}
