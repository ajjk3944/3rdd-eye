package ph;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f31965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31966b;

    public a(float f10, String str) {
        k.e(str, "unit");
        this.f31965a = f10;
        this.f31966b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f31965a, aVar.f31965a) == 0 && k.a(this.f31966b, aVar.f31966b);
    }

    public final int hashCode() {
        return this.f31966b.hashCode() + (Float.floatToIntBits(this.f31965a) * 31);
    }

    public final String toString() {
        return "SensorData(value=" + this.f31965a + ", unit=" + this.f31966b + ")";
    }
}
