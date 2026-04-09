package com.yandex.mobile.ads.impl;

import L0.C0792x;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4084c1 implements InterfaceC4126i1, tr {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f25484a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4105f1 f25485b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f25486c;

    /* renamed from: d, reason: collision with root package name */
    private final du1 f25487d;

    /* renamed from: e, reason: collision with root package name */
    private final ff1 f25488e;

    /* renamed from: f, reason: collision with root package name */
    private final qc0 f25489f;

    /* renamed from: g, reason: collision with root package name */
    private final cd0 f25490g;

    /* renamed from: h, reason: collision with root package name */
    private final a8<?> f25491h;
    private final av1 i;

    public C4084c1(Context context, RelativeLayout rootLayout, C4188r1 adActivityListener, Window window, zc0 fullScreenDataHolder, du1 du1Var, ff1 orientationConfigurator, qc0 fullScreenBackButtonController, cd0 fullScreenInsetsController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(fullScreenDataHolder, "fullScreenDataHolder");
        kotlin.jvm.internal.l.f(orientationConfigurator, "orientationConfigurator");
        kotlin.jvm.internal.l.f(fullScreenBackButtonController, "fullScreenBackButtonController");
        kotlin.jvm.internal.l.f(fullScreenInsetsController, "fullScreenInsetsController");
        this.f25484a = rootLayout;
        this.f25485b = adActivityListener;
        this.f25486c = window;
        this.f25487d = du1Var;
        this.f25488e = orientationConfigurator;
        this.f25489f = fullScreenBackButtonController;
        this.f25490g = fullScreenInsetsController;
        this.f25491h = fullScreenDataHolder.a();
        av1 av1VarB = fullScreenDataHolder.b();
        this.i = av1VarB;
        av1VarB.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void a() {
        this.f25485b.a(2, null);
        this.i.i();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void b() {
        this.f25485b.a(3, null);
        this.i.g();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void c() {
        this.i.a(this.f25484a);
        Bundle bundle = new Bundle();
        Map<String, String> mapA = this.i.f().a();
        bundle.putSerializable("extra_tracking_parameters", mapA instanceof Serializable ? (Serializable) mapA : null);
        this.f25485b.a(0, bundle);
        this.f25485b.a(5, null);
        fp0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void d() {
        this.i.d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final boolean e() {
        if (this.f25489f.a()) {
            return (this.i.f().b() && this.f25491h.P()) ? false : true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void f() {
        this.f25485b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void g() {
        L0.Z a0Var;
        this.f25486c.requestFeature(1);
        this.f25486c.addFlags(1024);
        this.f25486c.addFlags(16777216);
        du1 du1Var = this.f25487d;
        if (du1Var != null && du1Var.z()) {
            cd0 cd0Var = this.f25490g;
            Window window = this.f25486c;
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
        this.f25490g.a(this.f25486c, this.f25484a);
        this.f25488e.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void onAdClosed() {
        this.f25485b.a(4, null);
    }
}
