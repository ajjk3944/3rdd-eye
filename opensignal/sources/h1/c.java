package h1;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9684a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9686c;

    public c(String str, int i10, long j) {
        this.f9684a = str;
        this.f9685b = j;
        this.f9686c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

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
        if (this.f9686c == cVar.f9686c && br.l.a(this.f9684a, cVar.f9684a)) {
            return b.a(this.f9685b, cVar.f9685b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f9684a.hashCode() * 31;
        int i10 = b.f9683e;
        return h0.b.b(iHashCode, 31, this.f9685b) + this.f9686c;
    }

    public final String toString() {
        return this.f9684a + " (id=" + this.f9686c + ", model=" + ((Object) b.b(this.f9685b)) + ')';
    }
}
