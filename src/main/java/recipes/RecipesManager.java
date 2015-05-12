package recipes;

import org.springframework.stereotype.Component;
import recipes.ratings.Ratings;
import recipes.recipes.Recipes;
import recipes.users.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
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
                .forEach(u -> System.out.println("u = " + u));
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

    public void rate(long userId, long recipeId, int rating) {
        Ratings.builder()
                .setRating(rating)
                .setRecipesId(recipeId)
                .setUsersId(userId)
                .persist();
    }

    public List<Recipe> fetchRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        Recipes.stream().forEach(r -> {
            Recipe recipe = new Recipe();
            recipe.setId(r.getId());
            recipe.setName(r.getName());
            recipe.setText(r.getText());
            recipes.add(recipe);
        });
        return recipes;
    }

    public Recipe fetchRecipe(long recipeId) {
        //Todo
        Recipes rec = Recipes.stream().filter(r -> r.getId() == recipeId).findFirst().get();
        Recipe recipe = new Recipe();
        recipe.setId(rec.getId());
        recipe.setName(rec.getName());
        recipe.setText(rec.getText());
        recipe.setRating(getRating(recipeId));
        return recipe;
    }

    private int getRating(long recipeId) {
        //Todo
        Double rating = Ratings.stream()
                .filter(r -> r.getRecipesId() == recipeId)
                .mapToInt(Ratings::getRating)
                .average()
                .getAsDouble();

        return rating.intValue();
    }

}
