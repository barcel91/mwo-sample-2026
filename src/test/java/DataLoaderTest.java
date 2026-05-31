import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.edu.agh.mwo.PitStop;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataLoaderTest {
    private DataLoader dataLoader;

    @BeforeEach
    void setUp() {
        dataLoader = new DataLoader();
    }

    @Test
    void shouldLoadData() {
        ArrayList<PitStop> data = dataLoader.load();
        assertNotNull(data);
    }

    @Test
    void shouldLoadNotEmptyData() {
        ArrayList<PitStop> data = dataLoader.load();
        assertFalse(data.isEmpty());
    }

}