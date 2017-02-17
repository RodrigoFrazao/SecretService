package be.cegeka.SecretService.Secret;
import be.cegeka.SecretService.user.Pineapple;

/**
 * Created by dieterp on 17/02/2017.
 */
public class Secret {

    private int id = 0;

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
}
