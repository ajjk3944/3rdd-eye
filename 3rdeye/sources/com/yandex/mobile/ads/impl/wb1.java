package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wb1 implements sc0, zb1 {

    /* renamed from: a, reason: collision with root package name */
    private final yb1 f34872a;

    /* renamed from: b, reason: collision with root package name */
    private final tp f34873b;

    public wb1(yb1 nativeWebViewController, tp closeShowListener) {
        kotlin.jvm.internal.l.f(nativeWebViewController, "nativeWebViewController");
        kotlin.jvm.internal.l.f(closeShowListener, "closeShowListener");
        this.f34872a = nativeWebViewController;
        this.f34873b = closeShowListener;
    }

    @Override // com.yandex.mobile.ads.impl.zb1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f34872a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        this.f34872a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.zb1
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f34873b.a();
        this.f34872a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
    }
}
