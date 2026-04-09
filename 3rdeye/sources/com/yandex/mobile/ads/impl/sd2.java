package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class sd2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ir0 f32946a;

    /* renamed from: b, reason: collision with root package name */
    private final wo f32947b;

    /* renamed from: c, reason: collision with root package name */
    private final nu f32948c;

    public sd2(ir0 link, wo clickListenerCreator, nu nuVar) {
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(clickListenerCreator, "clickListenerCreator");
        this.f32946a = link;
        this.f32947b = clickListenerCreator;
        this.f32948c = nuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f32947b.a(this.f32948c != null ? new ir0(this.f32946a.a(), this.f32946a.c(), this.f32946a.d(), this.f32948c.c(), this.f32946a.b()) : this.f32946a).onClick(view);
    }
}
