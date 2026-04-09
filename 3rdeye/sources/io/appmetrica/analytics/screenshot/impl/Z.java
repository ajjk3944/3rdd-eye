package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class Z implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M fromModel(X x10) {
        M m10 = new M();
        m10.f42512a = x10.f42535a;
        m10.f42513b = x10.f42536b;
        return m10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        M m10 = (M) obj;
        return new X(m10.f42512a, m10.f42513b);
    }

    public final X a(M m10) {
        return new X(m10.f42512a, m10.f42513b);
    }
}
