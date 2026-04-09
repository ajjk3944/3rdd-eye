package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.InterfaceC2503m;
import ci.AbstractC4268e;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.B0;
import pi.J0;
import pi.N0;
import pi.S;
import pi.v0;
import pi.w0;
import ti.AbstractC8119c;

/* loaded from: classes4.dex */
public abstract class A {
    private static final S a(S s10) {
        return (S) AbstractC8119c.b(s10).d();
    }

    private static final String b(v0 v0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + v0Var, sb2);
        c("hashCode: " + v0Var.hashCode(), sb2);
        c("javaClass: " + v0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC2503m interfaceC2503mC = v0Var.c(); interfaceC2503mC != null; interfaceC2503mC = interfaceC2503mC.b()) {
            c("fqName: " + kotlin.reflect.jvm.internal.impl.renderer.n.f52068h.O(interfaceC2503mC), sb2);
            c("javaClass: " + interfaceC2503mC.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        AbstractC6492s.i(str, "<this>");
        sb2.append(str);
        AbstractC6492s.h(sb2, "append(...)");
        sb2.append('\n');
        AbstractC6492s.h(sb2, "append(...)");
        return sb2;
    }

    public static final S d(S subtype, S supertype, x typeCheckingProcedureCallbacks) {
        AbstractC6492s.i(subtype, "subtype");
        AbstractC6492s.i(supertype, "supertype");
        AbstractC6492s.i(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(subtype, null));
        v0 v0VarN0 = supertype.N0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            S sB = uVar.b();
            v0 v0VarN02 = sB.N0();
            if (typeCheckingProcedureCallbacks.a(v0VarN02, v0VarN0)) {
                boolean zO0 = sB.O0();
                for (u uVarA = uVar.a(); uVarA != null; uVarA = uVarA.a()) {
                    S sB2 = uVarA.b();
                    List listL0 = sB2.L0();
                    if ((listL0 instanceof Collection) && listL0.isEmpty()) {
                        sB = w0.f58185c.a(sB2).c().n(sB, N0.INVARIANT);
                        AbstractC6492s.f(sB);
                    } else {
                        Iterator it = listL0.iterator();
                        while (it.hasNext()) {
                            N0 n0A = ((B0) it.next()).a();
                            N0 n02 = N0.INVARIANT;
                            if (n0A != n02) {
                                S sN = AbstractC4268e.h(w0.f58185c.a(sB2), false, 1, null).c().n(sB, n02);
                                AbstractC6492s.h(sN, "safeSubstitute(...)");
                                sB = a(sN);
                                break;
                            }
                        }
                        sB = w0.f58185c.a(sB2).c().n(sB, N0.INVARIANT);
                        AbstractC6492s.f(sB);
                    }
                    zO0 = zO0 || sB2.O0();
                }
                v0 v0VarN03 = sB.N0();
                if (typeCheckingProcedureCallbacks.a(v0VarN03, v0VarN0)) {
                    return J0.p(sB, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(v0VarN03) + ", \n\nsupertype: " + b(v0VarN0) + " \n" + typeCheckingProcedureCallbacks.a(v0VarN03, v0VarN0));
            }
            for (S s10 : v0VarN02.a()) {
                AbstractC6492s.f(s10);
                arrayDeque.add(new u(s10, uVar));
            }
        }
        return null;
    }
}
