package recipes;

import org.springframework.stereotype.Component;
import recipes.users.Users;

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

    public void storeRecipe(String name, String text) {
        //Todo
    }

    public void rate(int recipeId, int rating) {
        //Todo
    }

    public List<Recipe> fetchRecipes() {
        //Todo
        return null;
    }

    public Recipe fetchRecipe(int recipeId) {
        //Todo
        return null;
    }

}
