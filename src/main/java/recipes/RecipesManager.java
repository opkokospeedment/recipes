package recipes;

import org.springframework.stereotype.Component;
import recipes.recipes.Recipes;
import recipes.users.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by user on 2015-05-06.
 */
@Component
public class RecipesManager {

    public void registerUser(String user, String password) {
        //Todo
        Users.builder()
                .setName(user)
                .setPassword(password)
                .build()
                .persist();
    }

    public boolean login(String user, String password) {
        //Todo
        Users.stream()
            .forEach(u-> System.out.println("u = " + u));
        return Users.stream()
                .filter(u -> u.getName().equals(user))
                .filter(u -> u.getPassword().equals(password))
                .findAny()
                .isPresent();
    }

    public void addRecipe(String name, String text) {
        Recipes.builder()
                .setName(name)
                .setText(text)
                .persist();
    }

    public void rate(int recipeId, int rating) {
        //Todo
    }

    public List<Recipe> fetchRecipes() {
        Recipe recipe = new Recipe();
        recipe.setName("ett");
        recipe.setText("ettText");

        Recipe recipe2 = new Recipe();
        recipe2.setName("två");
        recipe2.setText("tvåText");

        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(recipe);
        recipes.add(recipe2);
        return recipes;
    }

    public Recipe fetchRecipe(int recipeId) {
        //Todo
        return null;
    }

}
