package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.sra;
import com.bytedance.sdk.component.adexpress.ycc.ul;
import com.bytedance.sdk.component.adexpress.ycc.yzg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends aa<com.bytedance.sdk.component.adexpress.ycc.ycc> {
    public ycc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, int i, int i3, int i6, JSONObject jSONObject) {
        super(context, bwVar, uymVar);
        this.ypw = context;
        this.dg = uymVar;
        this.xq = bwVar;
        emc(i, i3, i6, jSONObject, uymVar);
    }

    private void emc(int i, int i3, int i6, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this.emc = new com.bytedance.sdk.component.adexpress.ycc.ycc(this.ypw, i, i3, i6, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, uymVar.pxa() > 0 ? uymVar.pxa() : com.bytedance.sdk.component.adexpress.dg.ypw() ? 0 : 120);
        this.emc.setLayoutParams(layoutParams);
        this.emc.setClipChildren(false);
        this.emc.setSlideText(this.dg.but());
        sra sraVar = this.emc;
        if (sraVar instanceof com.bytedance.sdk.component.adexpress.ycc.ycc) {
            ((com.bytedance.sdk.component.adexpress.ycc.ycc) sraVar).setShakeText(this.dg.ffd());
            final ul shakeView = ((com.bytedance.sdk.component.adexpress.ycc.ycc) this.emc).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new yzg.emc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.ycc.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.xq.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.aa
    public void dg() {
    }
}
