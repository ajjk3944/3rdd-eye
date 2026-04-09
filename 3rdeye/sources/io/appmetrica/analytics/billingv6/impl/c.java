package io.appmetrica.analytics.billingv6.impl;

import c9.C2097r;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f38821a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38822b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f38823c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f38821a = billingInfoStorage;
        this.f38822b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f38823c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f38823c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f38822b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f38822b) {
            return;
        }
        this.f38822b = true;
        this.f38821a.saveInfo(C2097r.G0(this.f38823c.values()), this.f38822b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f38823c.put(billingInfo.productId, billingInfo);
        }
        this.f38821a.saveInfo(C2097r.G0(this.f38823c.values()), this.f38822b);
    }
}
