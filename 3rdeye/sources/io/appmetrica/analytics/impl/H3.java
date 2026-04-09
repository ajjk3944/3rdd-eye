package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class H3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ka f39558a;

    public H3() {
        this(new Ka(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(List<String> list) {
        Gn gnA = this.f39558a.a((List<Object>) list);
        C5044w8 c5044w8 = new C5044w8();
        c5044w8.f41916a = StringUtils.getUTF8Bytes((List<String>) gnA.f39550a);
        InterfaceC5064x3 interfaceC5064x3 = gnA.f39551b;
        int i = ((I4) interfaceC5064x3).f41889a;
        return new Ni(c5044w8, interfaceC5064x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public H3(Ka ka2) {
        this.f39558a = ka2;
    }

    public final List<String> a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
