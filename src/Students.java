public class Students {
    private String firstName;
    private String lastName;
    private final int id;
    private static int idUnique = 0;

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++idUnique;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}