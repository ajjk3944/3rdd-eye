package lh;

import uf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f28816d = new a();

    /* renamed from: a, reason: collision with root package name */
    @b("inter_ad_gap")
    private final long f28817a = 180;

    /* renamed from: b, reason: collision with root package name */
    @b("inter_ad_rate")
    private final int f28818b = 60;

    /* renamed from: c, reason: collision with root package name */
    @b("inter_ad_enabled")
    private final boolean f28819c = true;

    public final boolean a() {
        return this.f28819c;
    }

    public final long b() {
        return this.f28817a;
    }

    public final int c() {
        return this.f28818b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28817a == aVar.f28817a && this.f28818b == aVar.f28818b && this.f28819c == aVar.f28819c;
    }

    public final int hashCode() {
        long j = this.f28817a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.f28818b) * 31) + (this.f28819c ? 1231 : 1237);
    }

    public final String toString() {
        return "AppAnaAdConfig(interAdGap=" + this.f28817a + ", interAdRate=" + this.f28818b + ", interAdEnabled=" + this.f28819c + ")";
    }
}
