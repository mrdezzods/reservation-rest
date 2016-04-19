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
        "menu_id",
        "day",
        "open_time",
        "minutes",
        "restaurant_id"
})
public class TodayHour {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("menu_id")
    private String menuId;
    @JsonProperty("day")
    private String day;
    @JsonProperty("open_time")
    private String openTime;
    @JsonProperty("minutes")
    private String minutes;
    @JsonProperty("restaurant_id")
    private String restaurantId;
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
     * @return The menuId
     */
    @JsonProperty("menu_id")
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId The menu_id
     */
    @JsonProperty("menu_id")
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * @return The day
     */
    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    /**
     * @param day The day
     */
    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return The openTime
     */
    @JsonProperty("open_time")
    public String getOpenTime() {
        return openTime;
    }

    /**
     * @param openTime The open_time
     */
    @JsonProperty("open_time")
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    /**
     * @return The minutes
     */
    @JsonProperty("minutes")
    public String getMinutes() {
        return minutes;
    }

    /**
     * @param minutes The minutes
     */
    @JsonProperty("minutes")
    public void setMinutes(String minutes) {
        this.minutes = minutes;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
