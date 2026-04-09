package h2;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f9834b = b0.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9835c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f9836a;

    public /* synthetic */ i0(long j) {
        this.f9836a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f9836a == ((i0) obj).f9836a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9836a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        long j = this.f9836a;
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return c7.a.q(sb2, (int) (j & 4294967295L), ')');
    }
}
