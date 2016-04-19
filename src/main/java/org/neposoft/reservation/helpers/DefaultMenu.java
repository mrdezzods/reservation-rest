package org.neposoft.reservation.helpers;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrdezzods on 19/04/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "restaurant_id",
        "name",
        "status",
        "client_notice",
        "updated_at",
        "created_at",
        "deleted_at",
        "is_default",
        "hours"
})
public class DefaultMenu {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("restaurant_id")
    private String restaurantId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("client_notice")
    private String clientNotice;
    @JsonProperty("updated_at")
    private Object updatedAt;
    @JsonProperty("created_at")
    private Object createdAt;
    @JsonProperty("deleted_at")
    private Object deletedAt;
    @JsonProperty("is_default")
    private String isDefault;
    @JsonProperty("hours")
    private List<Hour> hours = new ArrayList<Hour>();
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
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     * @return The clientNotice
     */
    @JsonProperty("client_notice")
    public String getClientNotice() {
        return clientNotice;
    }

    /**
     * @param clientNotice The client_notice
     */
    @JsonProperty("client_notice")
    public void setClientNotice(String clientNotice) {
        this.clientNotice = clientNotice;
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
     * @return The createdAt
     */
    @JsonProperty("created_at")
    public Object getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Object createdAt) {
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
     * @return The isDefault
     */
    @JsonProperty("is_default")
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault The is_default
     */
    @JsonProperty("is_default")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return The hours
     */
    @JsonProperty("hours")
    public List<Hour> getHours() {
        return hours;
    }

    /**
     * @param hours The hours
     */
    @JsonProperty("hours")
    public void setHours(List<Hour> hours) {
        this.hours = hours;
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
