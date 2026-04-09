package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.base.BaseAdLoadController$loadAutograb$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class xj extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vj<Object> f35325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c82 f35326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(vj<Object> vjVar, c82 c82Var, InterfaceC4347e<? super xj> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f35325b = vjVar;
        this.f35326c = c82Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vj vjVar, c82 c82Var, String str) {
        vjVar.i().a(EnumC4191r4.f32458g);
        vjVar.f().b(str);
        vjVar.b(c82Var);
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new xj(this.f35325b, this.f35326c, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return new xj(this.f35325b, this.f35326c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        xh xhVar = ((vj) this.f35325b).i;
        Context contextL = this.f35325b.l();
        final vj<Object> vjVar = this.f35325b;
        final c82 c82Var = this.f35326c;
        xhVar.a(contextL, new bi() { // from class: com.yandex.mobile.ads.impl.D4
            @Override // com.yandex.mobile.ads.impl.bi
            public final void a(String str) {
                xj.a(vjVar, c82Var, str);
            }
        });
        return C1992A.f18074a;
    }
}
