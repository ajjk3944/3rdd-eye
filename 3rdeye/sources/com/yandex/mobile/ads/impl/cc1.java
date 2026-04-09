package com.yandex.mobile.ads.impl;

import A9.C0575f;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

@h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperInVideo$2", f = "NativeWrapperVideoLoader.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class cc1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super ya2>, Object> {

    /* renamed from: b, reason: collision with root package name */
    ya2 f25595b;

    /* renamed from: c, reason: collision with root package name */
    int f25596c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ya2 f25597d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ fc1 f25598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(ya2 ya2Var, fc1 fc1Var, InterfaceC4347e<? super cc1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f25597d = ya2Var;
        this.f25598e = fc1Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new cc1(this.f25597d, this.f25598e, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super ya2> interfaceC4347e) {
        return new cc1(this.f25597d, this.f25598e, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ya2 ya2Var;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f25596c;
        if (i == 0) {
            b9.n.b(obj);
            ya2 ya2Var2 = this.f25597d;
            if (ya2Var2 == null) {
                return null;
            }
            fc1 fc1Var = this.f25598e;
            List<mb2<ab1>> listC = ya2Var2.c();
            this.f25595b = ya2Var2;
            this.f25596c = 1;
            fc1Var.getClass();
            Object objH = C0575f.h(A9.U.f212b, new ec1(fc1Var, listC, null), this);
            if (objH == aVar) {
                return aVar;
            }
            ya2Var = ya2Var2;
            obj = objH;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ya2Var = this.f25595b;
            b9.n.b(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            throw new k61("Invalid VAST in response");
        }
        return ya2.a(ya2Var, list);
    }
}
