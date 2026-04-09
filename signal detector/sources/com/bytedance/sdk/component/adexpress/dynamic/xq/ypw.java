package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ypw implements uym {
    private com.bytedance.sdk.component.adexpress.ycc.xq emc;

    public ypw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this.emc = new com.bytedance.sdk.component.adexpress.ycc.xq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 180.0f));
        layoutParams.gravity = 17;
        this.emc.setLayoutParams(layoutParams);
        this.emc.setGuideText(uymVar.but());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ycc.xq xq() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.emc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.ypw();
    }
}
