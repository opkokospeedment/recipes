package recipes.recipes.impl;

import com.speedment.orm.core.manager.sql.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;
import recipes.recipes.Recipes;
import recipes.recipes.RecipesBuilder;
import recipes.recipes.RecipesManager;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.recipes'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class RecipesManagerImpl extends AbstractSqlManager<Long, Recipes, RecipesBuilder> implements RecipesManager {
    
    public RecipesManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public RecipesBuilder builder() {
        return new RecipesImpl();
    }
    
    @Override
    public RecipesBuilder toBuilder(Recipes prototype) {
        return new RecipesImpl(prototype);
    }
    
    protected Recipes defaultReadEntity(ResultSet resultSet) {
        final RecipesBuilder builder = builder();
        try {
            builder.setId(resultSet.getLong("id"));
            builder.setName(resultSet.getString("name"));
            builder.setText(resultSet.getString("text"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}