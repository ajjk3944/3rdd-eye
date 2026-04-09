package ak;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final nj.b f511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f512b;

    /* renamed from: c, reason: collision with root package name */
    public final String f513c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f514d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f515e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f516f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f517g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f518h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f519i;
    public final Integer j;
    public final Integer k;

    public f(nj.b bVar, String str, String str2, Integer num, Integer num2, Long l10, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        br.l.e(bVar, "generation");
        this.f511a = bVar;
        this.f512b = str;
        this.f513c = str2;
        this.f514d = num;
        this.f515e = num2;
        this.f516f = l10;
        this.f517g = num3;
        this.f518h = num4;
        this.f519i = num5;
        this.j = num6;
        this.k = num7;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "cell_tower_network_generation", this.f511a.name());
        xu.d.Y(jSONObject, "cell_tower_mcc", this.f512b);
        xu.d.Y(jSONObject, "cell_tower_mnc", this.f513c);
        xu.d.Y(jSONObject, "cell_tower_lac", this.f514d);
        xu.d.Y(jSONObject, "cell_tower_pci", this.f515e);
        xu.d.Y(jSONObject, "cell_tower_cid", this.f516f);
        xu.d.Y(jSONObject, "cell_tower_bandwidth", this.f517g);
        xu.d.Y(jSONObject, "cell_tower_rfcn", this.f518h);
        xu.d.Y(jSONObject, "cell_tower_cpid", this.f519i);
        xu.d.Y(jSONObject, "cell_tower_psc", this.j);
        xu.d.Y(jSONObject, "cell_tower_bsic", this.k);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f511a == fVar.f511a && br.l.a(this.f512b, fVar.f512b) && br.l.a(this.f513c, fVar.f513c) && br.l.a(this.f514d, fVar.f514d) && br.l.a(this.f515e, fVar.f515e) && br.l.a(this.f516f, fVar.f516f) && br.l.a(this.f517g, fVar.f517g) && br.l.a(this.f518h, fVar.f518h) && br.l.a(this.f519i, fVar.f519i) && br.l.a(this.j, fVar.j) && br.l.a(this.k, fVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f511a.hashCode() * 31;
        String str = this.f512b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f513c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f514d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f515e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f516f;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num3 = this.f517g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f518h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f519i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.k;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellTower(generation=");
        sb2.append(this.f511a);
        sb2.append(", mcc=");
        sb2.append(this.f512b);
        sb2.append(", mnc=");
        sb2.append(this.f513c);
        sb2.append(", lac=");
        sb2.append(this.f514d);
        sb2.append(", pci=");
        sb2.append(this.f515e);
        sb2.append(", cid=");
        sb2.append(this.f516f);
        sb2.append(", bandwidth=");
        sb2.append(this.f517g);
        sb2.append(", rfcn=");
        sb2.append(this.f518h);
        sb2.append(", cpid=");
        sb2.append(this.f519i);
        sb2.append(", psc=");
        sb2.append(this.j);
        sb2.append(", bsic=");
        return w.g.i(sb2, this.k, ')');
    }
}
