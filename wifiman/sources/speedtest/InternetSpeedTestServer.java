package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class InternetSpeedTestServer implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    InternetSpeedTestServer(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InternetSpeedTestServer)) {
            return false;
        }
        InternetSpeedTestServer internetSpeedTestServer = (InternetSpeedTestServer) obj;
        String url = getURL();
        String url2 = internetSpeedTestServer.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        LocationCoordinates location = getLocation();
        LocationCoordinates location2 = internetSpeedTestServer.getLocation();
        if (location == null) {
            if (location2 != null) {
                return false;
            }
        } else if (!location.equals(location2)) {
            return false;
        }
        String provider = getProvider();
        String provider2 = internetSpeedTestServer.getProvider();
        if (provider == null) {
            if (provider2 != null) {
                return false;
            }
        } else if (!provider.equals(provider2)) {
            return false;
        }
        String providerURL = getProviderURL();
        String providerURL2 = internetSpeedTestServer.getProviderURL();
        if (providerURL == null) {
            if (providerURL2 != null) {
                return false;
            }
        } else if (!providerURL.equals(providerURL2)) {
            return false;
        }
        String city = getCity();
        String city2 = internetSpeedTestServer.getCity();
        if (city == null) {
            if (city2 != null) {
                return false;
            }
        } else if (!city.equals(city2)) {
            return false;
        }
        String country = getCountry();
        String country2 = internetSpeedTestServer.getCountry();
        if (country == null) {
            if (country2 != null) {
                return false;
            }
        } else if (!country.equals(country2)) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = internetSpeedTestServer.getCountryCode();
        if (countryCode == null) {
            if (countryCode2 != null) {
                return false;
            }
        } else if (!countryCode.equals(countryCode2)) {
            return false;
        }
        LinkSpeed speedMbps = getSpeedMbps();
        LinkSpeed speedMbps2 = internetSpeedTestServer.getSpeedMbps();
        return speedMbps == null ? speedMbps2 == null : speedMbps.equals(speedMbps2);
    }

    public final native String getCity();

    public final native String getCountry();

    public final native String getCountryCode();

    public final native LocationCoordinates getLocation();

    public final native String getProvider();

    public final native String getProviderURL();

    public final native LinkSpeed getSpeedMbps();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getLocation(), getProvider(), getProviderURL(), getCity(), getCountry(), getCountryCode(), getSpeedMbps()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setCity(String str);

    public final native void setCountry(String str);

    public final native void setCountryCode(String str);

    public final native void setLocation(LocationCoordinates locationCoordinates);

    public final native void setProvider(String str);

    public final native void setProviderURL(String str);

    public final native void setSpeedMbps(LinkSpeed linkSpeed);

    public final native void setURL(String str);

    public String toString() {
        return "InternetSpeedTestServer{URL:" + getURL() + ",Location:" + getLocation() + ",Provider:" + getProvider() + ",ProviderURL:" + getProviderURL() + ",City:" + getCity() + ",Country:" + getCountry() + ",CountryCode:" + getCountryCode() + ",SpeedMbps:" + getSpeedMbps() + ",}";
    }

    public InternetSpeedTestServer() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
