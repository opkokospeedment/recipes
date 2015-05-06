package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2015-05-06.
 */
@Controller
@RequestMapping("/rest")
public class RecipesController {

    @Autowired
    private RecipesManager recipesManager;

    @RequestMapping(
            value="/users",
            method= RequestMethod.POST
    )
    public String registerUser(@RequestParam(value="username") String user, @RequestParam(value="password") String password) {
        recipesManager.registerUser(user, password);
        return "redirect:/login";
    }

}
