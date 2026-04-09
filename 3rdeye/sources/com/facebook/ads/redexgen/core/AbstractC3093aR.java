package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3093aR {
    public static final int A00 = XP.A00();

    public static void A00(C3272dL c3272dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c3272dL).A07(str);
        View view = new View(c3272dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c3272dL);
        viewGroup.addView(view, 0);
    }
}
