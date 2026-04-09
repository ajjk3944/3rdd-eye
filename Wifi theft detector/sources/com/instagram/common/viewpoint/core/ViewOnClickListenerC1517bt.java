package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1517bt implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1012Kr A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC1517bt(ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr, String str) {
        this.A00 = viewOnClickListenerC1012Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
