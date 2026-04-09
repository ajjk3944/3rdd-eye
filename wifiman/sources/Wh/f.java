package Wh;

import Uh.n;
import Uh.q;
import Uh.r;
import Uh.s;
import Uh.u;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class f {
    public static final q a(q qVar, g typeTable) {
        AbstractC6492s.i(qVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (qVar.t1()) {
            return qVar.b1();
        }
        if (qVar.u1()) {
            return typeTable.a(qVar.c1());
        }
        return null;
    }

    public static final List b(Uh.c cVar, g typeTable) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        List listH1 = cVar.H1();
        if (listH1.isEmpty()) {
            listH1 = null;
        }
        if (listH1 == null) {
            List listG1 = cVar.G1();
            AbstractC6492s.h(listG1, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listG1;
            listH1 = new ArrayList(AbstractC3689v.w(list, 10));
            for (Integer num : list) {
                AbstractC6492s.f(num);
                listH1.add(typeTable.a(num.intValue()));
            }
        }
        return listH1;
    }

    public static final List c(Uh.i iVar, g typeTable) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        List listI1 = iVar.i1();
        if (listI1.isEmpty()) {
            listI1 = null;
        }
        if (listI1 == null) {
            List listH1 = iVar.h1();
            AbstractC6492s.h(listH1, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listH1;
            listI1 = new ArrayList(AbstractC3689v.w(list, 10));
            for (Integer num : list) {
                AbstractC6492s.f(num);
                listI1.add(typeTable.a(num.intValue()));
            }
        }
        return listI1;
    }

    public static final List d(n nVar, g typeTable) {
        AbstractC6492s.i(nVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        List listH1 = nVar.h1();
        if (listH1.isEmpty()) {
            listH1 = null;
        }
        if (listH1 == null) {
            List listG1 = nVar.g1();
            AbstractC6492s.h(listG1, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listG1;
            listH1 = new ArrayList(AbstractC3689v.w(list, 10));
            for (Integer num : list) {
                AbstractC6492s.f(num);
                listH1.add(typeTable.a(num.intValue()));
            }
        }
        return listH1;
    }

    public static final q e(r rVar, g typeTable) {
        AbstractC6492s.i(rVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (rVar.n1()) {
            q qVarD1 = rVar.d1();
            AbstractC6492s.h(qVarD1, "getExpandedType(...)");
            return qVarD1;
        }
        if (rVar.o1()) {
            return typeTable.a(rVar.e1());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final q f(q qVar, g typeTable) {
        AbstractC6492s.i(qVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (qVar.y1()) {
            return qVar.l1();
        }
        if (qVar.z1()) {
            return typeTable.a(qVar.m1());
        }
        return null;
    }

    public static final boolean g(Uh.i iVar) {
        AbstractC6492s.i(iVar, "<this>");
        return iVar.F1() || iVar.G1();
    }

    public static final boolean h(n nVar) {
        AbstractC6492s.i(nVar, "<this>");
        return nVar.C1() || nVar.D1();
    }

    public static final q i(Uh.c cVar, g typeTable) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (cVar.y2()) {
            return cVar.T1();
        }
        if (cVar.z2()) {
            return typeTable.a(cVar.U1());
        }
        return null;
    }

    public static final q j(q qVar, g typeTable) {
        AbstractC6492s.i(qVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (qVar.B1()) {
            return qVar.o1();
        }
        if (qVar.C1()) {
            return typeTable.a(qVar.p1());
        }
        return null;
    }

    public static final q k(Uh.i iVar, g typeTable) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (iVar.F1()) {
            return iVar.p1();
        }
        if (iVar.G1()) {
            return typeTable.a(iVar.q1());
        }
        return null;
    }

    public static final q l(n nVar, g typeTable) {
        AbstractC6492s.i(nVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (nVar.C1()) {
            return nVar.o1();
        }
        if (nVar.D1()) {
            return typeTable.a(nVar.p1());
        }
        return null;
    }

    public static final q m(Uh.i iVar, g typeTable) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (iVar.H1()) {
            q qVarR1 = iVar.r1();
            AbstractC6492s.h(qVarR1, "getReturnType(...)");
            return qVarR1;
        }
        if (iVar.I1()) {
            return typeTable.a(iVar.s1());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final q n(n nVar, g typeTable) {
        AbstractC6492s.i(nVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (nVar.E1()) {
            q qVarQ1 = nVar.q1();
            AbstractC6492s.h(qVarQ1, "getReturnType(...)");
            return qVarQ1;
        }
        if (nVar.F1()) {
            return typeTable.a(nVar.r1());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(Uh.c cVar, g typeTable) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        List listK2 = cVar.k2();
        if (listK2.isEmpty()) {
            listK2 = null;
        }
        if (listK2 == null) {
            List listJ2 = cVar.j2();
            AbstractC6492s.h(listJ2, "getSupertypeIdList(...)");
            List<Integer> list = listJ2;
            listK2 = new ArrayList(AbstractC3689v.w(list, 10));
            for (Integer num : list) {
                AbstractC6492s.f(num);
                listK2.add(typeTable.a(num.intValue()));
            }
        }
        return listK2;
    }

    public static final q p(q.b bVar, g typeTable) {
        AbstractC6492s.i(bVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (bVar.q0()) {
            return bVar.T();
        }
        if (bVar.C0()) {
            return typeTable.a(bVar.d0());
        }
        return null;
    }

    public static final q q(u uVar, g typeTable) {
        AbstractC6492s.i(uVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (uVar.c1()) {
            q qVarW0 = uVar.W0();
            AbstractC6492s.h(qVarW0, "getType(...)");
            return qVarW0;
        }
        if (uVar.d1()) {
            return typeTable.a(uVar.X0());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final q r(r rVar, g typeTable) {
        AbstractC6492s.i(rVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (rVar.r1()) {
            q qVarK1 = rVar.k1();
            AbstractC6492s.h(qVarK1, "getUnderlyingType(...)");
            return qVarK1;
        }
        if (rVar.s1()) {
            return typeTable.a(rVar.l1());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(s sVar, g typeTable) {
        AbstractC6492s.i(sVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        List listC1 = sVar.c1();
        if (listC1.isEmpty()) {
            listC1 = null;
        }
        if (listC1 == null) {
            List listB1 = sVar.b1();
            AbstractC6492s.h(listB1, "getUpperBoundIdList(...)");
            List<Integer> list = listB1;
            listC1 = new ArrayList(AbstractC3689v.w(list, 10));
            for (Integer num : list) {
                AbstractC6492s.f(num);
                listC1.add(typeTable.a(num.intValue()));
            }
        }
        return listC1;
    }

    public static final q t(u uVar, g typeTable) {
        AbstractC6492s.i(uVar, "<this>");
        AbstractC6492s.i(typeTable, "typeTable");
        if (uVar.e1()) {
            return uVar.Y0();
        }
        if (uVar.f1()) {
            return typeTable.a(uVar.Z0());
        }
        return null;
    }
}
