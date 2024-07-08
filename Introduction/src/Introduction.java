public class Introduction {
    public static void main(String[] args) {




//        Student ashik = new Student(1,"ashik");
//        Student ghosh = new Student();
//        ghosh.greeting();
        Student one = new Student();
        Student two = one;
        one.name = "ag";
        System.out.println(two.name);

    }
}

class Student{
    int roll;
    String name;

    void greeting(){
        System.out.println("hello! My name is "+name);
    }
    //            Constructor
    Student(){
        this(34,"ghosh");
    }
    Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
}
