package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class emc implements uym {
    private com.bytedance.sdk.component.adexpress.ycc.ypw emc;

    public emc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        double dNw = uymVar.nw();
        dNw = dNw == 0.0d ? 1.0d : dNw;
        double dWbn = uymVar.wbn();
        int dynamicWidth = (int) (bwVar.getDynamicWidth() * 0.32d * dNw);
        int dynamicWidth2 = (int) (bwVar.getDynamicWidth() * 0.32d * (dWbn != 0.0d ? dWbn : 1.0d));
        this.emc = new com.bytedance.sdk.component.adexpress.ycc.ypw(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, uymVar.cn() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, uymVar.fu() - 3);
        this.emc.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.emc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public ViewGroup xq() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.ypw();
    }
}
