package Fundamentals;

public class Construct {
     String name;
     int age;
     Construct(String name,int age) {
         this.name = name;
         this.age = age;
     }
}

class Students extends Construct{
    int rollnum;
    int marks;
    Students(String name,int age,int rollnum,int marks){
        super(name,age);
        this.rollnum = rollnum;
        this.marks = marks;
    }

    Students s = new Students("harry",48,401,52);


}

