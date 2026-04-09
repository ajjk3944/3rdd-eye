package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "", "<init>", "()V", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "billingInitializationListener", "Ly8/s;", MobileAdsBridgeBase.initializeMethodName, "(Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;)V", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "billingClientStateListener", "startConnection", "(Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;)V", "", "purchaseType", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "isFeatureSupported", "(Ljava/lang/String;)Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "", "isReady", "()Z", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "purchasesResponseListener", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "(Ljava/lang/String;Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "productType", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;)V", "getAdapterVersion", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/t0;", "_isInitialized", "Lkotlinx/coroutines/flow/t0;", "get_isInitialized$unity_ads_defaultRelease", "()Lkotlinx/coroutines/flow/t0;", "isInitialized", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BillingClientAdapter {

    @NotNull
    private final t0 _isInitialized = e1.a(Boolean.FALSE);

    @NotNull
    public abstract String getAdapterVersion();

    @NotNull
    /* renamed from: get_isInitialized$unity_ads_defaultRelease, reason: from getter */
    public final t0 get_isInitialized() {
        return this._isInitialized;
    }

    public abstract void initialize(@NotNull BillingInitializationListener billingInitializationListener);

    @Nullable
    public abstract BillingResultResponseCode isFeatureSupported(@Nullable String purchaseType);

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(@NotNull String productId, @NotNull String productType, @NotNull ProductDetailsListener listener);

    public abstract void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(@Nullable BillingClientStateListener billingClientStateListener);
}
