import java.util.ArrayList;

public class Station {
    private String name;
    private ArrayList<Train> trains;

    public Station(String name) {
        this.name = name;
        this.trains = new ArrayList<Train>();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }
}
