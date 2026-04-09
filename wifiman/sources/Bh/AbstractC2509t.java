package Bh;

import Bh.v0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import ji.InterfaceC6346g;
import ji.InterfaceC6347h;
import pi.AbstractC7337E;
import ui.l;
import xi.AbstractC8534a;

/* renamed from: Bh.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2509t {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2510u f1792a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2510u f1793b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2510u f1794c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC2510u f1795d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC2510u f1796e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2510u f1797f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC2510u f1798g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC2510u f1799h;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC2510u f1800i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f1801j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f1802k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC2510u f1803l;

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC6346g f1804m;

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC6346g f1805n;

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC6346g f1806o;

    /* renamed from: p, reason: collision with root package name */
    private static final ui.l f1807p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map f1808q;

    /* renamed from: Bh.t$a */
    static class a implements InterfaceC6346g {
        a() {
        }

        @Override // ji.InterfaceC6346g
        public pi.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Bh.t$b */
    static class b implements InterfaceC6346g {
        b() {
        }

        @Override // ji.InterfaceC6346g
        public pi.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Bh.t$c */
    static class c implements InterfaceC6346g {
        c() {
        }

        @Override // ji.InterfaceC6346g
        public pi.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Bh.t$d */
    static class d extends r {
        d(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC2503m interfaceC2503m) {
            if (interfaceC2503m == null) {
                g(0);
            }
            return bi.i.j(interfaceC2503m) != h0.f1785a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [Bh.m, Bh.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [Bh.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [Bh.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [Bh.m] */
        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == 0) {
                g(1);
            }
            if (interfaceC2503m == null) {
                g(2);
            }
            if (bi.i.J(interfaceC2507q) && h(interfaceC2503m)) {
                return AbstractC2509t.f(interfaceC2507q, interfaceC2503m);
            }
            if (interfaceC2507q instanceof InterfaceC2502l) {
                InterfaceC2499i interfaceC2499iB = ((InterfaceC2502l) interfaceC2507q).b();
                if (z10 && bi.i.G(interfaceC2499iB) && bi.i.J(interfaceC2499iB) && (interfaceC2503m instanceof InterfaceC2502l) && bi.i.J(interfaceC2503m.b()) && AbstractC2509t.f(interfaceC2507q, interfaceC2503m)) {
                    return true;
                }
            }
            while (interfaceC2507q != 0) {
                interfaceC2507q = interfaceC2507q.b();
                if (((interfaceC2507q instanceof InterfaceC2495e) && !bi.i.x(interfaceC2507q)) || (interfaceC2507q instanceof M)) {
                    break;
                }
            }
            if (interfaceC2507q == 0) {
                return false;
            }
            while (interfaceC2503m != null) {
                if (interfaceC2507q == interfaceC2503m) {
                    return true;
                }
                if (interfaceC2503m instanceof M) {
                    return (interfaceC2507q instanceof M) && interfaceC2507q.e().equals(((M) interfaceC2503m).e()) && bi.i.b(interfaceC2503m, interfaceC2507q);
                }
                interfaceC2503m = interfaceC2503m.b();
            }
            return false;
        }
    }

    /* renamed from: Bh.t$e */
    static class e extends r {
        e(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            InterfaceC2503m interfaceC2503mQ;
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            if (AbstractC2509t.f1792a.e(interfaceC6346g, interfaceC2507q, interfaceC2503m, z10)) {
                if (interfaceC6346g == AbstractC2509t.f1805n) {
                    return true;
                }
                if (interfaceC6346g != AbstractC2509t.f1804m && (interfaceC2503mQ = bi.i.q(interfaceC2507q, InterfaceC2495e.class)) != null && (interfaceC6346g instanceof InterfaceC6347h)) {
                    return ((InterfaceC6347h) interfaceC6346g).t().a().equals(interfaceC2503mQ.a());
                }
            }
            return false;
        }
    }

    /* renamed from: Bh.t$f */
    static class f extends r {
        f(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2495e interfaceC2495e) {
            if (interfaceC2507q == null) {
                g(2);
            }
            if (interfaceC2495e == null) {
                g(3);
            }
            if (interfaceC6346g == AbstractC2509t.f1806o) {
                return false;
            }
            if (!(interfaceC2507q instanceof InterfaceC2492b) || (interfaceC2507q instanceof InterfaceC2502l) || interfaceC6346g == AbstractC2509t.f1805n) {
                return true;
            }
            if (interfaceC6346g == AbstractC2509t.f1804m || interfaceC6346g == null) {
                return false;
            }
            pi.S type = interfaceC6346g.getType();
            return bi.i.I(type, interfaceC2495e) || AbstractC7337E.a(type);
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            InterfaceC2495e interfaceC2495e;
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            InterfaceC2495e interfaceC2495e2 = (InterfaceC2495e) bi.i.q(interfaceC2507q, InterfaceC2495e.class);
            InterfaceC2495e interfaceC2495e3 = (InterfaceC2495e) bi.i.r(interfaceC2503m, InterfaceC2495e.class, false);
            if (interfaceC2495e3 == null) {
                return false;
            }
            if (interfaceC2495e2 != null && bi.i.x(interfaceC2495e2) && (interfaceC2495e = (InterfaceC2495e) bi.i.q(interfaceC2495e2, InterfaceC2495e.class)) != null && bi.i.H(interfaceC2495e3, interfaceC2495e)) {
                return true;
            }
            InterfaceC2507q interfaceC2507qM = bi.i.M(interfaceC2507q);
            InterfaceC2495e interfaceC2495e4 = (InterfaceC2495e) bi.i.q(interfaceC2507qM, InterfaceC2495e.class);
            if (interfaceC2495e4 == null) {
                return false;
            }
            if (bi.i.H(interfaceC2495e3, interfaceC2495e4) && h(interfaceC6346g, interfaceC2507qM, interfaceC2495e3)) {
                return true;
            }
            return e(interfaceC6346g, interfaceC2507q, interfaceC2495e3.b(), z10);
        }
    }

    /* renamed from: Bh.t$g */
    static class g extends r {
        g(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            if (bi.i.g(interfaceC2503m).K(bi.i.g(interfaceC2507q))) {
                return AbstractC2509t.f1807p.a(interfaceC2507q, interfaceC2503m);
            }
            return false;
        }
    }

    /* renamed from: Bh.t$h */
    static class h extends r {
        h(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return true;
        }
    }

    /* renamed from: Bh.t$i */
    static class i extends r {
        i(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: Bh.t$j */
    static class j extends r {
        j(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: Bh.t$k */
    static class k extends r {
        k(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return false;
        }
    }

    /* renamed from: Bh.t$l */
    static class l extends r {
        l(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(v0.e.f1817c);
        f1792a = dVar;
        e eVar = new e(v0.f.f1818c);
        f1793b = eVar;
        f fVar = new f(v0.g.f1819c);
        f1794c = fVar;
        g gVar = new g(v0.b.f1814c);
        f1795d = gVar;
        h hVar = new h(v0.h.f1820c);
        f1796e = hVar;
        i iVar = new i(v0.d.f1816c);
        f1797f = iVar;
        j jVar = new j(v0.a.f1813c);
        f1798g = jVar;
        k kVar = new k(v0.c.f1815c);
        f1799h = kVar;
        l lVar = new l(v0.i.f1821c);
        f1800i = lVar;
        f1801j = Collections.unmodifiableSet(Zg.d0.i(dVar, eVar, gVar, iVar));
        HashMap mapE = AbstractC8534a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f1802k = Collections.unmodifiableMap(mapE);
        f1803l = hVar;
        f1804m = new a();
        f1805n = new b();
        f1806o = new c();
        Iterator it = ServiceLoader.load(ui.l.class, ui.l.class.getClassLoader()).iterator();
        f1807p = it.hasNext() ? (ui.l) it.next() : l.a.f63098a;
        f1808q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.AbstractC2509t.a(int):void");
    }

    public static Integer d(AbstractC2510u abstractC2510u, AbstractC2510u abstractC2510u2) {
        if (abstractC2510u == null) {
            a(12);
        }
        if (abstractC2510u2 == null) {
            a(13);
        }
        Integer numA = abstractC2510u.a(abstractC2510u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC2510u2.a(abstractC2510u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC2507q e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
        InterfaceC2507q interfaceC2507qE;
        if (interfaceC2507q == null) {
            a(8);
        }
        if (interfaceC2503m == null) {
            a(9);
        }
        for (InterfaceC2507q interfaceC2507q2 = (InterfaceC2507q) interfaceC2507q.a(); interfaceC2507q2 != null && interfaceC2507q2.getVisibility() != f1797f; interfaceC2507q2 = (InterfaceC2507q) bi.i.q(interfaceC2507q2, InterfaceC2507q.class)) {
            if (!interfaceC2507q2.getVisibility().e(interfaceC6346g, interfaceC2507q2, interfaceC2503m, z10)) {
                return interfaceC2507q2;
            }
        }
        if (!(interfaceC2507q instanceof Dh.Q) || (interfaceC2507qE = e(interfaceC6346g, ((Dh.Q) interfaceC2507q).n0(), interfaceC2503m, z10)) == null) {
            return null;
        }
        return interfaceC2507qE;
    }

    public static boolean f(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        if (interfaceC2503m == null) {
            a(6);
        }
        if (interfaceC2503m2 == null) {
            a(7);
        }
        h0 h0VarJ = bi.i.j(interfaceC2503m2);
        if (h0VarJ != h0.f1785a) {
            return h0VarJ.equals(bi.i.j(interfaceC2503m));
        }
        return false;
    }

    public static boolean g(AbstractC2510u abstractC2510u) {
        if (abstractC2510u == null) {
            a(14);
        }
        return abstractC2510u == f1792a || abstractC2510u == f1793b;
    }

    public static boolean h(InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
        if (interfaceC2507q == null) {
            a(2);
        }
        if (interfaceC2503m == null) {
            a(3);
        }
        return e(f1805n, interfaceC2507q, interfaceC2503m, z10) == null;
    }

    private static void i(AbstractC2510u abstractC2510u) {
        f1808q.put(abstractC2510u.b(), abstractC2510u);
    }

    public static AbstractC2510u j(w0 w0Var) {
        if (w0Var == null) {
            a(15);
        }
        AbstractC2510u abstractC2510u = (AbstractC2510u) f1808q.get(w0Var);
        if (abstractC2510u != null) {
            return abstractC2510u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + w0Var);
    }
}
