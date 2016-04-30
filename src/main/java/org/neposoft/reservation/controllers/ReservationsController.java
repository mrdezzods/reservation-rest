package org.neposoft.reservation.controllers;

import domain.AppFacade;
import domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Set;


@RequestMapping("/reservations")
@RestController
public class ReservationsController {

    @Autowired
    protected AppFacade facade;

    /**
     * @api {get} /reservations Returns all restaurants
     * @apiName GetReservations
     * @apiGroup Reservation
     * @apiSuccess {java.util.List} Reservation All reservations in system
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Reservation> getReservations() {
        return facade.getAllReservations();
    }

    /**
     * Add a reservation
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> putReservtion(@Valid Reservation reservation, BindingResult bindingResult) {
        reservation.setRestaurant(null);

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        facade.addReservation(reservation);

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "{id}")
    public String updateReservation(@PathVariable String id) {

        return "";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity<String> deleteReservation(@PathVariable Integer id) {
        facade.deleteReservation(id);

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
