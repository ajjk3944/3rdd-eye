package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ly1 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    private final C4113g2 f30129a;

    /* renamed from: b, reason: collision with root package name */
    private k8 f30130b;

    public ly1(Context context, zs adBreak, wl0 instreamAdPlayerController, lm0 interfaceElementsManager, pm0 instreamAdViewsHolderManager, C4148l2 adBreakStatusController, C4113g2 adBreakPlaybackController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(interfaceElementsManager, "interfaceElementsManager");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(adBreakPlaybackController, "adBreakPlaybackController");
        this.f30129a = adBreakPlaybackController;
        adBreakPlaybackController.a(new a());
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void c() {
        this.f30129a.b();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void f() {
        this.f30129a.c();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void prepare() {
        this.f30129a.d();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void resume() {
        this.f30129a.f();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void start() {
        this.f30129a.g();
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void a(yn0 yn0Var) {
        this.f30129a.a(yn0Var);
    }

    @Override // com.yandex.mobile.ads.impl.j8
    public final void a(k8 k8Var) {
        this.f30130b = k8Var;
    }

    public final class a implements InterfaceC4120h2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void a() {
            k8 k8Var = ly1.this.f30130b;
            if (k8Var != null) {
                k8Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void e() {
            k8 k8Var = ly1.this.f30130b;
            if (k8Var != null) {
                k8Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void g() {
            k8 k8Var = ly1.this.f30130b;
            if (k8Var != null) {
                k8Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4120h2
        public final void d() {
        }
    }
}
