package com.android.billingclient.api;

import N7.C1094a9;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class PurchaseHistoryResult {
    private final BillingResult zza;
    private final List zzb;

    public PurchaseHistoryResult(@RecentlyNonNull BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchaseHistoryResult copy$default(@RecentlyNonNull PurchaseHistoryResult purchaseHistoryResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = purchaseHistoryResult.zza;
        }
        if ((i & 2) != 0) {
            list = purchaseHistoryResult.zzb;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> component2() {
        return this.zzb;
    }

    public final PurchaseHistoryResult copy(@RecentlyNonNull BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, purchaseHistoryResult.zza) && kotlin.jvm.internal.l.b(this.zzb, purchaseHistoryResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.zzb;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        List list = this.zzb;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseHistoryResult(billingResult=");
        sb.append(this.zza);
        sb.append(", purchaseHistoryRecordList=");
        return C1094a9.h(sb, this.zzb, ")");
    }
}
