package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Bm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4957sm fromModel(Am am) {
        C4957sm c4957sm = new C4957sm();
        c4957sm.f41650a = am.f39125a;
        return c4957sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Am(((C4957sm) obj).f41650a);
    }

    public final Am a(C4957sm c4957sm) {
        return new Am(c4957sm.f41650a);
    }
}
