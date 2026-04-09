package z0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f26488a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26489b;

    public e(float f10, float f11) {
        this.f26488a = f10;
        this.f26489b = f11;
    }

    public final long a(long j, long j7, t2.i iVar) {
        float f10 = (((int) (j7 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f11 = (((int) (j7 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        t2.i iVar2 = t2.i.Ltr;
        float f12 = this.f26488a;
        if (iVar != iVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f26489b) * f11;
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
        return Float.compare(this.f26488a, eVar.f26488a) == 0 && Float.compare(this.f26489b, eVar.f26489b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26489b) + (Float.hashCode(this.f26488a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f26488a);
        sb2.append(", verticalBias=");
        return h0.b.q(sb2, this.f26489b, ')');
    }
}
