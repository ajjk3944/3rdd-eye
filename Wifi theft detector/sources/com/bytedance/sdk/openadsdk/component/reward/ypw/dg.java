package com.bytedance.sdk.openadsdk.component.reward.ypw;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.gbl;
import com.bytedance.sdk.openadsdk.component.reward.view.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.utils.qh;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class dg extends ypw {
    public dg(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar);
    }

    public static boolean emc(rie rieVar) {
        return ul.ypw(rieVar) || ul.dg(rieVar) || ul.uym(rieVar);
    }

    private static ImageView xq(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setScaleType(ImageView.ScaleType.FIT_XY);
        dgVar.setImageResource(com.bytedance.sdk.component.utils.rie.dg(context, "tt_up_slide"));
        dgVar.setId(vk.hxp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(vw.ypw(context, 18.0f), vw.ypw(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = vw.ypw(context, 45.0f);
        dgVar.setLayoutParams(layoutParams);
        return dgVar;
    }

    private static LinearLayout ypw(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setId(vk.rie);
        bwVar.setOrientation(1);
        bwVar.setVisibility(8);
        bwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return bwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean bw() {
        if (ul.ypw(this.emc.ypw)) {
            return true;
        }
        return (ul.dg(this.emc.ypw) || ul.uym(this.emc.ypw)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean dg() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void gbl() {
        gbl gblVar;
        ul ulVar;
        if (ul.ypw(this.emc.ypw) && (gblVar = this.emc.mkp) != null && (ulVar = gblVar.cf) != null) {
            if (ulVar.dg()) {
                this.emc.mkp.ypw(0);
                this.emc.sz.set(true);
            } else {
                this.emc.qh.set(true);
                emc(true, false, true, 80);
            }
        }
        if (ul.dg(this.emc.ypw) || ul.uym(this.emc.ypw)) {
            emc(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public RFEndCardBackUpLayout uym() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void ycc() {
    }

    public static void emc(rie rieVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        if (ul.ypw(rieVar)) {
            emc(frameLayout, rieVar);
        } else if (ul.dg(rieVar) || ul.uym(rieVar)) {
            ypw(frameLayout, rieVar);
        } else {
            ypw.emc(frameLayout, emcVar);
        }
    }

    public static void ypw(FrameLayout frameLayout, rie rieVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar.setId(vk.ylm);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = vw.ypw(aa.emc(), 58.0f);
        frameLayout.addView(xqVar, layoutParams);
        xqVar.addView(emc(context, rieVar));
        LinearLayout linearLayoutYpw = ypw(context);
        linearLayoutYpw.setBackgroundColor(Color.parseColor("#99161823"));
        xqVar.addView(linearLayoutYpw);
        linearLayoutYpw.addView(xq(context));
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar2.setId(vk.mkp);
        frameLayout.addView(xqVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar3 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar3.setId(vk.sup);
        xqVar2.addView(xqVar3, new FrameLayout.LayoutParams(-1, -1));
        xqVar3.addView(ypw.emc(context));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar4 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar4.setId(vk.yzg);
        xqVar4.setVisibility(8);
        xqVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        xqVar3.addView(xqVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(vk.ul);
        dgVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        xqVar4.addView(dgVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar2);
    }

    public static void emc(FrameLayout frameLayout, rie rieVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(1);
        frameLayout.addView(bwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar.setId(vk.mkp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        bwVar.addView(xqVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar2.setId(vk.sup);
        xqVar.addView(xqVar2, new FrameLayout.LayoutParams(-1, -1));
        xqVar2.addView(ypw.emc(context));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar3 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar3.setId(vk.yzg);
        xqVar3.setVisibility(8);
        xqVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        xqVar2.addView(xqVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(vk.ul);
        dgVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        xqVar3.addView(dgVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar4 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar4.setId(vk.ylm);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        bwVar.addView(xqVar4, layoutParams3);
        xqVar4.addView(emc(context, rieVar));
        LinearLayout linearLayoutYpw = ypw(context);
        linearLayoutYpw.setBackgroundColor(Color.parseColor("#70161823"));
        xqVar4.addView(linearLayoutYpw);
        linearLayoutYpw.addView(xq(context));
        com.bytedance.sdk.openadsdk.component.reward.view.bw.emc(xqVar4, rieVar);
    }

    public static com.bytedance.sdk.component.zz.ycc emc(Context context, rie rieVar) {
        com.bytedance.sdk.component.zz.ycc yccVarYpw = com.bytedance.sdk.openadsdk.qh.emc.emc().ypw(rieVar);
        if (yccVarYpw != null) {
            yccVarYpw.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) yccVarYpw.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(yccVarYpw);
            }
        } else {
            yccVarYpw = new com.bytedance.sdk.component.zz.ycc(context, true, ycc.xq.LANDING_PAGE_LOADING);
            yccVarYpw.setLayerType(2, null);
        }
        vw.emc((View) yccVarYpw, 0);
        yccVarYpw.setId(vk.sra);
        yccVarYpw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return yccVarYpw;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(msw mswVar) {
        emc(this.ypw, mswVar, this.emc);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        qh qhVar;
        if (!ul.dg(this.emc.ypw) || this.emc.ypw.wpn() || (qhVar = (emcVar = this.emc).nw) == null) {
            return;
        }
        qhVar.emc(emcVar.ypw.hxp().ypw() * 1000);
    }
}
