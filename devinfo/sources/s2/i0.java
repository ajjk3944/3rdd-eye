package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33396a;

    public i0(String str) {
        this.f33396a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return nk.k.a(this.f33396a, ((i0) obj).f33396a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33396a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("UrlAnnotation(url="), this.f33396a, ')');
    }
}
