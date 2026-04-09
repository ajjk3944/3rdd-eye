package tm;

import br.l;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public um.a f22890a;

    /* renamed from: d, reason: collision with root package name */
    public String f22891d;

    /* renamed from: g, reason: collision with root package name */
    public String f22892g;

    public c() {
        um.a aVar = um.a.NONE;
        l.e(aVar, "networkType");
        this.f22890a = aVar;
        this.f22891d = "";
        this.f22892g = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22890a == cVar.f22890a && l.a(this.f22891d, cVar.f22891d) && l.a(this.f22892g, cVar.f22892g);
    }

    public final int hashCode() {
        return this.f22892g.hashCode() + c7.a.g(this.f22891d, this.f22890a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkInformation(networkType=");
        sb2.append(this.f22890a);
        sb2.append(", networkName=");
        sb2.append(this.f22891d);
        sb2.append(", networkSubtype=");
        return h0.b.r(sb2, this.f22892g, ')');
    }
}
