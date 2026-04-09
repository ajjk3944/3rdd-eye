package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class kz1<V extends ViewGroup> implements w00<V>, InterfaceC4077b1 {

    /* renamed from: a, reason: collision with root package name */
    private final y5 f29831a;

    /* renamed from: b, reason: collision with root package name */
    private final C4070a1 f29832b;

    /* renamed from: c, reason: collision with root package name */
    private final s41 f29833c;

    /* renamed from: d, reason: collision with root package name */
    private final az1 f29834d;

    /* renamed from: e, reason: collision with root package name */
    private k00 f29835e;

    public kz1(y5 y5Var, C4070a1 adActivityEventController, s41 nativeAdControlViewProvider, az1 skipAppearanceController) {
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        kotlin.jvm.internal.l.f(skipAppearanceController, "skipAppearanceController");
        this.f29831a = y5Var;
        this.f29832b = adActivityEventController;
        this.f29833c = nativeAdControlViewProvider;
        this.f29834d = skipAppearanceController;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        z5 z5VarB;
        kotlin.jvm.internal.l.f(container, "container");
        View viewB = this.f29833c.b(container);
        if (viewB != null) {
            this.f29832b.a(this);
            az1 az1Var = this.f29834d;
            y5 y5Var = this.f29831a;
            Long lValueOf = (y5Var == null || (z5VarB = y5Var.b()) == null) ? null : Long.valueOf(z5VarB.a());
            k00 k00Var = new k00(viewB, az1Var, lValueOf != null ? lValueOf.longValue() : 0L, jg1.a());
            this.f29835e = k00Var;
            k00Var.b();
            if (viewB.getTag() == null) {
                viewB.setTag("skip_button");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
    public final void b() {
        k00 k00Var = this.f29835e;
        if (k00Var != null) {
            k00Var.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f29832b.b(this);
        k00 k00Var = this.f29835e;
        if (k00Var != null) {
            k00Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
    public final void a() {
        k00 k00Var = this.f29835e;
        if (k00Var != null) {
            k00Var.d();
        }
    }
}
