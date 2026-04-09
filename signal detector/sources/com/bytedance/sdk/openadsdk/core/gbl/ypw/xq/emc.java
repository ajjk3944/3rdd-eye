package com.bytedance.sdk.openadsdk.core.gbl.ypw.xq;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.zz.ypw.emc {
    private final com.bytedance.adsdk.ugeno.zz.ypw.emc emc;

    public emc(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.zz.ypw.emc emcVar = new com.bytedance.adsdk.ugeno.zz.ypw.emc(context);
        this.emc = emcVar;
        addView(emcVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.zz.ypw.emc getPlayableView() {
        return this.emc;
    }
}
