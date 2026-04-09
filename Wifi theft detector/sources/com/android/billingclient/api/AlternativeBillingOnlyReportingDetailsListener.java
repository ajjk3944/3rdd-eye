package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@zzf
/* loaded from: classes.dex */
public interface AlternativeBillingOnlyReportingDetailsListener {
    void onAlternativeBillingOnlyTokenResponse(@NonNull BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails);
}
