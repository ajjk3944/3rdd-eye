package Sh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.f0;
import Bh.s0;
import Jh.C3115i;
import Jh.T;
import Sh.s;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import gi.C5922d;
import gi.EnumC5923e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.S;

/* loaded from: classes4.dex */
public abstract class C {
    private static final void a(StringBuilder sb2, S s10) {
        sb2.append(g(s10));
    }

    public static final String b(InterfaceC2515z interfaceC2515z, boolean z10, boolean z11) {
        String strB;
        AbstractC6492s.i(interfaceC2515z, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC2515z instanceof InterfaceC2502l) {
                strB = "<init>";
            } else {
                strB = interfaceC2515z.getName().b();
                AbstractC6492s.h(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        b0 b0VarK0 = interfaceC2515z.k0();
        if (b0VarK0 != null) {
            S type = b0VarK0.getType();
            AbstractC6492s.h(type, "getType(...)");
            a(sb2, type);
        }
        Iterator it = interfaceC2515z.i().iterator();
        while (it.hasNext()) {
            S type2 = ((s0) it.next()).getType();
            AbstractC6492s.h(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (AbstractC3510j.c(interfaceC2515z)) {
                sb2.append("V");
            } else {
                S returnType = interfaceC2515z.getReturnType();
                AbstractC6492s.f(returnType);
                a(sb2, returnType);
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String c(InterfaceC2515z interfaceC2515z, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC2515z, z10, z11);
    }

    public static final String d(InterfaceC2491a interfaceC2491a) {
        AbstractC6492s.i(interfaceC2491a, "<this>");
        F f10 = F.f20704a;
        if (bi.i.E(interfaceC2491a)) {
            return null;
        }
        InterfaceC2503m interfaceC2503mB = interfaceC2491a.b();
        InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
        if (interfaceC2495e == null || interfaceC2495e.getName().j()) {
            return null;
        }
        InterfaceC2491a interfaceC2491aA = interfaceC2491a.a();
        f0 f0Var = interfaceC2491aA instanceof f0 ? (f0) interfaceC2491aA : null;
        if (f0Var == null) {
            return null;
        }
        return B.a(f10, interfaceC2495e, c(f0Var, false, false, 3, null));
    }

    public static final boolean e(InterfaceC2491a f10) {
        InterfaceC2515z interfaceC2515zL;
        AbstractC6492s.i(f10, "f");
        if (!(f10 instanceof InterfaceC2515z)) {
            return false;
        }
        InterfaceC2515z interfaceC2515z = (InterfaceC2515z) f10;
        if (!AbstractC6492s.d(interfaceC2515z.getName().b(), "remove") || interfaceC2515z.i().size() != 1 || T.n((InterfaceC2492b) f10)) {
            return false;
        }
        List listI = interfaceC2515z.a().i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        S type = ((s0) AbstractC3689v.R0(listI)).getType();
        AbstractC6492s.h(type, "getType(...)");
        s sVarG = g(type);
        s.d dVar = sVarG instanceof s.d ? (s.d) sVarG : null;
        if ((dVar != null ? dVar.i() : null) != EnumC5923e.INT || (interfaceC2515zL = C3115i.l(interfaceC2515z)) == null) {
            return false;
        }
        List listI2 = interfaceC2515zL.a().i();
        AbstractC6492s.h(listI2, "getValueParameters(...)");
        S type2 = ((s0) AbstractC3689v.R0(listI2)).getType();
        AbstractC6492s.h(type2, "getType(...)");
        s sVarG2 = g(type2);
        InterfaceC2503m interfaceC2503mB = interfaceC2515zL.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        return AbstractC6492s.d(AbstractC5833e.p(interfaceC2503mB), o.a.f51855f0.j()) && (sVarG2 instanceof s.c) && AbstractC6492s.d(((s.c) sVarG2).i(), "java/lang/Object");
    }

    public static final String f(InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(interfaceC2495e, "<this>");
        Ah.c cVar = Ah.c.f771a;
        Zh.d dVarJ = AbstractC5833e.o(interfaceC2495e).j();
        AbstractC6492s.h(dVarJ, "toUnsafe(...)");
        Zh.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return AbstractC3510j.b(interfaceC2495e, null, 2, null);
        }
        String strH = C5922d.h(bVarN);
        AbstractC6492s.h(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final s g(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return (s) AbstractC3510j.e(s10, u.f20806a, I.f20710o, H.f20705a, null, null, 32, null);
    }
}
