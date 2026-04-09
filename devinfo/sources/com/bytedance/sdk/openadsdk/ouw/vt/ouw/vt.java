package com.bytedance.sdk.openadsdk.ouw.vt.ouw;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh {
    public vt(Context context, vpp vppVar, AdSlot adSlot) {
        super(context, vppVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh
    public final void ouw() {
        th thVar = new th(((lh) this).ouw, this.f8616lh, ((lh) this).bly, this.f8614cf, false);
        this.tlj = thVar;
        this.vt.ouw(thVar.getVideoController());
        lh();
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw vt() {
        qbp qbpVar = this.tlj;
        if (qbpVar != null) {
            return ((th) qbpVar).getVideoModel();
        }
        return null;
    }
}
