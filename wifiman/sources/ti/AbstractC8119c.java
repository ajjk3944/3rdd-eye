package ti;

import Bh.l0;
import Yg.s;
import Zg.AbstractC3689v;
import ci.AbstractC4268e;
import ci.InterfaceC4265b;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import pi.AbstractC7346d0;
import pi.B0;
import pi.D0;
import pi.F0;
import pi.G0;
import pi.J0;
import pi.L;
import pi.L0;
import pi.M0;
import pi.N0;
import pi.S;
import pi.V;
import pi.v0;
import pi.w0;
import si.AbstractC7984d;

/* renamed from: ti.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8119c {

    /* renamed from: ti.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62660a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62660a = iArr;
        }
    }

    /* renamed from: ti.c$b */
    public static final class b extends w0 {
        b() {
        }

        @Override // pi.w0
        public B0 k(v0 key) {
            AbstractC6492s.i(key, "key");
            InterfaceC4265b interfaceC4265b = key instanceof InterfaceC4265b ? (InterfaceC4265b) key : null;
            if (interfaceC4265b == null) {
                return null;
            }
            return interfaceC4265b.e().c() ? new D0(N0.OUT_VARIANCE, interfaceC4265b.e().getType()) : interfaceC4265b.e();
        }
    }

    public static final C8117a b(S type) {
        Object objG;
        AbstractC6492s.i(type, "type");
        if (L.b(type)) {
            C8117a c8117aB = b(L.c(type));
            C8117a c8117aB2 = b(L.d(type));
            return new C8117a(L0.b(V.e(L.c((S) c8117aB.c()), L.d((S) c8117aB2.c())), type), L0.b(V.e(L.c((S) c8117aB.d()), L.d((S) c8117aB2.d())), type));
        }
        v0 v0VarN0 = type.N0();
        if (AbstractC4268e.f(type)) {
            AbstractC6492s.g(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            B0 b0E = ((InterfaceC4265b) v0VarN0).e();
            S type2 = b0E.getType();
            AbstractC6492s.h(type2, "getType(...)");
            S sC = c(type2, type);
            int i10 = a.f62660a[b0E.a().ordinal()];
            if (i10 == 2) {
                return new C8117a(sC, AbstractC7984d.n(type).I());
            }
            if (i10 == 3) {
                AbstractC7346d0 abstractC7346d0H = AbstractC7984d.n(type).H();
                AbstractC6492s.h(abstractC7346d0H, "getNothingType(...)");
                return new C8117a(c(abstractC7346d0H, type), sC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + b0E);
        }
        if (type.L0().isEmpty() || type.L0().size() != v0VarN0.getParameters().size()) {
            return new C8117a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = type.L0();
        List parameters = v0VarN0.getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        for (s sVar : AbstractC3689v.s1(listL0, parameters)) {
            B0 b02 = (B0) sVar.a();
            l0 l0Var = (l0) sVar.c();
            AbstractC6492s.f(l0Var);
            C8120d c8120dI = i(b02, l0Var);
            if (b02.c()) {
                arrayList.add(c8120dI);
                arrayList2.add(c8120dI);
            } else {
                C8117a c8117aF = f(c8120dI);
                C8120d c8120d = (C8120d) c8117aF.a();
                C8120d c8120d2 = (C8120d) c8117aF.b();
                arrayList.add(c8120d);
                arrayList2.add(c8120d2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((C8120d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = AbstractC7984d.n(type).H();
            AbstractC6492s.h(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new C8117a(objG, g(type, arrayList2));
    }

    private static final S c(S s10, S s11) {
        S sQ = J0.q(s10, s11.O0());
        AbstractC6492s.h(sQ, "makeNullableIfNeeded(...)");
        return sQ;
    }

    public static final B0 d(B0 b02, boolean z10) {
        if (b02 == null) {
            return null;
        }
        if (b02.c()) {
            return b02;
        }
        S type = b02.getType();
        AbstractC6492s.h(type, "getType(...)");
        if (!J0.c(type, C8118b.f62659a)) {
            return b02;
        }
        N0 n0A = b02.a();
        AbstractC6492s.h(n0A, "getProjectionKind(...)");
        return n0A == N0.OUT_VARIANCE ? new D0(n0A, (S) b(type).d()) : z10 ? new D0(n0A, (S) b(type).c()) : h(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(M0 m02) {
        AbstractC6492s.f(m02);
        return Boolean.valueOf(AbstractC4268e.f(m02));
    }

    private static final C8117a f(C8120d c8120d) {
        C8117a c8117aB = b(c8120d.a());
        S s10 = (S) c8117aB.a();
        S s11 = (S) c8117aB.b();
        C8117a c8117aB2 = b(c8120d.b());
        return new C8117a(new C8120d(c8120d.c(), s11, (S) c8117aB2.a()), new C8120d(c8120d.c(), s10, (S) c8117aB2.b()));
    }

    private static final S g(S s10, List list) {
        s10.L0().size();
        list.size();
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(j((C8120d) it.next()));
        }
        return F0.e(s10, arrayList, null, null, 6, null);
    }

    private static final B0 h(B0 b02) {
        G0 g0G = G0.g(new b());
        AbstractC6492s.h(g0G, "create(...)");
        return g0G.t(b02);
    }

    private static final C8120d i(B0 b02, l0 l0Var) {
        int i10 = a.f62660a[G0.c(l0Var.p(), b02).ordinal()];
        if (i10 == 1) {
            S type = b02.getType();
            AbstractC6492s.h(type, "getType(...)");
            S type2 = b02.getType();
            AbstractC6492s.h(type2, "getType(...)");
            return new C8120d(l0Var, type, type2);
        }
        if (i10 == 2) {
            S type3 = b02.getType();
            AbstractC6492s.h(type3, "getType(...)");
            AbstractC7346d0 abstractC7346d0I = AbstractC5833e.m(l0Var).I();
            AbstractC6492s.h(abstractC7346d0I, "getNullableAnyType(...)");
            return new C8120d(l0Var, type3, abstractC7346d0I);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC7346d0 abstractC7346d0H = AbstractC5833e.m(l0Var).H();
        AbstractC6492s.h(abstractC7346d0H, "getNothingType(...)");
        S type4 = b02.getType();
        AbstractC6492s.h(type4, "getType(...)");
        return new C8120d(l0Var, abstractC7346d0H, type4);
    }

    private static final B0 j(C8120d c8120d) {
        c8120d.d();
        if (!AbstractC6492s.d(c8120d.a(), c8120d.b())) {
            N0 n0P = c8120d.c().p();
            N0 n02 = N0.IN_VARIANCE;
            if (n0P != n02) {
                if ((!i.n0(c8120d.a()) || c8120d.c().p() == n02) && i.p0(c8120d.b())) {
                    return new D0(k(c8120d, n02), c8120d.a());
                }
                return new D0(k(c8120d, N0.OUT_VARIANCE), c8120d.b());
            }
        }
        return new D0(c8120d.a());
    }

    private static final N0 k(C8120d c8120d, N0 n02) {
        return n02 == c8120d.c().p() ? N0.INVARIANT : n02;
    }
}
