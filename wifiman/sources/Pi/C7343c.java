package pi;

import Zg.AbstractC3689v;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import pi.u0;
import ri.InterfaceC7613d;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;

/* renamed from: pi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7343c {

    /* renamed from: a, reason: collision with root package name */
    public static final C7343c f58109a = new C7343c();

    private C7343c() {
    }

    private final boolean c(u0 u0Var, InterfaceC7619j interfaceC7619j, ri.m mVar) {
        ri.o oVarJ = u0Var.j();
        if (oVarJ.m0(interfaceC7619j)) {
            return true;
        }
        if (oVarJ.t(interfaceC7619j)) {
            return false;
        }
        if (u0Var.n() && oVarJ.z0(interfaceC7619j)) {
            return true;
        }
        return oVarJ.O(oVarJ.d(interfaceC7619j), mVar);
    }

    private final boolean e(u0 u0Var, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        ri.o oVarJ = u0Var.j();
        if (C7351g.f58126b) {
            if (!oVarJ.f(interfaceC7619j) && !oVarJ.i0(oVarJ.d(interfaceC7619j))) {
                u0Var.l(interfaceC7619j);
            }
            if (!oVarJ.f(interfaceC7619j2)) {
                u0Var.l(interfaceC7619j2);
            }
        }
        if (oVarJ.t(interfaceC7619j2) || oVarJ.K(interfaceC7619j) || oVarJ.L(interfaceC7619j)) {
            return true;
        }
        if ((interfaceC7619j instanceof InterfaceC7613d) && oVarJ.I((InterfaceC7613d) interfaceC7619j)) {
            return true;
        }
        C7343c c7343c = f58109a;
        if (c7343c.a(u0Var, interfaceC7619j, u0.c.b.f58181a)) {
            return true;
        }
        if (oVarJ.K(interfaceC7619j2) || c7343c.a(u0Var, interfaceC7619j2, u0.c.d.f58183a) || oVarJ.q0(interfaceC7619j)) {
            return false;
        }
        return c7343c.b(u0Var, interfaceC7619j, oVarJ.d(interfaceC7619j2));
    }

    public final boolean a(u0 u0Var, InterfaceC7619j type, u0.c supertypesPolicy) {
        AbstractC6492s.i(u0Var, "<this>");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(supertypesPolicy, "supertypesPolicy");
        ri.o oVarJ = u0Var.j();
        if ((oVarJ.q0(type) && !oVarJ.t(type)) || oVarJ.K(type)) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC6492s.f(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC6492s.f(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + AbstractC3689v.z0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC7619j interfaceC7619j = (InterfaceC7619j) arrayDequeH.pop();
            AbstractC6492s.f(interfaceC7619j);
            if (setI.add(interfaceC7619j)) {
                u0.c cVar = oVarJ.t(interfaceC7619j) ? u0.c.C2046c.f58182a : supertypesPolicy;
                if (AbstractC6492s.d(cVar, u0.c.C2046c.f58182a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ri.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.x0(oVarJ2.d(interfaceC7619j)).iterator();
                    while (it.hasNext()) {
                        InterfaceC7619j interfaceC7619jA = cVar.a(u0Var, (InterfaceC7618i) it.next());
                        if ((oVarJ.q0(interfaceC7619jA) && !oVarJ.t(interfaceC7619jA)) || oVarJ.K(interfaceC7619jA)) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC7619jA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    public final boolean b(u0 state, InterfaceC7619j start, ri.m end) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(start, "start");
        AbstractC6492s.i(end, "end");
        ri.o oVarJ = state.j();
        if (f58109a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC6492s.f(arrayDequeH);
        Set setI = state.i();
        AbstractC6492s.f(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + AbstractC3689v.z0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC7619j interfaceC7619j = (InterfaceC7619j) arrayDequeH.pop();
            AbstractC6492s.f(interfaceC7619j);
            if (setI.add(interfaceC7619j)) {
                u0.c cVar = oVarJ.t(interfaceC7619j) ? u0.c.C2046c.f58182a : u0.c.b.f58181a;
                if (AbstractC6492s.d(cVar, u0.c.C2046c.f58182a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ri.o oVarJ2 = state.j();
                    Iterator it = oVarJ2.x0(oVarJ2.d(interfaceC7619j)).iterator();
                    while (it.hasNext()) {
                        InterfaceC7619j interfaceC7619jA = cVar.a(state, (InterfaceC7618i) it.next());
                        if (f58109a.c(state, interfaceC7619jA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC7619jA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(u0 state, InterfaceC7619j subType, InterfaceC7619j superType) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return e(state, subType, superType);
    }
}
