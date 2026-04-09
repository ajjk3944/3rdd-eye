package i8;

import A9.E;
import a8.C1670b;
import a8.C1671c;
import androidx.lifecycle.J;
import b9.C1992A;
import f9.InterfaceC4347e;
import r8.C5536a;
import va.a;

/* compiled from: Analytics.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Analytics$init$2", f = "Analytics.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C4461a f38520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C4461a c4461a, InterfaceC4347e<? super c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38520l = c4461a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new c(this.f38520l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        C1671c c1671c = (C1671c) B7.e.f581d.f583c;
        c1671c.getClass();
        J j4 = J.f16049j;
        if (c1671c.f14246h == null) {
            C1670b c1670b = new C1670b(c1671c, true);
            c1671c.f14246h = c1670b;
            j4.f16055g.addObserver(c1670b);
        }
        com.zipoapps.premiumhelper.d dVar = this.f38520l.f38483a;
        C5536a c5536a = new C5536a();
        if (c5536a.f45828a != null) {
            a.b bVar = va.a.f47104a;
            bVar.o("a");
            bVar.c("Trying to register second ActivityLifeCycleLogger", new Object[0]);
        } else {
            C5536a.C0525a c0525a = new C5536a.C0525a();
            c5536a.f45828a = c0525a;
            dVar.registerActivityLifecycleCallbacks(c0525a);
        }
        return C1992A.f18074a;
    }
}
