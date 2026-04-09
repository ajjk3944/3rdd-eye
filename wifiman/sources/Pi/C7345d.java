package pi;

import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7616g;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;
import ri.InterfaceC7621l;

/* renamed from: pi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7345d {

    /* renamed from: a, reason: collision with root package name */
    public static final C7345d f58110a = new C7345d();

    private C7345d() {
    }

    private final boolean a(ri.o oVar, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        if (oVar.k0(interfaceC7619j) == oVar.k0(interfaceC7619j2) && oVar.t(interfaceC7619j) == oVar.t(interfaceC7619j2)) {
            if ((oVar.V(interfaceC7619j) == null) == (oVar.V(interfaceC7619j2) == null) && oVar.O(oVar.d(interfaceC7619j), oVar.d(interfaceC7619j2))) {
                if (oVar.r(interfaceC7619j, interfaceC7619j2)) {
                    return true;
                }
                int iK0 = oVar.k0(interfaceC7619j);
                for (int i10 = 0; i10 < iK0; i10++) {
                    InterfaceC7621l interfaceC7621lC = oVar.C(interfaceC7619j, i10);
                    InterfaceC7621l interfaceC7621lC2 = oVar.C(interfaceC7619j2, i10);
                    if (oVar.p(interfaceC7621lC) != oVar.p(interfaceC7621lC2)) {
                        return false;
                    }
                    if (!oVar.p(interfaceC7621lC) && (oVar.v(interfaceC7621lC) != oVar.v(interfaceC7621lC2) || !c(oVar, oVar.j(interfaceC7621lC), oVar.j(interfaceC7621lC2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(ri.o oVar, InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2) {
        if (interfaceC7618i == interfaceC7618i2) {
            return true;
        }
        InterfaceC7619j interfaceC7619jC = oVar.c(interfaceC7618i);
        InterfaceC7619j interfaceC7619jC2 = oVar.c(interfaceC7618i2);
        if (interfaceC7619jC != null && interfaceC7619jC2 != null) {
            return a(oVar, interfaceC7619jC, interfaceC7619jC2);
        }
        InterfaceC7616g interfaceC7616gU = oVar.u(interfaceC7618i);
        InterfaceC7616g interfaceC7616gU2 = oVar.u(interfaceC7618i2);
        if (interfaceC7616gU == null || interfaceC7616gU2 == null) {
            return false;
        }
        return a(oVar, oVar.e(interfaceC7616gU), oVar.e(interfaceC7616gU2)) && a(oVar, oVar.g(interfaceC7616gU), oVar.g(interfaceC7616gU2));
    }

    public final boolean b(ri.o context, InterfaceC7618i a10, InterfaceC7618i b10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return c(context, a10, b10);
    }
}
