package Bh;

import ii.InterfaceC6164k;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import si.AbstractC7984d;

/* renamed from: Bh.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2508s {
    public static final InterfaceC2498h a(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        InterfaceC2503m interfaceC2503mB = interfaceC2503m.b();
        if (interfaceC2503mB == null || (interfaceC2503m instanceof M)) {
            return null;
        }
        if (!b(interfaceC2503mB)) {
            return a(interfaceC2503mB);
        }
        if (interfaceC2503mB instanceof InterfaceC2498h) {
            return (InterfaceC2498h) interfaceC2503mB;
        }
        return null;
    }

    public static final boolean b(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return interfaceC2503m.b() instanceof M;
    }

    public static final boolean c(InterfaceC2515z interfaceC2515z) {
        AbstractC7346d0 abstractC7346d0U;
        pi.S sD;
        pi.S returnType;
        AbstractC6492s.i(interfaceC2515z, "<this>");
        InterfaceC2503m interfaceC2503mB = interfaceC2515z.b();
        InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
        if (interfaceC2495e == null) {
            return false;
        }
        InterfaceC2495e interfaceC2495e2 = bi.k.g(interfaceC2495e) ? interfaceC2495e : null;
        if (interfaceC2495e2 == null || (abstractC7346d0U = interfaceC2495e2.u()) == null || (sD = AbstractC7984d.D(abstractC7346d0U)) == null || (returnType = interfaceC2515z.getReturnType()) == null || !AbstractC6492s.d(interfaceC2515z.getName(), ui.t.f63144e)) {
            return false;
        }
        if ((!AbstractC7984d.s(returnType) && !AbstractC7984d.t(returnType)) || interfaceC2515z.i().size() != 1) {
            return false;
        }
        pi.S type = ((s0) interfaceC2515z.i().get(0)).getType();
        AbstractC6492s.h(type, "getType(...)");
        return AbstractC6492s.d(AbstractC7984d.D(type), sD) && interfaceC2515z.p0().isEmpty() && interfaceC2515z.k0() == null;
    }

    public static final InterfaceC2495e d(G g10, Zh.c fqName, Ih.b lookupLocation) {
        InterfaceC2498h interfaceC2498hG;
        InterfaceC6164k interfaceC6164kY0;
        AbstractC6492s.i(g10, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        Zh.c cVarE = fqName.e();
        AbstractC6492s.h(cVarE, "parent(...)");
        InterfaceC6164k interfaceC6164kR = g10.y(cVarE).r();
        Zh.f fVarG = fqName.g();
        AbstractC6492s.h(fVarG, "shortName(...)");
        InterfaceC2498h interfaceC2498hG2 = interfaceC6164kR.g(fVarG, lookupLocation);
        InterfaceC2495e interfaceC2495e = interfaceC2498hG2 instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hG2 : null;
        if (interfaceC2495e != null) {
            return interfaceC2495e;
        }
        Zh.c cVarE2 = fqName.e();
        AbstractC6492s.h(cVarE2, "parent(...)");
        InterfaceC2495e interfaceC2495eD = d(g10, cVarE2, lookupLocation);
        if (interfaceC2495eD == null || (interfaceC6164kY0 = interfaceC2495eD.y0()) == null) {
            interfaceC2498hG = null;
        } else {
            Zh.f fVarG2 = fqName.g();
            AbstractC6492s.h(fVarG2, "shortName(...)");
            interfaceC2498hG = interfaceC6164kY0.g(fVarG2, lookupLocation);
        }
        if (interfaceC2498hG instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hG;
        }
        return null;
    }
}
