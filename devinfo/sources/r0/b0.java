package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32493a = p1.s.f31018h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return p1.s.c(this.f32493a, ((b0) obj).f32493a);
        }
        return false;
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return yj.q.a(this.f32493a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) p1.s.i(this.f32493a)) + ", rippleAlpha=null)";
    }
}
