package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f30000a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30001b;

    public b(float f10, float f11) {
        this.f30000a = f10;
        this.f30001b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f30000a, bVar.f30000a) == 0 && Float.compare(this.f30001b, bVar.f30001b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30001b) + (Float.floatToIntBits(this.f30000a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionScrollPadding(start=");
        sb2.append(this.f30000a);
        sb2.append(", end=");
        return r5.c.k(sb2, this.f30001b, ')');
    }
}
