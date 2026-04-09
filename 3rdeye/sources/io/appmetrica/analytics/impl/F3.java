package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class F3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Pf f39400a;

    /* renamed from: b, reason: collision with root package name */
    public final O7 f39401b;

    /* renamed from: c, reason: collision with root package name */
    public final Jf f39402c;

    /* renamed from: d, reason: collision with root package name */
    public final C4925rg f39403d;

    public F3() {
        this(new Pf(), new O7(), new Jf(), new C4925rg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(G3 g32) {
        Ni niA;
        C5019v8 c5019v8 = new C5019v8();
        Ni niA2 = this.f39400a.fromModel(g32.f39471a);
        c5019v8.f41839a = (E8) niA2.f39906a;
        c5019v8.f41841c = this.f39401b.fromModel(g32.f39472b);
        Ni niA3 = this.f39402c.fromModel(g32.f39473c);
        c5019v8.f41842d = (D8) niA3.f39906a;
        Ig ig = g32.f39474d;
        if (ig != null) {
            niA = this.f39403d.fromModel(ig);
            c5019v8.f41840b = (G8) niA.f39906a;
        } else {
            niA = null;
        }
        return new Ni(c5019v8, new C5039w3(C5039w3.b(niA2, niA3, niA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public F3(Pf pf, O7 o72, Jf jf, C4925rg c4925rg) {
        this.f39400a = pf;
        this.f39401b = o72;
        this.f39402c = jf;
        this.f39403d = c4925rg;
    }

    public final G3 a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
