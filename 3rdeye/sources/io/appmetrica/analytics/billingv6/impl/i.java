package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes3.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f38842a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f38843b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f38844c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38845d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38846e;

    /* renamed from: f, reason: collision with root package name */
    public final n f38847f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f38842a = billingConfig;
        this.f38843b = billingClient;
        this.f38844c = utilsProvider;
        this.f38845d = str;
        this.f38846e = dVar;
        this.f38847f = nVar;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f38844c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
