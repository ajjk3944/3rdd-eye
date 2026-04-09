package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.uym;

/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends uym {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.uym
    void onError(int i, String str);
}
