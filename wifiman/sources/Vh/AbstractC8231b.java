package vh;

import Bh.EnumC2496f;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import th.e;
import th.p;
import th.q;
import wh.U0;
import wh.Y0;

/* renamed from: vh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8231b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final th.d a(e eVar) {
        InterfaceC2495e interfaceC2495e;
        th.d dVarB;
        AbstractC6492s.i(eVar, "<this>");
        if (eVar instanceof th.d) {
            return (th.d) eVar;
        }
        if (!(eVar instanceof q)) {
            throw new Y0("Cannot calculate JVM erasure for type: " + eVar);
        }
        List upperBounds = ((q) eVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            p pVar = (p) next;
            AbstractC6492s.g(pVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC2498h interfaceC2498hC = ((U0) pVar).u().N0().c();
            interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            if (interfaceC2495e != null && interfaceC2495e.h() != EnumC2496f.INTERFACE && interfaceC2495e.h() != EnumC2496f.ANNOTATION_CLASS) {
                interfaceC2495e = next;
                break;
            }
        }
        p pVar2 = (p) interfaceC2495e;
        if (pVar2 == null) {
            pVar2 = (p) AbstractC3689v.s0(upperBounds);
        }
        return (pVar2 == null || (dVarB = b(pVar2)) == null) ? O.b(Object.class) : dVarB;
    }

    public static final th.d b(p pVar) {
        th.d dVarA;
        AbstractC6492s.i(pVar, "<this>");
        e eVarR = pVar.r();
        if (eVarR != null && (dVarA = a(eVarR)) != null) {
            return dVarA;
        }
        throw new Y0("Cannot calculate JVM erasure for type: " + pVar);
    }
}
