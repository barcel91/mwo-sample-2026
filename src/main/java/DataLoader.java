import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.edu.agh.mwo.PitStop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private final ObjectMapper mapper = new ObjectMapper();

    public ArrayList<PitStop> load() {
        String path = "src/main/resources/pitstops-data.json";
        try {
            return (ArrayList<PitStop>) mapper.readValue(new File(path),
                    new TypeReference<List<PitStop>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
