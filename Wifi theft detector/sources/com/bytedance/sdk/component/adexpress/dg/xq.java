package com.bytedance.sdk.component.adexpress.dg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class xq {
    public static Drawable emc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        if (context == null || uymVar == null) {
            return null;
        }
        return emc(context, (int) uym.emc(context, uymVar.aa()), uymVar.vk(), uymVar.sf());
    }

    public static Drawable emc(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
