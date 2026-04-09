package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class v implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f C();

    public abstract void F(DataOutput dataOutput);

    public abstract String h();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.y("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.y("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.y("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.y("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.y("AST", "America/Anchorage"), j$.com.android.tools.r8.a.y("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.y("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.y("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.y("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.y("CST", "America/Chicago"), j$.com.android.tools.r8.a.y("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.y("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.y("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.y("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.y("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.y("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.y("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.y("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.y("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.y("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.y("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.y("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.y("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.y("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.y("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.y("EST", "-05:00"), j$.com.android.tools.r8.a.y("MST", "-07:00"), j$.com.android.tools.r8.a.y("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i4 = 0; i4 < 28; i4++) {
            Map.Entry entry = entryArr[i4];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        Collections.unmodifiableMap(map);
    }

    public static v D(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f26051a != 0) {
            str = str.concat(zoneOffset.f26052b);
        }
        return new w(str, zoneOffset.C());
    }

    public static v E(String str, int i4) {
        String strSubstring = str.substring(0, i4);
        if (str.length() == i4) {
            return D(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i4) != '+' && str.charAt(i4) != '-') {
            return w.G(str);
        }
        try {
            ZoneOffset zoneOffsetG = ZoneOffset.G(str.substring(i4));
            if (zoneOffsetG == ZoneOffset.UTC) {
                return D(strSubstring, zoneOffsetG);
            }
            return D(strSubstring, zoneOffsetG);
        } catch (a e2) {
            throw new a("Invalid ID for offset-based ZoneId: ".concat(str), e2);
        }
    }

    public v() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return h().equals(((v) obj).h());
        }
        return false;
    }

    public int hashCode() {
        return h().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return h();
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }
}
