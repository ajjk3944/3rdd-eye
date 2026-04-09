package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import di.AbstractC5398g;
import di.x;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.B0;
import pi.S;
import pi.V;
import pi.s0;
import si.AbstractC7984d;
import xi.AbstractC8534a;
import zh.AbstractC8767f;
import zh.C8768g;

/* loaded from: classes4.dex */
public abstract class h {
    public static final int a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarL = s10.getAnnotations().l(o.a.f51809D);
        if (cVarL == null) {
            return 0;
        }
        AbstractC5398g abstractC5398g = (AbstractC5398g) U.i(cVarL.a(), o.f51793q);
        AbstractC6492s.g(abstractC5398g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((di.n) abstractC5398g).b()).intValue();
    }

    public static final AbstractC7346d0 b(i builtIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, boolean z10) {
        AbstractC6492s.i(builtIns, "builtIns");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(contextReceiverTypes, "contextReceiverTypes");
        AbstractC6492s.i(parameterTypes, "parameterTypes");
        AbstractC6492s.i(returnType, "returnType");
        List listG = g(s10, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC2495e interfaceC2495eF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (s10 == null ? 0 : 1), z10);
        if (s10 != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return V.h(s0.b(annotations), interfaceC2495eF, listG);
    }

    public static final Zh.f d(S s10) {
        String str;
        AbstractC6492s.i(s10, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarL = s10.getAnnotations().l(o.a.f51811E);
        if (cVarL == null) {
            return null;
        }
        Object objS0 = AbstractC3689v.S0(cVarL.a().values());
        x xVar = objS0 instanceof x ? (x) objS0 : null;
        if (xVar != null && (str = (String) xVar.b()) != null) {
            if (!Zh.f.l(str)) {
                str = null;
            }
            if (str != null) {
                return Zh.f.h(str);
            }
        }
        return null;
    }

    public static final List e(S s10) {
        AbstractC6492s.i(s10, "<this>");
        p(s10);
        int iA = a(s10);
        if (iA == 0) {
            return AbstractC3689v.l();
        }
        List listSubList = s10.L0().subList(0, iA);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return arrayList;
    }

    public static final InterfaceC2495e f(i builtIns, int i10, boolean z10) {
        AbstractC6492s.i(builtIns, "builtIns");
        InterfaceC2495e interfaceC2495eX = z10 ? builtIns.X(i10) : builtIns.C(i10);
        AbstractC6492s.f(interfaceC2495eX);
        return interfaceC2495eX;
    }

    public static final List g(S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, i builtIns) {
        Zh.f fVar;
        AbstractC6492s.i(contextReceiverTypes, "contextReceiverTypes");
        AbstractC6492s.i(parameterTypes, "parameterTypes");
        AbstractC6492s.i(returnType, "returnType");
        AbstractC6492s.i(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (s10 != null ? 1 : 0) + 1);
        List list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC7984d.d((S) it.next()));
        }
        arrayList.addAll(arrayList2);
        AbstractC8534a.a(arrayList, s10 != null ? AbstractC7984d.d(s10) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            S sC = (S) obj;
            if (list == null || (fVar = (Zh.f) list.get(i10)) == null || fVar.j()) {
                fVar = null;
            }
            if (fVar != null) {
                Zh.c cVar = o.a.f51811E;
                Zh.f fVar2 = o.f51789m;
                String strB = fVar.b();
                AbstractC6492s.h(strB, "asString(...)");
                sC = AbstractC7984d.C(sC, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.L0(sC.getAnnotations(), new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(builtIns, cVar, U.e(z.a(fVar2, new x(strB))), false, 8, null))));
            }
            arrayList.add(AbstractC7984d.d(sC));
            i10 = i11;
        }
        arrayList.add(AbstractC7984d.d(returnType));
        return arrayList;
    }

    public static final AbstractC8767f h(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        if ((interfaceC2503m instanceof InterfaceC2495e) && i.B0(interfaceC2503m)) {
            return i(AbstractC5833e.p(interfaceC2503m));
        }
        return null;
    }

    private static final AbstractC8767f i(Zh.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        C8768g c8768gA = C8768g.f67314c.a();
        Zh.c cVarE = dVar.l().e();
        AbstractC6492s.h(cVarE, "parent(...)");
        String strB = dVar.i().b();
        AbstractC6492s.h(strB, "asString(...)");
        return c8768gA.b(cVarE, strB);
    }

    public static final AbstractC8767f j(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC != null) {
            return h(interfaceC2498hC);
        }
        return null;
    }

    public static final S k(S s10) {
        AbstractC6492s.i(s10, "<this>");
        p(s10);
        if (!s(s10)) {
            return null;
        }
        return ((B0) s10.L0().get(a(s10))).getType();
    }

    public static final S l(S s10) {
        AbstractC6492s.i(s10, "<this>");
        p(s10);
        S type = ((B0) AbstractC3689v.B0(s10.L0())).getType();
        AbstractC6492s.h(type, "getType(...)");
        return type;
    }

    public static final List m(S s10) {
        AbstractC6492s.i(s10, "<this>");
        p(s10);
        return s10.L0().subList(a(s10) + (n(s10) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return p(s10) && s(s10);
    }

    public static final boolean o(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        AbstractC8767f abstractC8767fH = h(interfaceC2503m);
        return AbstractC6492s.d(abstractC8767fH, AbstractC8767f.a.f67310e) || AbstractC6492s.d(abstractC8767fH, AbstractC8767f.d.f67313e);
    }

    public static final boolean p(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        return interfaceC2498hC != null && o(interfaceC2498hC);
    }

    public static final boolean q(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return AbstractC6492s.d(j(s10), AbstractC8767f.a.f67310e);
    }

    public static final boolean r(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return AbstractC6492s.d(j(s10), AbstractC8767f.d.f67313e);
    }

    private static final boolean s(S s10) {
        return s10.getAnnotations().l(o.a.f51807C) != null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h t(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, i builtIns, int i10) {
        AbstractC6492s.i(hVar, "<this>");
        AbstractC6492s.i(builtIns, "builtIns");
        Zh.c cVar = o.a.f51809D;
        return hVar.P(cVar) ? hVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.L0(hVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(builtIns, cVar, U.e(z.a(o.f51793q, new di.n(i10))), false, 8, null)));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h u(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, i builtIns) {
        AbstractC6492s.i(hVar, "<this>");
        AbstractC6492s.i(builtIns, "builtIns");
        Zh.c cVar = o.a.f51807C;
        return hVar.P(cVar) ? hVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.L0(hVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(builtIns, cVar, U.h(), false, 8, null)));
    }
}
