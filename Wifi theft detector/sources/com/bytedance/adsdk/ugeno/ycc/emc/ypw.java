package com.bytedance.adsdk.ugeno.ycc.emc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class ypw extends emc {
    public ypw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.emc.emc
    public Drawable ypw(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
