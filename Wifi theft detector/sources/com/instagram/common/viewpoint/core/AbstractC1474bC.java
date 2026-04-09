package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1474bC {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC1473bB viewOnClickListenerC1473bB = new ViewOnClickListenerC1473bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1473bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1472bA(viewOnClickListenerC1473bB));
        }
    }
}
