package com.vungle.ads.internal.presenter;

import com.vungle.ads.k0;

/* compiled from: AdPlayCallback.kt */
/* loaded from: classes2.dex */
public interface b {
    void onAdClick(String str);

    void onAdEnd(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdRewarded(String str);

    void onAdStart(String str);

    void onFailure(k0 k0Var);
}
