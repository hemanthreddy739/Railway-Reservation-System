import java.util.ArrayList;
import java.util.Scanner;



public class RailwayReservationSystem{
    private ArrayList<Station> stations;
    private ArrayList<Ticket> tickets;

    public RailwayReservationSystem() {
        stations = new ArrayList<Station>();
        tickets = new ArrayList<Ticket>();

        // Creating stations and trains
        Station delhi = new Station("Delhi");
        delhi.addTrain(new Train("Delhi SuperFast", "Delhi", "jaipur",  "7:00", 50, 2013));

        Station jaipur = new Station("Jaipur");

        Station prayagraj = new Station("Prayagraj");
        prayagraj.addTrain(new Train("Prayagraj Express", "Prayagraj", "Delhi","10:00", 50, 3045));

        Station mumbai = new Station("Mumbai");
        mumbai.addTrain(new Train("Mumbai SuperFast", "Mumbai", "Delhi", "13:05", 50, 1010));

        stations.add(delhi);
        stations.add(jaipur);
        stations.add(prayagraj);
        stations.add(mumbai);
    }

    public void displayStations() {
        System.out.println("Available Stations:");
        for (Station station : stations) {
            System.out.println(station.getName());
        }
    }

    public void displayTrains(String source, String destination) {
        System.out.println("Available Trains:");
        for (Station station : stations) {
            if (station.getName().equalsIgnoreCase(source)) {
                for (Train train : station.getTrains()) {
                    for (Station destinationStation : stations) {
                        if (destinationStation.getName().equalsIgnoreCase(destination)) {
                            if (destinationStation.getTrains().contains(train)) {
                                System.out.println(train.getTrainName() + " (Train Number: " + train.getTrainNumber() + ")");
                            }
                        }
                    }
                }
            }
        }
    }


    public int getBookedSeats(int trainNumber) {
        int bookedSeats = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getTrainNumber() == trainNumber) {
                bookedSeats++;
            }
        }
        return bookedSeats;
    }

    public void checkAvailability(int trainNumber) {
        for (Station station : stations) {
            for (Train train : station.getTrains()) {
                if (train.getTrainNumber() == trainNumber) {
                    if (train.getPassengerStrength() - getBookedSeats(trainNumber) > 0) {
                        System.out.println("Available Seats: " + (train.getPassengerStrength() - getBookedSeats(trainNumber)));
                    } else {
                        System.out.println("Sorry, no seats available on this train.");
                    }
                    return;
                }
            }
        }
        System.out.println("Invalid train number.");
    }

    public void bookTicket(String passengerName, int trainNumber, String date) {


        for (Station station : stations) {
            for (Train train : station.getTrains()) {
                if (train.getTrainNumber() == trainNumber) {
                    if (train.getPassengerStrength() - getBookedSeats(trainNumber) > 0) {
                        Ticket ticket = new Ticket(passengerName, new Train().getAvailableSeat(), trainNumber, new Ticket().getFare());
                        tickets.add(ticket);
                        System.out.println("Ticket booked successfully. Your seat number is: " + ticket.getSeatNumber() + ".");
                        return;
                    } else {
                        System.out.println("Sorry, no seats available on this train.");
                        return;
                    }
                }
            }
        }
        System.out.println("Invalid train number.");
    }

    public void cancelTicket(int seatNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getSeatNumber() == seatNumber) {
                tickets.remove(ticket);
                System.out.println("Ticket canceled successfully.");
                return;
            }

        }
    }

}