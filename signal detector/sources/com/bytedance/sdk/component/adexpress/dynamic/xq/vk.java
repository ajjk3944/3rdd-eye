package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.ylm;

/* loaded from: classes.dex */
public class vk implements uym {
    private com.bytedance.sdk.component.adexpress.dynamic.dg.uym dg;
    private ylm emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw xq;
    private Context ypw;

    public vk(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this.ypw = context;
        this.xq = bwVar;
        this.dg = uymVar;
        dg();
    }

    private void dg() {
        this.emc = new ylm(this.ypw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, 120.0f));
        layoutParams.gravity = 17;
        this.emc.setLayoutParams(layoutParams);
        this.emc.setClipChildren(false);
        this.emc.setGuideText(this.dg.but());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar = this.xq;
        if (bwVar != null) {
            this.emc.setOnClickListener((View.OnClickListener) bwVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        ylm ylmVar = this.emc;
        if (ylmVar != null) {
            ylmVar.emc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public ViewGroup xq() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        ylm ylmVar = this.emc;
        if (ylmVar != null) {
            ylmVar.ypw();
        }
    }
}
