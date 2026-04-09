package Ah;

import Ah.k;
import Bh.AbstractC2508s;
import Bh.AbstractC2509t;
import Bh.AbstractC2514y;
import Bh.D;
import Bh.E;
import Bh.EnumC2496f;
import Bh.G;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.L;
import Bh.f0;
import Bh.g0;
import Bh.s0;
import Dh.C2605k;
import Dh.H;
import Nh.C3387n;
import Nh.C3398z;
import Sh.B;
import Sh.C;
import Yg.J;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.d0;
import bi.o;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import li.AbstractC6609L;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import ni.C6981m;
import oi.InterfaceC7140a;
import pi.AbstractC7346d0;
import pi.G0;
import pi.S;
import pi.Y;
import xi.AbstractC8535b;
import xi.C8545l;

/* loaded from: classes4.dex */
public final class u implements Ch.a, Ch.c {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ th.l[] f826i = {O.h(new F(O.b(u.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), O.h(new F(O.b(u.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), O.h(new F(O.b(u.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    private final G f827a;

    /* renamed from: b, reason: collision with root package name */
    private final Ah.d f828b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.i f829c;

    /* renamed from: d, reason: collision with root package name */
    private final S f830d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f831e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7140a f832f;

    /* renamed from: g, reason: collision with root package name */
    private final oi.i f833g;

    /* renamed from: h, reason: collision with root package name */
    private final oi.g f834h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HIDDEN = new a("HIDDEN", 0);
        public static final a VISIBLE = new a("VISIBLE", 1);
        public static final a DEPRECATED_LIST_METHODS = new a("DEPRECATED_LIST_METHODS", 2);
        public static final a NOT_CONSIDERED = new a("NOT_CONSIDERED", 3);
        public static final a DROP = new a("DROP", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f835a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f835a = iArr;
        }
    }

    public static final class c extends H {
        c(G g10, Zh.c cVar) {
            super(g10, cVar);
        }

        @Override // Bh.M
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6164k.b r() {
            return InterfaceC6164k.b.f49223b;
        }
    }

    public static final class d extends AbstractC8535b.AbstractC2348b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f837b;

        d(String str, N n10) {
            this.f836a = str;
            this.f837b = n10;
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC2495e javaClassDescriptor) {
            AbstractC6492s.i(javaClassDescriptor, "javaClassDescriptor");
            String strA = B.a(Sh.F.f20704a, javaClassDescriptor, this.f836a);
            x xVar = x.f841a;
            if (xVar.f().contains(strA)) {
                this.f837b.f51689a = a.HIDDEN;
            } else if (xVar.i().contains(strA)) {
                this.f837b.f51689a = a.VISIBLE;
            } else if (xVar.c().contains(strA)) {
                this.f837b.f51689a = a.DEPRECATED_LIST_METHODS;
            } else if (xVar.d().contains(strA)) {
                this.f837b.f51689a = a.DROP;
            }
            return this.f837b.f51689a == null;
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = (a) this.f837b.f51689a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    public u(G moduleDescriptor, oi.n storageManager, InterfaceC6824a settingsComputation) {
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(settingsComputation, "settingsComputation");
        this.f827a = moduleDescriptor;
        this.f828b = Ah.d.f791a;
        this.f829c = storageManager.f(settingsComputation);
        this.f830d = q(storageManager);
        this.f831e = storageManager.f(new l(this, storageManager));
        this.f832f = storageManager.c();
        this.f833g = storageManager.f(new m(this));
        this.f834h = storageManager.e(new n(this));
    }

    private final a A(InterfaceC2515z interfaceC2515z) {
        InterfaceC2503m interfaceC2503mB = interfaceC2515z.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = AbstractC8535b.b(AbstractC3689v.e((InterfaceC2495e) interfaceC2503mB), new t(this), new d(C.c(interfaceC2515z, false, false, 3, null), new N()));
        AbstractC6492s.h(objB, "dfs(...)");
        return (a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable B(u uVar, InterfaceC2495e interfaceC2495e) {
        Collection collectionA = interfaceC2495e.k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            InterfaceC2498h interfaceC2498hC = ((S) it.next()).N0().c();
            C3387n c3387nZ = null;
            InterfaceC2498h interfaceC2498hA = interfaceC2498hC != null ? interfaceC2498hC.a() : null;
            InterfaceC2495e interfaceC2495e2 = interfaceC2498hA instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hA : null;
            if (interfaceC2495e2 != null && (c3387nZ = uVar.z(interfaceC2495e2)) == null) {
                c3387nZ = interfaceC2495e2;
            }
            if (c3387nZ != null) {
                arrayList.add(c3387nZ);
            }
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h C() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.h) oi.m.a(this.f833g, this, f826i[2]);
    }

    private final k.b D() {
        return (k.b) oi.m.a(this.f829c, this, f826i[0]);
    }

    private final boolean E(f0 f0Var, boolean z10) {
        InterfaceC2503m interfaceC2503mB = f0Var.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = C.c(f0Var, false, false, 3, null);
        if (z10 ^ x.f841a.g().contains(B.a(Sh.F.f20704a, (InterfaceC2495e) interfaceC2503mB, strC))) {
            return true;
        }
        Boolean boolE = AbstractC8535b.e(AbstractC3689v.e(f0Var), r.f823a, new s(this));
        AbstractC6492s.h(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(InterfaceC2492b interfaceC2492b) {
        return interfaceC2492b.a().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean G(Ah.u r2, Bh.InterfaceC2492b r3) {
        /*
            Bh.b$a r0 = r3.h()
            Bh.b$a r1 = Bh.InterfaceC2492b.a.DECLARATION
            if (r0 != r1) goto L1d
            Ah.d r2 = r2.f828b
            Bh.m r3 = r3.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.AbstractC6492s.g(r3, r0)
            Bh.e r3 = (Bh.InterfaceC2495e) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ah.u.G(Ah.u, Bh.b):java.lang.Boolean");
    }

    private final boolean H(InterfaceC2502l interfaceC2502l, InterfaceC2495e interfaceC2495e) {
        if (interfaceC2502l.i().size() == 1) {
            List listI = interfaceC2502l.i();
            AbstractC6492s.h(listI, "getValueParameters(...)");
            InterfaceC2498h interfaceC2498hC = ((s0) AbstractC3689v.R0(listI)).getType().N0().c();
            if (AbstractC6492s.d(interfaceC2498hC != null ? AbstractC5833e.p(interfaceC2498hC) : null, AbstractC5833e.p(interfaceC2495e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h I(u uVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.c(uVar.f827a.q(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 o(u uVar, oi.n nVar) {
        return AbstractC2514y.d(uVar.D().a(), g.f795d.a(), new L(nVar, uVar.D().a())).u();
    }

    private final f0 p(C6981m c6981m, f0 f0Var) {
        InterfaceC2515z.a aVarV = f0Var.v();
        aVarV.p(c6981m);
        aVarV.f(AbstractC2509t.f1796e);
        aVarV.g(c6981m.u());
        aVarV.e(c6981m.J0());
        InterfaceC2515z interfaceC2515zA = aVarV.a();
        AbstractC6492s.f(interfaceC2515zA);
        return (f0) interfaceC2515zA;
    }

    private final S q(oi.n nVar) {
        C2605k c2605k = new C2605k(new c(this.f827a, new Zh.c("java.io")), Zh.f.h("Serializable"), D.ABSTRACT, EnumC2496f.INTERFACE, AbstractC3689v.e(new Y(nVar, new o(this))), g0.f1784a, false, nVar);
        c2605k.K0(InterfaceC6164k.b.f49223b, d0.e(), null);
        AbstractC7346d0 abstractC7346d0U = c2605k.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        return abstractC7346d0U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S r(u uVar) {
        AbstractC7346d0 abstractC7346d0I = uVar.f827a.q().i();
        AbstractC6492s.h(abstractC7346d0I, "getAnyType(...)");
        return abstractC7346d0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h s(u uVar, Yg.s sVar) {
        AbstractC6492s.i(sVar, "<destruct>");
        String str = (String) sVar.a();
        String str2 = (String) sVar.c();
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b(uVar.f827a.q(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection t(InterfaceC2495e interfaceC2495e, InterfaceC6835l interfaceC6835l) {
        C3387n c3387nZ = z(interfaceC2495e);
        if (c3387nZ == null) {
            return AbstractC3689v.l();
        }
        Collection collectionG = this.f828b.g(AbstractC5833e.o(c3387nZ), Ah.b.f769h.a());
        InterfaceC2495e interfaceC2495e2 = (InterfaceC2495e) AbstractC3689v.C0(collectionG);
        if (interfaceC2495e2 == null) {
            return AbstractC3689v.l();
        }
        C8545l.b bVar = C8545l.f66170c;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5833e.o((InterfaceC2495e) it.next()));
        }
        C8545l c8545lB = bVar.b(arrayList);
        boolean zC = this.f828b.c(interfaceC2495e);
        InterfaceC6164k interfaceC6164kE0 = ((InterfaceC2495e) this.f832f.a(AbstractC5833e.o(c3387nZ), new q(c3387nZ, interfaceC2495e2))).E0();
        AbstractC6492s.h(interfaceC6164kE0, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) interfaceC6835l.invoke(interfaceC6164kE0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            f0 f0Var = (f0) obj;
            if (f0Var.h() == InterfaceC2492b.a.DECLARATION && f0Var.getVisibility().d() && !kotlin.reflect.jvm.internal.impl.builtins.i.k0(f0Var)) {
                Collection collectionF = f0Var.f();
                AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
                Collection collection = collectionF;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2503m interfaceC2503mB = ((InterfaceC2515z) it2.next()).b();
                        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
                        if (c8545lB.contains(AbstractC5833e.o(interfaceC2503mB))) {
                            break;
                        }
                    }
                }
                if (!E(f0Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e u(C3387n c3387n, InterfaceC2495e interfaceC2495e) {
        Kh.j EMPTY = Kh.j.f10805a;
        AbstractC6492s.h(EMPTY, "EMPTY");
        return c3387n.P0(EMPTY, interfaceC2495e);
    }

    private final AbstractC7346d0 v() {
        return (AbstractC7346d0) oi.m.a(this.f831e, this, f826i[1]);
    }

    private static final boolean w(InterfaceC2502l interfaceC2502l, G0 g02, InterfaceC2502l interfaceC2502l2) {
        return bi.o.x(interfaceC2502l, interfaceC2502l2.c(g02)) == o.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(Zh.f fVar, InterfaceC6164k it) {
        AbstractC6492s.i(it, "it");
        return it.b(fVar, Ih.d.FROM_BUILTINS);
    }

    private final C3387n z(InterfaceC2495e interfaceC2495e) {
        Zh.b bVarN;
        Zh.c cVarA;
        if (kotlin.reflect.jvm.internal.impl.builtins.i.a0(interfaceC2495e) || !kotlin.reflect.jvm.internal.impl.builtins.i.B0(interfaceC2495e)) {
            return null;
        }
        Zh.d dVarP = AbstractC5833e.p(interfaceC2495e);
        if (!dVarP.f() || (bVarN = Ah.c.f771a.n(dVarP)) == null || (cVarA = bVarN.a()) == null) {
            return null;
        }
        InterfaceC2495e interfaceC2495eD = AbstractC2508s.d(D().a(), cVarA, Ih.d.FROM_BUILTINS);
        if (interfaceC2495eD instanceof C3387n) {
            return (C3387n) interfaceC2495eD;
        }
        return null;
    }

    @Override // Ch.a
    public Collection a(InterfaceC2495e classDescriptor) {
        InterfaceC2495e interfaceC2495eF;
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        if (classDescriptor.h() != EnumC2496f.CLASS || !D().b()) {
            return AbstractC3689v.l();
        }
        C3387n c3387nZ = z(classDescriptor);
        if (c3387nZ != null && (interfaceC2495eF = Ah.d.f(this.f828b, AbstractC5833e.o(c3387nZ), Ah.b.f769h.a(), null, 4, null)) != null) {
            G0 g0C = y.a(interfaceC2495eF, c3387nZ).c();
            List listR0 = c3387nZ.m();
            ArrayList<InterfaceC2494d> arrayList = new ArrayList();
            for (Object obj : listR0) {
                InterfaceC2494d interfaceC2494d = (InterfaceC2494d) obj;
                if (interfaceC2494d.getVisibility().d()) {
                    Collection collectionM = interfaceC2495eF.m();
                    AbstractC6492s.h(collectionM, "getConstructors(...)");
                    Collection<InterfaceC2494d> collection = collectionM;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        for (InterfaceC2494d interfaceC2494d2 : collection) {
                            AbstractC6492s.f(interfaceC2494d2);
                            if (w(interfaceC2494d2, g0C, interfaceC2494d)) {
                                break;
                            }
                        }
                    }
                    if (!H(interfaceC2494d, classDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.i.k0(interfaceC2494d) && !x.f841a.e().contains(B.a(Sh.F.f20704a, c3387nZ, C.c(interfaceC2494d, false, false, 3, null)))) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
            for (InterfaceC2494d interfaceC2494d3 : arrayList) {
                InterfaceC2515z.a aVarV = interfaceC2494d3.v();
                aVarV.p(classDescriptor);
                aVarV.g(classDescriptor.u());
                aVarV.i();
                aVarV.t(g0C.j());
                if (!x.f841a.h().contains(B.a(Sh.F.f20704a, c3387nZ, C.c(interfaceC2494d3, false, false, 3, null)))) {
                    aVarV.r(C());
                }
                InterfaceC2515z interfaceC2515zA = aVarV.a();
                AbstractC6492s.g(interfaceC2515zA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((InterfaceC2494d) interfaceC2515zA);
            }
            return arrayList2;
        }
        return AbstractC3689v.l();
    }

    @Override // Ch.c
    public boolean b(InterfaceC2495e classDescriptor, f0 functionDescriptor) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        C3387n c3387nZ = z(classDescriptor);
        if (c3387nZ == null || !functionDescriptor.getAnnotations().P(Ch.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = C.c(functionDescriptor, false, false, 3, null);
        C3398z c3398zU0 = c3387nZ.E0();
        Zh.f name = functionDescriptor.getName();
        AbstractC6492s.h(name, "getName(...)");
        Collection collectionB = c3398zU0.b(name, Ih.d.FROM_BUILTINS);
        if (!(collectionB instanceof Collection) || !collectionB.isEmpty()) {
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                if (AbstractC6492s.d(C.c((f0) it.next(), false, false, 3, null), strC)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ch.a
    public Collection c(InterfaceC2495e classDescriptor) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        Zh.d dVarP = AbstractC5833e.p(classDescriptor);
        x xVar = x.f841a;
        return xVar.j(dVarP) ? AbstractC3689v.o(v(), this.f830d) : xVar.k(dVarP) ? AbstractC3689v.e(this.f830d) : AbstractC3689v.l();
    }

    @Override // Ch.a
    public Collection d(Zh.f name, InterfaceC2495e classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        if (AbstractC6492s.d(name, Ah.a.f767e.a()) && (classDescriptor instanceof C6981m) && kotlin.reflect.jvm.internal.impl.builtins.i.d0(classDescriptor)) {
            C6981m c6981m = (C6981m) classDescriptor;
            List listR1 = c6981m.e1().R1();
            AbstractC6492s.h(listR1, "getFunctionList(...)");
            List list = listR1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC6492s.d(AbstractC6609L.b(c6981m.d1().g(), ((Uh.i) it.next()).n1()), Ah.a.f767e.a())) {
                        return AbstractC3689v.l();
                    }
                }
            }
            return AbstractC3689v.e(p(c6981m, (f0) AbstractC3689v.Q0(v().r().b(name, Ih.d.FROM_BUILTINS))));
        }
        if (!D().b()) {
            return AbstractC3689v.l();
        }
        Collection<f0> collectionT = t(classDescriptor, new p(name));
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : collectionT) {
            InterfaceC2503m interfaceC2503mB = f0Var.b();
            AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC2515z interfaceC2515zC = f0Var.c(y.a((InterfaceC2495e) interfaceC2503mB, classDescriptor).c());
            AbstractC6492s.g(interfaceC2515zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC2515z.a aVarV = ((f0) interfaceC2515zC).v();
            aVarV.p(classDescriptor);
            aVarV.e(classDescriptor.J0());
            aVarV.i();
            int i10 = b.f835a[A(f0Var).ordinal()];
            f0 f0Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    Zh.f name2 = f0Var.getName();
                    if (AbstractC6492s.d(name2, v.f838a)) {
                        hVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.h) this.f834h.invoke(z.a(f0Var.getName().b(), "first"));
                    } else {
                        if (!AbstractC6492s.d(name2, v.f839b)) {
                            throw new IllegalStateException(("Unexpected name: " + f0Var.getName()).toString());
                        }
                        hVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.h) this.f834h.invoke(z.a(f0Var.getName().b(), "last"));
                    }
                    aVarV.r(hVar);
                } else if (i10 == 3) {
                    aVarV.r(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    J j10 = J.f24997a;
                }
                InterfaceC2515z interfaceC2515zA = aVarV.a();
                AbstractC6492s.f(interfaceC2515zA);
                f0Var2 = (f0) interfaceC2515zA;
            } else if (!E.a(classDescriptor)) {
                aVarV.l();
                InterfaceC2515z interfaceC2515zA2 = aVarV.a();
                AbstractC6492s.f(interfaceC2515zA2);
                f0Var2 = (f0) interfaceC2515zA2;
            }
            if (f0Var2 != null) {
                arrayList.add(f0Var2);
            }
        }
        return arrayList;
    }

    @Override // Ch.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set e(InterfaceC2495e classDescriptor) {
        C3398z c3398zU0;
        Set setA;
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return d0.e();
        }
        C3387n c3387nZ = z(classDescriptor);
        return (c3387nZ == null || (c3398zU0 = c3387nZ.E0()) == null || (setA = c3398zU0.a()) == null) ? d0.e() : setA;
    }
}
