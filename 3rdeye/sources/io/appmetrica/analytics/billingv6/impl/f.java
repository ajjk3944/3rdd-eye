package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class f implements ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f38829a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f38830b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f38831c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5480a f38832d;

    /* renamed from: e, reason: collision with root package name */
    public final List f38833e;

    /* renamed from: f, reason: collision with root package name */
    public final d f38834f;

    /* renamed from: g, reason: collision with root package name */
    public final n f38835g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f38829a = str;
        this.f38830b = billingClient;
        this.f38831c = utilsProvider;
        this.f38832d = hVar;
        this.f38833e = list;
        this.f38834f = dVar;
        this.f38835g = nVar;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f38831c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
