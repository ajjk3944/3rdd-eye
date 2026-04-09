package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4925rg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C4695ij f41577a;

    /* renamed from: b, reason: collision with root package name */
    public final La f41578b;

    /* renamed from: c, reason: collision with root package name */
    public final La f41579c;

    public C4925rg() {
        this(new C4695ij(), new La(100), new La(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(Ig ig) {
        Ni niFromModel;
        G8 g82 = new G8();
        Gn gnA = this.f41578b.a(ig.f39635a);
        g82.f39497a = StringUtils.getUTF8Bytes((String) gnA.f39550a);
        Gn gnA2 = this.f41579c.a(ig.f39636b);
        g82.f39498b = StringUtils.getUTF8Bytes((String) gnA2.f39550a);
        C4799mj c4799mj = ig.f39637c;
        if (c4799mj != null) {
            niFromModel = this.f41577a.fromModel(c4799mj);
            g82.f39499c = (H8) niFromModel.f39906a;
        } else {
            niFromModel = null;
        }
        return new Ni(g82, new C5039w3(C5039w3.b(gnA, gnA2, niFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4925rg(C4695ij c4695ij, La la2, La la3) {
        this.f41577a = c4695ij;
        this.f41578b = la2;
        this.f41579c = la3;
    }

    public final Ig a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
