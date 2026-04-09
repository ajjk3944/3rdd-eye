package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42499a;

    /* renamed from: b, reason: collision with root package name */
    public final T f42500b;

    public G(boolean z10, T t10) {
        this.f42499a = z10;
        this.f42500b = t10;
    }

    public final T a() {
        return this.f42500b;
    }

    public final boolean b() {
        return this.f42499a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f42499a + ", config=" + this.f42500b + ')';
    }

    public G() {
        this(new O().f42519a, new T());
    }
}
