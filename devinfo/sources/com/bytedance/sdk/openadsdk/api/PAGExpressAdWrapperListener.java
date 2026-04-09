package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i4);

    void onRenderFail(View view, String str, int i4);

    void onRenderSuccess(View view, float f10, float f11);
}
