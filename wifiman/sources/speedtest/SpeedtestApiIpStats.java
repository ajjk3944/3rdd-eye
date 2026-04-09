package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestApiIpStats implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestApiIpStats(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestApiIpStats)) {
            return false;
        }
        SpeedtestApiIpStats speedtestApiIpStats = (SpeedtestApiIpStats) obj;
        String ip = getIp();
        String ip2 = speedtestApiIpStats.getIp();
        if (ip == null) {
            if (ip2 != null) {
                return false;
            }
        } else if (!ip.equals(ip2)) {
            return false;
        }
        String isp = getIsp();
        String isp2 = speedtestApiIpStats.getIsp();
        if (isp == null) {
            if (isp2 != null) {
                return false;
            }
        } else if (!isp.equals(isp2)) {
            return false;
        }
        String ispIcon = getIspIcon();
        String ispIcon2 = speedtestApiIpStats.getIspIcon();
        if (ispIcon == null) {
            if (ispIcon2 != null) {
                return false;
            }
        } else if (!ispIcon.equals(ispIcon2)) {
            return false;
        }
        String organization = getOrganization();
        String organization2 = speedtestApiIpStats.getOrganization();
        if (organization == null) {
            if (organization2 != null) {
                return false;
            }
        } else if (!organization.equals(organization2)) {
            return false;
        }
        String country = getCountry();
        String country2 = speedtestApiIpStats.getCountry();
        if (country == null) {
            if (country2 != null) {
                return false;
            }
        } else if (!country.equals(country2)) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = speedtestApiIpStats.getCountryCode();
        if (countryCode == null) {
            if (countryCode2 != null) {
                return false;
            }
        } else if (!countryCode.equals(countryCode2)) {
            return false;
        }
        LocationCoordinates location = getLocation();
        LocationCoordinates location2 = speedtestApiIpStats.getLocation();
        if (location == null) {
            if (location2 != null) {
                return false;
            }
        } else if (!location.equals(location2)) {
            return false;
        }
        String timezone = getTimezone();
        String timezone2 = speedtestApiIpStats.getTimezone();
        if (timezone == null) {
            if (timezone2 != null) {
                return false;
            }
        } else if (!timezone.equals(timezone2)) {
            return false;
        }
        SpeedtestError error = getError();
        SpeedtestError error2 = speedtestApiIpStats.getError();
        return error == null ? error2 == null : error.equals(error2);
    }

    public final native String getCountry();

    public final native String getCountryCode();

    public final native SpeedtestError getError();

    public final native String getIp();

    public final native String getIsp();

    public final native String getIspIcon();

    public final native LocationCoordinates getLocation();

    public final native String getOrganization();

    public final native String getTimezone();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getIp(), getIsp(), getIspIcon(), getOrganization(), getCountry(), getCountryCode(), getLocation(), getTimezone(), getError()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setCountry(String str);

    public final native void setCountryCode(String str);

    public final native void setError(SpeedtestError speedtestError);

    public final native void setIp(String str);

    public final native void setIsp(String str);

    public final native void setIspIcon(String str);

    public final native void setLocation(LocationCoordinates locationCoordinates);

    public final native void setOrganization(String str);

    public final native void setTimezone(String str);

    public String toString() {
        return "SpeedtestApiIpStats{Ip:" + getIp() + ",Isp:" + getIsp() + ",IspIcon:" + getIspIcon() + ",Organization:" + getOrganization() + ",Country:" + getCountry() + ",CountryCode:" + getCountryCode() + ",Location:" + getLocation() + ",Timezone:" + getTimezone() + ",Error:" + getError() + ",}";
    }

    public SpeedtestApiIpStats() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
