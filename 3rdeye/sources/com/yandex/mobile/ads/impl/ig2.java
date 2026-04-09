package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class ig2<V extends View, T> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f28658b = {fa.a(ig2.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f28659a;

    public ig2(V view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f28659a = bo1.a(view);
    }

    public void a() {
    }

    public abstract boolean a(V v10, T t10);

    public final V b() {
        return (V) this.f28659a.getValue(this, f28658b[0]);
    }

    public abstract void b(V v10, T t10);

    public final boolean c() {
        View viewB = b();
        return viewB != null && !jh2.d(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(V view) {
        kotlin.jvm.internal.l.f(view, "view");
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(ag<?> asset, lg2 viewConfigurator, T t10) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        View viewB = b();
        if (viewB == null) {
            return;
        }
        viewConfigurator.a(viewB, asset);
        viewConfigurator.a(asset, new kg2(viewB));
    }
}
