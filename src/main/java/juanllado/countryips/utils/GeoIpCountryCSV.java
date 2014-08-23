package juanllado.countryips.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import juanllado.countryips.utils.model.GeoIpCountry;

public class GeoIpCountryCSV {

    private static final int POSITION_START_RANGE_IP = 0;
    private static final int POSITION_END_RANGE_IP = 1;
    private static final int POSITION_START_RANGE_IP_HASH = 2;
    private static final int POSITION_END_RANGE_IP_HASH = 3;
    private static final int POSITION_COUNTRY_CODE = 4;
    private static final int POSITION_COUNTRY_NAME = 5;

    private FileCSV fileCSV;

    public GeoIpCountryCSV(String urlCSV) {
        fileCSV = new FileCSV(urlCSV);
        try {
            fileCSV.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<GeoIpCountry> getGeoIpCountryList() {
        List<GeoIpCountry> geoIpCountryList = new ArrayList<GeoIpCountry>();
        for (String[] csvEntry : fileCSV.entries) {
            geoIpCountryList.add(getGeoIpCountry(csvEntry));
        }

        return geoIpCountryList;
    }

    private GeoIpCountry getGeoIpCountry(String[] csvEntries) {
        GeoIpCountry geoIpCountry = new GeoIpCountry();
        geoIpCountry.setStartRangeIp(csvEntries[POSITION_START_RANGE_IP]);
        geoIpCountry.setEndRangeIp(csvEntries[POSITION_END_RANGE_IP]);
        geoIpCountry.setStartRangeIpHash(csvEntries[POSITION_START_RANGE_IP_HASH]);
        geoIpCountry.setEndRangeIpHash(csvEntries[POSITION_END_RANGE_IP_HASH]);
        geoIpCountry.setCountryCode(csvEntries[POSITION_COUNTRY_CODE]);
        geoIpCountry.setCountryName(csvEntries[POSITION_COUNTRY_NAME]);
        return geoIpCountry;
    }

}
