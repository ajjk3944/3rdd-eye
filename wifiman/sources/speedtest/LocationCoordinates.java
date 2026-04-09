package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LocationCoordinates implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    LocationCoordinates(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LocationCoordinates)) {
            return false;
        }
        LocationCoordinates locationCoordinates = (LocationCoordinates) obj;
        return getLatitude() == locationCoordinates.getLatitude() && getLongitude() == locationCoordinates.getLongitude();
    }

    public final native double getLatitude();

    public final native double getLongitude();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(getLatitude()), Double.valueOf(getLongitude())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setLatitude(double d10);

    public final native void setLongitude(double d10);

    public String toString() {
        return "LocationCoordinates{Latitude:" + getLatitude() + ",Longitude:" + getLongitude() + ",}";
    }

    public LocationCoordinates() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
