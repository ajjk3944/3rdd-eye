package com.bytedance.sdk.openadsdk.core.cf.vt.vt;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.bly.vt.ouw {
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw vt;

    public ouw(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.vt = ouwVar;
        addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public final com.bytedance.adsdk.ugeno.bly.vt.ouw getPlayableView() {
        return this.vt;
    }
}
