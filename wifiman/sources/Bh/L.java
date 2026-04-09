package Bh;

import Dh.AbstractC2604j;
import Dh.C2610p;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.C7373u;
import pi.N0;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes4.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final oi.n f1757a;

    /* renamed from: b, reason: collision with root package name */
    private final G f1758b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.g f1759c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.g f1760d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Zh.b f1761a;

        /* renamed from: b, reason: collision with root package name */
        private final List f1762b;

        public a(Zh.b classId, List typeParametersCount) {
            AbstractC6492s.i(classId, "classId");
            AbstractC6492s.i(typeParametersCount, "typeParametersCount");
            this.f1761a = classId;
            this.f1762b = typeParametersCount;
        }

        public final Zh.b a() {
            return this.f1761a;
        }

        public final List b() {
            return this.f1762b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f1761a, aVar.f1761a) && AbstractC6492s.d(this.f1762b, aVar.f1762b);
        }

        public int hashCode() {
            return (this.f1761a.hashCode() * 31) + this.f1762b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f1761a + ", typeParametersCount=" + this.f1762b + ')';
        }
    }

    public static final class b extends AbstractC2604j {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f1763i;

        /* renamed from: j, reason: collision with root package name */
        private final List f1764j;

        /* renamed from: k, reason: collision with root package name */
        private final C7373u f1765k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oi.n storageManager, InterfaceC2503m container, Zh.f name, boolean z10, int i10) {
            super(storageManager, container, name, g0.f1784a, false);
            AbstractC6492s.i(storageManager, "storageManager");
            AbstractC6492s.i(container, "container");
            AbstractC6492s.i(name, "name");
            this.f1763i = z10;
            C7974i c7974iS = AbstractC7978m.s(0, i10);
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
            Iterator it = c7974iS.iterator();
            while (it.hasNext()) {
                int iD = ((Zg.Q) it).d();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
                N0 n02 = N0.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iD);
                arrayList.add(Dh.U.R0(this, hVarB, false, n02, Zh.f.h(sb2.toString()), iD, storageManager));
            }
            this.f1764j = arrayList;
            this.f1765k = new C7373u(this, p0.g(this), Zg.d0.c(AbstractC5833e.s(this).q().i()), storageManager);
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

        @Override // Bh.InterfaceC2495e
        /* renamed from: K0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6164k.b Q() {
            return InterfaceC6164k.b.f49223b;
        }

        @Override // Bh.C
        public boolean L() {
            return false;
        }

        @Override // Bh.InterfaceC2498h
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public C7373u k() {
            return this.f1765k;
        }

        @Override // Bh.InterfaceC2499i
        public boolean M() {
            return this.f1763i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Dh.z
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6164k.b i0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            return InterfaceC6164k.b.f49223b;
        }

        @Override // Bh.InterfaceC2495e
        public InterfaceC2494d P() {
            return null;
        }

        @Override // Bh.InterfaceC2495e
        public InterfaceC2495e S() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        }

        @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
        public AbstractC2510u getVisibility() {
            AbstractC2510u PUBLIC = AbstractC2509t.f1796e;
            AbstractC6492s.h(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // Bh.InterfaceC2495e
        public EnumC2496f h() {
            return EnumC2496f.CLASS;
        }

        @Override // Dh.AbstractC2604j, Bh.C
        public boolean isExternal() {
            return false;
        }

        @Override // Bh.InterfaceC2495e
        public boolean isInline() {
            return false;
        }

        @Override // Bh.InterfaceC2495e, Bh.C
        public D l() {
            return D.FINAL;
        }

        @Override // Bh.InterfaceC2495e
        public Collection m() {
            return Zg.d0.e();
        }

        @Override // Bh.InterfaceC2495e
        public Collection n() {
            return AbstractC3689v.l();
        }

        @Override // Bh.InterfaceC2495e
        public boolean o() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
        public List w() {
            return this.f1764j;
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

    public L(oi.n storageManager, G module) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(module, "module");
        this.f1757a = storageManager;
        this.f1758b = module;
        this.f1759c = storageManager.e(new J(this));
        this.f1760d = storageManager.e(new K(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e c(L l10, a aVar) {
        InterfaceC2503m interfaceC2503mD;
        AbstractC6492s.i(aVar, "<destruct>");
        Zh.b bVarA = aVar.a();
        List listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        Zh.b bVarE = bVarA.e();
        if (bVarE == null || (interfaceC2503mD = l10.d(bVarE, AbstractC3689v.h0(listB, 1))) == null) {
            interfaceC2503mD = (InterfaceC2497g) l10.f1759c.invoke(bVarA.f());
        }
        InterfaceC2503m interfaceC2503m = interfaceC2503mD;
        boolean zJ = bVarA.j();
        oi.n nVar = l10.f1757a;
        Zh.f fVarH = bVarA.h();
        Integer num = (Integer) AbstractC3689v.s0(listB);
        return new b(nVar, interfaceC2503m, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M e(L l10, Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return new C2610p(l10.f1758b, fqName);
    }

    public final InterfaceC2495e d(Zh.b classId, List typeParametersCount) {
        AbstractC6492s.i(classId, "classId");
        AbstractC6492s.i(typeParametersCount, "typeParametersCount");
        return (InterfaceC2495e) this.f1760d.invoke(new a(classId, typeParametersCount));
    }
}
