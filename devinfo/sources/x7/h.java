package x7;

import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    public final t8.c f37004b = new t8.c(0);

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        int i4 = 0;
        while (true) {
            t8.c cVar = this.f37004b;
            if (i4 >= cVar.f36920c) {
                return;
            }
            g gVar = (g) cVar.f(i4);
            Object objJ = this.f37004b.j(i4);
            f fVar = gVar.f37001b;
            if (gVar.f37003d == null) {
                gVar.f37003d = gVar.f37002c.getBytes(e.f36998a);
            }
            fVar.d(gVar.f37003d, objJ, messageDigest);
            i4++;
        }
    }

    public final Object c(g gVar) {
        t8.c cVar = this.f37004b;
        return cVar.containsKey(gVar) ? cVar.get(gVar) : gVar.f37000a;
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f37004b.equals(((h) obj).f37004b);
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return this.f37004b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f37004b + '}';
    }
}
