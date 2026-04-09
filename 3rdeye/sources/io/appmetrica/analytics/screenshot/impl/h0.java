package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f42560a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f42561b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f42562c;

    public h0(e0 e0Var, i0 i0Var, f0 f0Var) {
        this.f42560a = e0Var;
        this.f42561b = i0Var;
        this.f42562c = f0Var;
    }

    public final e0 a() {
        return this.f42560a;
    }

    public final f0 b() {
        return this.f42562c;
    }

    public final i0 c() {
        return this.f42561b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f42560a + ", serviceCaptorConfig=" + this.f42561b + ", contentObserverCaptorConfig=" + this.f42562c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(T t10) {
        C5139e c5139eA = t10.a();
        e0 e0Var = c5139eA != null ? new e0(c5139eA) : null;
        X xC = t10.c();
        i0 i0Var = xC != null ? new i0(xC) : null;
        C5149o c5149oB = t10.b();
        this(e0Var, i0Var, c5149oB != null ? new f0(c5149oB) : null);
    }
}
