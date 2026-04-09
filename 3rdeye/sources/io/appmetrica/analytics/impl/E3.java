package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class E3 implements InterfaceC4943s8 {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f39327a;

    public E3() {
        this(new F3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(D3 d32) {
        L8 l82 = new L8();
        l82.f39761e = new C4994u8();
        Ni niFromModel = this.f39327a.fromModel(d32.f39282b);
        l82.f39761e.f41717a = (C5019v8) niFromModel.f39906a;
        l82.f39757a = d32.f39281a;
        return Collections.singletonList(new Ni(l82, new C5039w3(C5039w3.b(niFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public E3(F3 f32) {
        this.f39327a = f32;
    }

    public final D3 a(List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
