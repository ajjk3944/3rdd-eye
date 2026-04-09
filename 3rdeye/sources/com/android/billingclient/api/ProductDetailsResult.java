package com.android.billingclient.api;

import N7.C1094a9;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* loaded from: classes.dex */
public final class ProductDetailsResult {
    private final BillingResult zza;
    private final List zzb;

    public ProductDetailsResult(@RecentlyNonNull BillingResult billingResult, List<ProductDetails> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ ProductDetailsResult copy$default(@RecentlyNonNull ProductDetailsResult productDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = productDetailsResult.zza;
        }
        if ((i & 2) != 0) {
            list = productDetailsResult.zzb;
        }
        return productDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<ProductDetails> component2() {
        return this.zzb;
    }

    public final ProductDetailsResult copy(@RecentlyNonNull BillingResult billingResult, List<ProductDetails> list) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        return new ProductDetailsResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsResult)) {
            return false;
        }
        ProductDetailsResult productDetailsResult = (ProductDetailsResult) obj;
        return kotlin.jvm.internal.l.b(this.zza, productDetailsResult.zza) && kotlin.jvm.internal.l.b(this.zzb, productDetailsResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<ProductDetails> getProductDetailsList() {
        return this.zzb;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        List list = this.zzb;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsResult(billingResult=");
        sb.append(this.zza);
        sb.append(", productDetailsList=");
        return C1094a9.h(sb, this.zzb, ")");
    }
}
