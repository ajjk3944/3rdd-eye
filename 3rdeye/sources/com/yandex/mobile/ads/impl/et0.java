package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class et0 implements u72 {

    /* renamed from: a, reason: collision with root package name */
    private final zs f27002a;

    /* renamed from: b, reason: collision with root package name */
    private final lt0 f27003b;

    /* renamed from: c, reason: collision with root package name */
    private final ab2 f27004c;

    /* renamed from: d, reason: collision with root package name */
    private final ht0 f27005d;

    /* renamed from: e, reason: collision with root package name */
    private final yl0 f27006e;

    /* renamed from: f, reason: collision with root package name */
    private gt0 f27007f;

    /* renamed from: g, reason: collision with root package name */
    private ct f27008g;

    public et0(Context context, vu1 sdkEnvironmentModule, zs instreamAdBreak, C4148l2 adBreakStatusController, nl0 customUiElementsHolder, zl0 instreamAdPlayerReuseControllerFactory, lt0 manualPlaybackEventListener, ab2 videoAdCreativePlaybackProxyListener, ht0 presenterProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAdBreak, "instreamAdBreak");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        kotlin.jvm.internal.l.f(manualPlaybackEventListener, "manualPlaybackEventListener");
        kotlin.jvm.internal.l.f(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        kotlin.jvm.internal.l.f(presenterProvider, "presenterProvider");
        this.f27002a = instreamAdBreak;
        this.f27003b = manualPlaybackEventListener;
        this.f27004c = videoAdCreativePlaybackProxyListener;
        this.f27005d = presenterProvider;
        this.f27006e = zl0.a(this);
    }

    public final zs a() {
        return this.f27002a;
    }

    public final void b() {
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.a();
        }
        ct ctVar = this.f27008g;
        if (ctVar != null) {
            this.f27006e.b(ctVar);
        }
        this.f27007f = null;
        this.f27008g = null;
    }

    public final void c() {
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.b();
        }
    }

    public final void d() {
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u72
    public final void invalidateAdPlayer() {
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.a();
        }
        ct ctVar = this.f27008g;
        if (ctVar != null) {
            this.f27006e.b(ctVar);
        }
        this.f27007f = null;
        this.f27008g = null;
    }

    public final void a(o70 instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.a(instreamAdView);
        }
    }

    public final void a(ul2 player) {
        kotlin.jvm.internal.l.f(player, "player");
        gt0 gt0Var = this.f27007f;
        if (gt0Var != null) {
            gt0Var.a();
        }
        ct ctVar = this.f27008g;
        if (ctVar != null) {
            this.f27006e.b(ctVar);
        }
        this.f27007f = null;
        this.f27008g = player;
        this.f27006e.a(player);
        gt0 gt0VarA = this.f27005d.a(player);
        gt0VarA.a(this.f27004c);
        gt0VarA.c();
        this.f27007f = gt0VarA;
    }

    public final void a(yn0 yn0Var) {
        this.f27004c.a(yn0Var);
    }

    public final void a(pl2 pl2Var) {
        this.f27003b.a(pl2Var);
    }
}
