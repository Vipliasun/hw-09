public class Main {
    public static void main(String[] args) {
        Students studentLead = new Students("a", "b");
        Students student1 = new Students("c", "d");
        Students student2 = new Students("e", "f");
        Group group = new Group(studentLead);
        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println("Group:\n"+group);
        Students newStudentLead = new Students("g", "h");
        group.setStudentLead(newStudentLead);
        group.renameStudent(student1, "C", "D");
        group.removeStudent(student2);
        group.addTask("t1");
        group.addTask("t2");
        System.out.print("Group:\n"+group);

    }
}