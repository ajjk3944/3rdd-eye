package z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f37794a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37795b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37796c;

    public c(float f10, float f11, long j) {
        this.f37794a = f10;
        this.f37795b = f11;
        this.f37796c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f37794a, cVar.f37794a) == 0 && Float.compare(this.f37795b, cVar.f37795b) == 0 && this.f37796c == cVar.f37796c;
    }

    public final int hashCode() {
        int iD = r5.c.d(this.f37795b, Float.floatToIntBits(this.f37794a) * 31, 31);
        long j = this.f37796c;
        return iD + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f37794a + ", distance=" + this.f37795b + ", duration=" + this.f37796c + ')';
    }
}
