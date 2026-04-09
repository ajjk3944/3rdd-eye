package vh;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import th.g;
import th.h;
import th.l;
import wh.AbstractC8339A;
import wh.j1;
import xh.h;

/* renamed from: vh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8230a {
    public static final boolean a(th.c cVar) {
        h hVarX;
        AbstractC6492s.i(cVar, "<this>");
        if (cVar instanceof th.h) {
            l lVar = (l) cVar;
            Field fieldB = AbstractC8232c.b(lVar);
            if (!(fieldB != null ? fieldB.isAccessible() : true)) {
                return false;
            }
            Method methodC = AbstractC8232c.c(lVar);
            if (!(methodC != null ? methodC.isAccessible() : true)) {
                return false;
            }
            Method methodE = AbstractC8232c.e((th.h) cVar);
            if (!(methodE != null ? methodE.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof l) {
            l lVar2 = (l) cVar;
            Field fieldB2 = AbstractC8232c.b(lVar2);
            if (!(fieldB2 != null ? fieldB2.isAccessible() : true)) {
                return false;
            }
            Method methodC2 = AbstractC8232c.c(lVar2);
            if (!(methodC2 != null ? methodC2.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof l.b) {
            Field fieldB3 = AbstractC8232c.b(((l.b) cVar).e0());
            if (!(fieldB3 != null ? fieldB3.isAccessible() : true)) {
                return false;
            }
            Method methodD = AbstractC8232c.d((g) cVar);
            if (!(methodD != null ? methodD.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof h.a) {
            Field fieldB4 = AbstractC8232c.b(((h.a) cVar).e0());
            if (!(fieldB4 != null ? fieldB4.isAccessible() : true)) {
                return false;
            }
            Method methodD2 = AbstractC8232c.d((g) cVar);
            if (!(methodD2 != null ? methodD2.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof g)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            g gVar = (g) cVar;
            Method methodD3 = AbstractC8232c.d(gVar);
            if (!(methodD3 != null ? methodD3.isAccessible() : true)) {
                return false;
            }
            AbstractC8339A abstractC8339AB = j1.b(cVar);
            Member memberB = (abstractC8339AB == null || (hVarX = abstractC8339AB.X()) == null) ? null : hVarX.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorA = AbstractC8232c.a(gVar);
            if (!(constructorA != null ? constructorA.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
