package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vr {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f34647a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4224w2 f34648b;

    /* renamed from: c, reason: collision with root package name */
    private c91 f34649c;

    /* renamed from: d, reason: collision with root package name */
    private s42 f34650d;

    /* renamed from: e, reason: collision with root package name */
    private final w20 f34651e;

    /* renamed from: f, reason: collision with root package name */
    private final sl1 f34652f;

    public vr(a8 adResponse, InterfaceC4224w2 adCompleteListener, c91 nativeMediaContent, s42 timeProviderContainer, w20 w20Var, hr0 progressListener) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        this.f34647a = adResponse;
        this.f34648b = adCompleteListener;
        this.f34649c = nativeMediaContent;
        this.f34650d = timeProviderContainer;
        this.f34651e = w20Var;
        this.f34652f = progressListener;
    }

    public final sc0 a() {
        ta1 ta1VarA = this.f34649c.a();
        yb1 yb1VarB = this.f34649c.b();
        w20 w20Var = this.f34651e;
        if (kotlin.jvm.internal.l.b(w20Var != null ? w20Var.e() : null, c10.f25493d.a())) {
            return new g81(this.f34648b, this.f34650d, this.f34652f);
        }
        if (ta1VarA == null) {
            return yb1VarB != null ? new xb1(yb1VarB, this.f34648b) : new g81(this.f34648b, this.f34650d, this.f34652f);
        }
        a8<?> a8Var = this.f34647a;
        return new sa1(a8Var, ta1VarA, this.f34648b, this.f34652f, a8Var.K());
    }
}
