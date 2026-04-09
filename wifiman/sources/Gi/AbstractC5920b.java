package gi;

import Bh.AbstractC2509t;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.l0;
import Bh.s0;
import bi.i;
import bi.k;
import fi.AbstractC5833e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.S;
import si.AbstractC7984d;

/* renamed from: gi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5920b {
    private static final boolean a(InterfaceC2495e interfaceC2495e) {
        return AbstractC6492s.d(AbstractC5833e.o(interfaceC2495e), o.f51799w);
    }

    private static final boolean b(S s10, boolean z10) {
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        l0 l0Var = interfaceC2498hC instanceof l0 ? (l0) interfaceC2498hC : null;
        if (l0Var == null) {
            return false;
        }
        return (z10 || !k.d(l0Var)) && e(AbstractC7984d.o(l0Var));
    }

    public static final boolean c(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return k.g(interfaceC2503m) && !a((InterfaceC2495e) interfaceC2503m);
    }

    public static final boolean d(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC != null) {
            return (k.b(interfaceC2498hC) && c(interfaceC2498hC)) || k.i(s10);
        }
        return false;
    }

    private static final boolean e(S s10) {
        return d(s10) || b(s10, true);
    }

    public static final boolean f(InterfaceC2492b descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        InterfaceC2494d interfaceC2494d = descriptor instanceof InterfaceC2494d ? (InterfaceC2494d) descriptor : null;
        if (interfaceC2494d == null || AbstractC2509t.g(interfaceC2494d.getVisibility())) {
            return false;
        }
        InterfaceC2495e interfaceC2495eC = interfaceC2494d.C();
        AbstractC6492s.h(interfaceC2495eC, "getConstructedClass(...)");
        if (k.g(interfaceC2495eC) || i.G(interfaceC2494d.C())) {
            return false;
        }
        List listI = interfaceC2494d.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        List list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S type = ((s0) it.next()).getType();
            AbstractC6492s.h(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
