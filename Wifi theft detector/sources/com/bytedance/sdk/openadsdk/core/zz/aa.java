package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class aa extends emc {
    private FrameLayout emc;
    private ul sup;
    private FrameLayout sz;

    public aa(@NonNull Context context) {
        super(context);
        this.ypw = context;
    }

    private void xq() {
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this.ypw);
        this.emc = xqVar;
        addView(xqVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(this.ypw);
        this.sz = xqVar2;
        this.emc.addView(xqVar2, new FrameLayout.LayoutParams(-1, -1));
        this.sz.removeAllViews();
    }

    private void ypw() {
        this.uym = vw.ypw(this.ypw, this.sup.getExpectExpressWidth());
        this.msw = vw.ypw(this.ypw, this.sup.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.uym, this.msw);
        }
        layoutParams.width = this.uym;
        layoutParams.height = this.msw;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.xq.pxj();
        xq();
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, ul ulVar, ViewGroup viewGroup) {
        if (rieVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.xq = rieVar;
        this.sup = ulVar;
        if (rieVar.mfx() == 7) {
            this.ycc = "rewarded_video";
        } else {
            this.ycc = "fullscreen_interstitial_ad";
        }
        ypw();
        if (com.bytedance.sdk.openadsdk.core.model.ul.xq(rieVar)) {
            this.sup.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.sup.addView(this, layoutParams);
        }
        int i10 = com.bytedance.sdk.openadsdk.utils.vk.un;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i10);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(str, viewFindViewById);
            }
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.emc;
    }

    public FrameLayout getVideoContainer() {
        return this.sz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc(View view, int i10, com.bytedance.sdk.openadsdk.core.model.vk vkVar) {
        ul ulVar = this.sup;
        if (ulVar != null) {
            ulVar.emc(view, i10, vkVar);
        }
    }
}
