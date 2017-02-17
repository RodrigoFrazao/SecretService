package be.cegeka.SecretService.User;

/**
 * Created by rodrPMFF on 17/02/2017.
 */
public class Person {

    public int Id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public Person(int id,String firstName, String lastName, String username, String password) {
        this.Id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
