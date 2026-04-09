package p0;

import a0.g;
import p1.s;
import yj.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f30943a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30944b;

    public b(long j, long j8) {
        this.f30943a = j;
        this.f30944b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f30943a, bVar.f30943a) && s.c(this.f30944b, bVar.f30944b);
    }

    public final int hashCode() {
        int i4 = s.f31019i;
        return q.a(this.f30944b) + (q.a(this.f30943a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        g.w(this.f30943a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) s.i(this.f30944b));
        sb2.append(')');
        return sb2.toString();
    }
}
