package h5;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f9959a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9960b;

    public p(long j, long j7) {
        this.f9959a = j;
        this.f9960b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f9959a == pVar.f9959a && this.f9960b == pVar.f9960b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9959a) * 31) + ((int) this.f9960b);
    }
}
