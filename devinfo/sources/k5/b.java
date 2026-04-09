package k5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27932a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27933b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27934c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27935d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27936e;

    public b(float f10, float f11, float f12, int i4, long j) {
        this.f27932a = i4;
        this.f27933b = f10;
        this.f27934c = f11;
        this.f27935d = f12;
        this.f27936e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f27934c == bVar.f27934c && this.f27935d == bVar.f27935d && this.f27933b == bVar.f27933b && this.f27932a == bVar.f27932a && this.f27936e == bVar.f27936e;
        }
        return false;
    }

    public final int hashCode() {
        int iD = (r5.c.d(this.f27933b, r5.c.d(this.f27935d, Float.floatToIntBits(this.f27934c) * 31, 31), 31) + this.f27932a) * 31;
        long j = this.f27936e;
        return iD + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f27934c + ", touchY=" + this.f27935d + ", progress=" + this.f27933b + ", swipeEdge=" + this.f27932a + ", frameTimeMillis=" + this.f27936e + ')';
    }
}
