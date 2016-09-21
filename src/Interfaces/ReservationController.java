package Interfaces;

import DTO.ReservationDetail;
import DTO.RouteDetail;
import DTO.RouteIdentifer;
import DTO.RouteSummary;
import ETO.FullBookedException;
import ETO.NoEnoughPlaceException;
import java.util.List;

public interface ReservationController {

    /**
     * get available routes
     *
     * @pre route should exist.
     * @return a collection of RouteSummary.
     */
    List<RouteSummary> getRoutes();

    /**
     * get departure times available for the chosen route.
     *
     * @pre route should exist.
     * @return a collection of RouteDetail.
     */
    List<RouteDetail> getAvailableTimes(RouteIdentifer routeId);

    /**
     * get the reservation detail after submitting reservation.
     *
     * @pre the session is not timeout
     * @throw FullBookedException if the desired route on desired date time is
     * fullbooked.
     * @throw NoEnoughPlaceExeption if the ferry doesn't have enough places for
     * desired amount of passengers and vehicles.
     * @return ReservationDetail
     */
    ReservationDetail reserve(RouteDetail detail) throws FullBookedException, NoEnoughPlaceException;

}
