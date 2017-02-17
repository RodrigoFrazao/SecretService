package be.cegeka.SecretService.Secret;

import be.cegeka.SecretService.user.Pineapple;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by dieterp on 17/02/2017.
 */
public class Secret {

    private int id;
    private String message;
    private Pineapple person;



    public Secret(String message, Pineapple person)
    {
        this.id = ++id;
        this.message = message;
        this.person = person;
    }
}
