package tm;

import br.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f22903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22905c;

    public h(String str, int i10, int i11) {
        this.f22903a = str;
        this.f22904b = i10;
        this.f22905c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f22903a, hVar.f22903a) && this.f22904b == hVar.f22904b && this.f22905c == hVar.f22905c && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        String str = this.f22903a;
        return Boolean.hashCode(false) + w.g.b(w.g.b(h0.b.a(0.0d, h0.b.a(0.0d, h0.b.a(0.0d, h0.b.a(0.0d, c7.a.C(0, c7.a.C(0, c7.a.C(this.f22905c, c7.a.C(this.f22904b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31), 31), false, 31), false, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleTowerQueryParams(networkId=");
        sb2.append(this.f22903a);
        sb2.append(", cid=");
        sb2.append(this.f22904b);
        sb2.append(", lac=");
        return h0.b.i(this.f22905c, ", opensignalId=0, psc=0, estLat=0.0, estLng=0.0, estAcc=0.0, confidence=0.0, is2G=false, is3G=false, is4G=false)", sb2);
    }
}
