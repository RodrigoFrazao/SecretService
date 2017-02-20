package be.cegeka.SecretService.Secret;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class SecretService {

    @Inject
    private SecretRepository repository;

    // picklist

    public List<Secret> SingleSecretPerDistinctPineapple()
    {
        List<Secret> resultList = new ArrayList<>();

        for (Secret secret: repository.getSecretRepo())
        {

            if (IsPinapplesSecretAlreadyInReturnList(resultList))
            {
                // afwerken
            }

        }

        return resultList;
    }

    // Is Pinapple already in the returnList?


    // af te werken
    private boolean IsPinapplesSecretAlreadyInReturnList(List<Secret> theResultList)

    {
        // moet nog in lijst zoeken of resultaat er al in zit
        theResultList.contains(repository);

        return false;

    }
}
