package com.yandex.mobile.ads.impl;

import L0.C0792x;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.widget.RelativeLayout;

/* renamed from: com.yandex.mobile.ads.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4112g1 implements InterfaceC4126i1, tr {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27507a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f27508b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f27509c;

    /* renamed from: d, reason: collision with root package name */
    private final h61 f27510d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4105f1 f27511e;

    /* renamed from: f, reason: collision with root package name */
    private final C4072a3 f27512f;

    /* renamed from: g, reason: collision with root package name */
    private final du1 f27513g;

    /* renamed from: h, reason: collision with root package name */
    private final qc0 f27514h;
    private final cd0 i;

    /* renamed from: j, reason: collision with root package name */
    private final sd0 f27515j;

    public C4112g1(Context context, RelativeLayout container, Window window, h61 nativeAdPrivate, a8 adResponse, C4188r1 adActivityListener, C4070a1 eventController, C4072a3 adConfiguration, int i, du1 du1Var, qc0 fullScreenBackButtonController, cd0 fullScreenInsetsController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenBackButtonController, "fullScreenBackButtonController");
        kotlin.jvm.internal.l.f(fullScreenInsetsController, "fullScreenInsetsController");
        this.f27507a = context;
        this.f27508b = container;
        this.f27509c = window;
        this.f27510d = nativeAdPrivate;
        this.f27511e = adActivityListener;
        this.f27512f = adConfiguration;
        this.f27513g = du1Var;
        this.f27514h = fullScreenBackButtonController;
        this.i = fullScreenInsetsController;
        this.f27515j = new xd0(context, adResponse, container, this, eventController, i, adActivityListener, adConfiguration).a(context, nativeAdPrivate, this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void a() {
        this.f27511e.a(2, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void b() {
        this.f27511e.a(3, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void c() {
        if (this.f27512f.b() != ns.i) {
            this.f27508b.setBackground(x7.f35211a);
        }
        this.f27515j.c();
        this.f27511e.a(0, null);
        this.f27511e.a(5, null);
        int i = fp0.f27419b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void d() {
        this.f27515j.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final boolean e() {
        return this.f27514h.a();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void f() {
        this.f27511e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void g() {
        L0.Z a0Var;
        this.f27511e.a(this.f27507a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f27509c.requestFeature(1);
        this.f27509c.addFlags(1024);
        this.f27509c.addFlags(16777216);
        du1 du1Var = this.f27513g;
        if (du1Var != null && du1Var.z()) {
            cd0 cd0Var = this.i;
            Window window = this.f27509c;
            cd0Var.getClass();
            kotlin.jvm.internal.l.f(window, "window");
            C0792x c0792x = new C0792x(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                L0.b0 b0Var = new L0.b0(window.getInsetsController(), c0792x);
                b0Var.f3888c = window;
                a0Var = b0Var;
            } else {
                a0Var = i >= 26 ? new L0.a0(window, c0792x) : new L0.Z(window, c0792x);
            }
            a0Var.z();
            a0Var.o(2);
        }
        this.i.a(this.f27509c, this.f27508b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void onAdClosed() {
        this.f27510d.destroy();
        this.f27511e.a(4, null);
    }
}
