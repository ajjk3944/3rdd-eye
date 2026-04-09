package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.sra;

/* loaded from: classes.dex */
public class dg extends aa<com.bytedance.sdk.component.adexpress.ycc.uym> {
    public dg(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        super(context, bwVar, uymVar);
        emc(uymVar);
    }

    private void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this.emc = new com.bytedance.sdk.component.adexpress.ycc.uym(this.ypw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, uymVar.pxa());
        this.emc.setLayoutParams(layoutParams);
        this.emc.setSlideText(this.dg.but());
        sra sraVar = this.emc;
        if (sraVar instanceof com.bytedance.sdk.component.adexpress.ycc.uym) {
            ((com.bytedance.sdk.component.adexpress.ycc.uym) sraVar).setButtonText(this.dg.ru());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.aa
    public void dg() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.aa, com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.ypw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.aa, com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.emc();
    }
}
