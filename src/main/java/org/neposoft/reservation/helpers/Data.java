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
        "name",
        "address",
        "town",
        "postcode",
        "tel",
        "email",
        "website",
        "slug",
        "logo",
        "geo_long",
        "geo_lat",
        "delivery_enabled",
        "reservation_enabled",
        "takeaway_enabled",
        "preorder_enabled",
        "default_menu",
        "today_hours",
        "menus",
        "reviews"
})
public class Data {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("town")
    private String town;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("tel")
    private String tel;
    @JsonProperty("email")
    private String email;
    @JsonProperty("website")
    private String website;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("logo")
    private Object logo;
    @JsonProperty("geo_long")
    private String geoLong;
    @JsonProperty("geo_lat")
    private String geoLat;
    @JsonProperty("delivery_enabled")
    private String deliveryEnabled;
    @JsonProperty("reservation_enabled")
    private String reservationEnabled;
    @JsonProperty("takeaway_enabled")
    private String takeawayEnabled;
    @JsonProperty("preorder_enabled")
    private Object preorderEnabled;
    @JsonProperty("default_menu")
    private DefaultMenu defaultMenu;
    @JsonProperty("today_hours")
    private List<TodayHour> todayHours = new ArrayList<TodayHour>();
    @JsonProperty("menus")
    private List<Menu> menus = new ArrayList<Menu>();
    @JsonProperty("reviews")
    private List<Review> reviews = new ArrayList<Review>();
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
     * @return The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The town
     */
    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    /**
     * @param town The town
     */
    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * @return The postcode
     */
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode The postcode
     */
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return The tel
     */
    @JsonProperty("tel")
    public String getTel() {
        return tel;
    }

    /**
     * @param tel The tel
     */
    @JsonProperty("tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return The slug
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug The slug
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * @return The logo
     */
    @JsonProperty("logo")
    public Object getLogo() {
        return logo;
    }

    /**
     * @param logo The logo
     */
    @JsonProperty("logo")
    public void setLogo(Object logo) {
        this.logo = logo;
    }

    /**
     * @return The geoLong
     */
    @JsonProperty("geo_long")
    public String getGeoLong() {
        return geoLong;
    }

    /**
     * @param geoLong The geo_long
     */
    @JsonProperty("geo_long")
    public void setGeoLong(String geoLong) {
        this.geoLong = geoLong;
    }

    /**
     * @return The geoLat
     */
    @JsonProperty("geo_lat")
    public String getGeoLat() {
        return geoLat;
    }

    /**
     * @param geoLat The geo_lat
     */
    @JsonProperty("geo_lat")
    public void setGeoLat(String geoLat) {
        this.geoLat = geoLat;
    }

    /**
     * @return The deliveryEnabled
     */
    @JsonProperty("delivery_enabled")
    public String getDeliveryEnabled() {
        return deliveryEnabled;
    }

    /**
     * @param deliveryEnabled The delivery_enabled
     */
    @JsonProperty("delivery_enabled")
    public void setDeliveryEnabled(String deliveryEnabled) {
        this.deliveryEnabled = deliveryEnabled;
    }

    /**
     * @return The reservationEnabled
     */
    @JsonProperty("reservation_enabled")
    public String getReservationEnabled() {
        return reservationEnabled;
    }

    /**
     * @param reservationEnabled The reservation_enabled
     */
    @JsonProperty("reservation_enabled")
    public void setReservationEnabled(String reservationEnabled) {
        this.reservationEnabled = reservationEnabled;
    }

    /**
     * @return The takeawayEnabled
     */
    @JsonProperty("takeaway_enabled")
    public String getTakeawayEnabled() {
        return takeawayEnabled;
    }

    /**
     * @param takeawayEnabled The takeaway_enabled
     */
    @JsonProperty("takeaway_enabled")
    public void setTakeawayEnabled(String takeawayEnabled) {
        this.takeawayEnabled = takeawayEnabled;
    }

    /**
     * @return The preorderEnabled
     */
    @JsonProperty("preorder_enabled")
    public Object getPreorderEnabled() {
        return preorderEnabled;
    }

    /**
     * @param preorderEnabled The preorder_enabled
     */
    @JsonProperty("preorder_enabled")
    public void setPreorderEnabled(Object preorderEnabled) {
        this.preorderEnabled = preorderEnabled;
    }

    /**
     * @return The defaultMenu
     */
    @JsonProperty("default_menu")
    public DefaultMenu getDefaultMenu() {
        return defaultMenu;
    }

    /**
     * @param defaultMenu The default_menu
     */
    @JsonProperty("default_menu")
    public void setDefaultMenu(DefaultMenu defaultMenu) {
        this.defaultMenu = defaultMenu;
    }

    /**
     * @return The todayHours
     */
    @JsonProperty("today_hours")
    public List<TodayHour> getTodayHours() {
        return todayHours;
    }

    /**
     * @param todayHours The today_hours
     */
    @JsonProperty("today_hours")
    public void setTodayHours(List<TodayHour> todayHours) {
        this.todayHours = todayHours;
    }

    /**
     * @return The menus
     */
    @JsonProperty("menus")
    public List<Menu> getMenus() {
        return menus;
    }

    /**
     * @param menus The menus
     */
    @JsonProperty("menus")
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    /**
     * @return The reviews
     */
    @JsonProperty("reviews")
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     * @param reviews The reviews
     */
    @JsonProperty("reviews")
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
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
