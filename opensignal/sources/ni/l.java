package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f18001a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18002b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f18003c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f18004d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f18005e;

    public l(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f18001a = bool;
        this.f18002b = num;
        this.f18003c = bool2;
        this.f18004d = bool3;
        this.f18005e = bool4;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "IS_DATA_ENABLED", this.f18001a);
        xu.d.Y(jSONObject, "PREFERRED_NETWORK_MODE", this.f18002b);
        xu.d.Y(jSONObject, "IS_ADAPTIVE_CONNECTIVITY_ENABLED", this.f18003c);
        xu.d.Y(jSONObject, "KEY_IS_AIRPLANE_MODE_ON", this.f18004d);
        xu.d.Y(jSONObject, "IS_TETHERING", this.f18005e);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return br.l.a(this.f18001a, lVar.f18001a) && br.l.a(this.f18002b, lVar.f18002b) && br.l.a(this.f18003c, lVar.f18003c) && br.l.a(this.f18004d, lVar.f18004d) && br.l.a(this.f18005e, lVar.f18005e);
    }

    public final int hashCode() {
        Boolean bool = this.f18001a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f18002b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f18003c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f18004d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f18005e;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSettingsCoreResult(isDataEnabled=" + this.f18001a + ", preferredNetworkMode=" + this.f18002b + ", adaptiveConnectivityEnabled=" + this.f18003c + ", isAirplaneModeOn=" + this.f18004d + ", isTethering=" + this.f18005e + ')';
    }
}
