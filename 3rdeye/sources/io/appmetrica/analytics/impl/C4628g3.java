package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4628g3 implements ProtobufConverter {
    public static C5088y2 a(BillingInfo billingInfo) {
        C5088y2 c5088y2 = new C5088y2();
        int i = AbstractC4602f3.f40835a[billingInfo.type.ordinal()];
        c5088y2.f42100a = i != 1 ? i != 2 ? 1 : 3 : 2;
        c5088y2.f42101b = billingInfo.productId;
        c5088y2.f42102c = billingInfo.purchaseToken;
        c5088y2.f42103d = billingInfo.purchaseTime;
        c5088y2.f42104e = billingInfo.sendTime;
        return c5088y2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5088y2 c5088y2 = (C5088y2) obj;
        int i = c5088y2.f42100a;
        return new BillingInfo(i != 2 ? i != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c5088y2.f42101b, c5088y2.f42102c, c5088y2.f42103d, c5088y2.f42104e);
    }
}
