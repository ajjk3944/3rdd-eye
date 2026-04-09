package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class y7 {
    public static RelativeLayout.LayoutParams a(Context context, vy1 vy1Var) {
        RelativeLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.l.f(context, "context");
        if (vy1Var != null) {
            layoutParams = new RelativeLayout.LayoutParams(jh2.a(context, vy1Var.c(context)), jh2.a(context, vy1Var.a(context)));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    public static final RelativeLayout.LayoutParams a(Context context, jd0 anchorView) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(anchorView, "anchorView");
        int iA = jh2.a(context, 25.0f);
        int iA2 = jh2.a(context, 64.0f);
        int i = iA2 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
        layoutParams.addRule(7, anchorView.getId());
        layoutParams.addRule(6, anchorView.getId());
        ViewGroup.LayoutParams layoutParams2 = anchorView.getLayoutParams();
        int i10 = layoutParams2.width;
        boolean z10 = true;
        boolean z11 = i10 == -1 || i10 + iA >= context.getResources().getDisplayMetrics().widthPixels;
        int i11 = layoutParams2.height;
        if (i11 != -1 && i11 + iA < jh2.c(context)) {
            z10 = false;
        }
        int i12 = (iA >> 1) - ((iA2 - iA) / 2);
        if (!z11 && !z10) {
            i12 = -i;
        }
        layoutParams.setMargins(0, i12, i12, 0);
        return layoutParams;
    }

    public static final RelativeLayout.LayoutParams a(Context context, a8<?> a8Var) {
        RelativeLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.l.f(context, "context");
        if (a8Var != null) {
            layoutParams = new RelativeLayout.LayoutParams(jh2.a(context, a8Var.r()), jh2.a(context, a8Var.c()));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }
}
