package wh;

import Gh.AbstractC2914f;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import li.C6608K;
import mh.InterfaceC6839p;
import wh.AbstractC8355d0;
import wh.a1;

/* renamed from: wh.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8390v0 extends AbstractC8355d0 {

    /* renamed from: d, reason: collision with root package name */
    private final Class f65213d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f65214e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wh.v0$a */
    final class a extends AbstractC8355d0.b {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ th.l[] f65215j = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name */
        private final a1.a f65216d;

        /* renamed from: e, reason: collision with root package name */
        private final a1.a f65217e;

        /* renamed from: f, reason: collision with root package name */
        private final Yg.m f65218f;

        /* renamed from: g, reason: collision with root package name */
        private final Yg.m f65219g;

        /* renamed from: h, reason: collision with root package name */
        private final a1.a f65220h;

        public a() {
            super();
            this.f65216d = a1.c(new C8381q0(C8390v0.this));
            this.f65217e = a1.c(new C8382r0(this));
            Yg.q qVar = Yg.q.PUBLICATION;
            this.f65218f = Yg.n.a(qVar, new C8384s0(this, C8390v0.this));
            this.f65219g = Yg.n.a(qVar, new C8386t0(this));
            this.f65220h = a1.c(new C8388u0(C8390v0.this, this));
        }

        private final Fh.f i() {
            return (Fh.f) this.f65216d.b(this, f65215j[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fh.f m(C8390v0 c8390v0) {
            return Fh.f.f6672c.a(c8390v0.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection n(C8390v0 c8390v0, a aVar) {
            return c8390v0.K(aVar.l(), AbstractC8355d0.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.y o(a aVar) {
            Th.a aVarA;
            Fh.f fVarI = aVar.i();
            if (fVarI == null || (aVarA = fVarI.a()) == null) {
                return null;
            }
            String[] strArrA = aVarA.a();
            String[] strArrG = aVarA.g();
            if (strArrA == null || strArrG == null) {
                return null;
            }
            Yg.s sVarM = Yh.i.m(strArrA, strArrG);
            return new Yg.y((Yh.f) sVarM.a(), (Uh.l) sVarM.c(), aVarA.d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Class p(a aVar, C8390v0 c8390v0) {
            Th.a aVarA;
            Fh.f fVarI = aVar.i();
            String strE = (fVarI == null || (aVarA = fVarI.a()) == null) ? null : aVarA.e();
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return c8390v0.b().getClassLoader().loadClass(kotlin.text.t.K(strE, '/', '.', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC6164k q(a aVar) {
            Fh.f fVarI = aVar.i();
            return fVarI != null ? aVar.b().c().a(fVarI) : InterfaceC6164k.b.f49223b;
        }

        public final Yg.y j() {
            return (Yg.y) this.f65219g.getValue();
        }

        public final Class k() {
            return (Class) this.f65218f.getValue();
        }

        public final InterfaceC6164k l() {
            Object objB = this.f65217e.b(this, f65215j[1]);
            AbstractC6492s.h(objB, "getValue(...)");
            return (InterfaceC6164k) objB;
        }
    }

    /* renamed from: wh.v0$b */
    /* synthetic */ class b extends AbstractC6489o implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65222a = new b();

        b() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bh.Y invoke(C6608K p02, Uh.n p12) {
            AbstractC6492s.i(p02, "p0");
            AbstractC6492s.i(p12, "p1");
            return p02.u(p12);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(C6608K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public C8390v0(Class jClass) {
        AbstractC6492s.i(jClass, "jClass");
        this.f65213d = jClass;
        this.f65214e = Yg.n.a(Yg.q.PUBLICATION, new C8379p0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a V(C8390v0 c8390v0) {
        return c8390v0.new a();
    }

    private final InterfaceC6164k W() {
        return ((a) this.f65214e.getValue()).l();
    }

    @Override // wh.AbstractC8355d0
    public Collection G() {
        return AbstractC3689v.l();
    }

    @Override // wh.AbstractC8355d0
    public Collection H(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return W().b(name, Ih.d.FROM_REFLECTION);
    }

    @Override // wh.AbstractC8355d0
    public Bh.Y I(int i10) {
        Yg.y yVarJ = ((a) this.f65214e.getValue()).j();
        if (yVarJ == null) {
            return null;
        }
        Yh.f fVar = (Yh.f) yVarJ.a();
        Uh.l lVar = (Uh.l) yVarJ.c();
        Yh.e eVar = (Yh.e) yVarJ.d();
        h.f packageLocalVariable = Xh.a.f24355n;
        AbstractC6492s.h(packageLocalVariable, "packageLocalVariable");
        Uh.n nVar = (Uh.n) Wh.e.b(lVar, packageLocalVariable, i10);
        if (nVar == null) {
            return null;
        }
        Class clsB = b();
        Uh.t tVarF1 = lVar.f1();
        AbstractC6492s.h(tVarF1, "getTypeTable(...)");
        return (Bh.Y) j1.h(clsB, nVar, fVar, new Wh.g(tVarF1), eVar, b.f65222a);
    }

    @Override // wh.AbstractC8355d0
    protected Class L() {
        Class clsK = ((a) this.f65214e.getValue()).k();
        return clsK == null ? b() : clsK;
    }

    @Override // wh.AbstractC8355d0
    public Collection M(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return W().d(name, Ih.d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.InterfaceC6482h
    public Class b() {
        return this.f65213d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8390v0) && AbstractC6492s.d(b(), ((C8390v0) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "file class " + AbstractC2914f.e(b()).a();
    }
}
