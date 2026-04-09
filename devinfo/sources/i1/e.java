package i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f25544a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25545b;

    public e(float f10, float f11) {
        this.f25544a = f10;
        this.f25545b = f11;
    }

    public final long a(long j, long j8, d3.l lVar) {
        float f10 = (((int) (j8 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f11 = (((int) (j8 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        d3.l lVar2 = d3.l.f21966a;
        float f12 = this.f25544a;
        if (lVar != lVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f25545b) * f11;
        return (Math.round(f15) & 4294967295L) | (Math.round(f14) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f25544a, eVar.f25544a) == 0 && Float.compare(this.f25545b, eVar.f25545b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25545b) + (Float.floatToIntBits(this.f25544a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f25544a);
        sb2.append(", verticalBias=");
        return r5.c.k(sb2, this.f25545b, ')');
    }
}
