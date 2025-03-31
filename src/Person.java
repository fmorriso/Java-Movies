import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;


    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Person that)) return false;
        return this.firstName.equals(that.firstName) & this.lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }


    @Override
    public String toString() {
        String sb = "Person{" + "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
        return sb;
    }
}
