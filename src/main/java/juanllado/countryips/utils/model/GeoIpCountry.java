package juanllado.countryips.utils.model;

public class GeoIpCountry {

    private String startRangeIp = "";
    private String endRangeIp = "";
    private String startRangeIpHash = "";
    private String endRangeIpHash = "";
    private String countryCode = "";
    private String countryName = "";

    public String getStartRangeIp() {
        return startRangeIp;
    }

    public void setStartRangeIp(String startRangeIp) {
        this.startRangeIp = startRangeIp;
    }

    public String getEndRangeIp() {
        return endRangeIp;
    }

    public void setEndRangeIp(String endRangeIp) {
        this.endRangeIp = endRangeIp;
    }

    public String getStartRangeIpHash() {
        return startRangeIpHash;
    }

    public void setStartRangeIpHash(String startRangeIpHash) {
        this.startRangeIpHash = startRangeIpHash;
    }

    public String getEndRangeIpHash() {
        return endRangeIpHash;
    }

    public void setEndRangeIpHash(String endRangeIpHash) {
        this.endRangeIpHash = endRangeIpHash;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }




}
