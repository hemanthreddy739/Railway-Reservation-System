
import java.util.Arrays;
public class Train {
    private String trainName;
    private String source;
    private String destination;
    private String time;
    private int passengerStrength;
    private int trainNumber;
    private boolean[] seats;


    Train(){

    }

    public Train(String trainName, String source, String destination, String time, int passengerStrength, int trainNumber) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
        seats = new boolean[passengerStrength];
        Arrays.fill(seats, true);
    }

    public int getAvailableSeat() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                return i + 1;
            }
        }
        return -1;
    }
    // Getters and Setters

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String name) {
        this.trainName = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPassengerStrength() {
        return passengerStrength;
    }

    public void setPassengerStrength(int passengerStrength) {
        this.passengerStrength = passengerStrength;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}
