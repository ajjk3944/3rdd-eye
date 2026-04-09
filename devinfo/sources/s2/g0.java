package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f33386b = z.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33387c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f33388a;

    public /* synthetic */ g0(long j) {
        this.f33388a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f33388a == ((g0) obj).f33388a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33388a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        long j = this.f33388a;
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return d.h.u(sb2, (int) (j & 4294967295L), ')');
    }
}
