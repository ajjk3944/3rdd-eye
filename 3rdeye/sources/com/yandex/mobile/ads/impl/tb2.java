package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.gv1;
import f9.InterfaceC4347e;
import p9.InterfaceC5480a;

@h9.e(c = "com.monetization.ads.video.core.VideoAdLoaderController$initSdk$1", f = "VideoAdLoaderController.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class tb2 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f33518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ yb2 f33519c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f33520d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC5480a<C1992A> f33521e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p9.l<fb2, C1992A> f33522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tb2(yb2 yb2Var, Object obj, InterfaceC5480a<C1992A> interfaceC5480a, p9.l<? super fb2, C1992A> lVar, InterfaceC4347e<? super tb2> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f33519c = yb2Var;
        this.f33520d = obj;
        this.f33521e = interfaceC5480a;
        this.f33522f = lVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new tb2(this.f33519c, this.f33520d, this.f33521e, this.f33522f, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((tb2) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f33518b;
        if (i == 0) {
            b9.n.b(obj);
            jv1 jv1Var = this.f33519c.f35702f;
            tk0 tk0Var = tk0.f33655e;
            this.f33518b = 1;
            obj = jv1Var.a(tk0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        gv1 gv1Var = (gv1) obj;
        if (gv1Var instanceof gv1.b) {
            gv1.b bVar = (gv1.b) gv1Var;
            yb2.a(this.f33519c, bVar.a(), bVar.b());
            this.f33519c.i.add(this.f33520d);
            this.f33521e.invoke();
        } else if (gv1Var instanceof gv1.a) {
            gb2 gb2Var = this.f33519c.f35703g;
            C4128i3 error = ((gv1.a) gv1Var).a();
            gb2Var.getClass();
            kotlin.jvm.internal.l.f(error, "error");
            this.f33522f.invoke(new fb2(error.b(), error.d() != null ? error.c() : "Internal error occured while loading ads."));
        }
        return C1992A.f18074a;
    }
}
