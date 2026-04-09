package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.C0597q;
import b9.C1992A;
import c9.C2092m;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperWithVideoAdsInfo$2", f = "NativeWrapperVideoLoader.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ec1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends mb2<ab1>>>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f26790b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f26791c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<mb2<ab1>> f26792d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ fc1 f26793e;

    @h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperWithVideoAdsInfo$2$1$1", f = "NativeWrapperVideoLoader.kt", l = {52}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends mb2<ab1>>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fc1 f26795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mb2<ab1> f26796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fc1 fc1Var, mb2<ab1> mb2Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f26795c = fc1Var;
            this.f26796d = mb2Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f26795c, this.f26796d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends mb2<ab1>>> interfaceC4347e) {
            return new a(this.f26795c, this.f26796d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f26794b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            fc1 fc1Var = this.f26795c;
            List listG = E.u.G(this.f26796d);
            this.f26794b = 1;
            Object objA = fc1.a(fc1Var, listG, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(fc1 fc1Var, List list, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f26792d = list;
        this.f26793e = fc1Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        ec1 ec1Var = new ec1(this.f26793e, this.f26792d, interfaceC4347e);
        ec1Var.f26791c = obj;
        return ec1Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends mb2<ab1>>> interfaceC4347e) {
        return ((ec1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        A9.G0 g0B;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f26790b;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f26791c;
            List<mb2<ab1>> list = this.f26792d;
            fc1 fc1Var = this.f26793e;
            ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mb2 mb2Var = (mb2) it.next();
                if (mb2Var.g().o()) {
                    g0B = C0575f.b(e4, null, new a(fc1Var, mb2Var, null), 3);
                } else {
                    List listG = E.u.G(mb2Var);
                    C0597q c0597q = new C0597q();
                    c0597q.R(listG);
                    g0B = c0597q;
                }
                arrayList.add(g0B);
            }
            this.f26790b = 1;
            obj = A9.I.h(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C2092m.U((Iterable) obj);
    }
}
