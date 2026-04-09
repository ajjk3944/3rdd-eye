package com.yandex.mobile.ads.impl;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

@h9.e(c = "com.monetization.ads.feed.domain.FeedItemListUseCase$feedStateStateFlow$1", f = "FeedItemListUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n90 extends h9.i implements p9.q<z90, List<? extends i90>, InterfaceC4347e<? super ga0>, Object> {

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ z90 f30803b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ List f30804c;

    public n90(InterfaceC4347e<? super n90> interfaceC4347e) {
        super(3, interfaceC4347e);
    }

    @Override // p9.q
    public final Object invoke(z90 z90Var, List<? extends i90> list, InterfaceC4347e<? super ga0> interfaceC4347e) {
        n90 n90Var = new n90(interfaceC4347e);
        n90Var.f30803b = z90Var;
        n90Var.f30804c = list;
        return n90Var.invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        return new ga0(this.f30803b, this.f30804c);
    }
}
