package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18113a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18114b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f18115c;

    public q0(Integer num, Integer num2, Long l10) {
        this.f18113a = num;
        this.f18114b = num2;
        this.f18115c = l10;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("display_network_type_int", this.f18113a);
        jSONObject.put("display_override_network_type_int", this.f18114b);
        jSONObject.put("display_network_type_update_time", this.f18115c);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return br.l.a(this.f18113a, q0Var.f18113a) && br.l.a(this.f18114b, q0Var.f18114b) && br.l.a(this.f18115c, q0Var.f18115c);
    }

    public final int hashCode() {
        Integer num = this.f18113a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f18114b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f18115c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "TelephonyDisplayInfoCoreResult(displayNetworkTypeInt=" + this.f18113a + ", displayOverrideNetworkTypeInt=" + this.f18114b + ", updateTime=" + this.f18115c + ')';
    }
}
