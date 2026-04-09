package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f32486a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32487b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32488c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32489d;

    public a(long j, long j8, long j9, long j10) {
        this.f32486a = j;
        this.f32487b = j8;
        this.f32488c = j9;
        this.f32489d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p1.s.c(this.f32486a, aVar.f32486a) && p1.s.c(this.f32487b, aVar.f32487b) && p1.s.c(this.f32488c, aVar.f32488c) && p1.s.c(this.f32489d, aVar.f32489d);
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return yj.q.a(this.f32489d) + a0.g.f(a0.g.f(yj.q.a(this.f32486a) * 31, 31, this.f32487b), 31, this.f32488c);
    }
}
