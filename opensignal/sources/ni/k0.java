package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17992a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17993b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17994c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17995d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17996e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17997f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17998g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17999h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f18000i;

    public k0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Long l10) {
        this.f17992a = num;
        this.f17993b = num2;
        this.f17994c = num3;
        this.f17995d = num4;
        this.f17996e = num5;
        this.f17997f = num6;
        this.f17998g = num7;
        this.f17999h = str;
        this.f18000i = l10;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "gsm_bit_error_rate", this.f17992a);
        xu.d.Y(jSONObject, "gsm_signal_strength", this.f17993b);
        xu.d.Y(jSONObject, "cdma_dbm", this.f17994c);
        xu.d.Y(jSONObject, "cdma_ecio", this.f17995d);
        xu.d.Y(jSONObject, "evdo_dbm", this.f17996e);
        xu.d.Y(jSONObject, "evdo_ecio", this.f17997f);
        xu.d.Y(jSONObject, "evdo_snr", this.f17998g);
        xu.d.Y(jSONObject, "signal_strength_string", this.f17999h);
        xu.d.Y(jSONObject, "signal_strength_time", this.f18000i);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return br.l.a(this.f17992a, k0Var.f17992a) && br.l.a(this.f17993b, k0Var.f17993b) && br.l.a(this.f17994c, k0Var.f17994c) && br.l.a(this.f17995d, k0Var.f17995d) && br.l.a(this.f17996e, k0Var.f17996e) && br.l.a(this.f17997f, k0Var.f17997f) && br.l.a(this.f17998g, k0Var.f17998g) && br.l.a(this.f17999h, k0Var.f17999h) && br.l.a(this.f18000i, k0Var.f18000i);
    }

    public final int hashCode() {
        Integer num = this.f17992a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17993b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17994c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17995d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f17996e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17997f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17998g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str = this.f17999h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f18000i;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SignalStrengthFieldsCoreResult(gsmBitErrorRate=" + this.f17992a + ", gsmSignalStrength=" + this.f17993b + ", cdmaDbm=" + this.f17994c + ", cdmaEcio=" + this.f17995d + ", evdoDbm=" + this.f17996e + ", evdoEcio=" + this.f17997f + ", evdoSnr=" + this.f17998g + ", signalStrengthString=" + this.f17999h + ", updateTime=" + this.f18000i + ')';
    }
}
