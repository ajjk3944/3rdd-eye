package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class V9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4854om fromModel(U9 u92) {
        C4854om c4854om = new C4854om();
        if (u92 != null) {
            c4854om.f41395a = u92.f40231a;
        }
        return c4854om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new U9(((C4854om) obj).f41395a);
    }

    public final U9 a(C4854om c4854om) {
        return new U9(c4854om.f41395a);
    }
}
