package bi;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.C;
import Bh.D;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2507q;
import Bh.InterfaceC2515z;
import Bh.X;
import Bh.Y;
import Bh.b0;
import Bh.l0;
import Bh.s0;
import Dh.AbstractC2612s;
import Dh.K;
import Yg.J;
import Zg.AbstractC3689v;
import bi.j;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;
import pi.C7351g;
import pi.L;
import pi.S;
import pi.W;
import pi.u0;
import pi.v0;
import xi.C8545l;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    private static final List f33359e = AbstractC3689v.i1(ServiceLoader.load(j.class, j.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final o f33360f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a f33361g;

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f33362a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f33363b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f33364c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f33365d;

    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = SnmpConfigurator.O_AUTH_PROTOCOL;
            } else {
                objArr[0] = SnmpConfigurator.O_BIND_ADDRESS;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
            }
            if (v0Var2 == null) {
                b(1);
            }
            return v0Var.equals(v0Var2);
        }
    }

    static class b implements InterfaceC6839p {
        b() {
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Yg.s invoke(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
            return new Yg.s(interfaceC2491a, interfaceC2491a2);
        }
    }

    static class c implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2503m f33366a;

        c(InterfaceC2503m interfaceC2503m) {
            this.f33366a = interfaceC2503m;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC2492b interfaceC2492b) {
            return Boolean.valueOf(interfaceC2492b.b() == this.f33366a);
        }
    }

    static class d implements InterfaceC6835l {
        d() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2492b invoke(InterfaceC2492b interfaceC2492b) {
            return interfaceC2492b;
        }
    }

    static class e implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2495e f33367a;

        e(InterfaceC2495e interfaceC2495e) {
            this.f33367a = interfaceC2495e;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC2492b interfaceC2492b) {
            boolean z10 = false;
            if (!AbstractC2509t.g(interfaceC2492b.getVisibility()) && AbstractC2509t.h(interfaceC2492b, this.f33367a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static class f implements InterfaceC6835l {
        f() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2491a invoke(InterfaceC2492b interfaceC2492b) {
            return interfaceC2492b;
        }
    }

    static class g implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f33368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2492b f33369b;

        g(n nVar, InterfaceC2492b interfaceC2492b) {
            this.f33368a = nVar;
            this.f33369b = interfaceC2492b;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public J invoke(InterfaceC2492b interfaceC2492b) {
            this.f33368a.b(this.f33369b, interfaceC2492b);
            return J.f24997a;
        }
    }

    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33370a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33371b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f33372c;

        static {
            int[] iArr = new int[D.values().length];
            f33372c = iArr;
            try {
                iArr[D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33372c[D.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33372c[D.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33372c[D.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f33371b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33371b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33371b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            f33370a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33370a[j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33370a[j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class i {

        /* renamed from: c, reason: collision with root package name */
        private static final i f33373c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        private final a f33374a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33375b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f33374a = aVar;
            this.f33375b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f33373c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f33374a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f33374a + ": " + this.f33375b;
        }
    }

    static {
        a aVar = new a();
        f33361g = aVar;
        f33360f = new o(aVar, g.a.f52146a, f.a.f52145a, null);
    }

    private o(e.a aVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, InterfaceC6839p interfaceC6839p) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f33364c = aVar;
        this.f33362a = gVar;
        this.f33363b = fVar;
        this.f33365d = interfaceC6839p;
    }

    private static boolean A(X x10, X x11) {
        if (x10 == null || x11 == null) {
            return true;
        }
        return H(x10, x11);
    }

    public static boolean B(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        if (interfaceC2491a == null) {
            a(65);
        }
        if (interfaceC2491a2 == null) {
            a(66);
        }
        S returnType = interfaceC2491a.getReturnType();
        S returnType2 = interfaceC2491a2.getReturnType();
        if (!H(interfaceC2491a, interfaceC2491a2)) {
            return false;
        }
        u0 u0VarL = f33360f.l(interfaceC2491a.getTypeParameters(), interfaceC2491a2.getTypeParameters());
        if (interfaceC2491a instanceof InterfaceC2515z) {
            return G(interfaceC2491a, returnType, interfaceC2491a2, returnType2, u0VarL);
        }
        if (!(interfaceC2491a instanceof Y)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC2491a.getClass());
        }
        Y y10 = (Y) interfaceC2491a;
        Y y11 = (Y) interfaceC2491a2;
        if (A(y10.g(), y11.g())) {
            return (y10.h0() && y11.h0()) ? C7351g.f58125a.m(u0VarL, returnType.Q0(), returnType2.Q0()) : (y10.h0() || !y11.h0()) && G(interfaceC2491a, returnType, interfaceC2491a2, returnType2, u0VarL);
        }
        return false;
    }

    private static boolean C(InterfaceC2491a interfaceC2491a, Collection collection) {
        if (interfaceC2491a == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC2491a, (InterfaceC2491a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(InterfaceC2491a interfaceC2491a, S s10, InterfaceC2491a interfaceC2491a2, S s11, u0 u0Var) {
        if (interfaceC2491a == null) {
            a(71);
        }
        if (s10 == null) {
            a(72);
        }
        if (interfaceC2491a2 == null) {
            a(73);
        }
        if (s11 == null) {
            a(74);
        }
        if (u0Var == null) {
            a(75);
        }
        return C7351g.f58125a.t(u0Var, s10.Q0(), s11.Q0());
    }

    private static boolean H(InterfaceC2507q interfaceC2507q, InterfaceC2507q interfaceC2507q2) {
        if (interfaceC2507q == null) {
            a(67);
        }
        if (interfaceC2507q2 == null) {
            a(68);
        }
        Integer numD = AbstractC2509t.d(interfaceC2507q.getVisibility(), interfaceC2507q2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(C c10, C c11, boolean z10) {
        if (c10 == null) {
            a(55);
        }
        if (c11 == null) {
            a(56);
        }
        return !AbstractC2509t.g(c11.getVisibility()) && AbstractC2509t.h(c11, c10, z10);
    }

    public static boolean J(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, boolean z10, boolean z11) {
        if (interfaceC2491a == null) {
            a(13);
        }
        if (interfaceC2491a2 == null) {
            a(14);
        }
        if (!interfaceC2491a.equals(interfaceC2491a2) && bi.g.f33354a.k(interfaceC2491a.a(), interfaceC2491a2.a(), z10, z11)) {
            return true;
        }
        InterfaceC2491a interfaceC2491aA = interfaceC2491a2.a();
        Iterator it = bi.i.d(interfaceC2491a).iterator();
        while (it.hasNext()) {
            if (bi.g.f33354a.k(interfaceC2491aA, (InterfaceC2491a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC2492b interfaceC2492b, InterfaceC6835l interfaceC6835l) {
        AbstractC2510u abstractC2510u;
        if (interfaceC2492b == null) {
            a(105);
        }
        for (InterfaceC2492b interfaceC2492b2 : interfaceC2492b.f()) {
            if (interfaceC2492b2.getVisibility() == AbstractC2509t.f1798g) {
                K(interfaceC2492b2, interfaceC6835l);
            }
        }
        if (interfaceC2492b.getVisibility() != AbstractC2509t.f1798g) {
            return;
        }
        AbstractC2510u abstractC2510uH = h(interfaceC2492b);
        if (abstractC2510uH == null) {
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(interfaceC2492b);
            }
            abstractC2510u = AbstractC2509t.f1796e;
        } else {
            abstractC2510u = abstractC2510uH;
        }
        if (interfaceC2492b instanceof K) {
            ((K) interfaceC2492b).c1(abstractC2510u);
            Iterator it = ((Y) interfaceC2492b).x().iterator();
            while (it.hasNext()) {
                K((X) it.next(), abstractC2510uH == null ? null : interfaceC6835l);
            }
            return;
        }
        if (interfaceC2492b instanceof AbstractC2612s) {
            ((AbstractC2612s) interfaceC2492b).j1(abstractC2510u);
            return;
        }
        Dh.J j10 = (Dh.J) interfaceC2492b;
        j10.N0(abstractC2510u);
        if (abstractC2510u != j10.C0().getVisibility()) {
            j10.L0(false);
        }
    }

    public static Object L(Collection collection, InterfaceC6835l interfaceC6835l) {
        Object next;
        if (collection == null) {
            a(76);
        }
        if (interfaceC6835l == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object objP0 = AbstractC3689v.p0(collection);
            if (objP0 == null) {
                a(78);
            }
            return objP0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listE0 = AbstractC3689v.E0(collection, interfaceC6835l);
        Object objP02 = AbstractC3689v.p0(collection);
        InterfaceC2491a interfaceC2491a = (InterfaceC2491a) interfaceC6835l.invoke(objP02);
        for (Object obj : collection) {
            InterfaceC2491a interfaceC2491a2 = (InterfaceC2491a) interfaceC6835l.invoke(obj);
            if (C(interfaceC2491a2, listE0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC2491a2, interfaceC2491a) && !B(interfaceC2491a, interfaceC2491a2)) {
                objP02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objP02 == null) {
                a(79);
            }
            return objP02;
        }
        if (arrayList.size() == 1) {
            Object objP03 = AbstractC3689v.p0(arrayList);
            if (objP03 == null) {
                a(80);
            }
            return objP03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!L.b(((InterfaceC2491a) interfaceC6835l.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objP04 = AbstractC3689v.p0(arrayList);
        if (objP04 == null) {
            a(82);
        }
        return objP04;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.o.a(int):void");
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return AbstractC3689v.c0(collection, new c(((InterfaceC2492b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(Bh.l0 r4, Bh.l0 r5, pi.u0 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            pi.S r5 = (pi.S) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            pi.S r3 = (pi.S) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.o.c(Bh.l0, Bh.l0, pi.u0):boolean");
    }

    private static boolean d(S s10, S s11, u0 u0Var) {
        if (s10 == null) {
            a(44);
        }
        if (s11 == null) {
            a(45);
        }
        if (u0Var == null) {
            a(46);
        }
        if (W.a(s10) && W.a(s11)) {
            return true;
        }
        return C7351g.f58125a.m(u0Var, s10.Q0(), s11.Q0());
    }

    private static i e(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        if ((interfaceC2491a.k0() == null) != (interfaceC2491a2.k0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC2491a.i().size() != interfaceC2491a2.i().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(InterfaceC2492b interfaceC2492b, Set set) {
        if (interfaceC2492b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC2492b.h().isReal()) {
            set.add(interfaceC2492b);
            return;
        }
        if (interfaceC2492b.f().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC2492b);
        }
        Iterator it = interfaceC2492b.f().iterator();
        while (it.hasNext()) {
            f((InterfaceC2492b) it.next(), set);
        }
    }

    private static List g(InterfaceC2491a interfaceC2491a) {
        b0 b0VarK0 = interfaceC2491a.k0();
        ArrayList arrayList = new ArrayList();
        if (b0VarK0 != null) {
            arrayList.add(b0VarK0.getType());
        }
        Iterator it = interfaceC2491a.i().iterator();
        while (it.hasNext()) {
            arrayList.add(((s0) it.next()).getType());
        }
        return arrayList;
    }

    private static AbstractC2510u h(InterfaceC2492b interfaceC2492b) {
        if (interfaceC2492b == null) {
            a(106);
        }
        Collection<InterfaceC2492b> collectionF = interfaceC2492b.f();
        AbstractC2510u abstractC2510uU = u(collectionF);
        if (abstractC2510uU == null) {
            return null;
        }
        if (interfaceC2492b.h() != InterfaceC2492b.a.FAKE_OVERRIDE) {
            return abstractC2510uU.f();
        }
        for (InterfaceC2492b interfaceC2492b2 : collectionF) {
            if (interfaceC2492b2.l() != D.ABSTRACT && !interfaceC2492b2.getVisibility().equals(abstractC2510uU)) {
                return null;
            }
        }
        return abstractC2510uU;
    }

    public static o i(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new o(aVar, gVar, f.a.f52145a, null);
    }

    private static void j(Collection collection, InterfaceC2495e interfaceC2495e, n nVar) {
        if (collection == null) {
            a(83);
        }
        if (interfaceC2495e == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection collectionT = t(interfaceC2495e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC2492b interfaceC2492bC0 = ((InterfaceC2492b) L(collection, new d())).c0(interfaceC2495e, n(collection, interfaceC2495e), zIsEmpty ? AbstractC2509t.f1799h : AbstractC2509t.f1798g, InterfaceC2492b.a.FAKE_OVERRIDE, false);
        nVar.d(interfaceC2492bC0, collection);
        nVar.a(interfaceC2492bC0);
    }

    private static void k(InterfaceC2495e interfaceC2495e, Collection collection, n nVar) {
        if (interfaceC2495e == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC2492b) it.next()), interfaceC2495e, nVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(w.a(linkedList), linkedList, nVar), interfaceC2495e, nVar);
            }
        }
    }

    private u0 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            u0 u0VarK0 = new p(null, this.f33364c, this.f33362a, this.f33363b, this.f33365d).K0(true, true);
            if (u0VarK0 == null) {
                a(42);
            }
            return u0VarK0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((l0) list.get(i10)).k(), ((l0) list2.get(i10)).k());
        }
        u0 u0VarK02 = new p(map, this.f33364c, this.f33362a, this.f33363b, this.f33365d).K0(true, true);
        if (u0VarK02 == null) {
            a(43);
        }
        return u0VarK02;
    }

    public static o m(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new o(f33361g, gVar, f.a.f52145a, null);
    }

    private static D n(Collection collection, InterfaceC2495e interfaceC2495e) {
        if (collection == null) {
            a(86);
        }
        if (interfaceC2495e == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC2492b interfaceC2492b = (InterfaceC2492b) it.next();
            int i10 = h.f33372c[interfaceC2492b.l().ordinal()];
            if (i10 == 1) {
                D d10 = D.FINAL;
                if (d10 == null) {
                    a(88);
                }
                return d10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC2492b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC2495e.L() && interfaceC2495e.l() != D.ABSTRACT && interfaceC2495e.l() != D.SEALED) {
            z10 = true;
        }
        if (z11 && !z12) {
            D d11 = D.OPEN;
            if (d11 == null) {
                a(89);
            }
            return d11;
        }
        if (!z11 && z12) {
            D dL = z10 ? interfaceC2495e.l() : D.ABSTRACT;
            if (dL == null) {
                a(90);
            }
            return dL;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC2492b) it2.next()));
        }
        return y(r(hashSet), z10, interfaceC2495e.l());
    }

    private Collection o(InterfaceC2492b interfaceC2492b, Collection collection, InterfaceC2495e interfaceC2495e, n nVar) {
        if (interfaceC2492b == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (interfaceC2495e == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C8545l c8545lJ = C8545l.j();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC2492b interfaceC2492b2 = (InterfaceC2492b) it.next();
            i.a aVarC = D(interfaceC2492b2, interfaceC2492b, interfaceC2495e).c();
            boolean zI = I(interfaceC2492b, interfaceC2492b2, false);
            int i10 = h.f33371b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    c8545lJ.add(interfaceC2492b2);
                }
                arrayList.add(interfaceC2492b2);
            } else if (i10 == 2) {
                if (zI) {
                    nVar.c(interfaceC2492b2, interfaceC2492b);
                }
                arrayList.add(interfaceC2492b2);
            }
        }
        nVar.d(interfaceC2492b, c8545lJ);
        return arrayList;
    }

    private static Collection p(InterfaceC2492b interfaceC2492b, Queue queue, n nVar) {
        if (interfaceC2492b == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return q(interfaceC2492b, queue, new f(), new g(nVar, interfaceC2492b));
    }

    public static Collection q(Object obj, Collection collection, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (interfaceC6835l == null) {
            a(99);
        }
        if (interfaceC6835l2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC2491a interfaceC2491a = (InterfaceC2491a) interfaceC6835l.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC2491a interfaceC2491a2 = (InterfaceC2491a) interfaceC6835l.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC2491a, interfaceC2491a2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    interfaceC6835l2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && AbstractC5833e.y(AbstractC5833e.s((InterfaceC2503m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p) {
        if (set == null) {
            a(9);
        }
        if (interfaceC6839p == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Yg.s sVar = (Yg.s) interfaceC6839p.invoke(obj, it.next());
                InterfaceC2491a interfaceC2491a = (InterfaceC2491a) sVar.a();
                InterfaceC2491a interfaceC2491a2 = (InterfaceC2491a) sVar.c();
                if (!J(interfaceC2491a, interfaceC2491a2, z10, true)) {
                    if (J(interfaceC2491a2, interfaceC2491a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC2495e interfaceC2495e, Collection collection) {
        if (interfaceC2495e == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listM0 = AbstractC3689v.m0(collection, new e(interfaceC2495e));
        if (listM0 == null) {
            a(96);
        }
        return listM0;
    }

    public static AbstractC2510u u(Collection collection) {
        AbstractC2510u abstractC2510u;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return AbstractC2509t.f1803l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC2510u = null;
            while (it.hasNext()) {
                AbstractC2510u visibility = ((InterfaceC2492b) it.next()).getVisibility();
                if (abstractC2510u != null) {
                    Integer numD = AbstractC2509t.d(visibility, abstractC2510u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC2510u = visibility;
            }
        }
        if (abstractC2510u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = AbstractC2509t.d(abstractC2510u, ((InterfaceC2492b) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC2510u;
    }

    public static i w(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        boolean z10;
        if (interfaceC2491a == null) {
            a(38);
        }
        if (interfaceC2491a2 == null) {
            a(39);
        }
        boolean z11 = interfaceC2491a instanceof InterfaceC2515z;
        if ((z11 && !(interfaceC2491a2 instanceof InterfaceC2515z)) || (((z10 = interfaceC2491a instanceof Y)) && !(interfaceC2491a2 instanceof Y))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC2491a);
        }
        if (!interfaceC2491a.getName().equals(interfaceC2491a2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC2491a, interfaceC2491a2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        o oVar = f33360f;
        i.a aVarC = oVar.D(interfaceC2491a2, interfaceC2491a, null).c();
        i.a aVarC2 = oVar.D(interfaceC2491a, interfaceC2491a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    private static D y(Collection collection, boolean z10, D d10) {
        if (collection == null) {
            a(91);
        }
        if (d10 == null) {
            a(92);
        }
        D d11 = D.ABSTRACT;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC2492b interfaceC2492b = (InterfaceC2492b) it.next();
            D dL = (z10 && interfaceC2492b.l() == D.ABSTRACT) ? d10 : interfaceC2492b.l();
            if (dL.compareTo(d11) < 0) {
                d11 = dL;
            }
        }
        if (d11 == null) {
            a(93);
        }
        return d11;
    }

    public static Set z(InterfaceC2492b interfaceC2492b) {
        if (interfaceC2492b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC2492b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, InterfaceC2495e interfaceC2495e) {
        if (interfaceC2491a == null) {
            a(19);
        }
        if (interfaceC2491a2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC2491a, interfaceC2491a2, interfaceC2495e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, InterfaceC2495e interfaceC2495e, boolean z10) {
        if (interfaceC2491a == null) {
            a(22);
        }
        if (interfaceC2491a2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC2491a, interfaceC2491a2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (j jVar : f33359e) {
            if (jVar.a() != j.a.CONFLICTS_ONLY && (!z11 || jVar.a() != j.a.SUCCESS_ONLY)) {
                int i10 = h.f33370a[jVar.b(interfaceC2491a, interfaceC2491a2, interfaceC2495e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (j jVar2 : f33359e) {
            if (jVar2.a() == j.a.CONFLICTS_ONLY) {
                int i11 = h.f33370a[jVar2.b(interfaceC2491a, interfaceC2491a2, interfaceC2495e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, boolean z10) {
        if (interfaceC2491a == null) {
            a(28);
        }
        if (interfaceC2491a2 == null) {
            a(29);
        }
        i iVarW = w(interfaceC2491a, interfaceC2491a2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(interfaceC2491a);
        List listG2 = g(interfaceC2491a2);
        List typeParameters = interfaceC2491a.getTypeParameters();
        List typeParameters2 = interfaceC2491a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a.b((S) listG.get(i10), (S) listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        u0 u0VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((l0) typeParameters.get(i11), (l0) typeParameters2.get(i11), u0VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d((S) listG.get(i10), (S) listG2.get(i10), u0VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((interfaceC2491a instanceof InterfaceC2515z) && (interfaceC2491a2 instanceof InterfaceC2515z) && ((InterfaceC2515z) interfaceC2491a).isSuspend() != ((InterfaceC2515z) interfaceC2491a2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z10) {
            S returnType = interfaceC2491a.getReturnType();
            S returnType2 = interfaceC2491a2.getReturnType();
            if (returnType != null && returnType2 != null && ((!W.a(returnType2) || !W.a(returnType)) && !C7351g.f58125a.t(u0VarL, returnType2.Q0(), returnType.Q0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(Zh.f fVar, Collection collection, Collection collection2, InterfaceC2495e interfaceC2495e, n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (interfaceC2495e == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC2492b) it.next(), collection, interfaceC2495e, nVar));
        }
        k(interfaceC2495e, linkedHashSet, nVar);
    }
}
