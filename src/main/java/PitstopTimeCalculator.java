import pl.edu.agh.mwo.PitStop;

import java.util.Comparator;
import java.util.List;

public class PitstopTimeCalculator {

    public PitStop maxPitspotTime(List<PitStop> pitStops) {
        return pitStops.stream()
                .max(Comparator.comparingDouble(PitStop::getPit_duration))
                .orElse(null);
    }
}
