package be.cegeka.SecretService.Controller;

import be.cegeka.SecretService.user.Pineapple;
import be.cegeka.SecretService.user.PineappleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;


@Controller
@RequestMapping("/pineapple")
public class PineappleController {

    @Inject
    private PineappleService pineappleService;

    @RequestMapping (method = RequestMethod.GET)
    public

    @ResponseBody
    List<Pineapple> GetAllPineapples(){
       return pineappleService.getAllPineapples();
    }

    @RequestMapping (method = RequestMethod.POST)
    public
    @ResponseBody
    void AddPinapple(@RequestParam (value = "firstName") String firstName,
                     @RequestParam (value = "lastName") String lastName,
                     @RequestParam (value = "username") String username,
                     @RequestParam (value = "password") String password){
        pineappleService.addPineapple(firstName, lastName, username, password);
    }
}
