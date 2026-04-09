package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly extends com.bytedance.sdk.openadsdk.core.le.lh {
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;

    public bly(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar.hun);
        this.ouw = ouwVar;
        if (ouwVar.f7959gh != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutPno;
        vtVar.ouw(this);
        if (this.ouw.ouw != 1 && (rFEndCardBackUpLayoutPno = vtVar.pno()) != null) {
            addView(rFEndCardBackUpLayoutPno, new FrameLayout.LayoutParams(-1, -1));
        }
        ouw(vtVar.bly(), this);
        ouw(vtVar.tlj(), this);
    }

    private static void ouw(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
