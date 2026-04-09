package com.bytedance.adsdk.ugeno.ycc.ypw;

import android.view.View;
import com.bytedance.adsdk.ugeno.msw.xq;

/* loaded from: classes.dex */
public class ypw implements xq.bw {
    @Override // com.bytedance.adsdk.ugeno.msw.xq.bw
    public void emc(View view, float f2) {
        int width = view.getWidth();
        if (f2 < -1.0f || f2 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f2 < 0.0f) {
            view.setTranslationX((-width) * f2);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f2);
        }
        view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f2)));
    }
}
