package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.x01;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.core.initializer.AppStartupInitializer$initialize$1", f = "AppStartupInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class vf extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f34521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vu1 f34522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(Context context, vu1 vu1Var, InterfaceC4347e<? super vf> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f34521b = context;
        this.f34522c = vu1Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new vf(this.f34521b, this.f34522c, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return new vf(this.f34521b, this.f34522c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        t72.a(this.f34521b, this.f34522c.c());
        wd.a(this.f34521b, this.f34522c.c());
        at0 at0Var = new at0();
        Boolean boolC = at0.c(this.f34521b);
        if (boolC != null) {
            f11.b(boolC.booleanValue());
        }
        Boolean boolF = at0.f(this.f34521b);
        if (boolF != null) {
            f11.a(boolF.booleanValue());
        }
        if (ba.a(this.f34521b)) {
            new x01();
            x01.a aVarA = x01.a(this.f34521b);
            if (aVarA instanceof x01.a.b) {
                uo0.a(new vo0().a((x01.a.b) aVarA), new Object[0]);
            } else if (aVarA instanceof x01.a.C0425a) {
                uo0.b("Yandex Mobile Ads 7.14.0 integrated successfully", new Object[0]);
            }
            fz0 fz0Var = new fz0();
            qz0.a(new rz0(fz0Var).a(new oz0().a(az0.a.a())));
        }
        fw1 fw1Var = new fw1(at0Var, this.f34522c);
        C4146l0.a(this.f34521b);
        fw1Var.a(this.f34521b);
        return C1992A.f18074a;
    }
}
