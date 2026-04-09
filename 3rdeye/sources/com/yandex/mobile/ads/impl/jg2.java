package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class jg2<V extends View, T> {

    /* renamed from: a, reason: collision with root package name */
    private final ig2<V, T> f29133a;

    public jg2(ig2<V, T> viewAdapter) {
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        this.f29133a = viewAdapter;
    }

    public final void a() {
        View viewB = this.f29133a.b();
        if (viewB == null) {
            return;
        }
        this.f29133a.a(viewB);
    }

    public final void b() {
        this.f29133a.a();
    }

    public final void b(T t10) {
        View viewB = this.f29133a.b();
        if (viewB == null) {
            return;
        }
        this.f29133a.b(viewB, t10);
        viewB.setVisibility(0);
    }

    public final void a(ag<?> asset, lg2 viewConfigurator, T t10) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        if (this.f29133a.b() == null) {
            return;
        }
        this.f29133a.a(asset, viewConfigurator, t10);
    }

    public final boolean a(T t10) {
        View viewB = this.f29133a.b();
        return viewB != null && this.f29133a.a(viewB, t10);
    }
}
