package recipes.ratings;

import com.speedment.orm.core.entity.Entity;
import java.lang.Long;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;
import recipes.recipes.Recipes;
import recipes.recipes.RecipesManager;
import recipes.users.Users;
import recipes.users.UsersManager;

/**
 * An interface representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.ratings'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
@Entity(managerType = RatingsManager.class,
builderType = RatingsBuilder.class,
primaryKeyType = Long.class)
public interface Ratings {
    
    Long getId();
    
    Long getUsersId();
    
    Long getRecipesId();
    
    Integer getRating();
    
    default Users findUsersId() {
        return UsersManager.get()
                .stream().filter(users -> Objects.equals(this.getUsersId(), users.getId())).findAny().get();
    }
    
    default Recipes findRecipesId() {
        return RecipesManager.get()
                .stream().filter(recipes -> Objects.equals(this.getRecipesId(), recipes.getId())).findAny().get();
    }
    
    static RatingsBuilder builder() {
        return RatingsManager.get().builder();
    }
    
    default RatingsBuilder toBuilder() {
        return RatingsManager.get().toBuilder(this);
    }
    
    default String toJson() {
        return RatingsManager.get().toJson(this);
    }
    
    static Stream<Ratings> stream() {
        return RatingsManager.get().stream();
    }
    
    default Optional<Ratings> persist() {
        return RatingsManager.get().persist(this);
    }
    
    default Optional<Ratings> update() {
        return RatingsManager.get().update(this);
    }
    
    default Optional<Ratings> remove() {
        return RatingsManager.get().remove(this);
    }
}