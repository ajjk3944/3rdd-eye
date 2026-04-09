package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.uym;

/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends uym {
    @MainThread
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.uym
    @MainThread
    void onError(int i10, String str);
}
