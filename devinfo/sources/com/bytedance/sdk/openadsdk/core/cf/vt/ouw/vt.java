package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.content.Context;
import com.bytedance.adsdk.ugeno.yu;
import com.bytedance.adsdk.vt.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends le {

    /* renamed from: lh, reason: collision with root package name */
    yu f8167lh;

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.f8167lh;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.f8167lh;
        if (yuVar != null) {
            yuVar.ra();
        }
    }
}
