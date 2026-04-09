package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class H9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F9 fromModel(G9 g92) {
        F9 f92 = new F9();
        String str = g92.f39500a;
        if (str != null) {
            f92.f39434a = str.getBytes();
        }
        return f92;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G9 toModel(F9 f92) {
        return new G9(new String(f92.f39434a));
    }
}
