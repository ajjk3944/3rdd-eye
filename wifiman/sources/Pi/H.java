package pi;

import java.util.HashSet;
import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;

/* loaded from: classes4.dex */
public abstract class H {
    public static final InterfaceC7618i a(H0 h02, InterfaceC7618i inlineClassType) {
        AbstractC6492s.i(h02, "<this>");
        AbstractC6492s.i(inlineClassType, "inlineClassType");
        return b(h02, inlineClassType, new HashSet());
    }

    private static final InterfaceC7618i b(H0 h02, InterfaceC7618i interfaceC7618i, HashSet hashSet) {
        InterfaceC7618i interfaceC7618iB;
        InterfaceC7618i interfaceC7618iG0;
        ri.m mVarF0 = h02.f0(interfaceC7618i);
        if (!hashSet.add(mVarF0)) {
            return null;
        }
        ri.n nVarE0 = h02.e0(mVarF0);
        if (nVarE0 != null) {
            InterfaceC7618i interfaceC7618iU0 = h02.u0(nVarE0);
            interfaceC7618iB = b(h02, interfaceC7618iU0, hashSet);
            if (interfaceC7618iB == null) {
                return null;
            }
            boolean z10 = h02.n0(h02.f0(interfaceC7618iU0)) || ((interfaceC7618iU0 instanceof InterfaceC7619j) && h02.D0((InterfaceC7619j) interfaceC7618iU0));
            if ((interfaceC7618iB instanceof InterfaceC7619j) && h02.D0((InterfaceC7619j) interfaceC7618iB) && h02.v0(interfaceC7618i) && z10) {
                interfaceC7618iG0 = h02.G0(interfaceC7618iU0);
            } else if (!h02.v0(interfaceC7618iB) && h02.C0(interfaceC7618i)) {
                interfaceC7618iG0 = h02.G0(interfaceC7618iB);
            }
            return interfaceC7618iG0;
        }
        if (!h02.n0(mVarF0)) {
            return interfaceC7618i;
        }
        InterfaceC7618i interfaceC7618iH = h02.h(interfaceC7618i);
        if (interfaceC7618iH == null || (interfaceC7618iB = b(h02, interfaceC7618iH, hashSet)) == null) {
            return null;
        }
        if (h02.v0(interfaceC7618i)) {
            return h02.v0(interfaceC7618iB) ? interfaceC7618i : ((interfaceC7618iB instanceof InterfaceC7619j) && h02.D0((InterfaceC7619j) interfaceC7618iB)) ? interfaceC7618i : h02.G0(interfaceC7618iB);
        }
        return interfaceC7618iB;
    }
}
