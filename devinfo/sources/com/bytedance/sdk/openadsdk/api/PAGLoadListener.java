package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends ra {
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.ra
    void onError(int i4, String str);
}
