package pk;

import br.l;
import ir.m;
import ir.s;
import nk.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20583a;

    /* renamed from: b, reason: collision with root package name */
    public final r f20584b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20585c;

    /* renamed from: d, reason: collision with root package name */
    public final m f20586d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20587e;

    public a(String str, r rVar, s sVar, m mVar, int i10) {
        l.e(str, "jsonName");
        this.f20583a = str;
        this.f20584b = rVar;
        this.f20585c = sVar;
        this.f20586d = mVar;
        this.f20587e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f20583a, aVar.f20583a) && l.a(this.f20584b, aVar.f20584b) && l.a(this.f20585c, aVar.f20585c) && l.a(this.f20586d, aVar.f20586d) && this.f20587e == aVar.f20587e;
    }

    public final int hashCode() {
        int iHashCode = (this.f20585c.hashCode() + ((this.f20584b.hashCode() + (this.f20583a.hashCode() * 31)) * 31)) * 31;
        m mVar = this.f20586d;
        return Integer.hashCode(this.f20587e) + ((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Binding(jsonName=");
        sb2.append(this.f20583a);
        sb2.append(", adapter=");
        sb2.append(this.f20584b);
        sb2.append(", property=");
        sb2.append(this.f20585c);
        sb2.append(", parameter=");
        sb2.append(this.f20586d);
        sb2.append(", propertyIndex=");
        return c7.a.q(sb2, this.f20587e, ')');
    }
}
