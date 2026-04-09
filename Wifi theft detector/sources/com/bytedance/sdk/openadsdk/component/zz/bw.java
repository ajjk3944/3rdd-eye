package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.core.zz.bw;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class bw extends xq {
    emc sz;

    public interface emc {
        void emc(View view, int i10);
    }

    public bw(Context context, rie rieVar) {
        super(context);
        emc(context, rieVar);
    }

    private void emc(Context context, rie rieVar) {
        com.bytedance.sdk.openadsdk.core.zz.bw bwVar = new com.bytedance.sdk.openadsdk.core.zz.bw(context);
        com.bytedance.sdk.openadsdk.core.zz.dg.emc().xq(bwVar);
        bwVar.emc(rieVar, new bw.ypw() { // from class: com.bytedance.sdk.openadsdk.component.zz.bw.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
            public void emc(int i10, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
            public void ypw() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
            public View emc() {
                return bw.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
            public void emc(View view, int i10) {
                emc emcVar = bw.this.sz;
                if (emcVar != null) {
                    emcVar.emc(view, i10);
                }
            }
        }, "open_ad");
        addView(bwVar, new ViewGroup.LayoutParams(-1, -1));
        bwVar.ul();
        int iYpw = vw.ypw(context, 9.0f);
        int iYpw2 = vw.ypw(context, 10.0f);
        this.dg = PAGLogoView.createPAGLogoViewByMaterial(context, rieVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams.leftMargin = iYpw2;
        layoutParams.bottomMargin = iYpw2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.dg, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.xq xqVar = new com.bytedance.sdk.openadsdk.core.widget.xq(context);
        this.sup = xqVar;
        xqVar.setPadding(iYpw, 0, iYpw, 0);
        this.sup.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(vw.ypw(context, 32.0f), vw.ypw(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iYpw2, iYpw2);
        addView(this.sup, layoutParams2);
        View view = this.msw;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.dg getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.msw getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public vk getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.sz = null;
    }

    public void setRenderListener(emc emcVar) {
        this.sz = emcVar;
    }
}
