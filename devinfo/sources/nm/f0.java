package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f30037a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30038b;

    public f0(float f10, float f11) {
        this.f30037a = f10;
        this.f30038b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.f30037a, f0Var.f30037a) == 0 && Float.compare(this.f30038b, f0Var.f30038b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30038b) + (Float.floatToIntBits(this.f30037a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAreaOffsets(start=");
        sb2.append(this.f30037a);
        sb2.append(", end=");
        return r5.c.k(sb2, this.f30038b, ')');
    }
}
