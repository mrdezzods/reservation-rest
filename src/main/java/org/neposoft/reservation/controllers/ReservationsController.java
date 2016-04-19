package org.neposoft.reservation.controllers;

import domain.AppFacade;
import domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RequestMapping("/reservations")
@RestController
public class ReservationsController {

    @Autowired
    protected AppFacade facade;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Reservation> getReservations() {
        return facade.getAllReservations();
    }
}
