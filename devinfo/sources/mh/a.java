package mh;

import uf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29378d = new a();

    /* renamed from: a, reason: collision with root package name */
    @b("enabled")
    private final boolean f29379a = false;

    /* renamed from: b, reason: collision with root package name */
    @b("interAdGap")
    private final long f29380b = 0;

    /* renamed from: c, reason: collision with root package name */
    @b("lastGap")
    private final long f29381c = 0;

    public final boolean a() {
        return this.f29379a;
    }

    public final long b() {
        return this.f29380b;
    }

    public final long c() {
        return this.f29381c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29379a == aVar.f29379a && this.f29380b == aVar.f29380b && this.f29381c == aVar.f29381c;
    }

    public final int hashCode() {
        int i4 = this.f29379a ? 1231 : 1237;
        long j = this.f29380b;
        int i10 = ((i4 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f29381c;
        return i10 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "ExitConfirmAdConfig(enabled=" + this.f29379a + ", interAdGap=" + this.f29380b + ", lastGap=" + this.f29381c + ")";
    }
}
