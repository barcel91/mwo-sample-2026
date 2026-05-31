import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PitStopCounterTest {

    @Test
    void countPitStops() {
        List<PitStop> pitStops = new ArrayList<>();
        pitStops.add(new PitStop(31.3, 7, 14));
        pitStops.add(new PitStop(30.0, 8, 23));

        PitStopCounter pitStopCounter = new PitStopCounter();

        int pitStopsNumber = pitStopCounter .countPitStops(pitStops);

        assertEquals(3, pitStopsNumber);

    }
}