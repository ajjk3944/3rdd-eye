package Jh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.X;
import Bh.Y;
import Bh.f0;
import fi.AbstractC5833e;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public abstract class T {
    public static final boolean d(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        return g(interfaceC2492b) != null;
    }

    public static final String e(InterfaceC2492b callableMemberDescriptor) {
        InterfaceC2492b interfaceC2492bW;
        Zh.f fVarJ;
        AbstractC6492s.i(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC2492b interfaceC2492bF = f(callableMemberDescriptor);
        if (interfaceC2492bF == null || (interfaceC2492bW = AbstractC5833e.w(interfaceC2492bF)) == null) {
            return null;
        }
        if (interfaceC2492bW instanceof Y) {
            return C3119m.f10196a.b(interfaceC2492bW);
        }
        if (!(interfaceC2492bW instanceof f0) || (fVarJ = C3112f.f10185o.j((f0) interfaceC2492bW)) == null) {
            return null;
        }
        return fVarJ.b();
    }

    private static final InterfaceC2492b f(InterfaceC2492b interfaceC2492b) {
        if (kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2492b)) {
            return g(interfaceC2492b);
        }
        return null;
    }

    public static final InterfaceC2492b g(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        if (!U.f10160a.g().contains(interfaceC2492b.getName()) && !C3116j.f10189a.d().contains(AbstractC5833e.w(interfaceC2492b).getName())) {
            return null;
        }
        if ((interfaceC2492b instanceof Y) || (interfaceC2492b instanceof X)) {
            return AbstractC5833e.i(interfaceC2492b, false, P.f10157a, 1, null);
        }
        if (interfaceC2492b instanceof f0) {
            return AbstractC5833e.i(interfaceC2492b, false, Q.f10158a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return C3119m.f10196a.d(AbstractC5833e.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return C3112f.f10185o.k((f0) it);
    }

    public static final InterfaceC2492b j(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        InterfaceC2492b interfaceC2492bG = g(interfaceC2492b);
        if (interfaceC2492bG != null) {
            return interfaceC2492bG;
        }
        C3115i c3115i = C3115i.f10188o;
        Zh.f name = interfaceC2492b.getName();
        AbstractC6492s.h(name, "getName(...)");
        if (c3115i.n(name)) {
            return AbstractC5833e.i(interfaceC2492b, false, S.f10159a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return kotlin.reflect.jvm.internal.impl.builtins.i.g0(it) && C3115i.o(it) != null;
    }

    public static final boolean l(InterfaceC2495e interfaceC2495e, InterfaceC2491a specialCallableDescriptor) {
        AbstractC6492s.i(interfaceC2495e, "<this>");
        AbstractC6492s.i(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC2503m interfaceC2503mB = specialCallableDescriptor.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC7346d0 abstractC7346d0U = ((InterfaceC2495e) interfaceC2503mB).u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        for (InterfaceC2495e interfaceC2495eS = bi.i.s(interfaceC2495e); interfaceC2495eS != null; interfaceC2495eS = bi.i.s(interfaceC2495eS)) {
            if (!(interfaceC2495eS instanceof Lh.c) && kotlin.reflect.jvm.internal.impl.types.checker.w.b(interfaceC2495eS.u(), abstractC7346d0U) != null) {
                return !kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2495eS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        return AbstractC5833e.w(interfaceC2492b).b() instanceof Lh.c;
    }

    public static final boolean n(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        return m(interfaceC2492b) || kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2492b);
    }
}
