package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm implements ra<com.bytedance.sdk.component.adexpress.le.cf> {
    private final com.bytedance.sdk.component.adexpress.le.cf ouw;

    public vm(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = new com.bytedance.sdk.component.adexpress.le.cf(context);
        this.ouw = cfVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, raVar.yu.xn <= 0 ? com.bytedance.sdk.component.adexpress.yu.vt() ? 0 : 120 : r2);
        cfVar.setLayoutParams(layoutParams);
        cfVar.setClipChildren(false);
        cfVar.setText(raVar.yu.vm);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.postDelayed(cfVar.getHaloAnimation(), 300L);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.ouw.cancel();
        }
    }
}
