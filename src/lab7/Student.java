package lab7;
//1.name
//2.age
//3.gander
//4.height

public class Student {
    //properties of student class
    private String  name;
    private int age;
    private String gander;
    private double height;
    //default constructor
    public Student (){}
    //design constructor
    public Student(String name, int age, String gander, double height) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//class

