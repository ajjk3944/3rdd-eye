package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4190r3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4163n3 f32438a;

    /* renamed from: b, reason: collision with root package name */
    private final lm0 f32439b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4218v3 f32440c;

    /* renamed from: d, reason: collision with root package name */
    private final C4204t3 f32441d;

    public C4190r3(C4163n3 adGroupController, lm0 uiElementsManager, InterfaceC4218v3 adGroupPlaybackEventsListener, C4204t3 adGroupPlaybackController) {
        kotlin.jvm.internal.l.f(adGroupController, "adGroupController");
        kotlin.jvm.internal.l.f(uiElementsManager, "uiElementsManager");
        kotlin.jvm.internal.l.f(adGroupPlaybackEventsListener, "adGroupPlaybackEventsListener");
        kotlin.jvm.internal.l.f(adGroupPlaybackController, "adGroupPlaybackController");
        this.f32438a = adGroupController;
        this.f32439b = uiElementsManager;
        this.f32440c = adGroupPlaybackEventsListener;
        this.f32441d = adGroupPlaybackController;
    }

    public final void a(boolean z10) {
        qn0 qn0VarC = this.f32438a.c();
        if (qn0VarC != null) {
            qn0VarC.a();
        }
        C4225w3 c4225w3F = this.f32438a.f();
        if (c4225w3F == null) {
            this.f32439b.a();
            this.f32440c.g();
            return;
        }
        this.f32439b.a(c4225w3F.c());
        int iOrdinal = c4225w3F.b().a().ordinal();
        if (iOrdinal == 0) {
            if (z10) {
                this.f32441d.b();
            }
            this.f32439b.a();
            this.f32440c.c();
            this.f32441d.e();
            return;
        }
        if (iOrdinal == 1) {
            if (z10) {
                this.f32441d.b();
            }
            this.f32439b.a();
            this.f32440c.c();
            return;
        }
        if (iOrdinal == 2) {
            this.f32440c.a();
            this.f32441d.d();
            return;
        }
        if (iOrdinal != 4 && iOrdinal != 5) {
            if (iOrdinal == 6) {
                this.f32440c.b();
                this.f32441d.f();
                return;
            } else if (iOrdinal != 8 && iOrdinal != 9) {
                return;
            }
        }
        a(z10);
    }
}
