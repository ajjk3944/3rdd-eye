package si;

import Bh.EnumC2496f;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Bh.k0;
import Bh.l0;
import Zg.AbstractC3689v;
import Zg.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.B0;
import pi.C7360k0;
import pi.C7377y;
import pi.D0;
import pi.F0;
import pi.I;
import pi.J0;
import pi.L0;
import pi.M0;
import pi.N0;
import pi.S;
import pi.V;
import pi.s0;
import pi.v0;

/* renamed from: si.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7984d {
    public static final S A(S s10) {
        AbstractC6492s.i(s10, "<this>");
        S sN = J0.n(s10);
        AbstractC6492s.h(sN, "makeNotNullable(...)");
        return sN;
    }

    public static final S B(S s10) {
        AbstractC6492s.i(s10, "<this>");
        S sO = J0.o(s10);
        AbstractC6492s.h(sO, "makeNullable(...)");
        return sO;
    }

    public static final S C(S s10, h newAnnotations) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(newAnnotations, "newAnnotations");
        return (s10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? s10 : s10.Q0().T0(s0.a(s10.M0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [pi.M0] */
    public static final S D(S s10) {
        AbstractC7346d0 abstractC7346d0F;
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            I i10 = (I) m0Q0;
            AbstractC7346d0 abstractC7346d0V0 = i10.V0();
            if (!abstractC7346d0V0.N0().getParameters().isEmpty() && abstractC7346d0V0.N0().c() != null) {
                List parameters = abstractC7346d0V0.N0().getParameters();
                AbstractC6492s.h(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C7360k0((l0) it.next()));
                }
                abstractC7346d0V0 = F0.f(abstractC7346d0V0, arrayList, null, 2, null);
            }
            AbstractC7346d0 abstractC7346d0W0 = i10.W0();
            if (!abstractC7346d0W0.N0().getParameters().isEmpty() && abstractC7346d0W0.N0().c() != null) {
                List parameters2 = abstractC7346d0W0.N0().getParameters();
                AbstractC6492s.h(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C7360k0((l0) it2.next()));
                }
                abstractC7346d0W0 = F0.f(abstractC7346d0W0, arrayList2, null, 2, null);
            }
            abstractC7346d0F = V.e(abstractC7346d0V0, abstractC7346d0W0);
        } else {
            if (!(m0Q0 instanceof AbstractC7346d0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) m0Q0;
            boolean zIsEmpty = abstractC7346d0.N0().getParameters().isEmpty();
            abstractC7346d0F = abstractC7346d0;
            if (!zIsEmpty) {
                InterfaceC2498h interfaceC2498hC = abstractC7346d0.N0().c();
                abstractC7346d0F = abstractC7346d0;
                if (interfaceC2498hC != null) {
                    List parameters3 = abstractC7346d0.N0().getParameters();
                    AbstractC6492s.h(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C7360k0((l0) it3.next()));
                    }
                    abstractC7346d0F = F0.f(abstractC7346d0, arrayList3, null, 2, null);
                }
            }
        }
        return L0.b(abstractC7346d0F, m0Q0);
    }

    public static final boolean E(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return e(s10, C7983c.f61644a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(M0 it) {
        AbstractC6492s.i(it, "it");
        InterfaceC2498h interfaceC2498hC = it.N0().c();
        if (interfaceC2498hC != null) {
            return (interfaceC2498hC instanceof k0) || (interfaceC2498hC instanceof l0);
        }
        return false;
    }

    public static final B0 d(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return new D0(s10);
    }

    public static final boolean e(S s10, InterfaceC6835l predicate) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return J0.c(s10, predicate);
    }

    private static final boolean f(S s10, v0 v0Var, Set set) {
        boolean zF;
        if (AbstractC6492s.d(s10.N0(), v0Var)) {
            return true;
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        InterfaceC2499i interfaceC2499i = interfaceC2498hC instanceof InterfaceC2499i ? (InterfaceC2499i) interfaceC2498hC : null;
        List listW = interfaceC2499i != null ? interfaceC2499i.w() : null;
        Iterable<N> iterableQ1 = AbstractC3689v.q1(s10.L0());
        if (!(iterableQ1 instanceof Collection) || !((Collection) iterableQ1).isEmpty()) {
            for (N n10 : iterableQ1) {
                int iA = n10.a();
                B0 b02 = (B0) n10.b();
                l0 l0Var = listW != null ? (l0) AbstractC3689v.t0(listW, iA) : null;
                if ((l0Var == null || set == null || !set.contains(l0Var)) && !b02.c()) {
                    S type = b02.getType();
                    AbstractC6492s.h(type, "getType(...)");
                    zF = f(type, v0Var, set);
                } else {
                    zF = false;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return e(s10, C7982b.f61643a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(M0 it) {
        AbstractC6492s.i(it, "it");
        InterfaceC2498h interfaceC2498hC = it.N0().c();
        if (interfaceC2498hC != null) {
            return x(interfaceC2498hC);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return J0.c(s10, C7981a.f61642a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(M0 m02) {
        return Boolean.valueOf(J0.m(m02));
    }

    public static final B0 k(S type, N0 projectionKind, l0 l0Var) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(projectionKind, "projectionKind");
        if ((l0Var != null ? l0Var.p() : null) == projectionKind) {
            projectionKind = N0.INVARIANT;
        }
        return new D0(projectionKind, type);
    }

    public static final Set l(S s10, Set set) {
        AbstractC6492s.i(s10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(s10, s10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(S s10, S s11, Set set, Set set2) {
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC instanceof l0) {
            if (!AbstractC6492s.d(s10.N0(), s11.N0())) {
                set.add(interfaceC2498hC);
                return;
            }
            for (S s12 : ((l0) interfaceC2498hC).getUpperBounds()) {
                AbstractC6492s.f(s12);
                m(s12, s11, set, set2);
            }
            return;
        }
        InterfaceC2498h interfaceC2498hC2 = s10.N0().c();
        InterfaceC2499i interfaceC2499i = interfaceC2498hC2 instanceof InterfaceC2499i ? (InterfaceC2499i) interfaceC2498hC2 : null;
        List listW = interfaceC2499i != null ? interfaceC2499i.w() : null;
        int i10 = 0;
        for (B0 b02 : s10.L0()) {
            int i11 = i10 + 1;
            l0 l0Var = listW != null ? (l0) AbstractC3689v.t0(listW, i10) : null;
            if ((l0Var == null || set2 == null || !set2.contains(l0Var)) && !b02.c() && !AbstractC3689v.f0(set, b02.getType().N0().c()) && !AbstractC6492s.d(b02.getType().N0(), s11.N0())) {
                S type = b02.getType();
                AbstractC6492s.h(type, "getType(...)");
                m(type, s11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final i n(S s10) {
        AbstractC6492s.i(s10, "<this>");
        i iVarQ = s10.N0().q();
        AbstractC6492s.h(iVarQ, "getBuiltIns(...)");
        return iVarQ;
    }

    public static final S o(l0 l0Var) {
        Object obj;
        AbstractC6492s.i(l0Var, "<this>");
        List upperBounds = l0Var.getUpperBounds();
        AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = l0Var.getUpperBounds();
        AbstractC6492s.h(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC2498h interfaceC2498hC = ((S) next).N0().c();
            InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            if (interfaceC2495e != null && interfaceC2495e.h() != EnumC2496f.INTERFACE && interfaceC2495e.h() != EnumC2496f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        S s10 = (S) obj;
        if (s10 != null) {
            return s10;
        }
        List upperBounds3 = l0Var.getUpperBounds();
        AbstractC6492s.h(upperBounds3, "getUpperBounds(...)");
        Object objQ0 = AbstractC3689v.q0(upperBounds3);
        AbstractC6492s.h(objQ0, "first(...)");
        return (S) objQ0;
    }

    public static final boolean p(l0 typeParameter) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final boolean q(l0 typeParameter, v0 v0Var, Set set) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
        List<S> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (S s10 : list) {
            AbstractC6492s.f(s10);
            if (f(s10, typeParameter.u().N0(), set) && (v0Var == null || AbstractC6492s.d(s10.N0(), v0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(l0 l0Var, v0 v0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(l0Var, v0Var, set);
    }

    public static final boolean s(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return i.f0(s10);
    }

    public static final boolean t(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return i.n0(s10);
    }

    public static final boolean u(S s10) {
        AbstractC6492s.i(s10, "<this>");
        if (!(s10 instanceof C7377y)) {
            return false;
        }
        ((C7377y) s10).Z0();
        return false;
    }

    public static final boolean v(S s10) {
        AbstractC6492s.i(s10, "<this>");
        if (!(s10 instanceof C7377y)) {
            return false;
        }
        ((C7377y) s10).Z0();
        return false;
    }

    public static final boolean w(S s10, S superType) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(superType, "superType");
        return e.f52144a.c(s10, superType);
    }

    public static final boolean x(InterfaceC2498h interfaceC2498h) {
        AbstractC6492s.i(interfaceC2498h, "<this>");
        return (interfaceC2498h instanceof l0) && (((l0) interfaceC2498h).b() instanceof k0);
    }

    public static final boolean y(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return J0.m(s10);
    }

    public static final boolean z(S type) {
        AbstractC6492s.i(type, "type");
        return (type instanceof kotlin.reflect.jvm.internal.impl.types.error.i) && ((kotlin.reflect.jvm.internal.impl.types.error.i) type).X0().isUnresolved();
    }
}
