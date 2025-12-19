package edu.pitt.se;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy() {
        PlaylistRecommender pr = new PlaylistRecommender();

        assertEquals("HIGH", pr.classifyEnergy(List.of(160, 135, 140)));
        assertEquals("MEDIUM", pr.classifyEnergy(List.of(125, 75, 110)));
        assertEquals("LOW", pr.classifyEnergy(List.of(105, 55, 30)));
    }

    @Test
    void testIsValidTrackTitle() {
        PlaylistRecommender pr = new PlaylistRecommender();

        assertTrue(pr.isValidTrackTitle("Track Title"));
        assertFalse(pr.isValidTrackTitle("Track Title #2"));
    }   

    @Test
    void testNormalizeVolume() {
        PlaylistRecommender pr = new PlaylistRecommender();

        assertEquals(100, pr.normalizeVolume(150));
        assertEquals(0, pr.normalizeVolume(-40));
    }
}
