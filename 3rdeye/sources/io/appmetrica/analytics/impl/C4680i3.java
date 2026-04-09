package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4680i3 implements BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4688ib f41033a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f41034b;

    public C4680i3(InterfaceC4688ib interfaceC4688ib) {
        this(interfaceC4688ib, Ga.j().w().e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f41034b.execute(new C4654h3(this, it.next()));
        }
    }

    public C4680i3(InterfaceC4688ib interfaceC4688ib, ICommonExecutor iCommonExecutor) {
        this.f41033a = interfaceC4688ib;
        this.f41034b = iCommonExecutor;
    }
}
