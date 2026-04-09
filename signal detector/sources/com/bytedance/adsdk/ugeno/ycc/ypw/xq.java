package com.bytedance.adsdk.ugeno.ycc.ypw;

import android.view.View;
import com.bytedance.adsdk.ugeno.msw.xq;

/* loaded from: classes.dex */
public class xq implements xq.bw {
    final float emc = 0.8f;
    final float ypw = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.msw.xq.bw
    public void emc(View view, float f2) {
        float f5 = ((f2 < 0.0f ? 0.19999999f : -0.19999999f) * f2) + 1.0f;
        float f6 = (f2 * (f2 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f2 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f5);
        view.setScaleY(f5);
        view.setAlpha(Math.abs(f6));
    }
}
