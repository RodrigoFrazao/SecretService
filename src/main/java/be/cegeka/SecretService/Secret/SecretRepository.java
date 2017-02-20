package be.cegeka.SecretService.Secret;
import java.util.ArrayList;
import java.util.List;



public class SecretRepository {

    List<Secret> SecretRepo = new ArrayList<Secret>();

    public void AddPersonToPersonRepo(Secret secret)
    {
        SecretRepo.add(secret);
    }

    public List<Secret> getSecretRepo()
    {
        return SecretRepo;
    }
}
