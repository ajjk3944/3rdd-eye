package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class k extends gg.n implements kg.q {

    /* renamed from: a, reason: collision with root package name */
    final Callable f60549a;

    public k(Callable callable) {
        this.f60549a = callable;
    }

    @Override // kg.q
    public Object get() {
        return this.f60549a.call();
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        InterfaceC6043c interfaceC6043cR = InterfaceC6043c.r();
        pVar.c(interfaceC6043cR);
        if (interfaceC6043cR.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f60549a.call();
            if (interfaceC6043cR.isDisposed()) {
                return;
            }
            if (objCall == null) {
                pVar.a();
            } else {
                pVar.onSuccess(objCall);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (interfaceC6043cR.isDisposed()) {
                Eg.a.v(th2);
            } else {
                pVar.onError(th2);
            }
        }
    }
}
