package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class jg implements TTClientBidding {
    final pno ouw;

    public jg(Context context, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot) {
        this.ouw = new pno(context, ouwVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void loss(Double d10, String str, String str2) {
        this.ouw.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void win(Double d10) {
        this.ouw.win(d10);
    }
}
