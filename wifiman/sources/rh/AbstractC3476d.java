package Rh;

import Jh.AbstractC3108b;
import Jh.EnumC3109c;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import ri.InterfaceC7618i;
import ri.InterfaceC7621l;

/* renamed from: Rh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3476d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rh.d$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC7618i f19899a;

        /* renamed from: b, reason: collision with root package name */
        private final Jh.E f19900b;

        /* renamed from: c, reason: collision with root package name */
        private final ri.n f19901c;

        public a(InterfaceC7618i interfaceC7618i, Jh.E e10, ri.n nVar) {
            this.f19899a = interfaceC7618i;
            this.f19900b = e10;
            this.f19901c = nVar;
        }

        public final Jh.E a() {
            return this.f19900b;
        }

        public final InterfaceC7618i b() {
            return this.f19899a;
        }

        public final ri.n c() {
            return this.f19901c;
        }
    }

    private final C3484l G(C3484l c3484l, C3484l c3484l2) {
        return c3484l == null ? c3484l2 : c3484l2 == null ? c3484l : (!c3484l.d() || c3484l2.d()) ? (c3484l.d() || !c3484l2.d()) ? (c3484l.c().compareTo(c3484l2.c()) >= 0 && c3484l.c().compareTo(c3484l2.c()) > 0) ? c3484l : c3484l2 : c3484l : c3484l2;
    }

    private final List H(InterfaceC7618i interfaceC7618i) {
        return j(new a(interfaceC7618i, f(interfaceC7618i, r()), null), new C3475c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractC3476d abstractC3476d, ri.o oVar, a it) {
        InterfaceC7618i interfaceC7618iB;
        ri.m mVarF0;
        List listJ0;
        a aVar;
        InterfaceC7618i interfaceC7618iB2;
        AbstractC6492s.i(it, "it");
        if ((abstractC3476d.z() && (interfaceC7618iB2 = it.b()) != null && oVar.R(interfaceC7618iB2)) || (interfaceC7618iB = it.b()) == null || (mVarF0 = oVar.f0(interfaceC7618iB)) == null || (listJ0 = oVar.j0(mVarF0)) == null) {
            return null;
        }
        List list = listJ0;
        List listH = oVar.H(it.b());
        Iterator it2 = list.iterator();
        Iterator it3 = listH.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC3689v.w(list, 10), AbstractC3689v.w(listH, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            InterfaceC7621l interfaceC7621l = (InterfaceC7621l) it3.next();
            ri.n nVar = (ri.n) next;
            if (oVar.p(interfaceC7621l)) {
                aVar = new a(null, it.a(), nVar);
            } else {
                InterfaceC7618i interfaceC7618iJ = oVar.j(interfaceC7621l);
                aVar = new a(interfaceC7618iJ, abstractC3476d.f(interfaceC7618iJ, it.a()), nVar);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3480h e(j0 j0Var, C3480h[] c3480hArr, int i10) {
        Map mapB;
        C3480h c3480h;
        return (j0Var == null || (mapB = j0Var.b()) == null || (c3480h = (C3480h) mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= c3480hArr.length) ? C3480h.f19925e.a() : c3480hArr[i10] : c3480h;
    }

    private final Jh.E f(InterfaceC7618i interfaceC7618i, Jh.E e10) {
        return m().d(e10, n(interfaceC7618i));
    }

    private final C3480h g(InterfaceC7618i interfaceC7618i) {
        EnumC3483k enumC3483kY;
        EnumC3483k enumC3483kY2 = y(interfaceC7618i);
        EnumC3481i enumC3481i = null;
        if (enumC3483kY2 == null) {
            InterfaceC7618i interfaceC7618iV = v(interfaceC7618i);
            enumC3483kY = interfaceC7618iV != null ? y(interfaceC7618iV) : null;
        } else {
            enumC3483kY = enumC3483kY2;
        }
        ri.o oVarA = A();
        Ah.c cVar = Ah.c.f771a;
        if (cVar.l(x(oVarA.b0(interfaceC7618i)))) {
            enumC3481i = EnumC3481i.READ_ONLY;
        } else if (cVar.k(x(oVarA.F0(interfaceC7618i)))) {
            enumC3481i = EnumC3481i.MUTABLE;
        }
        return new C3480h(enumC3483kY, enumC3481i, A().K(interfaceC7618i) || F(interfaceC7618i), enumC3483kY != enumC3483kY2);
    }

    private final C3480h h(a aVar) {
        List listL;
        C3484l c3484lO;
        InterfaceC7618i interfaceC7618iB;
        ri.m mVarF0;
        if (aVar.b() == null) {
            ri.o oVarA = A();
            ri.n nVarC = aVar.c();
            if ((nVarC != null ? oVarA.E(nVarC) : null) == ri.s.IN) {
                return C3480h.f19925e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        InterfaceC7618i interfaceC7618iB2 = aVar.b();
        if (interfaceC7618iB2 == null || (listL = n(interfaceC7618iB2)) == null) {
            listL = AbstractC3689v.l();
        }
        ri.o oVarA2 = A();
        InterfaceC7618i interfaceC7618iB3 = aVar.b();
        ri.n nVarE0 = (interfaceC7618iB3 == null || (mVarF0 = oVarA2.f0(interfaceC7618iB3)) == null) ? null : oVarA2.e0(mVarF0);
        boolean z12 = q() == EnumC3109c.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !u() || (interfaceC7618iB = aVar.b()) == null || !B(interfaceC7618iB)) {
                listL = AbstractC3689v.K0(p(), listL);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().p(obj)) {
                        arrayList.add(obj);
                    }
                }
                listL = AbstractC3689v.M0(arrayList, listL);
            }
        }
        EnumC3481i enumC3481iG = m().g(listL);
        C3484l c3484lH = m().h(listL, new C3473a(this, aVar));
        if (c3484lH != null) {
            EnumC3483k enumC3483kC = c3484lH.c();
            if (c3484lH.c() == EnumC3483k.NOT_NULL && nVarE0 != null) {
                z10 = true;
            }
            return new C3480h(enumC3483kC, enumC3481iG, z10, c3484lH.d());
        }
        EnumC3109c enumC3109cQ = (z11 || z12) ? q() : EnumC3109c.TYPE_USE;
        Jh.E eA = aVar.a();
        Jh.w wVarA = eA != null ? eA.a(enumC3109cQ) : null;
        C3484l c3484lO2 = nVarE0 != null ? o(nVarE0) : null;
        C3484l c3484lT = t(c3484lO2, wVarA);
        boolean z13 = (c3484lO2 != null ? c3484lO2.c() : null) == EnumC3483k.NOT_NULL || !(nVarE0 == null || wVarA == null || !wVarA.c());
        ri.n nVarC2 = aVar.c();
        if (nVarC2 == null || (c3484lO = o(nVarC2)) == null) {
            c3484lO = null;
        } else if (c3484lO.c() == EnumC3483k.NULLABLE) {
            c3484lO = C3484l.b(c3484lO, EnumC3483k.FORCE_FLEXIBILITY, false, 2, null);
        }
        C3484l c3484lG = G(c3484lO, c3484lT);
        EnumC3483k enumC3483kC2 = c3484lG != null ? c3484lG.c() : null;
        if (c3484lG != null && c3484lG.d()) {
            z10 = true;
        }
        return new C3480h(enumC3483kC2, enumC3481iG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC3476d abstractC3476d, a aVar, Object extractNullability) {
        AbstractC6492s.i(extractNullability, "$this$extractNullability");
        return abstractC3476d.l(extractNullability, aVar.b());
    }

    private final List j(Object obj, InterfaceC6835l interfaceC6835l) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, interfaceC6835l);
        return arrayList;
    }

    private final void k(Object obj, List list, InterfaceC6835l interfaceC6835l) {
        list.add(obj);
        Iterable iterable = (Iterable) interfaceC6835l.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, interfaceC6835l);
            }
        }
    }

    private final C3484l o(ri.n nVar) {
        List arrayList;
        EnumC3483k enumC3483k;
        ri.o oVarA = A();
        if (!E(nVar)) {
            return null;
        }
        List listS = oVarA.S(nVar);
        List list = listS;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!oVarA.w0((InterfaceC7618i) it.next())) {
                    if (!z10 || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (y((InterfaceC7618i) it2.next()) != null) {
                                arrayList = listS;
                                break;
                            }
                        }
                    }
                    if (!z10 || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (v((InterfaceC7618i) it3.next()) != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    InterfaceC7618i interfaceC7618iV = v((InterfaceC7618i) it4.next());
                                    if (interfaceC7618iV != null) {
                                        arrayList.add(interfaceC7618iV);
                                    }
                                }
                                List list2 = arrayList;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    enumC3483k = EnumC3483k.NULLABLE;
                                } else {
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!oVarA.v0((InterfaceC7618i) it5.next())) {
                                            enumC3483k = EnumC3483k.NOT_NULL;
                                            break;
                                        }
                                    }
                                    enumC3483k = EnumC3483k.NULLABLE;
                                }
                                return new C3484l(enumC3483k, arrayList != listS);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final EnumC3483k y(InterfaceC7618i interfaceC7618i) {
        ri.o oVarA = A();
        if (oVarA.t(oVarA.b0(interfaceC7618i))) {
            return EnumC3483k.NULLABLE;
        }
        if (oVarA.t(oVarA.F0(interfaceC7618i))) {
            return null;
        }
        return EnumC3483k.NOT_NULL;
    }

    public abstract ri.o A();

    public abstract boolean B(InterfaceC7618i interfaceC7618i);

    public abstract boolean C();

    public abstract boolean D(InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2);

    public abstract boolean E(ri.n nVar);

    public abstract boolean F(InterfaceC7618i interfaceC7618i);

    public final InterfaceC6835l d(InterfaceC7618i interfaceC7618i, Iterable overrides, j0 j0Var, boolean z10) {
        int size;
        InterfaceC7618i interfaceC7618iB;
        AbstractC6492s.i(interfaceC7618i, "<this>");
        AbstractC6492s.i(overrides, "overrides");
        List listH = H(interfaceC7618i);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H((InterfaceC7618i) it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!D(interfaceC7618i, (InterfaceC7618i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        C3480h[] c3480hArr = new C3480h[size];
        int i10 = 0;
        while (i10 < size) {
            C3480h c3480hH = h((a) listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) AbstractC3689v.t0((List) it3.next(), i10);
                C3480h c3480hG = (aVar == null || (interfaceC7618iB = aVar.b()) == null) ? null : g(interfaceC7618iB);
                if (c3480hG != null) {
                    arrayList2.add(c3480hG);
                }
            }
            c3480hArr[i10] = l0.a(c3480hH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C3474b(j0Var, c3480hArr);
    }

    public abstract boolean l(Object obj, InterfaceC7618i interfaceC7618i);

    public abstract AbstractC3108b m();

    public abstract Iterable n(InterfaceC7618i interfaceC7618i);

    public abstract Iterable p();

    public abstract EnumC3109c q();

    public abstract Jh.E r();

    public abstract boolean s();

    protected abstract C3484l t(C3484l c3484l, Jh.w wVar);

    public abstract boolean u();

    public abstract InterfaceC7618i v(InterfaceC7618i interfaceC7618i);

    public boolean w() {
        return false;
    }

    public abstract Zh.d x(InterfaceC7618i interfaceC7618i);

    public abstract boolean z();
}
