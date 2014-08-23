package juanllado.countryips.utils;

import java.io.File;
import java.io.IOException;

public class CountryIpsCSVDownloader {

    private static final String URL_COUNTRY_IPS_CSV = "http://geolite.maxmind.com/download/geoip/database/GeoIPCountryCSV.zip";

    private FileDownloader downloader;

    public CountryIpsCSVDownloader() {
        downloader = new FileDownloader();
    }

    public File downloadTo(String path) throws IOException {
        return downloader.download(URL_COUNTRY_IPS_CSV, path);
    }

}
