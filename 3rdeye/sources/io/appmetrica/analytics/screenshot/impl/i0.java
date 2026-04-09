package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42564a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42565b;

    public i0(boolean z10, long j4) {
        this.f42564a = z10;
        this.f42565b = j4;
    }

    public final long a() {
        return this.f42565b;
    }

    public final boolean b() {
        return this.f42564a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb.append(this.f42564a);
        sb.append(", delaySeconds=");
        return androidx.work.s.f(sb, this.f42565b, ')');
    }

    public i0(X x10) {
        this(x10.b(), x10.a());
    }
}
