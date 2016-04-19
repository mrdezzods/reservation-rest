package org.neposoft.reservation.helpers;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrdezzods on 19/04/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "restaurant_id",
        "user_id",
        "review",
        "rating",
        "created_at",
        "deleted_at",
        "updated_at",
        "status",
        "as_anoniem",
        "name"
})
public class Review {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("restaurant_id")
    private String restaurantId;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("review")
    private String review;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("deleted_at")
    private Object deletedAt;
    @JsonProperty("updated_at")
    private Object updatedAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("as_anoniem")
    private String asAnoniem;
    @JsonProperty("name")
    private Object name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The restaurantId
     */
    @JsonProperty("restaurant_id")
    public String getRestaurantId() {
        return restaurantId;
    }

    /**
     * @param restaurantId The restaurant_id
     */
    @JsonProperty("restaurant_id")
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * @return The userId
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return The review
     */
    @JsonProperty("review")
    public String getReview() {
        return review;
    }

    /**
     * @param review The review
     */
    @JsonProperty("review")
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * @return The rating
     */
    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    /**
     * @param rating The rating
     */
    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The deletedAt
     */
    @JsonProperty("deleted_at")
    public Object getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt The deleted_at
     */
    @JsonProperty("deleted_at")
    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * @return The updatedAt
     */
    @JsonProperty("updated_at")
    public Object getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The asAnoniem
     */
    @JsonProperty("as_anoniem")
    public String getAsAnoniem() {
        return asAnoniem;
    }

    /**
     * @param asAnoniem The as_anoniem
     */
    @JsonProperty("as_anoniem")
    public void setAsAnoniem(String asAnoniem) {
        this.asAnoniem = asAnoniem;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
