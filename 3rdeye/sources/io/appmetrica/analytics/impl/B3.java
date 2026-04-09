package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class B3 implements ProtobufConverter {
    public final C4802mm a(C5114z3 c5114z3) {
        C4802mm c4802mm = new C4802mm();
        c4802mm.f41272a = c5114z3.f42161a;
        return c4802mm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C4802mm c4802mm = new C4802mm();
        c4802mm.f41272a = ((C5114z3) obj).f42161a;
        return c4802mm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5114z3(((C4802mm) obj).f41272a);
    }

    public final C5114z3 a(C4802mm c4802mm) {
        return new C5114z3(c4802mm.f41272a);
    }
}
