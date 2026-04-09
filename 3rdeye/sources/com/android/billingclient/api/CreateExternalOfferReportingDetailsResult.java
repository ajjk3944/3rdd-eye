package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class CreateExternalOfferReportingDetailsResult {
    private final BillingResult zza;
    private final ExternalOfferReportingDetails zzb;

    public CreateExternalOfferReportingDetailsResult(@RecentlyNonNull BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = externalOfferReportingDetails;
    }

    @RecentlyNonNull
    public static /* synthetic */ CreateExternalOfferReportingDetailsResult copy$default(@RecentlyNonNull CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = createExternalOfferReportingDetailsResult.zza;
        }
        if ((i & 2) != 0) {
            externalOfferReportingDetails = createExternalOfferReportingDetailsResult.zzb;
        }
        return createExternalOfferReportingDetailsResult.copy(billingResult, externalOfferReportingDetails);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final ExternalOfferReportingDetails component2() {
        return this.zzb;
    }

    public final CreateExternalOfferReportingDetailsResult copy(@RecentlyNonNull BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        return new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateExternalOfferReportingDetailsResult)) {
            return false;
        }
        CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult = (CreateExternalOfferReportingDetailsResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, createExternalOfferReportingDetailsResult.zza) && kotlin.jvm.internal.l.b(this.zzb, createExternalOfferReportingDetailsResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.zzb;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        ExternalOfferReportingDetails externalOfferReportingDetails = this.zzb;
        return iHashCode + (externalOfferReportingDetails == null ? 0 : externalOfferReportingDetails.hashCode());
    }

    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.zza + ", externalOfferReportingDetails=" + this.zzb + ")";
    }
}
