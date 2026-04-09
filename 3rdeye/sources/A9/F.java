package A9;

import A9.InterfaceC0594o0;
import F9.C0663f;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes3.dex */
public final class F {
    public static final C0663f a(InterfaceC4350h interfaceC4350h) {
        if (interfaceC4350h.get(InterfaceC0594o0.a.f263b) == null) {
            interfaceC4350h = interfaceC4350h.plus(C0572d0.a());
        }
        return new C0663f(interfaceC4350h);
    }

    public static final void b(E e4, CancellationException cancellationException) {
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) e4.k0().get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 != null) {
            interfaceC0594o0.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e4).toString());
        }
    }

    public static final <R> Object c(p9.p<? super E, ? super InterfaceC4347e<? super R>, ? extends Object> pVar, InterfaceC4347e<? super R> interfaceC4347e) {
        F9.v vVar = new F9.v(interfaceC4347e, interfaceC4347e.getContext());
        Object objE = A2.l.E(vVar, vVar, pVar);
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objE;
    }
}
