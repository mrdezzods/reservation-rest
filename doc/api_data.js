define({ "api": [  {    "type": "get",    "url": "/reservations",    "title": "Returns all restaurants",    "name": "GetReservations",    "group": "Reservation",    "success": {      "fields": {        "Success 200": [          {            "group": "Success 200",            "type": "java.util.List",            "optional": false,            "field": "Reservation",            "description": "<p>All reservations in system</p>"          }        ]      }    },    "version": "0.0.0",    "filename": "src/main/java/org/neposoft/reservation/controllers/ReservationsController.java",    "groupTitle": "Reservation"  },  {    "type": "get",    "url": "/restaurants",    "title": "Get all restaurants in the system",    "name": "GetRestaurants",    "group": "Restaurant",    "success": {      "fields": {        "Success 200": [          {            "group": "Success 200",            "type": "java.util.List",            "optional": false,            "field": "restaurants",            "description": "<p>All restaurants in the system.</p>"          }        ]      }    },    "version": "0.0.0",    "filename": "src/main/java/org/neposoft/reservation/controllers/RestaurantsController.java",    "groupTitle": "Restaurant"  },  {    "type": "get",    "url": "/restaurants/:slug",    "title": "Find a restaurant with specific slug",    "name": "findRestaurant",    "group": "Restaurant",    "parameter": {      "fields": {        "Parameter": [          {            "group": "Parameter",            "type": "String",            "optional": false,            "field": "slug",            "description": "<p>Slug of the restaurant</p>"          }        ]      }    },    "success": {      "fields": {        "Success 200": [          {            "group": "Success 200",            "type": "Restaurant",            "optional": false,            "field": "Restaurant",            "description": "<p>restaurant with the given slug</p>"          }        ]      }    },    "version": "0.0.0",    "filename": "src/main/java/org/neposoft/reservation/controllers/RestaurantsController.java",    "groupTitle": "Restaurant"  }] });
