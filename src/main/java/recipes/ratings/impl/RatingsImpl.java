package recipes.ratings.impl;

import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;
import recipes.ratings.Ratings;
import recipes.ratings.RatingsBuilder;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'project_1.recipes.recipes.ratings'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class RatingsImpl implements RatingsBuilder {
    
    private Long id;
    private Long usersId;
    private Long recipesId;
    private Integer rating;
    
    public RatingsImpl() {
        
    }
    
    public RatingsImpl(final Ratings ratings) {
        setId(ratings.getId());
        setUsersId(ratings.getUsersId());
        setRecipesId(ratings.getRecipesId());
        setRating(ratings.getRating());
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
    public RatingsImpl setId(Long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Long getUsersId() {
        return usersId;
    }
    
    @Override
    public RatingsImpl setUsersId(Long usersId) {
        this.usersId = usersId;
        return this;
    }
    
    @Override
    public Long getRecipesId() {
        return recipesId;
    }
    
    @Override
    public RatingsImpl setRecipesId(Long recipesId) {
        this.recipesId = recipesId;
        return this;
    }
    
    @Override
    public Integer getRating() {
        return rating;
    }
    
    @Override
    public RatingsImpl setRating(Integer rating) {
        this.rating = rating;
        return this;
    }
    
    @Override
    public Ratings build() {
        return new RatingsImpl(this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("usersId = "+Objects.toString(getUsersId()));
        sj.add("recipesId = "+Objects.toString(getRecipesId()));
        sj.add("rating = "+Objects.toString(getRating()));
        return "RatingsImpl "+sj.toString();
    }
}