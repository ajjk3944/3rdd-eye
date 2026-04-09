package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f21952a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21953b;

    public d(float f10, float f11) {
        this.f21952a = f10;
        this.f21953b = f11;
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
        return this.f21953b;
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
        return this.f21952a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f21952a, dVar.f21952a) == 0 && Float.compare(this.f21953b, dVar.f21953b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21953b) + (Float.floatToIntBits(this.f21952a) * 31);
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f21952a);
        sb2.append(", fontScale=");
        return r5.c.k(sb2, this.f21953b, ')');
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}
