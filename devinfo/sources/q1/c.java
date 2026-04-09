package q1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f32073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32075c;

    public c(int i4, long j, String str) {
        this.f32073a = str;
        this.f32074b = j;
        this.f32075c = i4;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i4 < -1 || i4 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i4);

    public abstract float b(int i4);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f32075c == cVar.f32075c && nk.k.a(this.f32073a, cVar.f32073a)) {
            return b.a(this.f32074b, cVar.f32074b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f32073a.hashCode() * 31;
        int i4 = b.f32072e;
        long j = this.f32074b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f32075c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32073a);
        sb2.append(" (id=");
        sb2.append(this.f32075c);
        sb2.append(", model=");
        long j = b.f32068a;
        long j8 = this.f32074b;
        sb2.append((Object) (b.a(j8, j) ? "Rgb" : b.a(j8, b.f32069b) ? "Xyz" : b.a(j8, b.f32070c) ? "Lab" : b.a(j8, b.f32071d) ? "Cmyk" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
