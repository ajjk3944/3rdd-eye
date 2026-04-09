package com.bytedance.sdk.openadsdk.component.reward.ypw;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.msw;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class xq extends ypw {
    public xq(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar);
    }

    private void ypw(msw mswVar) {
        if (mswVar == null) {
            return;
        }
        Context context = mswVar.getContext();
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(1);
        mswVar.addView(bwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar.setId(vk.mkp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        bwVar.addView(xqVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar2.setId(vk.sup);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        xqVar.addView(xqVar2, layoutParams2);
        xqVar2.addView(ypw.emc(context));
        if (this.ypw.in() != 3 && this.ypw.in() != 5) {
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
            dgVar.setId(vk.jl);
            dgVar.setVisibility(8);
            dgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(vw.ypw(context, 28.0f), vw.ypw(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = vw.ypw(context, 20.0f);
            layoutParams3.bottomMargin = vw.ypw(context, 10.0f);
            xqVar.addView(dgVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar3 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar3.setId(vk.ylm);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        bwVar.addView(xqVar3, layoutParams4);
        xqVar3.addView(dg.emc(context, this.emc.ypw));
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar3, this.ypw);
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean bw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean dg() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void ycc() {
    }

    public static boolean emc(rie rieVar) {
        ul.xq(rieVar);
        return ul.xq(rieVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(msw mswVar) {
        ypw(mswVar);
    }
}
