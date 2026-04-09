package wh;

import Bh.InterfaceC2503m;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC6492s;
import ni.C6963N;
import wh.K0;
import xh.i;

/* loaded from: classes4.dex */
public abstract class P0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final xh.h b(wh.K0.a r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.P0.b(wh.K0$a, boolean):xh.h");
    }

    private static final xh.i c(K0.a aVar, boolean z10, Field field) {
        xh.i aVar2;
        if (g(aVar.e0().d0()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar2 = aVar.b0() ? new i.g.a(field, e(aVar), f(aVar)) : new i.g.c(field, e(aVar));
            } else {
                if (!aVar.b0()) {
                    return new i.f.c(field);
                }
                aVar2 = new i.f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.b0() ? new i.f.b(field) : new i.f.d(field);
            }
            aVar2 = aVar.b0() ? new i.g.b(field, e(aVar)) : new i.g.d(field, e(aVar));
        } else {
            if (z10) {
                return new i.f.e(field);
            }
            aVar2 = new i.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(K0.a aVar) {
        return aVar.e0().d0().getAnnotations().P(j1.j());
    }

    private static final boolean e(K0.a aVar) {
        return !pi.J0.l(aVar.e0().d0().getType());
    }

    public static final Object f(K0.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        return aVar.e0().i0();
    }

    private static final boolean g(Bh.Y y10) {
        InterfaceC2503m interfaceC2503mB = y10.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        if (!bi.i.x(interfaceC2503mB)) {
            return false;
        }
        InterfaceC2503m interfaceC2503mB2 = interfaceC2503mB.b();
        return !(bi.i.C(interfaceC2503mB2) || bi.i.t(interfaceC2503mB2)) || ((y10 instanceof C6963N) && Yh.i.f(((C6963N) y10).F()));
    }
}
