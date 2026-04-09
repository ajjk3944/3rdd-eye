package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.AbstractC2509t;
import Bh.D;
import Bh.EnumC2496f;
import Bh.g0;
import Dh.C2610p;
import Dh.G;
import Dh.U;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.B0;
import pi.N0;
import pi.S;
import pi.V;
import pi.r0;
import pi.v0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final G f51896a;

    static {
        C2610p c2610p = new C2610p(kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.i(), o.f51795s);
        EnumC2496f enumC2496f = EnumC2496f.INTERFACE;
        Zh.f fVarG = o.f51798v.g();
        g0 g0Var = g0.f1784a;
        oi.n nVar = oi.f.f55716e;
        G g10 = new G(c2610p, enumC2496f, false, false, fVarG, g0Var, nVar);
        g10.M0(D.ABSTRACT);
        g10.O0(AbstractC2509t.f1796e);
        g10.N0(AbstractC3689v.e(U.R0(g10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), false, N0.IN_VARIANCE, Zh.f.h("T"), 0, nVar)));
        g10.K0();
        f51896a = g10;
    }

    public static final AbstractC7346d0 a(S suspendFunType) {
        AbstractC6492s.i(suspendFunType, "suspendFunType");
        h.r(suspendFunType);
        i iVarN = AbstractC7984d.n(suspendFunType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = suspendFunType.getAnnotations();
        S sK = h.k(suspendFunType);
        List listE = h.e(suspendFunType);
        List listM = h.m(suspendFunType);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        r0 r0VarJ = r0.f58162b.j();
        v0 v0VarK = f51896a.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        List listN0 = AbstractC3689v.N0(arrayList, V.k(r0VarJ, v0VarK, AbstractC3689v.e(AbstractC7984d.d(h.l(suspendFunType))), false, null, 16, null));
        AbstractC7346d0 abstractC7346d0I = AbstractC7984d.n(suspendFunType).I();
        AbstractC6492s.h(abstractC7346d0I, "getNullableAnyType(...)");
        return h.b(iVarN, annotations, sK, listE, listN0, null, abstractC7346d0I, (128 & 128) != 0 ? false : false).R0(suspendFunType.O0());
    }
}
