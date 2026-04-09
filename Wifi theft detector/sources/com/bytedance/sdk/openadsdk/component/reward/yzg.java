package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes.dex */
class yzg implements TTClientBidding {
    private final ru emc;

    public yzg(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot) {
        this.emc = new ru(context, emcVar, adSlot);
    }

    public ru emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.emc.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.emc.win(d10);
    }

    public void ypw() {
        this.emc.emc();
    }
}
