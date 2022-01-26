import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SongTest {

    @Test
    void fail() {
        Song song = new Song();
        String rhyme = song.sing();
        assertEquals("lalala", rhyme);
    }

    @Test
    void it_should_not_fail() {
        assertTrue(true);
    }
}
