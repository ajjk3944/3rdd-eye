package Nh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.L;
import Bh.e0;
import Bh.j0;
import Bh.l0;
import Bh.p0;
import Bh.q0;
import Bh.w0;
import Dh.AbstractC2604j;
import Zg.AbstractC3689v;
import Zg.d0;
import ch.AbstractC4260a;
import fi.AbstractC5833e;
import ii.C6160g;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC6645w;
import pi.AbstractC7341b;
import pi.D0;
import pi.I0;
import pi.N0;
import pi.r0;
import pi.v0;
import sh.C7974i;
import xi.AbstractC8534a;
import zi.InterfaceC8780j;

/* renamed from: Nh.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3387n extends AbstractC2604j implements Lh.c {

    /* renamed from: y, reason: collision with root package name */
    public static final a f16528y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    private static final Set f16529z = d0.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i, reason: collision with root package name */
    private final Mh.k f16530i;

    /* renamed from: j, reason: collision with root package name */
    private final Qh.g f16531j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC2495e f16532k;

    /* renamed from: l, reason: collision with root package name */
    private final Mh.k f16533l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f16534m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC2496f f16535n;

    /* renamed from: o, reason: collision with root package name */
    private final Bh.D f16536o;

    /* renamed from: p, reason: collision with root package name */
    private final w0 f16537p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f16538q;

    /* renamed from: r, reason: collision with root package name */
    private final b f16539r;

    /* renamed from: s, reason: collision with root package name */
    private final C3398z f16540s;

    /* renamed from: t, reason: collision with root package name */
    private final e0 f16541t;

    /* renamed from: u, reason: collision with root package name */
    private final C6160g f16542u;

    /* renamed from: v, reason: collision with root package name */
    private final a0 f16543v;

    /* renamed from: w, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f16544w;

    /* renamed from: x, reason: collision with root package name */
    private final oi.i f16545x;

    /* renamed from: Nh.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Nh.n$b */
    final class b extends AbstractC7341b {

        /* renamed from: d, reason: collision with root package name */
        private final oi.i f16546d;

        public b() {
            super(C3387n.this.f16533l.e());
            this.f16546d = C3387n.this.f16533l.e().f(new C3388o(C3387n.this));
        }

        private final pi.S K() {
            Zh.c cVarB;
            ArrayList arrayList;
            Zh.c cVarL = L();
            if (cVarL == null || cVarL.d() || !cVarL.i(kotlin.reflect.jvm.internal.impl.builtins.o.f51802z)) {
                cVarL = null;
            }
            if (cVarL == null) {
                cVarB = Jh.r.f10200a.b(AbstractC5833e.o(C3387n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarL;
            }
            InterfaceC2495e interfaceC2495eB = AbstractC5833e.B(C3387n.this.f16533l.d(), cVarB, Ih.d.FROM_JAVA_LOADER);
            if (interfaceC2495eB == null) {
                return null;
            }
            int size = interfaceC2495eB.k().getParameters().size();
            List parameters = C3387n.this.k().getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List list = parameters;
                arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new D0(N0.INVARIANT, ((l0) it.next()).u()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarL != null) {
                    return null;
                }
                D0 d02 = new D0(N0.INVARIANT, ((l0) AbstractC3689v.R0(parameters)).u());
                C7974i c7974i = new C7974i(1, size);
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(c7974i, 10));
                Iterator it2 = c7974i.iterator();
                while (it2.hasNext()) {
                    ((Zg.Q) it2).d();
                    arrayList2.add(d02);
                }
                arrayList = arrayList2;
            }
            return pi.V.h(r0.f58162b.j(), interfaceC2495eB, arrayList);
        }

        private final Zh.c L() {
            String str;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = C3387n.this.getAnnotations();
            Zh.c PURELY_IMPLEMENTS_ANNOTATION = Jh.I.f10119r;
            AbstractC6492s.h(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarL = annotations.l(PURELY_IMPLEMENTS_ANNOTATION);
            if (cVarL == null) {
                return null;
            }
            Object objS0 = AbstractC3689v.S0(cVarL.a().values());
            di.x xVar = objS0 instanceof di.x ? (di.x) objS0 : null;
            if (xVar == null || (str = (String) xVar.b()) == null || !Zh.e.e(str)) {
                return null;
            }
            return new Zh.c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(C3387n c3387n) {
            return p0.g(c3387n);
        }

        @Override // pi.AbstractC7374v, pi.v0
        /* renamed from: I */
        public InterfaceC2495e c() {
            return C3387n.this;
        }

        @Override // pi.v0
        public boolean d() {
            return true;
        }

        @Override // pi.v0
        public List getParameters() {
            return (List) this.f16546d.invoke();
        }

        @Override // pi.AbstractC7369p
        protected Collection r() {
            Collection collectionA = C3387n.this.S0().a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            ArrayList<Qh.x> arrayList2 = new ArrayList(0);
            pi.S sK = K();
            Iterator it = collectionA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Qh.j jVar = (Qh.j) it.next();
                pi.S sQ = C3387n.this.f16533l.a().r().q(C3387n.this.f16533l.g().p(jVar, Oh.b.b(I0.SUPERTYPE, false, false, null, 7, null)), C3387n.this.f16533l);
                if (sQ.N0().c() instanceof L.b) {
                    arrayList2.add(jVar);
                }
                if (!AbstractC6492s.d(sQ.N0(), sK != null ? sK.N0() : null) && !kotlin.reflect.jvm.internal.impl.builtins.i.b0(sQ)) {
                    arrayList.add(sQ);
                }
            }
            InterfaceC2495e interfaceC2495e = C3387n.this.f16532k;
            AbstractC8534a.a(arrayList, interfaceC2495e != null ? Ah.y.a(interfaceC2495e, C3387n.this).c().p(interfaceC2495e.u(), N0.INVARIANT) : null);
            AbstractC8534a.a(arrayList, sK);
            if (!arrayList2.isEmpty()) {
                InterfaceC6645w interfaceC6645wC = C3387n.this.f16533l.a().c();
                InterfaceC2495e interfaceC2495eC = c();
                ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
                for (Qh.x xVar : arrayList2) {
                    AbstractC6492s.g(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((Qh.j) xVar).s());
                }
                interfaceC6645wC.b(interfaceC2495eC, arrayList3);
            }
            return !arrayList.isEmpty() ? AbstractC3689v.i1(arrayList) : AbstractC3689v.e(C3387n.this.f16533l.d().q().i());
        }

        public String toString() {
            String strB = C3387n.this.getName().b();
            AbstractC6492s.h(strB, "asString(...)");
            return strB;
        }

        @Override // pi.AbstractC7369p
        protected j0 v() {
            return C3387n.this.f16533l.a().v();
        }
    }

    /* renamed from: Nh.n$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(AbstractC5833e.o((InterfaceC2495e) obj).b(), AbstractC5833e.o((InterfaceC2495e) obj2).b());
        }
    }

    public /* synthetic */ C3387n(Mh.k kVar, InterfaceC2503m interfaceC2503m, Qh.g gVar, InterfaceC2495e interfaceC2495e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC2503m, gVar, (i10 & 8) != 0 ? null : interfaceC2495e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q0(C3387n c3387n) {
        List<Qh.y> typeParameters = c3387n.f16531j.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(typeParameters, 10));
        for (Qh.y yVar : typeParameters) {
            l0 l0VarA = c3387n.f16533l.f().a(yVar);
            if (l0VarA == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + c3387n.f16531j + ", so it must be resolved");
            }
            arrayList.add(l0VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W0(C3387n c3387n) {
        Zh.b bVarN = AbstractC5833e.n(c3387n);
        if (bVarN != null) {
            return c3387n.f16530i.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3398z X0(C3387n c3387n, kotlin.reflect.jvm.internal.impl.types.checker.g it) {
        AbstractC6492s.i(it, "it");
        return new C3398z(c3387n.f16533l, c3387n, c3387n.f16531j, c3387n.f16532k != null, c3387n.f16540s);
    }

    @Override // Bh.InterfaceC2495e
    public boolean D() {
        return false;
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public boolean I0() {
        return false;
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return this.f16538q;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return null;
    }

    public final C3387n P0(Kh.j javaResolverCache, InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(javaResolverCache, "javaResolverCache");
        Mh.k kVar = this.f16533l;
        Mh.k kVarM = Mh.c.m(kVar, kVar.a().x(javaResolverCache));
        InterfaceC2503m interfaceC2503mB = b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        return new C3387n(kVarM, interfaceC2503mB, this.f16531j, interfaceC2495e);
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k Q() {
        return this.f16543v;
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public List m() {
        return (List) this.f16540s.a1().invoke();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2495e S() {
        return null;
    }

    public final Qh.g S0() {
        return this.f16531j;
    }

    public final List T0() {
        return (List) this.f16534m.getValue();
    }

    @Override // Dh.AbstractC2595a, Bh.InterfaceC2495e
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C3398z E0() {
        InterfaceC6164k interfaceC6164kE0 = super.E0();
        AbstractC6492s.g(interfaceC6164kE0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C3398z) interfaceC6164kE0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.z
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C3398z i0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (C3398z) this.f16541t.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return this.f16544w;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        if (!AbstractC6492s.d(this.f16537p, AbstractC2509t.f1792a) || this.f16531j.f() != null) {
            return Jh.V.d(this.f16537p);
        }
        AbstractC2510u abstractC2510u = Jh.y.f10215a;
        AbstractC6492s.f(abstractC2510u);
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        return this.f16535n;
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return false;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        return this.f16539r;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        return this.f16536o;
    }

    @Override // Bh.InterfaceC2495e
    public Collection n() {
        if (this.f16536o != Bh.D.SEALED) {
            return AbstractC3689v.l();
        }
        Oh.a aVarB = Oh.b.b(I0.COMMON, false, false, null, 7, null);
        InterfaceC8780j interfaceC8780jN = this.f16531j.N();
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC8780jN.iterator();
        while (it.hasNext()) {
            InterfaceC2498h interfaceC2498hC = this.f16533l.g().p((Qh.j) it.next(), aVarB).N0().c();
            InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            if (interfaceC2495e != null) {
                arrayList.add(interfaceC2495e);
            }
        }
        return AbstractC3689v.X0(arrayList, new c());
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + AbstractC5833e.p(this);
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        return (List) this.f16545x.invoke();
    }

    @Override // Dh.AbstractC2595a, Bh.InterfaceC2495e
    public InterfaceC6164k y0() {
        return this.f16542u;
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3387n(Mh.k outerContext, InterfaceC2503m containingDeclaration, Qh.g jClass, InterfaceC2495e interfaceC2495e) {
        Bh.D dA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        AbstractC6492s.i(outerContext, "outerContext");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(jClass, "jClass");
        this.f16530i = outerContext;
        this.f16531j = jClass;
        this.f16532k = interfaceC2495e;
        Mh.k kVarF = Mh.c.f(outerContext, this, jClass, 0, 4, null);
        this.f16533l = kVarF;
        kVarF.a().h().b(jClass, this);
        jClass.I();
        this.f16534m = Yg.n.b(new C3384k(this));
        this.f16535n = jClass.n() ? EnumC2496f.ANNOTATION_CLASS : jClass.H() ? EnumC2496f.INTERFACE : jClass.A() ? EnumC2496f.ENUM_CLASS : EnumC2496f.CLASS;
        if (jClass.n() || jClass.A()) {
            dA = Bh.D.FINAL;
        } else {
            dA = Bh.D.Companion.a(jClass.E(), jClass.E() || jClass.isAbstract() || jClass.H(), !jClass.isFinal());
        }
        this.f16536o = dA;
        this.f16537p = jClass.getVisibility();
        this.f16538q = (jClass.f() == null || jClass.Q()) ? false : true;
        this.f16539r = new b();
        C3398z c3398z = new C3398z(kVarF, this, jClass, interfaceC2495e != null, null, 16, null);
        this.f16540s = c3398z;
        this.f16541t = e0.f1778e.a(this, kVarF.e(), kVarF.a().k().d(), new C3385l(this));
        this.f16542u = new C6160g(c3398z);
        this.f16543v = new a0(kVarF, jClass, this);
        this.f16544w = Mh.h.a(kVarF, jClass);
        this.f16545x = kVarF.e().f(new C3386m(this));
    }
}
