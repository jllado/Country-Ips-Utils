package juanllado.countryips.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import juanllado.countryips.utils.CountryIpsCSVDownloader;

import org.junit.Before;
import org.junit.Test;

public class CountryIpsCSVDownloaderTest {

    private CountryIpsCSVDownloader downloader;

    @Before
    public void setUp() {
        downloader = new CountryIpsCSVDownloader();
    }

    @Test
    public void testDownload() throws Exception {
        assertThat(downloader.downloadTo("./GeoIPCountryCSV.zip").length() > 0, is(true));
    }
}
