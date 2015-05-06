package recipes.users;

import com.speedment.orm.core.Buildable;
import javax.annotation.Generated;

/**
 * A builder representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.users'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface UsersBuilder extends Users, Buildable<Users> {
    
    UsersBuilder setId(Long id);
    
    UsersBuilder setName(String name);
    
    UsersBuilder setPassword(String password);
}