package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class k implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f38851a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a f38852b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38853c;

    /* renamed from: d, reason: collision with root package name */
    public final List f38854d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38855e;

    /* renamed from: f, reason: collision with root package name */
    public final n f38856f;

    public k(UtilsProvider utilsProvider, InterfaceC5480a interfaceC5480a, List list, List list2, d dVar, n nVar) {
        this.f38851a = utilsProvider;
        this.f38852b = interfaceC5480a;
        this.f38853c = list;
        this.f38854d = list2;
        this.f38855e = dVar;
        this.f38856f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f38851a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
