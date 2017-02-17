package be.cegeka.SecretService.Secret;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dieterp on 17/02/2017.
 */

public class SecretRepository {

    List<Secret> SecretRepo = new ArrayList<Secret>();

    // add
    public void AddPersonToPersonRepo(Secret secret)
    {
        SecretRepo.add(secret);
    }


    // get
    public List<Secret> getSecretRepo()
    {
        return SecretRepo;
    }





}
