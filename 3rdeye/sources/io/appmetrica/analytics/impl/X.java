package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class X implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final O7 f40364a;

    /* renamed from: b, reason: collision with root package name */
    public final La f40365b;

    public X() {
        this(new O7(), new La(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(Y y10) {
        C4969t8 c4969t8 = new C4969t8();
        c4969t8.f41675b = this.f40364a.fromModel(y10.f40401a);
        Gn gnA = this.f40365b.a(y10.f40402b);
        c4969t8.f41674a = StringUtils.getUTF8Bytes((String) gnA.f39550a);
        return new Ni(c4969t8, new C5039w3(C5039w3.b(gnA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public X(O7 o72, La la2) {
        this.f40364a = o72;
        this.f40365b = la2;
    }

    public final Y a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
