package com.android.billingclient.api;

import N7.C1094a9;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class SkuDetailsResult {
    private final BillingResult zza;
    private final List zzb;

    public SkuDetailsResult(@RecentlyNonNull BillingResult billingResult, List<? extends SkuDetails> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ SkuDetailsResult copy$default(@RecentlyNonNull SkuDetailsResult skuDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = skuDetailsResult.zza;
        }
        if ((i & 2) != 0) {
            list = skuDetailsResult.zzb;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<SkuDetails> component2() {
        return this.zzb;
    }

    public final SkuDetailsResult copy(@RecentlyNonNull BillingResult billingResult, List<? extends SkuDetails> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, skuDetailsResult.zza) && kotlin.jvm.internal.l.b(this.zzb, skuDetailsResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<SkuDetails> getSkuDetailsList() {
        return this.zzb;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        List list = this.zzb;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SkuDetailsResult(billingResult=");
        sb.append(this.zza);
        sb.append(", skuDetailsList=");
        return C1094a9.h(sb, this.zzb, ")");
    }
}
