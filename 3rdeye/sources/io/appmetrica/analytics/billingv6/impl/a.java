package io.appmetrica.analytics.billingv6.impl;

import c9.C2092m;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f38815b;

    public a(b bVar, BillingResult billingResult) {
        this.f38814a = bVar;
        this.f38815b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f38814a;
        BillingResult billingResult = this.f38815b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f38820e.onUpdateFinished();
            return;
        }
        for (String str : C2092m.W("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f38816a;
            BillingClient billingClient = bVar.f38817b;
            UtilsProvider utilsProvider = bVar.f38818c;
            d dVar = bVar.f38819d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f38820e);
            dVar.f38825b.add(iVar);
            if (bVar.f38817b.isReady()) {
                bVar.f38817b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f38819d.a(iVar);
                bVar.f38820e.onUpdateFinished();
            }
        }
    }
}
