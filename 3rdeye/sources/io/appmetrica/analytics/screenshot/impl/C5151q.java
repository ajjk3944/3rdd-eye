package io.appmetrica.analytics.screenshot.impl;

import c9.C2091l;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5151q implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L fromModel(C5149o c5149o) {
        L l5 = new L();
        l5.f42508a = c5149o.f42578a;
        Object[] array = c5149o.f42579b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        l5.f42510c = (String[]) array;
        l5.f42509b = c5149o.f42580c;
        return l5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5149o toModel(L l5) {
        return new C5149o(l5.f42508a, C2091l.t(l5.f42510c), l5.f42509b);
    }
}
