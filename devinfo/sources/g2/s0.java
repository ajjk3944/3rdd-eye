package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f24408a;

    /* renamed from: b, reason: collision with root package name */
    public int f24409b;

    /* renamed from: c, reason: collision with root package name */
    public long f24410c;

    /* renamed from: d, reason: collision with root package name */
    public long f24411d = u0.f24422a;

    /* renamed from: e, reason: collision with root package name */
    public long f24412e = 0;

    public s0() {
        long j = 0;
        this.f24410c = (j & 4294967295L) | (j << 32);
    }

    public int K() {
        return (int) (this.f24410c & 4294967295L);
    }

    public int L() {
        return (int) (this.f24410c >> 32);
    }

    public final void P() {
        this.f24408a = ci.b.e((int) (this.f24410c >> 32), d3.a.j(this.f24411d), d3.a.h(this.f24411d));
        this.f24409b = ci.b.e((int) (this.f24410c & 4294967295L), d3.a.i(this.f24411d), d3.a.g(this.f24411d));
        int i4 = this.f24408a;
        long j = this.f24410c;
        this.f24412e = (((i4 - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void R(long j, float f10, mk.c cVar);

    public void S(long j, float f10, s1.b bVar) {
        R(j, f10, null);
    }

    public final void U(long j) {
        if (d3.k.a(this.f24410c, j)) {
            return;
        }
        this.f24410c = j;
        P();
    }

    public final void V(long j) {
        if (d3.a.b(this.f24411d, j)) {
            return;
        }
        this.f24411d = j;
        P();
    }

    public /* synthetic */ Object w() {
        return null;
    }
}
