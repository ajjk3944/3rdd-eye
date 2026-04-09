package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements ra {
    private com.bytedance.sdk.component.adexpress.le.vt ouw;

    public ouw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        double d10 = leVar.jqy;
        d10 = d10 == 0.0d ? 1.0d : d10;
        double d11 = leVar.ex;
        int dynamicWidth = (int) (fkwVar.getDynamicWidth() * 0.32d * d10);
        int dynamicWidth2 = (int) (fkwVar.getDynamicWidth() * 0.32d * (d11 != 0.0d ? d11 : 1.0d));
        this.ouw = new com.bytedance.sdk.component.adexpress.le.vt(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, raVar.yu.zin - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, raVar.yu.vpp - 3);
        this.ouw.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.le.vt vtVar = this.ouw;
        vtVar.f7364lh = false;
        ObjectAnimator objectAnimator = vtVar.vt;
        if (objectAnimator == null || vtVar.ouw == null) {
            return;
        }
        objectAnimator.start();
        vtVar.ouw.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.vt vtVar = this.ouw;
        vtVar.f7364lh = true;
        ObjectAnimator objectAnimator = vtVar.vt;
        if (objectAnimator == null || vtVar.ouw == null) {
            return;
        }
        objectAnimator.cancel();
        vtVar.ouw.cancel();
    }
}
