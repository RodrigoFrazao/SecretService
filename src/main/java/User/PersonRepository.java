package User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrPMFF on 17/02/2017.
 */
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
