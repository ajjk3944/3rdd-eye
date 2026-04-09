package com.unity3d.ads.core.domain.billing;

import com.android.billingclient.api.BillingClient;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "", "()V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object objB;
        try {
            objB = Result.b(BillingClient.class);
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(c.a(th));
        }
        return Result.h(objB);
    }
}
