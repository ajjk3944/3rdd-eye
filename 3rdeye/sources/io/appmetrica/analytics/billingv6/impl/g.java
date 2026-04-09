package io.appmetrica.analytics.billingv6.impl;

import c9.C2092m;
import c9.C2097r;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f38836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f38837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38838c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f38836a = iVar;
        this.f38837b = billingResult;
        this.f38838c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f38836a;
        BillingResult billingResult = this.f38837b;
        List<PurchaseHistoryRecord> list = this.f38838c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f38847f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f38845d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.l.b(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.l.b(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f38844c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f38842a, linkedHashMap, iVar.f38844c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f38845d, iVar.f38844c.getBillingInfoManager());
                iVar.f38847f.onUpdateFinished();
            } else {
                List listG0 = C2097r.G0(billingInfoToUpdate.keySet());
                n nVar = iVar.f38847f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f38845d;
                BillingClient billingClient = iVar.f38843b;
                UtilsProvider utilsProvider = iVar.f38844c;
                d dVar = iVar.f38846e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f38825b.add(fVar);
                if (iVar.f38843b.isReady()) {
                    BillingClient billingClient2 = iVar.f38843b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(C2092m.T(listG0, 10));
                    Iterator it = listG0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f38845d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f38846e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f38836a;
        iVar2.f38846e.a(iVar2);
    }
}
