package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8703a {

    /* renamed from: a, reason: collision with root package name */
    private long f67033a;

    /* renamed from: b, reason: collision with root package name */
    private float f67034b;

    public C8703a(long j10, float f10) {
        this.f67033a = j10;
        this.f67034b = f10;
    }

    public final float a() {
        return this.f67034b;
    }

    public final long b() {
        return this.f67033a;
    }

    public final void c(float f10) {
        this.f67034b = f10;
    }

    public final void d(long j10) {
        this.f67033a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8703a)) {
            return false;
        }
        C8703a c8703a = (C8703a) obj;
        return this.f67033a == c8703a.f67033a && Float.compare(this.f67034b, c8703a.f67034b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f67033a) * 31) + Float.hashCode(this.f67034b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f67033a + ", dataPoint=" + this.f67034b + ')';
    }
}
