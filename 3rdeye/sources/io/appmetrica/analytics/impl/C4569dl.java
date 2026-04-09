package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4569dl implements InterfaceC4943s8 {

    /* renamed from: a, reason: collision with root package name */
    public final C4695ij f40756a;

    public C4569dl() {
        this(new C4695ij());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(C4543cl c4543cl) {
        L8 l82 = new L8();
        l82.f39757a = 1;
        l82.f39758b = new K8();
        Ni niFromModel = this.f40756a.fromModel(c4543cl.f40635a);
        l82.f39758b.f39716a = (H8) niFromModel.f39906a;
        C5039w3 c5039w3 = new C5039w3(C5039w3.b(niFromModel));
        niFromModel.f39907b.getBytesTruncated();
        return Collections.singletonList(new Ni(l82, c5039w3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4569dl(C4695ij c4695ij) {
        this.f40756a = c4695ij;
    }

    public final C4543cl a(List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
