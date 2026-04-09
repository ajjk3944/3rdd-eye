package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class msw extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;

    public msw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar.vw);
        this.emc = emcVar;
        if (emcVar.pe != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutUym;
        ypwVar.emc(this);
        if (this.emc.emc != 1 && (rFEndCardBackUpLayoutUym = ypwVar.uym()) != null) {
            addView(rFEndCardBackUpLayoutUym, new FrameLayout.LayoutParams(-1, -1));
        }
        emc(ypwVar.msw(), this);
        emc(ypwVar.zz(), this);
    }

    private void emc(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
