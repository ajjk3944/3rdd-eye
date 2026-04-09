package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements ra {
    private com.bytedance.sdk.component.adexpress.le.lh ouw;

    public vt(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.lh(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f));
        layoutParams.gravity = 17;
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setGuideText(raVar.yu.vm);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.vt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.vt.cancel();
    }
}
