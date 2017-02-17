package be.cegeka.SecretService.user;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PineappleRepository {

    private List<Pineapple> pineapples;

    public PineappleRepository() {
        pineapples = new ArrayList<Pineapple>();
    }

    public void addPineapple(Pineapple pineapple){
        pineapples.add(pineapple);
    }

    public List<Pineapple> getAllPineapples(){
        return pineapples;
    }


}
