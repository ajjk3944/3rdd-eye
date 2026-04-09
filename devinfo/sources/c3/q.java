package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f2731c = new q(nh.a.i(0), nh.a.i(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f2732a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2733b;

    public q(long j, long j8) {
        this.f2732a = j;
        this.f2733b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return d3.n.a(this.f2732a, qVar.f2732a) && d3.n.a(this.f2733b, qVar.f2733b);
    }

    public final int hashCode() {
        return d3.n.d(this.f2733b) + (d3.n.d(this.f2732a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) d3.n.e(this.f2732a)) + ", restLine=" + ((Object) d3.n.e(this.f2733b)) + ')';
    }
}
