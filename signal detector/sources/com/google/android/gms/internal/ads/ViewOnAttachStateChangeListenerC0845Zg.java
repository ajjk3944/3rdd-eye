package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0845Zg implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054df f12912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1649oh f12913b;

    public ViewOnAttachStateChangeListenerC0845Zg(C1649oh c1649oh, InterfaceC1054df interfaceC1054df) {
        this.f12912a = interfaceC1054df;
        this.f12913b = c1649oh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12913b.v(view, this.f12912a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
