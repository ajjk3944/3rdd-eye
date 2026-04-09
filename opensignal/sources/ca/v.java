package ca;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f3510c = new v(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3511a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3512b;

    public v(long j, long j7) {
        this.f3511a = j;
        this.f3512b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f3511a == vVar.f3511a && this.f3512b == vVar.f3512b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3511a) * 31) + ((int) this.f3512b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(this.f3511a);
        sb2.append(", position=");
        return c7.a.n(this.f3512b, "]", sb2);
    }
}
