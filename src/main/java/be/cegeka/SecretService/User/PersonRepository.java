package be.cegeka.SecretService.User;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PersonRepository {

    private List<Person> people;

    public PersonRepository() {
        people = new ArrayList<Person>();
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getAllPeople(){
        return people;
    }


}
