import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PitStop {

    private double pit_duration;

    private int lap_number;

    private int driver_number;

    //=========================== Constructor


    public PitStop() {
    }

    public PitStop(double pit_duration, int lap_number, int driver_number) {
        this.pit_duration = pit_duration;
        this.lap_number = lap_number;
        this.driver_number = driver_number;
    }

    //========================== gettery i settery

    public int getLap_number() {
        return lap_number;
    }

    public void setLap_number(int lap_number) {
        this.lap_number = lap_number;
    }

    public double getPit_duration() {
        return pit_duration;
    }

    public void setPit_duration(double pit_duration) {
        this.pit_duration = pit_duration;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }

}
