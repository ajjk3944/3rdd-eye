package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42558a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f42559b;

    public g0(boolean z10, h0 h0Var) {
        this.f42558a = z10;
        this.f42559b = h0Var;
    }

    public final h0 a() {
        return this.f42559b;
    }

    public final boolean b() {
        return this.f42558a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f42558a + ", config=" + this.f42559b + ')';
    }

    public g0() {
        this(new G());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(G g10) {
        boolean zB = g10.b();
        T tA = g10.a();
        this(zB, tA != null ? new h0(tA) : null);
    }
}
