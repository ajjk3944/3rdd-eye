package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class sup {
    private boolean bw = false;
    private final emc dg;
    com.bytedance.sdk.openadsdk.component.reward.top.xq emc;
    private final Activity xq;
    private boolean ycc;
    com.bytedance.sdk.component.adexpress.dynamic.dg ypw;

    public sup(emc emcVar) {
        this.xq = emcVar.mxo;
        this.dg = emcVar;
    }

    public void bw(boolean z6) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setSkipEnable(z6);
    }

    public void dg(boolean z6) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setShowSkip(z6);
    }

    public void emc() {
        if (this.bw) {
            return;
        }
        this.bw = true;
        emc emcVar = this.dg;
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = emcVar.rig;
        if (xqVar != null) {
            this.emc = xqVar;
            this.ycc = true;
        } else {
            this.emc = (com.bytedance.sdk.openadsdk.component.reward.top.xq) emcVar.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.in);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar2 = this.emc;
        if (xqVar2 != null) {
            xqVar2.emc(this.dg.ypw);
            if (this.dg.ypw.ak()) {
                emc(false);
            } else {
                emc(this.dg.ypw.lr());
            }
        }
    }

    public void xq(boolean z6) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setShowSound(z6);
    }

    public void ypw(boolean z6) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.setSoundMute(z6);
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg dgVar = this.ypw;
        if (dgVar != null) {
            dgVar.setSoundMute(z6);
        }
    }

    public void bw() {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setSkipInvisiable();
    }

    public void dg() {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.clickSkip();
        }
    }

    public void xq() {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.showSkipButton();
    }

    public void ypw() {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.showCountDownText();
    }

    public void emc(boolean z6) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setShowDislike(z6);
    }

    public void emc(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setTime(String.valueOf(str), charSequence);
    }

    public void emc(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        if (this.ycc || (xqVar = this.emc) == null) {
            return;
        }
        xqVar.setSkipText(charSequence);
    }

    public void emc(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.clickSound(str);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.top.ypw ypwVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.setListener(ypwVar);
        }
    }

    public void emc(com.bytedance.sdk.component.adexpress.dynamic.dg dgVar) {
        this.ypw = dgVar;
    }

    public void emc(int i) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.emc;
        if (xqVar == null || xqVar.getITopLayout() == null || i == 0 || (viewFindViewById = this.emc.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (viewFindViewById.getWidth() + iArr[0]);
        if (width < vw.ypw(this.xq, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (vw.ypw(this.xq, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
            viewFindViewById.requestLayout();
        }
    }
}
