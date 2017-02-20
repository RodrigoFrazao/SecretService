package be.cegeka.SecretService.Secret;
import be.cegeka.SecretService.user.Pineapple;

import java.util.List;


public class Secret {

    private int id;

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Pineapple getPineapple() {
        return pineapple;
    }

    private String message;
    private Pineapple pineapple;



    public Secret(String message, Pineapple pineapple)

    {
        this.id = ++id;
        this.message = message;
        this.pineapple = pineapple;
    }

    /*
    public int MakeId(List<Secret> SecreList)
    {

        return 0;
    }
    */
}
