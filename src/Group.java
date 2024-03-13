import java.util.ArrayList;
import java.util.List;

public class Group {
    private Students studentLead;
    private final List<Students> studentsList;
    private final List<String> tasksList;

    public Group(Students studentLead) {
        this.studentLead = studentLead;
        this.studentsList = new ArrayList<>();
        this.tasksList = new ArrayList<>();
    }

    public Students getStudentLead() {
        return studentLead;
    }

    public void setStudentLead(Students studentLead) {
        this.studentLead = studentLead;
    }

    public void addStudent(Students newStudent) {
        studentsList.add(newStudent);
    }

    public void removeStudent(Students student) {
        if (studentsList.contains(student)) {
            studentsList.remove(student);
        } else {
            System.out.println("Student is not in this group");
        }
    }

    public void renameStudent(Students student, String newFirstName, String newLastName) {
        if (studentsList.contains(student)) {
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
        } else {
            System.out.println("Student not found in the group.");
        }
    }

    public void addTask(String task) {
        tasksList.add(task);
    }

    public List<Students> getListOfStudents() {
        return new ArrayList<>(studentsList);
    }

    public List<String> getListOfTasks() {
        return new ArrayList<>(tasksList);
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentLead=" + studentLead +
                ", studentsList=" + studentsList +
                ", tasksList=" + tasksList +
                '}';
    }
}

