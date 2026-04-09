package com.bytedance.adsdk.ugeno.ycc.ypw;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.msw.xq;

/* loaded from: classes.dex */
public class dg implements xq.bw {
    private String emc;

    public void emc(String str) {
        this.emc = str;
    }

    @Override // com.bytedance.adsdk.ugeno.msw.xq.bw
    public void emc(View view, float f2) {
        if (f2 < -1.0f || f2 > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f2));
            view.setTranslationY(view.getHeight() * f2);
        }
        if (TextUtils.equals(this.emc, "cube")) {
            float height = f2 < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f2 * (-90.0f));
        }
    }
}
