public class Student {

    private int id;
    private String name;
    private String department;
    private String semester;

    public Student(int id, String name, String department, String semester) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
    }
}


