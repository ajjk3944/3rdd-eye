package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4988u2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4776lm fromModel(BillingConfig billingConfig) {
        C4776lm c4776lm = new C4776lm();
        c4776lm.f41215a = billingConfig.sendFrequencySeconds;
        c4776lm.f41216b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c4776lm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4776lm c4776lm = (C4776lm) obj;
        return new BillingConfig(c4776lm.f41215a, c4776lm.f41216b);
    }

    public final BillingConfig a(C4776lm c4776lm) {
        return new BillingConfig(c4776lm.f41215a, c4776lm.f41216b);
    }
}
