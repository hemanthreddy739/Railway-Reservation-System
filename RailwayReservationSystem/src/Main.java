public class Main {


    public static void main(String[] args) {

        RailwayReservationSystem rrs = new RailwayReservationSystem();
        rrs.displayTrains("Delhi", "jaipur");
        rrs.bookTicket("ram",2013,"03-04-2023");
        rrs.bookTicket("eric",2013,"15-04-2023");
        rrs.cancelTicket(2345);
        rrs.checkAvailability(2013);
        rrs.displayStations();
        rrs.getBookedSeats(2013);



    }

}
