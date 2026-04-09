package Bh;

import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public abstract class p0 {
    public static final W d(pi.S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        return e(s10, interfaceC2498hC instanceof InterfaceC2499i ? (InterfaceC2499i) interfaceC2498hC : null, 0);
    }

    private static final W e(pi.S s10, InterfaceC2499i interfaceC2499i, int i10) {
        if (interfaceC2499i == null || kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2499i)) {
            return null;
        }
        int size = interfaceC2499i.w().size() + i10;
        if (interfaceC2499i.M()) {
            List listSubList = s10.L0().subList(i10, size);
            InterfaceC2503m interfaceC2503mB = interfaceC2499i.b();
            return new W(interfaceC2499i, listSubList, e(s10, interfaceC2503mB instanceof InterfaceC2499i ? (InterfaceC2499i) interfaceC2503mB : null, size));
        }
        if (size != s10.L0().size()) {
            bi.i.E(interfaceC2499i);
        }
        return new W(interfaceC2499i, s10.L0().subList(i10, s10.L0().size()), null);
    }

    private static final C2493c f(l0 l0Var, InterfaceC2503m interfaceC2503m, int i10) {
        return new C2493c(l0Var, interfaceC2503m, i10);
    }

    public static final List g(InterfaceC2499i interfaceC2499i) {
        List listL;
        Object next;
        pi.v0 v0VarK;
        AbstractC6492s.i(interfaceC2499i, "<this>");
        List listW = interfaceC2499i.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        if (!interfaceC2499i.M() && !(interfaceC2499i.b() instanceof InterfaceC2491a)) {
            return listW;
        }
        List listZ = AbstractC8783m.Z(AbstractC8783m.H(AbstractC8783m.C(AbstractC8783m.W(AbstractC5833e.u(interfaceC2499i), m0.f1788a), n0.f1789a), o0.f1790a));
        Iterator it = AbstractC5833e.u(interfaceC2499i).iterator();
        while (true) {
            listL = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC2495e) {
                break;
            }
        }
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) next;
        if (interfaceC2495e != null && (v0VarK = interfaceC2495e.k()) != null) {
            listL = v0VarK.getParameters();
        }
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        if (listZ.isEmpty() && listL.isEmpty()) {
            List listW2 = interfaceC2499i.w();
            AbstractC6492s.h(listW2, "getDeclaredTypeParameters(...)");
            return listW2;
        }
        List<l0> listM0 = AbstractC3689v.M0(listZ, listL);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listM0, 10));
        for (l0 l0Var : listM0) {
            AbstractC6492s.f(l0Var);
            arrayList.add(f(l0Var, interfaceC2499i, listW.size()));
        }
        return AbstractC3689v.M0(listW, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC2503m it) {
        AbstractC6492s.i(it, "it");
        return it instanceof InterfaceC2491a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC2503m it) {
        AbstractC6492s.i(it, "it");
        return !(it instanceof InterfaceC2502l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8780j j(InterfaceC2503m it) {
        AbstractC6492s.i(it, "it");
        List typeParameters = ((InterfaceC2491a) it).getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        return AbstractC3689v.d0(typeParameters);
    }
}
