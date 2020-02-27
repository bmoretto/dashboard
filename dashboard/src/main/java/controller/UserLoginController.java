package controller;

import model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.UserLoginRepository;

@Controller
public class UserLoginController {

    @Autowired
    private UserLoginRepository userLoginRepository;

    @RequestMapping(method= RequestMethod.GET, value="/createuser")
    public String inicio() {
        return "/createuser";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createuser")
    public String create(UserLogin userLogin) {
        userLoginRepository.save(userLogin);
        return "/createuser";
    }

}
