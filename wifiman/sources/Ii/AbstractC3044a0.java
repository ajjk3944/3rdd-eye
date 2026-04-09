package Ii;

import Ni.C3405g;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.coroutines.DispatchException;

/* renamed from: Ii.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3044a0 extends Ri.h {

    /* renamed from: c, reason: collision with root package name */
    public int f9299c;

    public AbstractC3044a0(int i10) {
        this.f9299c = i10;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract InterfaceC5380e c();

    public Throwable d(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f9236a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2) {
        L.a(c().getContext(), new Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC5380e interfaceC5380eC = c();
            AbstractC6492s.g(interfaceC5380eC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3405g c3405g = (C3405g) interfaceC5380eC;
            InterfaceC5380e interfaceC5380e = c3405g.f16593e;
            Object obj = c3405g.f16595g;
            InterfaceC5384i context = interfaceC5380e.getContext();
            Object objI = Ni.J.i(context, obj);
            InterfaceC3091y0 interfaceC3091y0 = null;
            Y0 y0M = objI != Ni.J.f16576a ? H.m(interfaceC5380e, context, objI) : null;
            try {
                InterfaceC5384i context2 = interfaceC5380e.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null && AbstractC3046b0.b(this.f9299c)) {
                    interfaceC3091y0 = (InterfaceC3091y0) context2.get(InterfaceC3091y0.f9363O);
                }
                if (interfaceC3091y0 != null && !interfaceC3091y0.isActive()) {
                    CancellationException cancellationException = interfaceC3091y0.getCancellationException();
                    a(objG, cancellationException);
                    u.a aVar = Yg.u.f25017b;
                    interfaceC5380e.resumeWith(Yg.u.c(Yg.v.a(cancellationException)));
                } else if (thD != null) {
                    u.a aVar2 = Yg.u.f25017b;
                    interfaceC5380e.resumeWith(Yg.u.c(Yg.v.a(thD)));
                } else {
                    u.a aVar3 = Yg.u.f25017b;
                    interfaceC5380e.resumeWith(Yg.u.c(e(objG)));
                }
                Yg.J j10 = Yg.J.f24997a;
                if (y0M == null || y0M.S0()) {
                    Ni.J.f(context, objI);
                }
            } catch (Throwable th2) {
                if (y0M == null || y0M.S0()) {
                    Ni.J.f(context, objI);
                }
                throw th2;
            }
        } catch (DispatchException e10) {
            L.a(c().getContext(), e10.getCause());
        } catch (Throwable th3) {
            f(th3);
        }
    }
}
