package com.bytedance.adsdk.ugeno.ycc.emc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class xq extends emc {
    public xq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.emc.emc
    public Drawable ypw(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
