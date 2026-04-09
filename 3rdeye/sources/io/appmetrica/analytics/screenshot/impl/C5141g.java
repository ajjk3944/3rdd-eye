package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5141g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K fromModel(C5139e c5139e) {
        K k10 = new K();
        k10.f42506a = c5139e.f42553a;
        return k10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5139e(((K) obj).f42506a);
    }

    public final C5139e a(K k10) {
        return new C5139e(k10.f42506a);
    }
}
