package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.component.adexpress.dynamic.emc.emc {
    private final Runnable dg;
    private final com.bytedance.sdk.component.adexpress.ypw.sz emc;
    private final com.bytedance.sdk.component.msw.msw xq;
    private com.bytedance.sdk.component.adexpress.ypw.uym ypw;

    public ycc(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z6, com.bytedance.sdk.component.adexpress.dynamic.bw.msw mswVar, com.bytedance.sdk.component.adexpress.ypw.sz szVar, com.bytedance.sdk.component.adexpress.dynamic.ycc.emc emcVar) {
        super(context, themeStatusBroadcastReceiver, z6, mswVar, szVar, emcVar);
        this.xq = new com.bytedance.sdk.component.msw.msw("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.zz.ycc.1
            @Override // java.lang.Runnable
            public void run() {
                ycc.this.emc.xq();
                com.bytedance.sdk.openadsdk.core.qh.xq().post(ycc.this.dg);
            }
        };
        this.dg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ycc.2
            @Override // java.lang.Runnable
            public void run() {
                if (ycc.this.ypw != null) {
                    ycc yccVar = ycc.this;
                    ycc.super.emc(yccVar.ypw);
                }
            }
        };
        this.emc = szVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.emc.emc
    public void ypw() {
        super.ypw();
        com.bytedance.sdk.openadsdk.core.qh.xq().removeCallbacks(this.dg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.emc.emc, com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) {
        this.ypw = uymVar;
        iyl.ypw(this.xq);
    }
}
