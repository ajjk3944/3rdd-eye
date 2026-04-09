package com.android.billingclient.api;

import N7.C1094a9;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class PurchasesResult {
    private final BillingResult zza;
    private final List zzb;

    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        kotlin.jvm.internal.l.f(purchasesList, "purchasesList");
        this.zza = billingResult;
        this.zzb = purchasesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = purchasesResult.zza;
        }
        if ((i & 2) != 0) {
            list = purchasesResult.zzb;
        }
        return purchasesResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    public final List<Purchase> component2() {
        return this.zzb;
    }

    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        kotlin.jvm.internal.l.f(purchasesList, "purchasesList");
        return new PurchasesResult(billingResult, purchasesList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, purchasesResult.zza) && kotlin.jvm.internal.l.b(this.zzb, purchasesResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    public final List<Purchase> getPurchasesList() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResult(billingResult=");
        sb.append(this.zza);
        sb.append(", purchasesList=");
        return C1094a9.h(sb, this.zzb, ")");
    }
}
