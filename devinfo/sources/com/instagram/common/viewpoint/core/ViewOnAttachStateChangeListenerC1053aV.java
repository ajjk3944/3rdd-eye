package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC1053aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C1054aW A00;

    public ViewOnAttachStateChangeListenerC1053aV(C1054aW c1054aW) {
        this.A00 = c1054aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A00.A09();
        this.A00.A03.setOnClickListener(null);
    }
}
