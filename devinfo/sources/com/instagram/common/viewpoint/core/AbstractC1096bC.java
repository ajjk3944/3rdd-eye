package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1096bC {
    public static void A00(View view, boolean z3, View.OnClickListener onClickListener) {
        if (!z3) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z3) {
                return;
            }
            ViewOnClickListenerC1095bB viewOnClickListenerC1095bB = new ViewOnClickListenerC1095bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1095bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1094bA(viewOnClickListenerC1095bB));
        }
    }
}
