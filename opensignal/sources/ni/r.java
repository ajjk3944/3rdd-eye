package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f18116a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18117b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18118c;

    public r(Boolean bool, String str, Integer num) {
        this.f18116a = bool;
        this.f18117b = str;
        this.f18118c = num;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "esim_is_enabled", this.f18116a);
        xu.d.Y(jSONObject, "esim_os_version", this.f18117b);
        xu.d.Y(jSONObject, "esim_card_id_for_default_euicc", this.f18118c);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return br.l.a(this.f18116a, rVar.f18116a) && br.l.a(this.f18117b, rVar.f18117b) && br.l.a(this.f18118c, rVar.f18118c);
    }

    public final int hashCode() {
        Boolean bool = this.f18116a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f18117b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f18118c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsimStatusCoreResult(isEsimEnabled=");
        sb2.append(this.f18116a);
        sb2.append(", esimOsVersion=");
        sb2.append(this.f18117b);
        sb2.append(", esimCardIdForDefaultEuicc=");
        return w.g.i(sb2, this.f18118c, ')');
    }
}
