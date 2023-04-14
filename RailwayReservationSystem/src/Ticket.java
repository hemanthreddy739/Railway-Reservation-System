public class Ticket {
    private String passengerName;
    private int seatNumber;
    private int trainNumber;
    private double fare;


    Ticket(){

    }

    public Ticket(String passengerName, int seatNumber, int trainNumber, double fare) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.trainNumber = trainNumber;
        this.fare = fare;
    }

    // Getters and Setters

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }


}
