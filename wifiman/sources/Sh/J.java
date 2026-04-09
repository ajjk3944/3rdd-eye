package Sh;

import Ah.c;
import Rh.l0;
import gi.C5922d;
import gi.EnumC5923e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.H0;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public abstract class J {
    public static final Object a(t tVar, Object possiblyPrimitiveType, boolean z10) {
        AbstractC6492s.i(tVar, "<this>");
        AbstractC6492s.i(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? tVar.d(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object b(H0 h02, InterfaceC7618i type, t typeFactory, I mode) {
        AbstractC6492s.i(h02, "<this>");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(typeFactory, "typeFactory");
        AbstractC6492s.i(mode, "mode");
        ri.m mVarF0 = h02.f0(type);
        if (!h02.Z(mVarF0)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.l lVarG = h02.G(mVarF0);
        if (lVarG != null) {
            return a(typeFactory, typeFactory.f(lVarG), h02.v0(type) || l0.c(h02, type));
        }
        kotlin.reflect.jvm.internal.impl.builtins.l lVarO = h02.o(mVarF0);
        if (lVarO != null) {
            return typeFactory.b('[' + EnumC5923e.get(lVarO).getDesc());
        }
        if (h02.n(mVarF0)) {
            Zh.d dVarS0 = h02.s0(mVarF0);
            Zh.b bVarN = dVarS0 != null ? Ah.c.f771a.n(dVarS0) : null;
            if (bVarN != null) {
                if (!mode.a()) {
                    List listI = Ah.c.f771a.i();
                    if (!(listI instanceof Collection) || !listI.isEmpty()) {
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            if (AbstractC6492s.d(((c.a) it.next()).d(), bVarN)) {
                                return null;
                            }
                        }
                    }
                }
                String strH = C5922d.h(bVarN);
                AbstractC6492s.h(strH, "internalNameByClassId(...)");
                return typeFactory.c(strH);
            }
        }
        return null;
    }
}
