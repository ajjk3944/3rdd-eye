package pi;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mh.InterfaceC6835l;
import xi.C8545l;

/* loaded from: classes4.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC7346d0 f58070a = kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC7346d0 f58071b = kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC7346d0 f58072c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC7346d0 f58073d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends AbstractC7333A {

        /* renamed from: b, reason: collision with root package name */
        private final String f58074b;

        public a(String str) {
            this.f58074b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pi.J0.a.Z0(int):void");
        }

        @Override // pi.M0
        /* renamed from: U0, reason: merged with bridge method [inline-methods] */
        public AbstractC7346d0 R0(boolean z10) {
            throw new IllegalStateException(this.f58074b);
        }

        @Override // pi.M0
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public AbstractC7346d0 T0(r0 r0Var) {
            if (r0Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f58074b);
        }

        @Override // pi.AbstractC7333A
        protected AbstractC7346d0 W0() {
            throw new IllegalStateException(this.f58074b);
        }

        @Override // pi.AbstractC7333A
        public AbstractC7333A Y0(AbstractC7346d0 abstractC7346d0) {
            if (abstractC7346d0 == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f58074b);
        }

        @Override // pi.AbstractC7333A
        /* renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a X0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            if (gVar == null) {
                Z0(3);
            }
            return this;
        }

        @Override // pi.AbstractC7346d0
        public String toString() {
            String str = this.f58074b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.J0.a(int):void");
    }

    public static boolean b(S s10) {
        if (s10 == null) {
            a(28);
        }
        if (s10.O0()) {
            return true;
        }
        return L.b(s10) && b(L.a(s10).W0());
    }

    public static boolean c(S s10, InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l == null) {
            a(43);
        }
        return d(s10, interfaceC6835l, null);
    }

    private static boolean d(S s10, InterfaceC6835l interfaceC6835l, C8545l c8545l) {
        if (interfaceC6835l == null) {
            a(44);
        }
        if (s10 == null) {
            return false;
        }
        M0 m0Q0 = s10.Q0();
        if (w(s10)) {
            return ((Boolean) interfaceC6835l.invoke(m0Q0)).booleanValue();
        }
        if (c8545l != null && c8545l.contains(s10)) {
            return false;
        }
        if (((Boolean) interfaceC6835l.invoke(m0Q0)).booleanValue()) {
            return true;
        }
        if (c8545l == null) {
            c8545l = C8545l.j();
        }
        c8545l.add(s10);
        I i10 = m0Q0 instanceof I ? (I) m0Q0 : null;
        if (i10 != null && (d(i10.V0(), interfaceC6835l, c8545l) || d(i10.W0(), interfaceC6835l, c8545l))) {
            return true;
        }
        if ((m0Q0 instanceof C7377y) && d(((C7377y) m0Q0).Z0(), interfaceC6835l, c8545l)) {
            return true;
        }
        v0 v0VarN0 = s10.N0();
        if (v0VarN0 instanceof Q) {
            Iterator it = ((Q) v0VarN0).a().iterator();
            while (it.hasNext()) {
                if (d((S) it.next(), interfaceC6835l, c8545l)) {
                    return true;
                }
            }
            return false;
        }
        for (B0 b02 : s10.L0()) {
            if (!b02.c() && d(b02.getType(), interfaceC6835l, c8545l)) {
                return true;
            }
        }
        return false;
    }

    public static S e(S s10, S s11, G0 g02) {
        if (s10 == null) {
            a(20);
        }
        if (s11 == null) {
            a(21);
        }
        if (g02 == null) {
            a(22);
        }
        S sP = g02.p(s11, N0.INVARIANT);
        if (sP != null) {
            return q(sP, s10.O0());
        }
        return null;
    }

    public static InterfaceC2495e f(S s10) {
        if (s10 == null) {
            a(30);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hC;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D0(((Bh.l0) it.next()).u()));
        }
        List listI1 = AbstractC3689v.i1(arrayList);
        if (listI1 == null) {
            a(17);
        }
        return listI1;
    }

    public static List h(S s10) {
        if (s10 == null) {
            a(18);
        }
        G0 g0F = G0.f(s10);
        Collection collectionA = s10.N0().a();
        ArrayList arrayList = new ArrayList(collectionA.size());
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            S sE = e(s10, (S) it.next(), g0F);
            if (sE != null) {
                arrayList.add(sE);
            }
        }
        return arrayList;
    }

    public static Bh.l0 i(S s10) {
        if (s10 == null) {
            a(63);
        }
        if (s10.N0().c() instanceof Bh.l0) {
            return (Bh.l0) s10.N0().c();
        }
        return null;
    }

    public static boolean j(S s10) {
        if (s10 == null) {
            a(29);
        }
        if (s10.N0().c() instanceof InterfaceC2495e) {
            return false;
        }
        Iterator it = h(s10).iterator();
        while (it.hasNext()) {
            if (l((S) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(S s10) {
        return s10 != null && s10.N0() == f58070a.N0();
    }

    public static boolean l(S s10) {
        if (s10 == null) {
            a(27);
        }
        if (s10.O0()) {
            return true;
        }
        if (L.b(s10) && l(L.a(s10).W0())) {
            return true;
        }
        if (AbstractC7354h0.c(s10)) {
            return false;
        }
        if (m(s10)) {
            return j(s10);
        }
        v0 v0VarN0 = s10.N0();
        if (v0VarN0 instanceof Q) {
            Iterator it = v0VarN0.a().iterator();
            while (it.hasNext()) {
                if (l((S) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(S s10) {
        if (s10 == null) {
            a(60);
        }
        if (i(s10) != null) {
            return true;
        }
        s10.N0();
        return false;
    }

    public static S n(S s10) {
        if (s10 == null) {
            a(2);
        }
        return p(s10, false);
    }

    public static S o(S s10) {
        if (s10 == null) {
            a(1);
        }
        return p(s10, true);
    }

    public static S p(S s10, boolean z10) {
        if (s10 == null) {
            a(3);
        }
        M0 m0R0 = s10.Q0().R0(z10);
        if (m0R0 == null) {
            a(4);
        }
        return m0R0;
    }

    public static S q(S s10, boolean z10) {
        if (s10 == null) {
            a(8);
        }
        if (z10) {
            return o(s10);
        }
        if (s10 == null) {
            a(9);
        }
        return s10;
    }

    public static AbstractC7346d0 r(AbstractC7346d0 abstractC7346d0, boolean z10) {
        if (abstractC7346d0 == null) {
            a(5);
        }
        if (!z10) {
            if (abstractC7346d0 == null) {
                a(7);
            }
            return abstractC7346d0;
        }
        AbstractC7346d0 abstractC7346d0R0 = abstractC7346d0.R0(true);
        if (abstractC7346d0R0 == null) {
            a(6);
        }
        return abstractC7346d0R0;
    }

    public static B0 s(Bh.l0 l0Var) {
        if (l0Var == null) {
            a(45);
        }
        return new C7360k0(l0Var);
    }

    public static B0 t(Bh.l0 l0Var, G g10) {
        if (l0Var == null) {
            a(46);
        }
        return g10.b() == I0.SUPERTYPE ? new D0(AbstractC7362l0.b(l0Var)) : new C7360k0(l0Var);
    }

    public static AbstractC7346d0 u(InterfaceC2498h interfaceC2498h, InterfaceC6164k interfaceC6164k, InterfaceC6835l interfaceC6835l) {
        if (!kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2498h)) {
            return v(interfaceC2498h.k(), interfaceC6164k, interfaceC6835l);
        }
        kotlin.reflect.jvm.internal.impl.types.error.i iVarD = kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC2498h.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static AbstractC7346d0 v(v0 v0Var, InterfaceC6164k interfaceC6164k, InterfaceC6835l interfaceC6835l) {
        if (v0Var == null) {
            a(12);
        }
        if (interfaceC6164k == null) {
            a(13);
        }
        if (interfaceC6835l == null) {
            a(14);
        }
        AbstractC7346d0 abstractC7346d0N = V.n(r0.f58162b.j(), v0Var, g(v0Var.getParameters()), false, interfaceC6164k, interfaceC6835l);
        if (abstractC7346d0N == null) {
            a(15);
        }
        return abstractC7346d0N;
    }

    public static boolean w(S s10) {
        if (s10 == null) {
            a(0);
        }
        return s10 == f58072c || s10 == f58073d;
    }
}
