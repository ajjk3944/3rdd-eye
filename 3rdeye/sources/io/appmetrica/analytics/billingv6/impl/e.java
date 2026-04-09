package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f38826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f38827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38828c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f38826a = fVar;
        this.f38827b = billingResult;
        this.f38828c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f38826a;
        BillingResult billingResult = this.f38827b;
        List list = this.f38828c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f38835g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f38831c;
            InterfaceC5480a interfaceC5480a = fVar.f38832d;
            List list2 = fVar.f38833e;
            d dVar = fVar.f38834f;
            k kVar = new k(utilsProvider, interfaceC5480a, list2, list, dVar, fVar.f38835g);
            dVar.f38825b.add(kVar);
            if (fVar.f38830b.isReady()) {
                fVar.f38830b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f38829a).build(), kVar);
            } else {
                fVar.f38834f.a(kVar);
                fVar.f38835g.onUpdateFinished();
            }
        }
        f fVar2 = this.f38826a;
        fVar2.f38834f.a(fVar2);
    }
}
