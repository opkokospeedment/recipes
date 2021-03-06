package recipes.users;

import com.speedment.orm.core.entity.Entity;
import java.lang.Long;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;
import recipes.ratings.Ratings;
import recipes.ratings.RatingsManager;

/**
 * An interface representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.users'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
@Entity(managerType = UsersManager.class,
builderType = UsersBuilder.class,
primaryKeyType = Long.class)
public interface Users {
    
    Long getId();
    
    String getName();
    
    String getPassword();
    
    default Stream<Ratings> ratingsesByUsersId() {
        return RatingsManager.get()
                .stream().filter(ratings -> Objects.equals(this.getId(), ratings.getUsersId()));
    }
    
    default Stream<Ratings> ratingses() {
        return ratingsesByUsersId();
    }
    
    static UsersBuilder builder() {
        return UsersManager.get().builder();
    }
    
    default UsersBuilder toBuilder() {
        return UsersManager.get().toBuilder(this);
    }
    
    default String toJson() {
        return UsersManager.get().toJson(this);
    }
    
    static Stream<Users> stream() {
        return UsersManager.get().stream();
    }
    
    default Optional<Users> persist() {
        return UsersManager.get().persist(this);
    }
    
    default Optional<Users> update() {
        return UsersManager.get().update(this);
    }
    
    default Optional<Users> remove() {
        return UsersManager.get().remove(this);
    }
}