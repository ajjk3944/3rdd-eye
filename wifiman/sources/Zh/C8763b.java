package zh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.AbstractC2514y;
import Bh.D;
import Bh.EnumC2496f;
import Bh.G;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.M;
import Bh.g0;
import Bh.j0;
import Bh.l0;
import Bh.q0;
import Dh.AbstractC2595a;
import Dh.U;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.Q;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import oi.n;
import pi.AbstractC7341b;
import pi.D0;
import pi.N0;
import pi.V;
import pi.r0;
import pi.v0;
import sh.C7974i;
import yi.AbstractC8674a;
import zh.AbstractC8767f;

/* renamed from: zh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8763b extends AbstractC2595a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f67293n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final Zh.b f67294o;

    /* renamed from: p, reason: collision with root package name */
    private static final Zh.b f67295p;

    /* renamed from: f, reason: collision with root package name */
    private final n f67296f;

    /* renamed from: g, reason: collision with root package name */
    private final M f67297g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC8767f f67298h;

    /* renamed from: i, reason: collision with root package name */
    private final int f67299i;

    /* renamed from: j, reason: collision with root package name */
    private final C2393b f67300j;

    /* renamed from: k, reason: collision with root package name */
    private final C8765d f67301k;

    /* renamed from: l, reason: collision with root package name */
    private final List f67302l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC8764c f67303m;

    /* renamed from: zh.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: zh.b$b, reason: collision with other inner class name */
    private final class C2393b extends AbstractC7341b {
        public C2393b() {
            super(C8763b.this.f67296f);
        }

        @Override // pi.AbstractC7374v, pi.v0
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public C8763b c() {
            return C8763b.this;
        }

        @Override // pi.v0
        public boolean d() {
            return true;
        }

        @Override // pi.v0
        public List getParameters() {
            return C8763b.this.f67302l;
        }

        @Override // pi.AbstractC7369p
        protected Collection r() {
            List listO;
            AbstractC8767f abstractC8767fU0 = C8763b.this.U0();
            AbstractC8767f.a aVar = AbstractC8767f.a.f67310e;
            if (AbstractC6492s.d(abstractC8767fU0, aVar)) {
                listO = AbstractC3689v.e(C8763b.f67294o);
            } else if (AbstractC6492s.d(abstractC8767fU0, AbstractC8767f.b.f67311e)) {
                listO = AbstractC3689v.o(C8763b.f67295p, new Zh.b(o.f51769A, aVar.c(C8763b.this.Q0())));
            } else {
                AbstractC8767f.d dVar = AbstractC8767f.d.f67313e;
                if (AbstractC6492s.d(abstractC8767fU0, dVar)) {
                    listO = AbstractC3689v.e(C8763b.f67294o);
                } else {
                    if (!AbstractC6492s.d(abstractC8767fU0, AbstractC8767f.c.f67312e)) {
                        AbstractC8674a.b(null, 1, null);
                        throw null;
                    }
                    listO = AbstractC3689v.o(C8763b.f67295p, new Zh.b(o.f51795s, dVar.c(C8763b.this.Q0())));
                }
            }
            G gB = C8763b.this.f67297g.b();
            List<Zh.b> list = listO;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (Zh.b bVar : list) {
                InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(gB, bVar);
                if (interfaceC2495eB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listB1 = AbstractC3689v.b1(getParameters(), interfaceC2495eB.k().getParameters().size());
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listB1, 10));
                Iterator it = listB1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new D0(((l0) it.next()).u()));
                }
                arrayList.add(V.h(r0.f58162b.j(), interfaceC2495eB, arrayList2));
            }
            return AbstractC3689v.i1(arrayList);
        }

        public String toString() {
            return c().toString();
        }

        @Override // pi.AbstractC7369p
        protected j0 v() {
            return j0.a.f1787a;
        }
    }

    static {
        Zh.c cVar = o.f51769A;
        Zh.f fVarH = Zh.f.h("Function");
        AbstractC6492s.h(fVarH, "identifier(...)");
        f67294o = new Zh.b(cVar, fVarH);
        Zh.c cVar2 = o.f51800x;
        Zh.f fVarH2 = Zh.f.h("KFunction");
        AbstractC6492s.h(fVarH2, "identifier(...)");
        f67295p = new Zh.b(cVar2, fVarH2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8763b(n storageManager, M containingDeclaration, AbstractC8767f functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(functionTypeKind, "functionTypeKind");
        this.f67296f = storageManager;
        this.f67297g = containingDeclaration;
        this.f67298h = functionTypeKind;
        this.f67299i = i10;
        this.f67300j = new C2393b();
        this.f67301k = new C8765d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        C7974i c7974i = new C7974i(1, i10);
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(c7974i, 10));
        Iterator it = c7974i.iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            N0 n02 = N0.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iD);
            K0(arrayList, this, n02, sb2.toString());
            arrayList2.add(J.f24997a);
        }
        K0(arrayList, this, N0.OUT_VARIANCE, "R");
        this.f67302l = AbstractC3689v.i1(arrayList);
        this.f67303m = EnumC8764c.Companion.a(this.f67298h);
    }

    private static final void K0(ArrayList arrayList, C8763b c8763b, N0 n02, String str) {
        arrayList.add(U.R0(c8763b, h.f51914c1.b(), false, n02, Zh.f.h(str), arrayList.size(), c8763b.f67296f));
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
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public /* bridge */ /* synthetic */ InterfaceC2494d P() {
        return (InterfaceC2494d) Y0();
    }

    public final int Q0() {
        return this.f67299i;
    }

    public Void R0() {
        return null;
    }

    @Override // Bh.InterfaceC2495e
    public /* bridge */ /* synthetic */ InterfaceC2495e S() {
        return (InterfaceC2495e) R0();
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List m() {
        return AbstractC3689v.l();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2504n, Bh.InterfaceC2503m
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public M b() {
        return this.f67297g;
    }

    public final AbstractC8767f U0() {
        return this.f67298h;
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public List n() {
        return AbstractC3689v.l();
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6164k.b Q() {
        return InterfaceC6164k.b.f49223b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.z
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C8765d i0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f67301k;
    }

    public Void Y0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public h getAnnotations() {
        return h.f51914c1.b();
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u PUBLIC = AbstractC2509t.f1796e;
        AbstractC6492s.h(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        return EnumC2496f.INTERFACE;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return false;
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        return this.f67300j;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public D l() {
        return D.ABSTRACT;
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return false;
    }

    public String toString() {
        String strB = getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        return strB;
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        return this.f67302l;
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        return null;
    }
}
