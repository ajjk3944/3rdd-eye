package com.unity3d.ads.core.domain.billing;

import c9.c;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import d9.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientAdapter", "", "productType", "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Ljava/lang/String;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "fetchProductDetails", "(Ljava/lang/String;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonProductDetailsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonProductDetailsFetcher.kt\ncom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,45:1\n314#2,11:46\n*S KotlinDebug\n*F\n+ 1 CommonProductDetailsFetcher.kt\ncom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher\n*L\n20#1:46,11\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final String productType;

    public CommonProductDetailsFetcher(@Nullable BillingClientAdapter billingClientAdapter, @NotNull String productType) {
        p.e(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    public Object fetchProductDetails(@NotNull String str, @NotNull c cVar) {
        final kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(@NotNull BillingResultBridge billingResult, @Nullable String str2) {
                p.e(billingResult, "billingResult");
                if (str2 != null && billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    o oVar = pVar;
                    Result.Companion companion = Result.INSTANCE;
                    oVar.resumeWith(Result.b(new ProductDetailsResult.Success(str2)));
                } else if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    o oVar2 = pVar;
                    Result.Companion companion2 = Result.INSTANCE;
                    oVar2.resumeWith(Result.b(ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    o oVar3 = pVar;
                    Result.Companion companion3 = Result.INSTANCE;
                    oVar3.resumeWith(Result.b(new ProductDetailsResult.Failure(billingResult)));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object objW = pVar.w();
        if (objW == a.f()) {
            e.c(cVar);
        }
        return objW;
    }
}
