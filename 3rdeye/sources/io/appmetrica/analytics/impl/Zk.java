package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Zk implements InterfaceC4943s8 {

    /* renamed from: a, reason: collision with root package name */
    public final C4695ij f40485a;

    /* renamed from: b, reason: collision with root package name */
    public final Pf f40486b;

    public Zk() {
        this(new C4695ij(), new Pf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(Yk yk) {
        L8 l82 = new L8();
        l82.f39757a = 2;
        l82.f39759c = new I8();
        Ni niFromModel = this.f40485a.fromModel(yk.f40433b);
        l82.f39759c.f39620b = (H8) niFromModel.f39906a;
        Ni niFromModel2 = this.f40486b.fromModel(yk.f40432a);
        l82.f39759c.f39619a = (E8) niFromModel2.f39906a;
        return Collections.singletonList(new Ni(l82, new C5039w3(C5039w3.b(niFromModel, niFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Zk(C4695ij c4695ij, Pf pf) {
        this.f40485a = c4695ij;
        this.f40486b = pf;
    }

    public final Yk a(List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
