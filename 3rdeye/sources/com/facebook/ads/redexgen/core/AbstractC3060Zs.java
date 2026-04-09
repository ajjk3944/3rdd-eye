package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3060Zs {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC3059Zr viewOnClickListenerC3059Zr = new ViewOnClickListenerC3059Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC3059Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC3058Zq(viewOnClickListenerC3059Zr));
        }
    }
}
