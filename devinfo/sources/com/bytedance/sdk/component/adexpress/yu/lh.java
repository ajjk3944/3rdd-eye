package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static Drawable ouw(Context context, int i4, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i4, i10);
        }
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }

    public static Drawable ouw(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        if (context == null || raVar == null) {
            return null;
        }
        return ouw(context, (int) ra.ouw(context, raVar.yu.vt), raVar.cf(), raVar.mwh());
    }
}
