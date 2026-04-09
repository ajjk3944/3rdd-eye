package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class sz implements uym {
    private com.bytedance.sdk.component.adexpress.ycc.cf emc;

    public sz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this.emc = new com.bytedance.sdk.component.adexpress.ycc.cf(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bwVar.getDynamicHeight(), bwVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.emc.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ycc.cf xq() {
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
