package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1058aa implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1058aa(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07.canGoForward()) {
                this.A00.A07.goForward();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
