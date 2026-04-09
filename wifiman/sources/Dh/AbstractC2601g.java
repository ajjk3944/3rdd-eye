package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2506p;
import Bh.g0;
import Bh.k0;
import Dh.T;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.J0;
import pi.v0;

/* renamed from: Dh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2601g extends AbstractC2608n implements k0 {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3440j = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(AbstractC2601g.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: e, reason: collision with root package name */
    private final oi.n f3441e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2510u f3442f;

    /* renamed from: g, reason: collision with root package name */
    private final oi.i f3443g;

    /* renamed from: h, reason: collision with root package name */
    private List f3444h;

    /* renamed from: i, reason: collision with root package name */
    private final a f3445i;

    /* renamed from: Dh.g$a */
    public static final class a implements v0 {
        a() {
        }

        @Override // pi.v0
        public Collection a() {
            Collection collectionA = c().f0().N0().a();
            AbstractC6492s.h(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // pi.v0
        public v0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // pi.v0
        public boolean d() {
            return true;
        }

        @Override // pi.v0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public k0 c() {
            return AbstractC2601g.this;
        }

        @Override // pi.v0
        public List getParameters() {
            return AbstractC2601g.this.R0();
        }

        @Override // pi.v0
        public kotlin.reflect.jvm.internal.impl.builtins.i q() {
            return AbstractC5833e.m(c());
        }

        public String toString() {
            return "[typealias " + c().getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2601g(oi.n storageManager, InterfaceC2503m containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, g0 sourceElement, AbstractC2510u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(sourceElement, "sourceElement");
        AbstractC6492s.i(visibilityImpl, "visibilityImpl");
        this.f3441e = storageManager;
        this.f3442f = visibilityImpl;
        this.f3443g = storageManager.f(new C2598d(this));
        this.f3445i = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 N0(AbstractC2601g abstractC2601g, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        InterfaceC2498h interfaceC2498hF = gVar.f(abstractC2601g);
        if (interfaceC2498hF != null) {
            return interfaceC2498hF.u();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection O0(AbstractC2601g abstractC2601g) {
        return abstractC2601g.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean T0(Dh.AbstractC2601g r1, pi.M0 r2) {
        /*
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            boolean r0 = pi.W.a(r2)
            if (r0 != 0) goto L23
            pi.v0 r2 = r2.N0()
            Bh.h r2 = r2.c()
            boolean r0 = r2 instanceof Bh.l0
            if (r0 == 0) goto L23
            Bh.l0 r2 = (Bh.l0) r2
            Bh.m r2 = r2.b()
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.AbstractC2601g.T0(Dh.g, pi.M0):java.lang.Boolean");
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return J0.c(f0(), new C2599e(this));
    }

    protected final AbstractC7346d0 M0() {
        InterfaceC6164k interfaceC6164kE0;
        InterfaceC2495e interfaceC2495eT = t();
        if (interfaceC2495eT == null || (interfaceC6164kE0 = interfaceC2495eT.E0()) == null) {
            interfaceC6164kE0 = InterfaceC6164k.b.f49223b;
        }
        AbstractC7346d0 abstractC7346d0U = J0.u(this, interfaceC6164kE0, new C2600f(this));
        AbstractC6492s.h(abstractC7346d0U, "makeUnsubstitutedType(...)");
        return abstractC7346d0U;
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public k0 a() {
        InterfaceC2506p interfaceC2506pA = super.a();
        AbstractC6492s.g(interfaceC2506pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (k0) interfaceC2506pA;
    }

    public final Collection Q0() {
        InterfaceC2495e interfaceC2495eT = t();
        if (interfaceC2495eT == null) {
            return AbstractC3689v.l();
        }
        Collection<InterfaceC2494d> collectionM = interfaceC2495eT.m();
        AbstractC6492s.h(collectionM, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2494d interfaceC2494d : collectionM) {
            T.a aVar = T.f3407I;
            oi.n nVar = this.f3441e;
            AbstractC6492s.f(interfaceC2494d);
            Q qB = aVar.b(nVar, this, interfaceC2494d);
            if (qB != null) {
                arrayList.add(qB);
            }
        }
        return arrayList;
    }

    protected abstract List R0();

    public final void S0(List declaredTypeParameters) {
        AbstractC6492s.i(declaredTypeParameters, "declaredTypeParameters");
        this.f3444h = declaredTypeParameters;
    }

    protected final oi.n g0() {
        return this.f3441e;
    }

    @Override // Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        return this.f3442f;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return false;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        return this.f3445i;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o visitor, Object obj) {
        AbstractC6492s.i(visitor, "visitor");
        return visitor.g(this, obj);
    }

    @Override // Dh.AbstractC2607m
    public String toString() {
        return "typealias " + getName().b();
    }

    @Override // Bh.InterfaceC2499i
    public List w() {
        List list = this.f3444h;
        if (list != null) {
            return list;
        }
        AbstractC6492s.v("declaredTypeParametersImpl");
        return null;
    }
}
