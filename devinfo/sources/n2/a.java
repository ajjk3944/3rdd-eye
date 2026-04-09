package n2;

import d.h;
import nk.k;
import v1.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f29561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29562b;

    public a(e eVar, int i4) {
        this.f29561a = eVar;
        this.f29562b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f29561a, aVar.f29561a) && this.f29562b == aVar.f29562b;
    }

    public final int hashCode() {
        return (this.f29561a.hashCode() * 31) + this.f29562b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f29561a);
        sb2.append(", configFlags=");
        return h.u(sb2, this.f29562b, ')');
    }
}
