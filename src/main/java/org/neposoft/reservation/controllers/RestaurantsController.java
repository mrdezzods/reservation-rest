package org.neposoft.reservation.controllers;

import org.neposoft.reservation.helpers.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mrdezzods on 19/04/16.
 */

@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse getAll() {
        RestTemplate template = new RestTemplate();
        ApiResponse response = template.getForObject("http://www.eatonline-wip.neposoft.org/api/v1/restaurants/nepalihouse", ApiResponse.class);
        return response;
    }
}
