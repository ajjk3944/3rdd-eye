package pi;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.InterfaceC7368o0;
import si.AbstractC7984d;

/* renamed from: pi.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7364m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f58142c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C7364m0 f58143d = new C7364m0(InterfaceC7368o0.a.f58154a, false);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7368o0 f58144a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f58145b;

    /* renamed from: pi.m0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, Bh.k0 k0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + k0Var.getName());
        }

        private a() {
        }
    }

    public C7364m0(InterfaceC7368o0 reportStrategy, boolean z10) {
        AbstractC6492s.i(reportStrategy, "reportStrategy");
        this.f58144a = reportStrategy;
        this.f58145b = z10;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it.next()).e());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it2.next();
            if (hashSet.contains(cVar.e())) {
                this.f58144a.c(cVar);
            }
        }
    }

    private final void b(S s10, S s11) {
        G0 g0F = G0.f(s11);
        AbstractC6492s.h(g0F, "create(...)");
        int i10 = 0;
        for (Object obj : s11.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            B0 b02 = (B0) obj;
            if (!b02.c()) {
                S type = b02.getType();
                AbstractC6492s.h(type, "getType(...)");
                if (!AbstractC7984d.g(type)) {
                    B0 b03 = (B0) s10.L0().get(i10);
                    Bh.l0 l0Var = (Bh.l0) s10.N0().getParameters().get(i10);
                    if (this.f58145b) {
                        InterfaceC7368o0 interfaceC7368o0 = this.f58144a;
                        S type2 = b03.getType();
                        AbstractC6492s.h(type2, "getType(...)");
                        S type3 = b02.getType();
                        AbstractC6492s.h(type3, "getType(...)");
                        AbstractC6492s.f(l0Var);
                        interfaceC7368o0.b(g0F, type2, type3, l0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final AbstractC7346d0 c(AbstractC7346d0 abstractC7346d0, r0 r0Var) {
        return W.a(abstractC7346d0) ? abstractC7346d0 : F0.f(abstractC7346d0, null, g(abstractC7346d0, r0Var), 1, null);
    }

    private final AbstractC7346d0 d(AbstractC7346d0 abstractC7346d0, S s10) {
        AbstractC7346d0 abstractC7346d0R = J0.r(abstractC7346d0, s10.O0());
        AbstractC6492s.h(abstractC7346d0R, "makeNullableIfNeeded(...)");
        return abstractC7346d0R;
    }

    private final AbstractC7346d0 e(AbstractC7346d0 abstractC7346d0, S s10) {
        return c(d(abstractC7346d0, s10), s10.M0());
    }

    private final AbstractC7346d0 f(C7366n0 c7366n0, r0 r0Var, boolean z10) {
        v0 v0VarK = c7366n0.b().k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return V.m(r0Var, v0VarK, c7366n0.a(), z10, InterfaceC6164k.b.f49223b);
    }

    private final r0 g(S s10, r0 r0Var) {
        return W.a(s10) ? s10.M0() : r0Var.j(s10.M0());
    }

    private final B0 i(B0 b02, C7366n0 c7366n0, int i10) {
        M0 m0Q0 = b02.getType().Q0();
        if (AbstractC7337E.a(m0Q0)) {
            return b02;
        }
        AbstractC7346d0 abstractC7346d0A = F0.a(m0Q0);
        if (W.a(abstractC7346d0A) || !AbstractC7984d.E(abstractC7346d0A)) {
            return b02;
        }
        v0 v0VarN0 = abstractC7346d0A.N0();
        InterfaceC2498h interfaceC2498hC = v0VarN0.c();
        v0VarN0.getParameters().size();
        abstractC7346d0A.L0().size();
        if (interfaceC2498hC instanceof Bh.l0) {
            return b02;
        }
        if (!(interfaceC2498hC instanceof Bh.k0)) {
            AbstractC7346d0 abstractC7346d0L = l(abstractC7346d0A, c7366n0, i10);
            b(abstractC7346d0A, abstractC7346d0L);
            return new D0(b02.a(), abstractC7346d0L);
        }
        Bh.k0 k0Var = (Bh.k0) interfaceC2498hC;
        if (c7366n0.d(k0Var)) {
            this.f58144a.d(k0Var);
            return new D0(N0.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.RECURSIVE_TYPE_ALIAS, k0Var.getName().toString()));
        }
        List listL0 = abstractC7346d0A.L0();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listL0, 10));
        int i11 = 0;
        for (Object obj : listL0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC3689v.v();
            }
            arrayList.add(k((B0) obj, c7366n0, (Bh.l0) v0VarN0.getParameters().get(i11), i10 + 1));
            i11 = i12;
        }
        AbstractC7346d0 abstractC7346d0J = j(C7366n0.f58147e.a(c7366n0, k0Var, arrayList), abstractC7346d0A.M0(), abstractC7346d0A.O0(), i10 + 1, false);
        AbstractC7346d0 abstractC7346d0L2 = l(abstractC7346d0A, c7366n0, i10);
        if (!AbstractC7337E.a(abstractC7346d0J)) {
            abstractC7346d0J = AbstractC7354h0.j(abstractC7346d0J, abstractC7346d0L2);
        }
        return new D0(b02.a(), abstractC7346d0J);
    }

    private final AbstractC7346d0 j(C7366n0 c7366n0, r0 r0Var, boolean z10, int i10, boolean z11) {
        B0 b0K = k(new D0(N0.INVARIANT, c7366n0.b().f0()), c7366n0, null, i10);
        S type = b0K.getType();
        AbstractC6492s.h(type, "getType(...)");
        AbstractC7346d0 abstractC7346d0A = F0.a(type);
        if (W.a(abstractC7346d0A)) {
            return abstractC7346d0A;
        }
        b0K.a();
        a(abstractC7346d0A.getAnnotations(), AbstractC7372t.a(r0Var));
        AbstractC7346d0 abstractC7346d0R = J0.r(c(abstractC7346d0A, r0Var), z10);
        AbstractC6492s.h(abstractC7346d0R, "let(...)");
        return z11 ? AbstractC7354h0.j(abstractC7346d0R, f(c7366n0, r0Var, z10)) : abstractC7346d0R;
    }

    private final B0 k(B0 b02, C7366n0 c7366n0, Bh.l0 l0Var, int i10) {
        N0 n0P;
        N0 n02;
        N0 n03;
        f58142c.b(i10, c7366n0.b());
        if (b02.c()) {
            AbstractC6492s.f(l0Var);
            B0 b0S = J0.s(l0Var);
            AbstractC6492s.h(b0S, "makeStarProjection(...)");
            return b0S;
        }
        S type = b02.getType();
        AbstractC6492s.h(type, "getType(...)");
        B0 b0C = c7366n0.c(type.N0());
        if (b0C == null) {
            return i(b02, c7366n0, i10);
        }
        if (b0C.c()) {
            AbstractC6492s.f(l0Var);
            B0 b0S2 = J0.s(l0Var);
            AbstractC6492s.h(b0S2, "makeStarProjection(...)");
            return b0S2;
        }
        M0 m0Q0 = b0C.getType().Q0();
        N0 n0A = b0C.a();
        AbstractC6492s.h(n0A, "getProjectionKind(...)");
        N0 n0A2 = b02.a();
        AbstractC6492s.h(n0A2, "getProjectionKind(...)");
        if (n0A2 != n0A && n0A2 != (n03 = N0.INVARIANT)) {
            if (n0A == n03) {
                n0A = n0A2;
            } else {
                this.f58144a.a(c7366n0.b(), l0Var, m0Q0);
            }
        }
        if (l0Var == null || (n0P = l0Var.p()) == null) {
            n0P = N0.INVARIANT;
        }
        if (n0P != n0A && n0P != (n02 = N0.INVARIANT)) {
            if (n0A == n02) {
                n0A = n02;
            } else {
                this.f58144a.a(c7366n0.b(), l0Var, m0Q0);
            }
        }
        a(type.getAnnotations(), m0Q0.getAnnotations());
        return new D0(n0A, e(F0.a(m0Q0), type));
    }

    private final AbstractC7346d0 l(AbstractC7346d0 abstractC7346d0, C7366n0 c7366n0, int i10) {
        v0 v0VarN0 = abstractC7346d0.N0();
        List listL0 = abstractC7346d0.L0();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listL0, 10));
        int i11 = 0;
        for (Object obj : listL0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC3689v.v();
            }
            B0 b02 = (B0) obj;
            B0 b0K = k(b02, c7366n0, (Bh.l0) v0VarN0.getParameters().get(i11), i10 + 1);
            if (!b0K.c()) {
                b0K = new D0(b0K.a(), J0.q(b0K.getType(), b02.getType().O0()));
            }
            arrayList.add(b0K);
            i11 = i12;
        }
        return F0.f(abstractC7346d0, arrayList, null, 2, null);
    }

    public final AbstractC7346d0 h(C7366n0 typeAliasExpansion, r0 attributes) {
        AbstractC6492s.i(typeAliasExpansion, "typeAliasExpansion");
        AbstractC6492s.i(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }
}
