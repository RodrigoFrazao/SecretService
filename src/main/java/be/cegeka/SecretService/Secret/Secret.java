package be.cegeka.SecretService.Secret;

import be.cegeka.SecretService.User.Person;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by dieterp on 17/02/2017.
 */
public class Secret {

    private int id;
    private String message;
    private Person person;



    public Secret(String message, Person person)
    {
        this.id = ++id;
        this.message = message;
        this.person = person;
    }
}
