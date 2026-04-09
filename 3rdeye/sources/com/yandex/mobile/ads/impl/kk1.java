package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2097r;
import f9.InterfaceC4347e;
import java.util.List;

@h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$prefetchedMediationAdapterInfos$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class kk1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends bk1>>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f29690b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<A9.L<bk1>> f29691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kk1(List<? extends A9.L<bk1>> list, InterfaceC4347e<? super kk1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f29691c = list;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new kk1(this.f29691c, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends bk1>> interfaceC4347e) {
        return new kk1(this.f29691c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f29690b;
        if (i == 0) {
            b9.n.b(obj);
            List<A9.L<bk1>> list = this.f29691c;
            this.f29690b = 1;
            obj = A9.I.h(list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C2097r.n0((Iterable) obj);
    }
}
