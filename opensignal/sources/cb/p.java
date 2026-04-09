package cb;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f3583a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3584b;

    public p(long j, long j7) {
        this.f3583a = j;
        this.f3584b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f3583a == pVar.f3583a && this.f3584b == pVar.f3584b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3583a) * 31) + ((int) this.f3584b);
    }
}
