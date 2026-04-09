package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements ra {
    com.bytedance.sdk.component.adexpress.le.fkw ouw;

    public lh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.fkw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fkwVar.getDynamicHeight(), fkwVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.ouw.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        AnimatorSet animatorSet = this.ouw.ouw;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        AnimatorSet animatorSet = this.ouw.ouw;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
