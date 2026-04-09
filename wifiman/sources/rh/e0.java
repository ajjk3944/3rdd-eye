package Rh;

import Bh.AbstractC2508s;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2498h;
import Bh.s0;
import Jh.EnumC3109c;
import Nh.C3383j;
import Nh.C3387n;
import Qh.InterfaceC3444a;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import pi.InterfaceC7344c0;
import pi.J0;
import pi.M0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3479g f19904a;

    public e0(C3479g typeEnhancement) {
        AbstractC6492s.i(typeEnhancement, "typeEnhancement");
        this.f19904a = typeEnhancement;
    }

    private final boolean f(pi.S s10) {
        return J0.c(s10, d0.f19902a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(M0 m02) {
        InterfaceC2498h interfaceC2498hC = m02.N0().c();
        if (interfaceC2498hC == null) {
            return Boolean.FALSE;
        }
        Zh.f name = interfaceC2498hC.getName();
        Ah.c cVar = Ah.c.f771a;
        return Boolean.valueOf(AbstractC6492s.d(name, cVar.h().g()) && AbstractC6492s.d(AbstractC5833e.k(interfaceC2498hC), cVar.h()));
    }

    private final pi.S h(InterfaceC2492b interfaceC2492b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Mh.k kVar, EnumC3109c enumC3109c, j0 j0Var, boolean z11, InterfaceC6835l interfaceC6835l) {
        g0 g0Var = new g0(aVar, z10, kVar, enumC3109c, false, 16, null);
        pi.S s10 = (pi.S) interfaceC6835l.invoke(interfaceC2492b);
        Collection collectionF = interfaceC2492b.f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        Collection<InterfaceC2492b> collection = collectionF;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        for (InterfaceC2492b interfaceC2492b2 : collection) {
            AbstractC6492s.f(interfaceC2492b2);
            arrayList.add((pi.S) interfaceC6835l.invoke(interfaceC2492b2));
        }
        return i(g0Var, s10, arrayList, j0Var, z11);
    }

    private final pi.S i(g0 g0Var, pi.S s10, List list, j0 j0Var, boolean z10) {
        return this.f19904a.a(s10, g0Var.d(s10, list, j0Var, z10), g0Var.z());
    }

    static /* synthetic */ pi.S j(e0 e0Var, InterfaceC2492b interfaceC2492b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Mh.k kVar, EnumC3109c enumC3109c, j0 j0Var, boolean z11, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        return e0Var.h(interfaceC2492b, aVar, z10, kVar, enumC3109c, j0Var, (i10 & 32) != 0 ? false : z11, interfaceC6835l);
    }

    static /* synthetic */ pi.S k(e0 e0Var, g0 g0Var, pi.S s10, List list, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j0Var = null;
        }
        j0 j0Var2 = j0Var;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return e0Var.i(g0Var, s10, list, j0Var2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Bh.InterfaceC2492b l(Bh.InterfaceC2492b r22, Mh.k r23) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.e0.l(Bh.b, Mh.k):Bh.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pi.S m(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        pi.S returnType = it.getReturnType();
        AbstractC6492s.f(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pi.S n(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        Bh.b0 b0VarK0 = it.k0();
        AbstractC6492s.f(b0VarK0);
        pi.S type = b0VarK0.getType();
        AbstractC6492s.h(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pi.S o(s0 s0Var, InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        pi.S type = ((s0) it.i().get(s0Var.getIndex())).getType();
        AbstractC6492s.h(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(M0 it) {
        AbstractC6492s.i(it, "it");
        return it instanceof InterfaceC7344c0;
    }

    private final pi.S t(InterfaceC2492b interfaceC2492b, s0 s0Var, Mh.k kVar, j0 j0Var, boolean z10, InterfaceC6835l interfaceC6835l) {
        Mh.k kVarK;
        return h(interfaceC2492b, s0Var, false, (s0Var == null || (kVarK = Mh.c.k(kVar, s0Var.getAnnotations())) == null) ? kVar : kVarK, EnumC3109c.VALUE_PARAMETER, j0Var, z10, interfaceC6835l);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h u(InterfaceC2492b interfaceC2492b, Mh.k kVar) {
        InterfaceC2498h interfaceC2498hA = AbstractC2508s.a(interfaceC2492b);
        if (interfaceC2498hA == null) {
            return interfaceC2492b.getAnnotations();
        }
        C3387n c3387n = interfaceC2498hA instanceof C3387n ? (C3387n) interfaceC2498hA : null;
        List listT0 = c3387n != null ? c3387n.T0() : null;
        List list = listT0;
        if (list == null || list.isEmpty()) {
            return interfaceC2492b.getAnnotations();
        }
        List list2 = listT0;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3383j(kVar, (InterfaceC3444a) it.next(), true));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.K0(interfaceC2492b.getAnnotations(), arrayList));
    }

    public final Collection p(Mh.k c10, Collection platformSignatures) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(platformSignatures, "platformSignatures");
        Collection collection = platformSignatures;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((InterfaceC2492b) it.next(), c10));
        }
        return arrayList;
    }

    public final pi.S q(pi.S type, Mh.k context) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(context, "context");
        pi.S sK = k(this, new g0(null, false, context, EnumC3109c.TYPE_USE, true), type, AbstractC3689v.l(), null, false, 12, null);
        return sK == null ? type : sK;
    }

    public final List r(Bh.l0 typeParameter, List bounds, Mh.k context) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        AbstractC6492s.i(bounds, "bounds");
        AbstractC6492s.i(context, "context");
        List<pi.S> list = bounds;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (pi.S s10 : list) {
            if (!AbstractC7984d.e(s10, c0.f19898a)) {
                pi.S sK = k(this, new g0(typeParameter, false, context, EnumC3109c.TYPE_PARAMETER_BOUNDS, false, 16, null), s10, AbstractC3689v.l(), null, false, 12, null);
                if (sK != null) {
                    s10 = sK;
                }
            }
            arrayList.add(s10);
        }
        return arrayList;
    }
}
