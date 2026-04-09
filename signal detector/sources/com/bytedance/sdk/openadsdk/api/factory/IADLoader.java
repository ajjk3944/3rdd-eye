package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.uym;

/* loaded from: classes.dex */
public interface IADLoader<R extends PAGRequest, L extends uym> {
    void loadAd(String str, R r6, L l2);
}
