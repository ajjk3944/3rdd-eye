package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class sba implements uym<com.bytedance.sdk.component.adexpress.ycc.gbl> {
    private final com.bytedance.sdk.component.adexpress.ycc.gbl emc;

    public sba(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        com.bytedance.sdk.component.adexpress.ycc.gbl gblVar = new com.bytedance.sdk.component.adexpress.ycc.gbl(context);
        this.emc = gblVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, uymVar.pxa() > 0 ? uymVar.pxa() : com.bytedance.sdk.component.adexpress.dg.ypw() ? 0 : 120);
        gblVar.setLayoutParams(layoutParams);
        gblVar.setClipChildren(false);
        gblVar.setText(uymVar.but());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ycc.gbl xq() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        com.bytedance.sdk.component.adexpress.ycc.gbl gblVar = this.emc;
        if (gblVar != null) {
            gblVar.emc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        com.bytedance.sdk.component.adexpress.ycc.gbl gblVar = this.emc;
        if (gblVar != null) {
            gblVar.ypw();
        }
    }
}
