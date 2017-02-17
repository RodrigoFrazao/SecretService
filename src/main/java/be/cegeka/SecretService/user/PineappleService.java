package be.cegeka.SecretService.user;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class PineappleService {

    @Inject
    private PineappleRepository pineappleRepository;

    private static int counter;

    public PineappleService(PineappleRepository pineappleRepository) {
        this.pineappleRepository = pineappleRepository;
    }

    public List<Pineapple> getAllPineapples(){
        return pineappleRepository.getAllPineapples();
    }

    public void addPineapple(String firstName, String lastName, String username, String password){
        pineappleRepository.addPineapple(new Pineapple(counter++,firstName,lastName,username,password));
    }
}
