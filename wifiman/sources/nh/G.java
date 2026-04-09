package Nh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Jh.InterfaceC3126u;
import Nh.InterfaceC3376c;
import Sh.v;
import Th.a;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.C6157d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import xi.AbstractC8536c;
import xi.AbstractC8543j;

/* loaded from: classes4.dex */
public final class G extends b0 {

    /* renamed from: n, reason: collision with root package name */
    private final Qh.u f16442n;

    /* renamed from: o, reason: collision with root package name */
    private final D f16443o;

    /* renamed from: p, reason: collision with root package name */
    private final oi.j f16444p;

    /* renamed from: q, reason: collision with root package name */
    private final oi.h f16445q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Zh.f f16446a;

        /* renamed from: b, reason: collision with root package name */
        private final Qh.g f16447b;

        public a(Zh.f name, Qh.g gVar) {
            AbstractC6492s.i(name, "name");
            this.f16446a = name;
            this.f16447b = gVar;
        }

        public final Qh.g a() {
            return this.f16447b;
        }

        public final Zh.f b() {
            return this.f16446a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(this.f16446a, ((a) obj).f16446a);
        }

        public int hashCode() {
            return this.f16446a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC2495e f16448a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2495e descriptor) {
                super(null);
                AbstractC6492s.i(descriptor, "descriptor");
                this.f16448a = descriptor;
            }

            public final InterfaceC2495e a() {
                return this.f16448a;
            }
        }

        /* renamed from: Nh.G$b$b, reason: collision with other inner class name */
        public static final class C0595b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0595b f16449a = new C0595b();

            private C0595b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f16450a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Mh.k c10, Qh.u jPackage, D ownerDescriptor) {
        super(c10);
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(jPackage, "jPackage");
        AbstractC6492s.i(ownerDescriptor, "ownerDescriptor");
        this.f16442n = jPackage;
        this.f16443o = ownerDescriptor;
        this.f16444p = c10.e().b(new E(c10, this));
        this.f16445q = c10.e().i(new F(this, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e i0(G g10, Mh.k kVar, a request) {
        AbstractC6492s.i(request, "request");
        Zh.b bVar = new Zh.b(g10.R().e(), request.b());
        v.a aVarB = request.a() != null ? kVar.a().j().b(request.a(), g10.m0()) : kVar.a().j().a(bVar, g10.m0());
        Sh.x xVarA = aVarB != null ? aVarB.a() : null;
        Zh.b bVarB = xVarA != null ? xVarA.b() : null;
        if (bVarB != null && (bVarB.j() || bVarB.i())) {
            return null;
        }
        b bVarP0 = g10.p0(xVarA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0595b)) {
            throw new NoWhenBranchMatchedException();
        }
        Qh.g gVarA = request.a();
        if (gVarA == null) {
            gVarA = kVar.a().d().c(new InterfaceC3126u.a(bVar, null, null, 4, null));
        }
        Qh.g gVar = gVarA;
        if ((gVar != null ? gVar.I() : null) != Qh.D.BINARY) {
            Zh.c cVarE = gVar != null ? gVar.e() : null;
            if (cVarE == null || cVarE.d() || !AbstractC6492s.d(cVarE.e(), g10.R().e())) {
                return null;
            }
            C3387n c3387n = new C3387n(kVar, g10.R(), gVar, null, 8, null);
            kVar.a().e().a(c3387n);
            return c3387n;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + Sh.w.a(kVar.a().j(), gVar, g10.m0()) + "\nfindKotlinClass(ClassId) = " + Sh.w.b(kVar.a().j(), bVar, g10.m0()) + '\n');
    }

    private final InterfaceC2495e j0(Zh.f fVar, Qh.g gVar) {
        if (!Zh.h.f25421a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f16444p.invoke();
        if (gVar != null || set == null || set.contains(fVar.b())) {
            return (InterfaceC2495e) this.f16445q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    private final Yh.e m0() {
        return AbstractC8536c.a(L().a().b().f().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(Mh.k kVar, G g10) {
        return kVar.a().d().b(g10.R().e());
    }

    private final b p0(Sh.x xVar) {
        if (xVar == null) {
            return b.C0595b.f16449a;
        }
        if (xVar.a().c() != a.EnumC0806a.CLASS) {
            return b.c.f16450a;
        }
        InterfaceC2495e interfaceC2495eN = L().a().b().n(xVar);
        return interfaceC2495eN != null ? new b.a(interfaceC2495eN) : b.C0595b.f16449a;
    }

    @Override // Nh.U
    protected void B(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
    }

    @Override // Nh.U
    protected Set D(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        return d0.e();
    }

    @Override // Nh.U, ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return AbstractC3689v.l();
    }

    @Override // Nh.U, ii.AbstractC6165l, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        C6157d.a aVar = C6157d.f49182c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return AbstractC3689v.l();
        }
        Iterable iterable = (Iterable) K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC2503m interfaceC2503m = (InterfaceC2503m) obj;
            if (interfaceC2503m instanceof InterfaceC2495e) {
                Zh.f name = ((InterfaceC2495e) interfaceC2503m).getName();
                AbstractC6492s.h(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InterfaceC2495e k0(Qh.g javaClass) {
        AbstractC6492s.i(javaClass, "javaClass");
        return j0(javaClass.getName(), javaClass);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2495e g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return j0(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public D R() {
        return this.f16443o;
    }

    @Override // Nh.U
    protected Set v(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        if (!kindFilter.a(C6157d.f49182c.e())) {
            return d0.e();
        }
        Set set = (Set) this.f16444p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Zh.f.h((String) it.next()));
            }
            return hashSet;
        }
        Qh.u uVar = this.f16442n;
        if (interfaceC6835l == null) {
            interfaceC6835l = AbstractC8543j.k();
        }
        Collection<Qh.g> collectionQ = uVar.q(interfaceC6835l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Qh.g gVar : collectionQ) {
            Zh.f name = gVar.I() == Qh.D.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Nh.U
    protected Set x(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        return d0.e();
    }

    @Override // Nh.U
    protected InterfaceC3376c z() {
        return InterfaceC3376c.a.f16504a;
    }
}
