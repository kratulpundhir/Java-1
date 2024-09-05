public class EngineeringStudent extends Student {
    String engineeringBranch;

    EngineeringStudent(int rollNumber, String name, float[] marks, String engineeringBranch) {
        super(rollNumber, name, marks);
        this.engineeringBranch = engineeringBranch;
    }

    void display() {
        System.out.println("Engineering Branch: " + engineeringBranch);
    }

    public static void main(String[] args) {

        float marks1[] = new float[5];
        float marks2[] = new float[5];
        for (int i = 0; i < 5; i++) {
            marks1[i] = (float) (i + 90);
            marks2[i] = (float) (2 * i + 65);
        }
        Student obj1 = new Student(1, "Test1", marks1);
        EngineeringStudent obj2 = new EngineeringStudent(1, "Test1", marks1, "Aerospace Engineering");
        Student obj3 = new Student(2, "Test2", marks2);
        EngineeringStudent obj4 = new EngineeringStudent(1, "Test1", marks1, "Mechanical Engineering");
        obj2.display();
        obj1.display();
        obj4.display();
        obj3.display();
    }
}
