package bi;

import Bh.C;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.g0;
import Bh.l0;
import Zg.AbstractC3689v;
import bi.o;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import mh.InterfaceC6839p;
import pi.v0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f33354a = new g();

    private g() {
    }

    public static /* synthetic */ boolean f(g gVar, InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, boolean z10, boolean z11, boolean z12, kotlin.reflect.jvm.internal.impl.types.checker.g gVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return gVar.e(interfaceC2491a, interfaceC2491a2, z10, z13, z12, gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, v0 c12, v0 c22) {
        AbstractC6492s.i(c12, "c1");
        AbstractC6492s.i(c22, "c2");
        if (AbstractC6492s.d(c12, c22)) {
            return true;
        }
        InterfaceC2498h interfaceC2498hC = c12.c();
        InterfaceC2498h interfaceC2498hC2 = c22.c();
        if ((interfaceC2498hC instanceof l0) && (interfaceC2498hC2 instanceof l0)) {
            return f33354a.n((l0) interfaceC2498hC, (l0) interfaceC2498hC2, z10, new f(interfaceC2491a, interfaceC2491a2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        return AbstractC6492s.d(interfaceC2503m, interfaceC2491a) && AbstractC6492s.d(interfaceC2503m2, interfaceC2491a2);
    }

    private final boolean j(InterfaceC2495e interfaceC2495e, InterfaceC2495e interfaceC2495e2) {
        return AbstractC6492s.d(interfaceC2495e.k(), interfaceC2495e2.k());
    }

    public static /* synthetic */ boolean l(g gVar, InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(interfaceC2503m, interfaceC2503m2, z10, z11);
    }

    public static /* synthetic */ boolean o(g gVar, l0 l0Var, l0 l0Var2, boolean z10, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC6839p = C4115c.f33347a;
        }
        return gVar.n(l0Var, l0Var2, z10, interfaceC6839p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        return false;
    }

    private final boolean q(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2, InterfaceC6839p interfaceC6839p, boolean z10) {
        InterfaceC2503m interfaceC2503mB = interfaceC2503m.b();
        InterfaceC2503m interfaceC2503mB2 = interfaceC2503m2.b();
        return ((interfaceC2503mB instanceof InterfaceC2492b) || (interfaceC2503mB2 instanceof InterfaceC2492b)) ? ((Boolean) interfaceC6839p.invoke(interfaceC2503mB, interfaceC2503mB2)).booleanValue() : l(this, interfaceC2503mB, interfaceC2503mB2, z10, false, 8, null);
    }

    private final g0 r(InterfaceC2491a interfaceC2491a) {
        while (interfaceC2491a instanceof InterfaceC2492b) {
            InterfaceC2492b interfaceC2492b = (InterfaceC2492b) interfaceC2491a;
            if (interfaceC2492b.h() != InterfaceC2492b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionF = interfaceC2492b.f();
            AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
            interfaceC2491a = (InterfaceC2492b) AbstractC3689v.S0(collectionF);
            if (interfaceC2491a == null) {
                return null;
            }
        }
        return interfaceC2491a.j();
    }

    public final boolean e(InterfaceC2491a a10, InterfaceC2491a b10, boolean z10, boolean z11, boolean z12, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (AbstractC6492s.d(a10, b10)) {
            return true;
        }
        if (!AbstractC6492s.d(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof C) && (b10 instanceof C) && ((C) a10).L() != ((C) b10).L()) {
            return false;
        }
        if ((AbstractC6492s.d(a10.b(), b10.b()) && (!z10 || !AbstractC6492s.d(r(a10), r(b10)))) || i.E(a10) || i.E(b10) || !q(a10, b10, C4116d.f33348a, z10)) {
            return false;
        }
        o oVarI = o.i(kotlinTypeRefiner, new e(z10, a10, b10));
        AbstractC6492s.h(oVarI, "create(...)");
        o.i.a aVarC = oVarI.E(a10, b10, null, !z12).c();
        o.i.a aVar = o.i.a.OVERRIDABLE;
        return aVarC == aVar && oVarI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean k(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2, boolean z10, boolean z11) {
        return ((interfaceC2503m instanceof InterfaceC2495e) && (interfaceC2503m2 instanceof InterfaceC2495e)) ? j((InterfaceC2495e) interfaceC2503m, (InterfaceC2495e) interfaceC2503m2) : ((interfaceC2503m instanceof l0) && (interfaceC2503m2 instanceof l0)) ? o(this, (l0) interfaceC2503m, (l0) interfaceC2503m2, z10, null, 8, null) : ((interfaceC2503m instanceof InterfaceC2491a) && (interfaceC2503m2 instanceof InterfaceC2491a)) ? f(this, (InterfaceC2491a) interfaceC2503m, (InterfaceC2491a) interfaceC2503m2, z10, z11, false, g.a.f52146a, 16, null) : ((interfaceC2503m instanceof M) && (interfaceC2503m2 instanceof M)) ? AbstractC6492s.d(((M) interfaceC2503m).e(), ((M) interfaceC2503m2).e()) : AbstractC6492s.d(interfaceC2503m, interfaceC2503m2);
    }

    public final boolean m(l0 a10, l0 b10, boolean z10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public final boolean n(l0 a10, l0 b10, boolean z10, InterfaceC6839p equivalentCallables) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        AbstractC6492s.i(equivalentCallables, "equivalentCallables");
        if (AbstractC6492s.d(a10, b10)) {
            return true;
        }
        return !AbstractC6492s.d(a10.b(), b10.b()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
