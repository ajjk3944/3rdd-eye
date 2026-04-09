package u5;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f23356c = new y(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f23357a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23358b;

    public y(long j, long j7) {
        this.f23357a = j;
        this.f23358b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f23357a == yVar.f23357a && this.f23358b == yVar.f23358b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23357a) * 31) + ((int) this.f23358b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f23357a);
        sb2.append(", position=");
        return c7.a.n(this.f23358b, "]", sb2);
    }
}
