package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by user on 2015-05-06.
 */
@Controller
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

    @RequestMapping(
            value="/recipes",
            method= RequestMethod.POST
    )
    public String addRecipe(@RequestParam(value="name") String name, @RequestParam(value="text") String text) {
        recipesManager.addRecipe(name, text);
        return "recipes";
    }

    @RequestMapping("/recipes")
    public String getRecipes() {
        return "recipes";
    }

    @ModelAttribute("recipes")
    public List<Recipe> populateRecipes() {
        return recipesManager.fetchRecipes();
    }
}
