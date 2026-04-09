package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC1431aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C1432aW A00;

    public ViewOnAttachStateChangeListenerC1431aV(C1432aW c1432aW) {
        this.A00 = c1432aW;
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
