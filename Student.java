public class Student {
    int rollNumber;
    String name;
    float marks[] = new float[5];

    Student(int rollNumber, String name, float marks[]) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    char calculateGrade() {
        char Grade = 'F';
        float avg = 0;
        for (int i = 0; i < 5; i++)
            avg = avg + marks[i];
        avg = avg / 5;
        if (avg == 100)
            Grade = 'O';
        else if (avg >= 90)
            Grade = 'A';
        else if (avg >= 75)
            Grade = 'B';
        else if (avg >= 60)
            Grade = 'C';
        else if (avg >= 45)
            Grade = 'D';
        else if (avg >= 33)
            Grade = 'E';
        return Grade;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.print("Marks: " + marks[1]);
        for (int i = 1; i < 5; i++)
            System.out.print(", " + marks[i]);
        System.out.println("\nGrade: " + calculateGrade() + "\n\n");
    }

    public static void main(String[] args) {
        float marks1[] = new float[5];
        float marks2[] = new float[5];
        for (int i = 0; i < 5; i++) {
            marks1[i] = (float) (i + 90);
            marks2[i] = (float) (2 * i + 65);
        }
        Student obj1 = new Student(1, "Test1", marks1);
        Student obj2 = new Student(2, "Test2", marks2);
        obj1.display();
        obj2.display();
    }
}