package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xb1 implements sc0, zb1 {

    /* renamed from: a, reason: collision with root package name */
    private final yb1 f35244a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4224w2 f35245b;

    public xb1(yb1 nativeWebViewController, InterfaceC4224w2 adCompleteListener) {
        kotlin.jvm.internal.l.f(nativeWebViewController, "nativeWebViewController");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        this.f35244a = nativeWebViewController;
        this.f35245b = adCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.zb1
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f35244a.b(this);
        this.f35245b = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        this.f35244a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.zb1
    public final void a() {
        InterfaceC4224w2 interfaceC4224w2 = this.f35245b;
        if (interfaceC4224w2 != null) {
            interfaceC4224w2.b();
        }
        this.f35244a.b(this);
        this.f35245b = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
    }
}
