package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f38824a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f38825b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f38824a = billingClient;
    }

    public final void a(Object obj) {
        this.f38825b.remove(obj);
        if (this.f38825b.size() == 0) {
            this.f38824a.endConnection();
        }
    }
}
