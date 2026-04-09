package com.bytedance.adsdk.ugeno.ycc.ypw;

import android.view.View;
import com.bytedance.adsdk.ugeno.msw.xq;

/* loaded from: classes.dex */
public class emc implements xq.bw {
    @Override // com.bytedance.adsdk.ugeno.msw.xq.bw
    public void emc(View view, float f2) {
        view.setPivotX(f2 < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f2 * 90.0f);
    }
}
