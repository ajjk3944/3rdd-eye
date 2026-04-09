package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33399a;

    public j0(String str) {
        this.f33399a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return nk.k.a(this.f33399a, ((j0) obj).f33399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33399a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f33399a, ')');
    }
}
