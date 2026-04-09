package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4517bl implements InterfaceC4943s8 {

    /* renamed from: a, reason: collision with root package name */
    public final Pf f40590a;

    /* renamed from: b, reason: collision with root package name */
    public final C4925rg f40591b;

    public C4517bl() {
        this(new Pf(), new C4925rg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(C4491al c4491al) {
        Ni niFromModel;
        L8 l82 = new L8();
        l82.f39757a = 3;
        l82.f39760d = new J8();
        Ni niFromModel2 = this.f40590a.fromModel(c4491al.f40527a);
        l82.f39760d.f39686a = (E8) niFromModel2.f39906a;
        Ig ig = c4491al.f40528b;
        if (ig != null) {
            niFromModel = this.f40591b.fromModel(ig);
            l82.f39760d.f39687b = (G8) niFromModel.f39906a;
        } else {
            niFromModel = null;
        }
        return Collections.singletonList(new Ni(l82, new C5039w3(C5039w3.b(niFromModel2, niFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4517bl(Pf pf, C4925rg c4925rg) {
        this.f40590a = pf;
        this.f40591b = c4925rg;
    }

    public final C4491al a(List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
