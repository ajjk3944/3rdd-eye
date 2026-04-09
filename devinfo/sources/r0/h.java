package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f32540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32543d;

    public h(long j, long j8, long j9, long j10) {
        this.f32540a = j;
        this.f32541b = j8;
        this.f32542c = j9;
        this.f32543d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p1.s.c(this.f32540a, hVar.f32540a) && p1.s.c(this.f32541b, hVar.f32541b) && p1.s.c(this.f32542c, hVar.f32542c) && p1.s.c(this.f32543d, hVar.f32543d);
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return yj.q.a(this.f32543d) + a0.g.f(a0.g.f(yj.q.a(this.f32540a) * 31, 31, this.f32541b), 31, this.f32542c);
    }
}
