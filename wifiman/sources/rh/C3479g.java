package Rh;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.AbstractC7354h0;
import pi.B0;
import pi.J0;
import pi.M0;
import pi.N0;
import pi.r0;
import pi.s0;
import pi.v0;
import si.AbstractC7984d;

/* renamed from: Rh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3479g {

    /* renamed from: a, reason: collision with root package name */
    private final Mh.e f19914a;

    /* renamed from: Rh.g$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final pi.S f19915a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19916b;

        public a(pi.S s10, int i10) {
            this.f19915a = s10;
            this.f19916b = i10;
        }

        public final int a() {
            return this.f19916b;
        }

        public final pi.S b() {
            return this.f19915a;
        }
    }

    /* renamed from: Rh.g$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7346d0 f19917a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19918b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f19919c;

        public b(AbstractC7346d0 abstractC7346d0, int i10, boolean z10) {
            this.f19917a = abstractC7346d0;
            this.f19918b = i10;
            this.f19919c = z10;
        }

        public final boolean a() {
            return this.f19919c;
        }

        public final int b() {
            return this.f19918b;
        }

        public final AbstractC7346d0 c() {
            return this.f19917a;
        }
    }

    public C3479g(Mh.e javaResolverSettings) {
        AbstractC6492s.i(javaResolverSettings, "javaResolverSettings");
        this.f19914a = javaResolverSettings;
    }

    private final b b(AbstractC7346d0 abstractC7346d0, InterfaceC6835l interfaceC6835l, int i10, h0 h0Var, boolean z10, boolean z11) {
        InterfaceC2498h interfaceC2498hC;
        v0 v0VarN0;
        boolean z12;
        a aVar;
        B0 b0S;
        InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        boolean zA = i0.a(h0Var);
        boolean z13 = (z11 && z10) ? false : true;
        pi.S s10 = null;
        if ((zA || !abstractC7346d0.L0().isEmpty()) && (interfaceC2498hC = abstractC7346d0.N0().c()) != null) {
            C3480h c3480h = (C3480h) interfaceC6835l2.invoke(Integer.valueOf(i10));
            InterfaceC2498h interfaceC2498hF = k0.f(interfaceC2498hC, c3480h, h0Var);
            Boolean boolH = k0.h(c3480h, h0Var);
            if (interfaceC2498hF == null || (v0VarN0 = interfaceC2498hF.k()) == null) {
                v0VarN0 = abstractC7346d0.N0();
            }
            v0 v0Var = v0VarN0;
            int iA = i10 + 1;
            List listL0 = abstractC7346d0.L0();
            List parameters = v0Var.getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            List list = parameters;
            Iterator it = listL0.iterator();
            Iterator it2 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(AbstractC3689v.w(listL0, 10), AbstractC3689v.w(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                Bh.l0 l0Var = (Bh.l0) it2.next();
                B0 b02 = (B0) next;
                if (z13) {
                    z12 = z13;
                    if (!b02.c()) {
                        aVar = d(b02.getType().Q0(), interfaceC6835l2, iA, z11);
                    } else if (((C3480h) interfaceC6835l2.invoke(Integer.valueOf(iA))).f() == EnumC3483k.FORCE_FLEXIBILITY) {
                        M0 m0Q0 = b02.getType().Q0();
                        aVar = new a(pi.V.e(pi.L.c(m0Q0).R0(false), pi.L.d(m0Q0).R0(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                } else {
                    z12 = z13;
                    aVar = new a(s10, 0);
                }
                iA += aVar.a();
                if (aVar.b() != null) {
                    pi.S sB = aVar.b();
                    N0 n0A = b02.a();
                    AbstractC6492s.h(n0A, "getProjectionKind(...)");
                    b0S = AbstractC7984d.k(sB, n0A, l0Var);
                } else if (interfaceC2498hF == null || b02.c()) {
                    b0S = interfaceC2498hF != null ? J0.s(l0Var) : null;
                } else {
                    pi.S type = b02.getType();
                    AbstractC6492s.h(type, "getType(...)");
                    N0 n0A2 = b02.a();
                    AbstractC6492s.h(n0A2, "getProjectionKind(...)");
                    b0S = AbstractC7984d.k(type, n0A2, l0Var);
                }
                arrayList.add(b0S);
                interfaceC6835l2 = interfaceC6835l;
                z13 = z12;
                s10 = null;
            }
            int i11 = iA - i10;
            if (interfaceC2498hF == null && boolH == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((B0) it3.next()) == null) {
                        }
                    }
                }
                return new b(null, i11, false);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = abstractC7346d0.getAnnotations();
            C3478f c3478f = k0.f19934b;
            if (interfaceC2498hF == null) {
                c3478f = null;
            }
            boolean z14 = false;
            r0 r0VarB = s0.b(k0.e(AbstractC3689v.q(annotations, c3478f, boolH != null ? k0.g() : null)));
            List listL02 = abstractC7346d0.L0();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listL02.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(AbstractC3689v.w(arrayList, 10), AbstractC3689v.w(listL02, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                B0 b03 = (B0) it5.next();
                B0 b04 = (B0) next2;
                if (b04 != null) {
                    b03 = b04;
                }
                arrayList2.add(b03);
            }
            AbstractC7346d0 abstractC7346d0K = pi.V.k(r0VarB, v0Var, arrayList2, boolH != null ? boolH.booleanValue() : abstractC7346d0.O0(), null, 16, null);
            if (c3480h.d()) {
                abstractC7346d0K = e(abstractC7346d0K);
            }
            if (boolH != null && c3480h.g()) {
                z14 = true;
            }
            return new b(abstractC7346d0K, i11, z14);
        }
        return new b(null, 1, false);
    }

    static /* synthetic */ b c(C3479g c3479g, AbstractC7346d0 abstractC7346d0, InterfaceC6835l interfaceC6835l, int i10, h0 h0Var, boolean z10, boolean z11, int i11, Object obj) {
        return c3479g.b(abstractC7346d0, interfaceC6835l, i10, h0Var, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Rh.C3479g.a d(pi.M0 r12, mh.InterfaceC6835l r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = pi.W.a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            Rh.g$a r12 = new Rh.g$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof pi.I
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof pi.InterfaceC7344c0
            r9 = r12
            pi.I r9 = (pi.I) r9
            pi.d0 r3 = r9.V0()
            Rh.h0 r6 = Rh.h0.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            Rh.g$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            pi.d0 r3 = r9.W0()
            Rh.h0 r6 = Rh.h0.FLEXIBLE_UPPER
            Rh.g$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            pi.d0 r14 = r10.c()
            if (r14 != 0) goto L43
            pi.d0 r14 = r13.c()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.a()
            if (r14 != 0) goto L85
            boolean r14 = r13.a()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            Oh.k r1 = new Oh.k
            pi.d0 r12 = r10.c()
            if (r12 != 0) goto L5e
            pi.d0 r12 = r9.V0()
        L5e:
            pi.d0 r13 = r13.c()
            if (r13 != 0) goto L68
            pi.d0 r13 = r9.W0()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            pi.d0 r12 = r10.c()
            if (r12 != 0) goto L76
            pi.d0 r12 = r9.V0()
        L76:
            pi.d0 r13 = r13.c()
            if (r13 != 0) goto L80
            pi.d0 r13 = r9.W0()
        L80:
            pi.M0 r1 = pi.V.e(r12, r13)
            goto La3
        L85:
            pi.d0 r13 = r13.c()
            if (r13 == 0) goto L98
            pi.d0 r14 = r10.c()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            pi.M0 r13 = pi.V.e(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            pi.d0 r13 = r10.c()
            kotlin.jvm.internal.AbstractC6492s.f(r13)
        L9f:
            pi.M0 r1 = pi.L0.d(r12, r13)
        La3:
            Rh.g$a r12 = new Rh.g$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof pi.AbstractC7346d0
            if (r0 == 0) goto Le0
            r2 = r12
            pi.d0 r2 = (pi.AbstractC7346d0) r2
            Rh.h0 r5 = Rh.h0.INFLEXIBLE
            r8 = 8
            r9 = 0
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            Rh.g$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            Rh.g$a r14 = new Rh.g$a
            boolean r15 = r13.a()
            if (r15 == 0) goto Ld3
            pi.d0 r15 = r13.c()
            pi.M0 r12 = pi.L0.d(r12, r15)
            goto Ld7
        Ld3:
            pi.d0 r12 = r13.c()
        Ld7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.C3479g.d(pi.M0, mh.l, int, boolean):Rh.g$a");
    }

    private final AbstractC7346d0 e(AbstractC7346d0 abstractC7346d0) {
        return this.f19914a.a() ? AbstractC7354h0.h(abstractC7346d0, true) : new C3482j(abstractC7346d0);
    }

    public final pi.S a(pi.S s10, InterfaceC6835l qualifiers, boolean z10) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(qualifiers, "qualifiers");
        return d(s10.Q0(), qualifiers, 0, z10).b();
    }
}
