package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Fm implements ProtobufConverter {
    public final C4983tm a(Em em) {
        C4983tm c4983tm = new C4983tm();
        c4983tm.f41700a = em.f39385a;
        return c4983tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C4983tm c4983tm = new C4983tm();
        c4983tm.f41700a = ((Em) obj).f39385a;
        return c4983tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Em(((C4983tm) obj).f41700a);
    }

    public final Em a(C4983tm c4983tm) {
        return new Em(c4983tm.f41700a);
    }
}
