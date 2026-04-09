package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Ke implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4931rm fromModel(Je je) {
        C4931rm c4931rm = new C4931rm();
        c4931rm.f41591a = je.f39690a;
        c4931rm.f41592b = je.f39691b;
        return c4931rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4931rm c4931rm = (C4931rm) obj;
        return new Je(c4931rm.f41591a, c4931rm.f41592b);
    }

    public final Je a(C4931rm c4931rm) {
        return new Je(c4931rm.f41591a, c4931rm.f41592b);
    }
}
