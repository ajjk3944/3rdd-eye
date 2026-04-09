package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public class az<V extends View, T> implements bg<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ig2<V, T> f25025a;

    public az(ig2<V, T> viewAdapter) {
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        this.f25025a = viewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void a() {
        View viewB = this.f25025a.b();
        if (viewB == null) {
            return;
        }
        this.f25025a.a(viewB);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean b() {
        return this.f25025a.b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final yg2 c() {
        View viewB = this.f25025a.b();
        if (viewB != null) {
            return new yg2(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean d() {
        return jh2.a(this.f25025a.b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean e() {
        return this.f25025a.c();
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void a(ag<T> asset, lg2 viewConfigurator) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f25025a.a(asset, viewConfigurator, asset.d());
    }

    public void b(T t10) {
        c(t10);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void c(T t10) {
        View viewB = this.f25025a.b();
        if (viewB == null) {
            return;
        }
        this.f25025a.b(viewB, t10);
        viewB.setVisibility(0);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean a(T t10) {
        View viewB = this.f25025a.b();
        return viewB != null && this.f25025a.a(viewB, t10);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void destroy() {
    }
}
