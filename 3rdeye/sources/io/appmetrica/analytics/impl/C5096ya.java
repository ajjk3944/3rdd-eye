package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5096ya implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5125ze f42133a;

    public C5096ya() {
        this(new Pl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4880pm fromModel(G4 g42) {
        C4880pm c4880pm = new C4880pm();
        c4880pm.f41436b = g42.f39476b;
        c4880pm.f41435a = g42.f39475a;
        c4880pm.f41437c = g42.f39477c;
        c4880pm.f41438d = g42.f39478d;
        c4880pm.f41439e = g42.f39479e;
        c4880pm.f41440f = this.f42133a.a(g42.f39480f);
        return c4880pm;
    }

    public C5096ya(Pl pl) {
        this.f42133a = pl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G4 toModel(C4880pm c4880pm) {
        E4 e4 = new E4();
        e4.f39331d = c4880pm.f41438d;
        e4.f39330c = c4880pm.f41437c;
        e4.f39329b = c4880pm.f41436b;
        e4.f39328a = c4880pm.f41435a;
        e4.f39332e = c4880pm.f41439e;
        e4.f39333f = this.f42133a.a(c4880pm.f41440f);
        return new G4(e4);
    }
}
