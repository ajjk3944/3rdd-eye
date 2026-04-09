package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class ConsumeResult {
    private final BillingResult zza;
    private final String zzb;

    public ConsumeResult(@RecentlyNonNull BillingResult billingResult, String str) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConsumeResult copy$default(@RecentlyNonNull ConsumeResult consumeResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = consumeResult.zza;
        }
        if ((i & 2) != 0) {
            str = consumeResult.zzb;
        }
        return consumeResult.copy(billingResult, str);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final String component2() {
        return this.zzb;
    }

    public final ConsumeResult copy(@RecentlyNonNull BillingResult billingResult, String str) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeResult)) {
            return false;
        }
        ConsumeResult consumeResult = (ConsumeResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, consumeResult.zza) && kotlin.jvm.internal.l.b(this.zzb, consumeResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final String getPurchaseToken() {
        return this.zzb;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConsumeResult(billingResult=");
        sb.append(this.zza);
        sb.append(", purchaseToken=");
        return B4.f.c(sb, this.zzb, ")");
    }
}
