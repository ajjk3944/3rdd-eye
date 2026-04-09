package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.l0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import pi.AbstractC7346d0;
import pi.B0;
import pi.G0;
import pi.M0;
import pi.N0;
import pi.S;
import pi.V;
import pi.w0;
import ri.EnumC7611b;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public abstract class o {
    private static final List a(M0 m02, EnumC7611b enumC7611b) {
        if (m02.L0().size() != m02.N0().getParameters().size()) {
            return null;
        }
        List listL0 = m02.L0();
        List list = listL0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((B0) it.next()).a() != N0.INVARIANT) {
                    List parameters = m02.N0().getParameters();
                    AbstractC6492s.h(parameters, "getParameters(...)");
                    List<Yg.s> listS1 = AbstractC3689v.s1(list, parameters);
                    ArrayList arrayList = new ArrayList(AbstractC3689v.w(listS1, 10));
                    for (Yg.s sVar : listS1) {
                        B0 b0D = (B0) sVar.a();
                        l0 l0Var = (l0) sVar.c();
                        if (b0D.a() != N0.INVARIANT) {
                            M0 m0Q0 = (b0D.c() || b0D.a() != N0.IN_VARIANCE) ? null : b0D.getType().Q0();
                            AbstractC6492s.f(l0Var);
                            b0D = AbstractC7984d.d(new i(enumC7611b, m0Q0, b0D, l0Var));
                        }
                        arrayList.add(b0D);
                    }
                    G0 g0C = w0.f58185c.b(m02.N0(), arrayList).c();
                    int size = listL0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        B0 b02 = (B0) listL0.get(i10);
                        B0 b03 = (B0) arrayList.get(i10);
                        if (b02.a() != N0.INVARIANT) {
                            List upperBounds = ((l0) m02.N0().getParameters().get(i10)).getUpperBounds();
                            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f52145a.a(g0C.n((S) it2.next(), N0.INVARIANT).Q0()));
                            }
                            if (!b02.c() && b02.a() == N0.OUT_VARIANCE) {
                                arrayList2.add(f.a.f52145a.a(b02.getType().Q0()));
                            }
                            S type = b03.getType();
                            AbstractC6492s.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).N0().n(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final AbstractC7346d0 b(AbstractC7346d0 type, EnumC7611b status) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(status, "status");
        List listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final AbstractC7346d0 c(M0 m02, List list) {
        return V.k(m02.M0(), m02.N0(), list, m02.O0(), null, 16, null);
    }
}
