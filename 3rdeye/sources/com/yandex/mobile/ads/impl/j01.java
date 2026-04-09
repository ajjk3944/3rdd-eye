package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class j01 implements j8, bj1, InterfaceC4120h2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4148l2 f28904a;

    /* renamed from: b, reason: collision with root package name */
    private final pe2 f28905b;

    /* renamed from: c, reason: collision with root package name */
    private final ab2 f28906c;

    /* renamed from: d, reason: collision with root package name */
    private final i01 f28907d;

    /* renamed from: e, reason: collision with root package name */
    private final a f28908e;

    /* renamed from: f, reason: collision with root package name */
    private final zi1 f28909f;

    /* renamed from: g, reason: collision with root package name */
    private k8 f28910g;

    /* renamed from: h, reason: collision with root package name */
    private C4113g2 f28911h;

    public final class a implements re2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.re2
        public final void a() {
            j01.this.f28909f.b();
            C4113g2 c4113g2 = j01.this.f28911h;
            if (c4113g2 != null) {
                c4113g2.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.re2
        public final void onVideoCompleted() {
            j01.e(j01.this);
            j01.this.f28909f.b();
            j01.this.f28905b.a(null);
            k8 k8Var = j01.this.f28910g;
            if (k8Var != null) {
                k8Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.re2
        public final void onVideoError() {
            j01.this.f28909f.b();
            j01.this.f28905b.a(null);
            C4113g2 c4113g2 = j01.this.f28911h;
            if (c4113g2 != null) {
                c4113g2.c();
            }
            k8 k8Var = j01.this.f28910g;
            if (k8Var != null) {
                k8Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.re2
        public final void onVideoPaused() {
            j01.this.f28909f.b();
        }

        @Override // com.yandex.mobile.ads.impl.re2
        public final void onVideoResumed() {
            j01.this.f28909f.a();
        }
    }

    public j01(Context context, bm0 instreamAdPlaylist, C4148l2 adBreakStatusController, wl0 instreamAdPlayerController, lm0 interfaceElementsManager, pm0 instreamAdViewsHolderManager, te2 videoPlayerController, pe2 videoPlaybackController, ab2 videoAdCreativePlaybackProxyListener, aj1 schedulerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(instreamAdPlaylist, "instreamAdPlaylist");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(interfaceElementsManager, "interfaceElementsManager");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(videoPlaybackController, "videoPlaybackController");
        kotlin.jvm.internal.l.f(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        kotlin.jvm.internal.l.f(schedulerCreator, "schedulerCreator");
        this.f28904a = adBreakStatusController;
        this.f28905b = videoPlaybackController;
        this.f28906c = videoAdCreativePlaybackProxyListener;
        this.f28907d = new i01(context, adBreakStatusController, instreamAdPlayerController, interfaceElementsManager, instreamAdViewsHolderManager, videoAdCreativePlaybackProxyListener);
        this.f28908e = new a();
        this.f28909f = schedulerCreator.a(instreamAdPlaylist, this);
    }

    public static final void e(j01 j01Var) {
        C4113g2 c4113g2 = j01Var.f28911h;
        if (c4113g2 != null) {
            c4113g2.a((InterfaceC4120h2) null);
        }
        C4113g2 c4113g22 = j01Var.f28911h;
        if (c4113g22 != null) {
            c4113g22.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void f() {
        this.f28909f.b();
        C4113g2 c4113g2 = this.f28911h;
        if (c4113g2 != null) {
            c4113g2.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
    public final void g() {
        this.f28911h = null;
        this.f28905b.e();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void prepare() {
        k8 k8Var = this.f28910g;
        if (k8Var != null) {
            k8Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void resume() {
        C1992A c1992a;
        C4113g2 c4113g2 = this.f28911h;
        if (c4113g2 != null) {
            if (this.f28904a.a()) {
                this.f28905b.c();
                c4113g2.f();
            } else {
                this.f28905b.e();
                c4113g2.d();
            }
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            this.f28905b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void start() {
        this.f28905b.a(this.f28908e);
        this.f28905b.e();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void c() {
        this.f28909f.b();
        C4113g2 c4113g2 = this.f28911h;
        if (c4113g2 != null) {
            c4113g2.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
    public final void d() {
        this.f28905b.c();
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(zs adBreak) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        C4113g2 c4113g2A = this.f28907d.a(adBreak);
        if (!kotlin.jvm.internal.l.b(c4113g2A, this.f28911h)) {
            C4113g2 c4113g2 = this.f28911h;
            if (c4113g2 != null) {
                c4113g2.a((InterfaceC4120h2) null);
            }
            C4113g2 c4113g22 = this.f28911h;
            if (c4113g22 != null) {
                c4113g22.e();
            }
        }
        c4113g2A.a(this);
        c4113g2A.g();
        this.f28911h = c4113g2A;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(zs adBreak) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        C4113g2 c4113g2A = this.f28907d.a(adBreak);
        if (!kotlin.jvm.internal.l.b(c4113g2A, this.f28911h)) {
            C4113g2 c4113g2 = this.f28911h;
            if (c4113g2 != null) {
                c4113g2.a((InterfaceC4120h2) null);
            }
            C4113g2 c4113g22 = this.f28911h;
            if (c4113g22 != null) {
                c4113g22.e();
            }
        }
        c4113g2A.a(this);
        c4113g2A.d();
        this.f28911h = c4113g2A;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
    public final void e() {
        this.f28911h = null;
        this.f28905b.e();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void a(yn0 yn0Var) {
        this.f28906c.a(yn0Var);
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void a(k8 k8Var) {
        this.f28910g = k8Var;
    }
}
