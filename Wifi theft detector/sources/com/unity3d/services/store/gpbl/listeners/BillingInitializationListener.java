package com.unity3d.services.store.gpbl.listeners;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseUpdatedResponseListener;", "Ly8/s;", "onIsAlreadyInitialized", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
