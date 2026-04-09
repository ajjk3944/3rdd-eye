package pi;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import si.AbstractC7984d;

/* renamed from: pi.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7335C {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static G0 b(List list, E0 e02, InterfaceC2503m interfaceC2503m, List list2) {
        if (list == null) {
            a(0);
        }
        if (e02 == null) {
            a(1);
        }
        if (interfaceC2503m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        G0 g0C = c(list, e02, interfaceC2503m, list2, null);
        if (g0C != null) {
            return g0C;
        }
        throw new AssertionError("Substitution failed");
    }

    public static G0 c(List list, E0 e02, InterfaceC2503m interfaceC2503m, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (e02 == null) {
            a(6);
        }
        if (interfaceC2503m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Bh.l0 l0Var = (Bh.l0) it.next();
            Dh.U uQ0 = Dh.U.Q0(interfaceC2503m, l0Var.getAnnotations(), l0Var.G(), l0Var.p(), l0Var.getName(), i10, Bh.g0.f1784a, l0Var.g0());
            map.put(l0Var.k(), new D0(uQ0.u()));
            map2.put(l0Var, uQ0);
            list2.add(uQ0);
            i10++;
        }
        w0 w0VarJ = w0.j(map);
        G0 g0H = G0.h(e02, w0VarJ);
        G0 g0H2 = G0.h(e02.h(), w0VarJ);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Bh.l0 l0Var2 = (Bh.l0) it2.next();
            Dh.U u10 = (Dh.U) map2.get(l0Var2);
            for (S s10 : l0Var2.getUpperBounds()) {
                InterfaceC2498h interfaceC2498hC = s10.N0().c();
                S sP = (((interfaceC2498hC instanceof Bh.l0) && AbstractC7984d.p((Bh.l0) interfaceC2498hC)) ? g0H : g0H2).p(s10, N0.OUT_VARIANCE);
                if (sP == null) {
                    return null;
                }
                if (sP != s10 && zArr != null) {
                    zArr[0] = true;
                }
                u10.M0(sP);
            }
            u10.V0();
        }
        return g0H;
    }
}
