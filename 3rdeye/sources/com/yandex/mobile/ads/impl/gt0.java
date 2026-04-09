package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2099t;

/* loaded from: classes3.dex */
public final class gt0 {

    /* renamed from: a, reason: collision with root package name */
    private final wl0 f27978a;

    /* renamed from: b, reason: collision with root package name */
    private final lt0 f27979b;

    /* renamed from: c, reason: collision with root package name */
    private final mt0 f27980c;

    /* renamed from: d, reason: collision with root package name */
    private final pm0 f27981d;

    /* renamed from: e, reason: collision with root package name */
    private final C4113g2 f27982e;

    public gt0(Context context, vu1 sdkEnvironmentModule, zs instreamAdBreak, wl0 instreamAdPlayerController, C4148l2 adBreakStatusController, lt0 manualPlaybackEventListener, nl0 instreamAdCustomUiElementsHolder, mt0 manualPlaybackManager, pm0 instreamAdViewsHolderManager, C4113g2 adBreakPlaybackController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAdBreak, "instreamAdBreak");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(manualPlaybackEventListener, "manualPlaybackEventListener");
        kotlin.jvm.internal.l.f(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        kotlin.jvm.internal.l.f(manualPlaybackManager, "manualPlaybackManager");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(adBreakPlaybackController, "adBreakPlaybackController");
        this.f27978a = instreamAdPlayerController;
        this.f27979b = manualPlaybackEventListener;
        this.f27980c = manualPlaybackManager;
        this.f27981d = instreamAdViewsHolderManager;
        this.f27982e = adBreakPlaybackController;
    }

    public final void b() {
        om0 om0VarA = this.f27981d.a();
        if (om0VarA == null || om0VarA.b() == null) {
            return;
        }
        this.f27982e.a();
    }

    public final void c() {
        this.f27978a.a();
        this.f27982e.a(new a());
        this.f27982e.d();
    }

    public final void d() {
        om0 om0VarA = this.f27981d.a();
        if (om0VarA == null || om0VarA.b() == null) {
            return;
        }
        this.f27982e.f();
    }

    public final void a() {
        this.f27982e.b();
        this.f27978a.b();
        this.f27981d.b();
    }

    public final void a(o70 instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        gt0 gt0VarA = this.f27980c.a(instreamAdView);
        if (!equals(gt0VarA)) {
            if (gt0VarA != null) {
                gt0VarA.f27982e.c();
                gt0VarA.f27981d.b();
            }
            if (this.f27980c.a(this)) {
                this.f27982e.c();
                this.f27981d.b();
            }
            this.f27980c.a(instreamAdView, this);
        }
        this.f27981d.a(instreamAdView, C2099t.f18581b);
        this.f27978a.a();
        this.f27982e.g();
    }

    public final void a(ab2 ab2Var) {
        this.f27982e.a(ab2Var);
    }

    public final class a implements InterfaceC4120h2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void a() {
            gt0.this.f27979b.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void b() {
            gt0.this.f27979b.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void e() {
            gt0.this.f27979b.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void g() {
            gt0.this.f27979b.onInstreamAdBreakError("Ad player returned error");
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void d() {
        }
    }
}
