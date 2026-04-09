package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.bly.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends lh {
    ouw mwh;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    public fkw(Context context, vpp vppVar) {
        super(context);
        com.bytedance.sdk.openadsdk.core.bly.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.bly.fkw(context);
        com.bytedance.sdk.openadsdk.core.bly.yu.ouw();
        com.bytedance.sdk.openadsdk.core.bly.yu.vt(fkwVar);
        fkwVar.ouw(vppVar, new fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.bly.fkw.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void m_() {
                ouw ouwVar = fkw.this.mwh;
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void ouw(int i4) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final View ouw() {
                return fkw.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void n_() {
            }
        }, "open_ad");
        addView(fkwVar, new ViewGroup.LayoutParams(-1, -1));
        fkwVar.cf();
        int iOuw = osn.ouw(context, 9.0f);
        int iOuw2 = osn.ouw(context, 10.0f);
        this.yu = PAGLogoView.createPAGLogoViewByMaterial(context, vppVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams.leftMargin = iOuw2;
        layoutParams.bottomMargin = iOuw2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.yu, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.lh lhVar = new com.bytedance.sdk.openadsdk.core.widget.lh(context);
        this.ryl = lhVar;
        lhVar.setPadding(iOuw, 0, iOuw, 0);
        this.ryl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(osn.ouw(context, 32.0f), osn.ouw(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iOuw2, iOuw2);
        addView(this.ryl, layoutParams2);
        View view = this.pno;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.yu getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final rn getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mwh = null;
    }

    public final void setRenderListener(ouw ouwVar) {
        this.mwh = ouwVar;
    }
}
