package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class Jf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final X f39692a;

    /* renamed from: b, reason: collision with root package name */
    public final Kf f39693b;

    public Jf() {
        this(new X(), new Kf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(Lf lf) {
        int bytesTruncated;
        D8 d82 = new D8();
        Ni niFromModel = this.f39692a.fromModel(lf.f39782a);
        d82.f39291a = (C4969t8) niFromModel.f39906a;
        Gn gnA = this.f39693b.a(lf.f39783b);
        if (AbstractC4623fo.a((Collection) gnA.f39550a)) {
            bytesTruncated = 0;
        } else {
            d82.f39292b = new C4969t8[((List) gnA.f39550a).size()];
            bytesTruncated = 0;
            for (int i = 0; i < ((List) gnA.f39550a).size(); i++) {
                Ni niFromModel2 = this.f39692a.fromModel((Y) ((List) gnA.f39550a).get(i));
                d82.f39292b[i] = (C4969t8) niFromModel2.f39906a;
                bytesTruncated += niFromModel2.f39907b.getBytesTruncated();
            }
        }
        return new Ni(d82, new C5039w3(C5039w3.b(niFromModel, gnA, new C5039w3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jf(X x10, Kf kf) {
        this.f39692a = x10;
        this.f39693b = kf;
    }

    public final Lf a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
