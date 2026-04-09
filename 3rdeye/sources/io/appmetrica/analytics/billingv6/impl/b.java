package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes3.dex */
public final class b implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f38816a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f38817b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f38818c;

    /* renamed from: d, reason: collision with root package name */
    public final d f38819d;

    /* renamed from: e, reason: collision with root package name */
    public final n f38820e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f38816a = billingConfig;
        this.f38817b = billingClient;
        this.f38818c = billingLibraryMonitor$updateBilling$1;
        this.f38819d = dVar;
        this.f38820e = nVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f38818c.getWorkerExecutor().execute(new a(this, billingResult));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }
}
