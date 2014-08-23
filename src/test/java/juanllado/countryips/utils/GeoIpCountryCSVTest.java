package juanllado.countryips.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.List;

import juanllado.countryips.utils.GeoIpCountryCSV;
import juanllado.countryips.utils.model.GeoIpCountry;

import org.junit.Before;
import org.junit.Test;

public class GeoIpCountryCSVTest {

    private GeoIpCountryCSV geoIpCountryCSV;

    @Before
    public void setUp() {
        geoIpCountryCSV = new GeoIpCountryCSV("tmp/GeoIPCountryWhois.csv");
    }

    @Test
    public void load_GeoIpCountry_list_from_csv() throws IOException {
        List<GeoIpCountry> geoIpCountryList = geoIpCountryCSV.getGeoIpCountryList();
        assertThat(geoIpCountryList.size(), is(96661));
        assertThat(geoIpCountryList.get(0).getStartRangeIp(), is("1.0.0.0"));
        assertThat(geoIpCountryList.get(0).getEndRangeIp(), is("1.0.0.255"));
        assertThat(geoIpCountryList.get(0).getStartRangeIpHash(), is("16777216"));
        assertThat(geoIpCountryList.get(0).getEndRangeIpHash(), is("16777471"));
        assertThat(geoIpCountryList.get(0).getCountryCode(), is("AU"));
        assertThat(geoIpCountryList.get(0).getCountryName(), is("Australia"));
    }

}
