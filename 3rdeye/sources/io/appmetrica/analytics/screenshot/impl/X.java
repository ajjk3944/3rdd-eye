package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42535a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42536b;

    public X(boolean z10, long j4) {
        this.f42535a = z10;
        this.f42536b = j4;
    }

    public final long a() {
        return this.f42536b;
    }

    public final boolean b() {
        return this.f42535a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceCaptorConfig(enabled=");
        sb.append(this.f42535a);
        sb.append(", delaySeconds=");
        return androidx.work.s.f(sb, this.f42536b, ')');
    }

    public X() {
        this(new M().f42512a, new M().f42513b);
    }
}
