package bi;

import Bh.A;
import Bh.H;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.Z;
import Bh.q0;
import Bh.t0;
import fi.AbstractC5833e;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.G0;
import pi.N0;
import pi.S;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Zh.c f33356a;

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.b f33357b;

    static {
        Zh.c cVar = new Zh.c("kotlin.jvm.JvmInline");
        f33356a = cVar;
        f33357b = Zh.b.f25401d.c(cVar);
    }

    public static final boolean a(InterfaceC2491a interfaceC2491a) {
        AbstractC6492s.i(interfaceC2491a, "<this>");
        if (interfaceC2491a instanceof Z) {
            Y yC0 = ((Z) interfaceC2491a).C0();
            AbstractC6492s.h(yC0, "getCorrespondingProperty(...)");
            if (f(yC0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return (interfaceC2503m instanceof InterfaceC2495e) && (((InterfaceC2495e) interfaceC2503m).z0() instanceof A);
    }

    public static final boolean c(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC != null) {
            return b(interfaceC2498hC);
        }
        return false;
    }

    public static final boolean d(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return (interfaceC2503m instanceof InterfaceC2495e) && (((InterfaceC2495e) interfaceC2503m).z0() instanceof H);
    }

    public static final boolean e(t0 t0Var) {
        A aQ;
        AbstractC6492s.i(t0Var, "<this>");
        if (t0Var.k0() == null) {
            InterfaceC2503m interfaceC2503mB = t0Var.b();
            Zh.f fVarC = null;
            InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
            if (interfaceC2495e != null && (aQ = AbstractC5833e.q(interfaceC2495e)) != null) {
                fVarC = aQ.c();
            }
            if (AbstractC6492s.d(fVarC, t0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(t0 t0Var) {
        q0 q0VarZ0;
        AbstractC6492s.i(t0Var, "<this>");
        if (t0Var.k0() == null) {
            InterfaceC2503m interfaceC2503mB = t0Var.b();
            InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
            if (interfaceC2495e != null && (q0VarZ0 = interfaceC2495e.z0()) != null) {
                Zh.f name = t0Var.getName();
                AbstractC6492s.h(name, "getName(...)");
                if (q0VarZ0.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return b(interfaceC2503m) || d(interfaceC2503m);
    }

    public static final boolean h(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC != null) {
            return g(interfaceC2498hC);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        return (interfaceC2498hC == null || !d(interfaceC2498hC) || kotlin.reflect.jvm.internal.impl.types.checker.s.f52171a.v0(s10)) ? false : true;
    }

    public static final S j(S s10) {
        AbstractC6492s.i(s10, "<this>");
        S sK = k(s10);
        if (sK != null) {
            return G0.f(s10).p(sK, N0.INVARIANT);
        }
        return null;
    }

    public static final S k(S s10) {
        A aQ;
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
        if (interfaceC2495e == null || (aQ = AbstractC5833e.q(interfaceC2495e)) == null) {
            return null;
        }
        return (AbstractC7346d0) aQ.d();
    }
}
