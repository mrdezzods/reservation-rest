package org.neposoft.reservation.controllers;

import domain.AppFacade;
import domain.Restaurant;
import org.neposoft.reservation.helpers.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


/**
 * Created by mrdezzods on 19/04/16.
 */

/**
 * @api {get} /restaurants Get all restaurants in the system
 * @apiName GetRestaurants
 * @apiGroup Restaurant
 * @apiSuccess { java.util.List } restaurants All restaurants in the system.
 */
@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {

    @Autowired
    protected AppFacade facade;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Restaurant> getAll() {
        return facade.getAllRestaurants();
    }


    /**
     * @api {get} /restaurants/:slug Find a restaurant with specific slug
     * @apiName findRestaurant
     * @apiGroup Restaurant
     * @apiParam {String} slug Slug of the restaurant
     * @apiSuccess { Restaurant } Restaurant  restaurant with the given slug
     */
    public Restaurant find() {
        return facade.findRestaurantBySlug("");
    }
}
