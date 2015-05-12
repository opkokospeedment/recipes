package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
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
        return "redirect:/recipes";
    }

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public String getRecipes() {
        return "recipes";
    }

    @ModelAttribute("recipes")
    public List<Recipe> populateRecipes() {
        return recipesManager.fetchRecipes();
    }

    @RequestMapping(value = "/recipes/{recipeId}", method = RequestMethod.GET)
    public String getRecipe(Model model, @PathVariable long recipeId) {
        model.addAttribute("recipe", recipesManager.fetchRecipe(recipeId));
        return "recipe";
    }

    @RequestMapping(value = "/recipes/{recipeId}", method = RequestMethod.POST)
    public String rate(Model model, @PathVariable long recipeId, @RequestParam(value = "rating") int rating) {
        recipesManager.rate(0, recipeId, rating);
        recipesManager.fetchRecipe(recipeId);
        model.addAttribute("recipe", recipesManager.fetchRecipe(recipeId));
        return "recipe";
    }



}
