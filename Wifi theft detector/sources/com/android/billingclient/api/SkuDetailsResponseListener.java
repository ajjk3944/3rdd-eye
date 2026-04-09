package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public interface SkuDetailsResponseListener {
    void onSkuDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list);
}
