package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final C5139e f42522a;

    /* renamed from: b, reason: collision with root package name */
    public final X f42523b;

    /* renamed from: c, reason: collision with root package name */
    public final C5149o f42524c;

    public T(C5139e c5139e, X x10, C5149o c5149o) {
        this.f42522a = c5139e;
        this.f42523b = x10;
        this.f42524c = c5149o;
    }

    public final C5139e a() {
        return this.f42522a;
    }

    public final C5149o b() {
        return this.f42524c;
    }

    public final X c() {
        return this.f42523b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f42522a + ", serviceCaptorConfig=" + this.f42523b + ", contentObserverCaptorConfig=" + this.f42524c + ')';
    }

    public T() {
        this(new C5139e(), new X(), new C5149o());
    }
}
