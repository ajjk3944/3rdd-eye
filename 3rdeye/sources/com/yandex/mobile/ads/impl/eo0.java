package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class eo0 {

    /* renamed from: a, reason: collision with root package name */
    private final wl0 f26957a;

    /* renamed from: b, reason: collision with root package name */
    private final te2 f26958b;

    /* renamed from: c, reason: collision with root package name */
    private final ab2 f26959c;

    /* renamed from: d, reason: collision with root package name */
    private final c f26960d;

    /* renamed from: e, reason: collision with root package name */
    private final a f26961e;

    /* renamed from: f, reason: collision with root package name */
    private final b f26962f;

    /* renamed from: g, reason: collision with root package name */
    private final pe2 f26963g;

    /* renamed from: h, reason: collision with root package name */
    private final i8 f26964h;
    private g8 i;

    /* renamed from: j, reason: collision with root package name */
    private fo0 f26965j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26966k;

    public final class a implements k8 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void a() {
            eo0.this.e();
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void b() {
            eo0.g(eo0.this);
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void c() {
            eo0.e(eo0.this);
        }
    }

    public final class b implements k8 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void a() {
            eo0.c(eo0.this);
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void b() {
            eo0.g(eo0.this);
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void c() {
            eo0.c(eo0.this);
        }
    }

    public final class c implements k8 {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void a() {
            eo0.this.f26966k = false;
            eo0.d(eo0.this);
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void b() {
            boolean z10 = eo0.this.f26966k;
            eo0.this.f26966k = false;
            if (z10) {
                eo0.g(eo0.this);
                return;
            }
            fo0 fo0Var = eo0.this.f26965j;
            if (fo0Var != null) {
                fo0Var.onInstreamAdPrepared();
            }
        }

        @Override // com.yandex.mobile.ads.impl.k8
        public final void c() {
            eo0.d(eo0.this);
        }
    }

    public /* synthetic */ eo0(Context context, vu1 vu1Var, xs xsVar, wl0 wl0Var, pm0 pm0Var, te2 te2Var, nl0 nl0Var) {
        this(context, vu1Var, xsVar, wl0Var, pm0Var, te2Var, nl0Var, new qe2(), new ab2());
    }

    public static final void c(eo0 eo0Var) {
        fo0 fo0Var = eo0Var.f26965j;
        if (fo0Var != null) {
            fo0Var.a();
        }
        eo0Var.f26958b.h();
        eo0Var.f26957a.b();
    }

    public static final void d(eo0 eo0Var) {
        g8 g8VarA = eo0Var.f26964h.a();
        eo0Var.i = g8VarA;
        g8VarA.a(eo0Var.f26961e);
        g8 g8Var = eo0Var.i;
        if (g8Var != null) {
            g8Var.f();
        }
    }

    public static final void e(eo0 eo0Var) {
        g8 g8VarB = eo0Var.f26964h.b();
        eo0Var.i = g8VarB;
        if (g8VarB != null) {
            g8VarB.a(eo0Var.f26962f);
            g8 g8Var = eo0Var.i;
            if (g8Var != null) {
                g8Var.f();
                return;
            }
            return;
        }
        fo0 fo0Var = eo0Var.f26965j;
        if (fo0Var != null) {
            fo0Var.a();
        }
        eo0Var.f26958b.h();
        eo0Var.f26957a.b();
    }

    public static final void g(eo0 eo0Var) {
        g8 g8Var = eo0Var.i;
        if (g8Var != null) {
            g8Var.h();
        }
    }

    public final void h() {
        if (this.i != null) {
            fo0 fo0Var = this.f26965j;
            if (fo0Var != null) {
                fo0Var.onInstreamAdPrepared();
                return;
            }
            return;
        }
        g8 g8VarC = this.f26964h.c();
        this.i = g8VarC;
        if (g8VarC == null) {
            fo0 fo0Var2 = this.f26965j;
            if (fo0Var2 != null) {
                fo0Var2.onInstreamAdPrepared();
                return;
            }
            return;
        }
        g8VarC.a(this.f26960d);
        this.f26966k = false;
        g8 g8Var = this.i;
        if (g8Var != null) {
            g8Var.f();
        }
    }

    public final void i() {
        g8 g8Var = this.i;
        if (g8Var != null) {
            g8Var.g();
        }
    }

    public final void j() {
        this.f26963g.f();
        g8 g8Var = this.i;
        if (g8Var != null) {
            g8Var.e();
        }
    }

    public final void a() {
        this.f26963g.a();
    }

    public final void b() {
        g8 g8Var = this.i;
        if (g8Var != null) {
            g8Var.g();
            return;
        }
        fo0 fo0Var = this.f26965j;
        if (fo0Var != null) {
            fo0Var.a();
        }
        this.f26958b.h();
        this.f26957a.b();
    }

    public final void f() {
        if (this.i != null) {
            this.f26963g.c();
            g8 g8Var = this.i;
            if (g8Var != null) {
                g8Var.h();
                return;
            }
            return;
        }
        g8 g8VarC = this.f26964h.c();
        this.i = g8VarC;
        if (g8VarC != null) {
            g8VarC.a(this.f26960d);
            this.f26963g.c();
            this.f26966k = true;
            g8 g8Var2 = this.i;
            if (g8Var2 != null) {
                g8Var2.f();
                return;
            }
            return;
        }
        g8 g8VarA = this.f26964h.a();
        this.i = g8VarA;
        g8VarA.a(this.f26961e);
        g8 g8Var3 = this.i;
        if (g8Var3 != null) {
            g8Var3.f();
        }
    }

    public final void a(yn0 yn0Var) {
        this.f26959c.a(yn0Var);
    }

    public final void g() {
        this.f26958b.a(this.f26963g);
        this.f26963g.d();
    }

    public eo0(Context context, vu1 sdkEnvironmentModule, xs instreamVideoAd, wl0 instreamAdPlayerController, pm0 instreamAdViewsHolderManager, te2 videoPlayerController, nl0 customUiElementsHolder, qe2 videoPlaybackControllerFactory, ab2 videoAdCreativePlaybackProxyListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(videoPlaybackControllerFactory, "videoPlaybackControllerFactory");
        kotlin.jvm.internal.l.f(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        this.f26957a = instreamAdPlayerController;
        this.f26958b = videoPlayerController;
        this.f26959c = videoAdCreativePlaybackProxyListener;
        this.f26960d = new c();
        this.f26961e = new a();
        this.f26962f = new b();
        pe2 pe2VarA = qe2.a(videoPlayerController, this);
        this.f26963g = pe2VarA;
        this.f26964h = new i8(context, sdkEnvironmentModule, instreamVideoAd, instreamAdPlayerController, instreamAdViewsHolderManager, videoPlayerController, pe2VarA, videoAdCreativePlaybackProxyListener, customUiElementsHolder);
    }

    public final void a(fo0 fo0Var) {
        this.f26965j = fo0Var;
    }

    public final void c() {
        g8 g8Var = this.i;
        if (g8Var != null) {
            g8Var.d();
        }
        this.f26957a.b();
    }

    public final void d() {
        c();
        this.f26958b.h();
        this.f26963g.b();
    }

    public final void e() {
        fo0 fo0Var = this.f26965j;
        if (fo0Var != null) {
            fo0Var.b();
        }
        this.f26958b.h();
        this.f26957a.b();
    }
}
