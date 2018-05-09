package lab7;

public class sutdentApp {
    public static void main(String[] args) {
        Student s1 = new Student ();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGander("Male");
        s1.setHeight(180);
        System.out.print(s1.toString());

        String s2 = new  Student ("Safe",90,"Female",190);
        System.out.print(s2.toString());
    }
}
