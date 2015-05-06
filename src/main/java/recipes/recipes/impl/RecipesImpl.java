package recipes.recipes.impl;

import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;
import recipes.recipes.Recipes;
import recipes.recipes.RecipesBuilder;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.recipes'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class RecipesImpl implements RecipesBuilder {
    
    private Long id;
    private String name;
    private String text;
    
    public RecipesImpl() {
        
    }
    
    public RecipesImpl(final Recipes recipes) {
        setId(recipes.getId());
        setName(recipes.getName());
        setText(recipes.getText());
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
    public RecipesImpl setId(Long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public RecipesImpl setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public String getText() {
        return text;
    }
    
    @Override
    public RecipesImpl setText(String text) {
        this.text = text;
        return this;
    }
    
    @Override
    public Recipes build() {
        return new RecipesImpl(this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("name = "+Objects.toString(getName()));
        sj.add("text = "+Objects.toString(getText()));
        return "RecipesImpl "+sj.toString();
    }
}