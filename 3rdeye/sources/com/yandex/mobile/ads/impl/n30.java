package com.yandex.mobile.ads.impl;

import A9.C0575f;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Iterator;
import java.util.List;

@h9.e(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetchUrlList$2", f = "DnsPrefetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n30 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f30748b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<String> f30749c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m30 f30750d;

    @h9.e(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetchUrlList$2$1$1", f = "DnsPrefetcher.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m30 f30751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m30 m30Var, String str, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f30751b = m30Var;
            this.f30752c = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f30751b, this.f30752c, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new a(this.f30751b, this.f30752c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            this.f30751b.a(this.f30752c);
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(m30 m30Var, List list, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f30749c = list;
        this.f30750d = m30Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        n30 n30Var = new n30(this.f30750d, this.f30749c, interfaceC4347e);
        n30Var.f30748b = obj;
        return n30Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((n30) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        A9.E e4 = (A9.E) this.f30748b;
        List<String> list = this.f30749c;
        m30 m30Var = this.f30750d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C0575f.e(e4, null, null, new a(m30Var, (String) it.next(), null), 3);
        }
        return C1992A.f18074a;
    }
}
