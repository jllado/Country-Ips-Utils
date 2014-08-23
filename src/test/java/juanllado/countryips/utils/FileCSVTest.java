package juanllado.countryips.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import juanllado.countryips.utils.FileCSV;

import org.junit.Test;

public class FileCSVTest {

    private FileCSV csv;

    @Test
    public void load_CSV() throws IOException {
        csv = new FileCSV("tmp/GeoIPCountryWhois.csv");
        csv.load();
        assertThat(csv.size(), is(96661));
    }
}
