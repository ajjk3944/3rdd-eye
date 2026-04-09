package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f21954a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21955b;

    /* renamed from: c, reason: collision with root package name */
    public final e3.a f21956c;

    public e(float f10, float f11, e3.a aVar) {
        this.f21954a = f10;
        this.f21955b = f11;
        this.f21956c = aVar;
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return this.f21955b;
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return this.f21954a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f21954a, eVar.f21954a) == 0 && Float.compare(this.f21955b, eVar.f21955b) == 0 && nk.k.a(this.f21956c, eVar.f21956c);
    }

    public final int hashCode() {
        return this.f21956c.hashCode() + r5.c.d(this.f21955b, Float.floatToIntBits(this.f21954a) * 31, 31);
    }

    @Override // d3.c
    public final float o(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f21956c.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f21954a + ", fontScale=" + this.f21955b + ", converter=" + this.f21956c + ')';
    }

    @Override // d3.c
    public final long x(float f10) {
        return nh.a.p(4294967296L, this.f21956c.a(D(f10)));
    }
}
