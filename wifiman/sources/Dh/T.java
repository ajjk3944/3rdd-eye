package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.g0;
import Bh.k0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC6345f;
import ji.InterfaceC6346g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.AbstractC7354h0;
import pi.G0;
import pi.N0;

/* loaded from: classes4.dex */
public final class T extends AbstractC2612s implements Q {

    /* renamed from: E, reason: collision with root package name */
    private final oi.n f3409E;

    /* renamed from: F, reason: collision with root package name */
    private final k0 f3410F;

    /* renamed from: G, reason: collision with root package name */
    private final oi.j f3411G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC2494d f3412H;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3408J = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(T.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: I, reason: collision with root package name */
    public static final a f3407I = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final G0 c(k0 k0Var) {
            if (k0Var.t() == null) {
                return null;
            }
            return G0.f(k0Var.U());
        }

        public final Q b(oi.n storageManager, k0 typeAliasDescriptor, InterfaceC2494d constructor) {
            InterfaceC2494d interfaceC2494dC;
            List listL;
            AbstractC6492s.i(storageManager, "storageManager");
            AbstractC6492s.i(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC6492s.i(constructor, "constructor");
            G0 g0C = c(typeAliasDescriptor);
            if (g0C == null || (interfaceC2494dC = constructor.c(g0C)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = constructor.getAnnotations();
            InterfaceC2492b.a aVarH = constructor.h();
            AbstractC6492s.h(aVarH, "getKind(...)");
            g0 g0VarJ = typeAliasDescriptor.j();
            AbstractC6492s.h(g0VarJ, "getSource(...)");
            T t10 = new T(storageManager, typeAliasDescriptor, interfaceC2494dC, null, annotations, aVarH, g0VarJ, null);
            List listO0 = AbstractC2612s.O0(t10, constructor.i(), g0C);
            if (listO0 == null) {
                return null;
            }
            AbstractC7346d0 abstractC7346d0C = pi.L.c(interfaceC2494dC.getReturnType().Q0());
            AbstractC7346d0 abstractC7346d0U = typeAliasDescriptor.u();
            AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
            AbstractC7346d0 abstractC7346d0J = AbstractC7354h0.j(abstractC7346d0C, abstractC7346d0U);
            b0 b0VarD0 = constructor.d0();
            b0 b0VarI = b0VarD0 != null ? bi.h.i(t10, g0C.n(b0VarD0.getType(), N0.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b()) : null;
            InterfaceC2495e interfaceC2495eT = typeAliasDescriptor.t();
            if (interfaceC2495eT != null) {
                List listP0 = constructor.p0();
                AbstractC6492s.h(listP0, "getContextReceiverParameters(...)");
                List list = listP0;
                listL = new ArrayList(AbstractC3689v.w(list, 10));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC3689v.v();
                    }
                    b0 b0Var = (b0) obj;
                    pi.S sN = g0C.n(b0Var.getType(), N0.INVARIANT);
                    InterfaceC6346g value = b0Var.getValue();
                    AbstractC6492s.g(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listL.add(bi.h.c(interfaceC2495eT, sN, ((InterfaceC6345f) value).a(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), i10));
                    i10 = i11;
                }
            } else {
                listL = AbstractC3689v.l();
            }
            t10.R0(b0VarI, null, listL, typeAliasDescriptor.w(), listO0, abstractC7346d0J, Bh.D.FINAL, typeAliasDescriptor.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ T(oi.n nVar, k0 k0Var, InterfaceC2494d interfaceC2494d, Q q10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, InterfaceC2492b.a aVar, g0 g0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, k0Var, interfaceC2494d, q10, hVar, aVar, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T r1(T t10, InterfaceC2494d interfaceC2494d) {
        oi.n nVar = t10.f3409E;
        k0 k0VarP1 = t10.p1();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = interfaceC2494d.getAnnotations();
        InterfaceC2492b.a aVarH = interfaceC2494d.h();
        AbstractC6492s.h(aVarH, "getKind(...)");
        g0 g0VarJ = t10.p1().j();
        AbstractC6492s.h(g0VarJ, "getSource(...)");
        T t11 = new T(nVar, k0VarP1, interfaceC2494d, t10, annotations, aVarH, g0VarJ);
        G0 g0C = f3407I.c(t10.p1());
        if (g0C == null) {
            return null;
        }
        b0 b0VarD0 = interfaceC2494d.d0();
        b0 b0VarC = b0VarD0 != null ? b0VarD0.c(g0C) : null;
        List listP0 = interfaceC2494d.p0();
        AbstractC6492s.h(listP0, "getContextReceiverParameters(...)");
        List list = listP0;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b0) it.next()).c(g0C));
        }
        t11.R0(null, b0VarC, arrayList, t10.p1().w(), t10.i(), t10.getReturnType(), Bh.D.FINAL, t10.p1().getVisibility());
        return t11;
    }

    @Override // Bh.InterfaceC2502l
    public boolean B() {
        return n0().B();
    }

    @Override // Bh.InterfaceC2502l
    public InterfaceC2495e C() {
        InterfaceC2495e interfaceC2495eC = n0().C();
        AbstractC6492s.h(interfaceC2495eC, "getConstructedClass(...)");
        return interfaceC2495eC;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2491a
    public pi.S getReturnType() {
        pi.S returnType = super.getReturnType();
        AbstractC6492s.f(returnType);
        return returnType;
    }

    @Override // Bh.InterfaceC2492b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public Q c0(InterfaceC2503m newOwner, Bh.D modality, AbstractC2510u visibility, InterfaceC2492b.a kind, boolean z10) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(modality, "modality");
        AbstractC6492s.i(visibility, "visibility");
        AbstractC6492s.i(kind, "kind");
        InterfaceC2515z interfaceC2515zA = v().p(newOwner).h(modality).f(visibility).s(kind).m(z10).a();
        AbstractC6492s.g(interfaceC2515zA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC2515zA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.AbstractC2612s
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public T L0(InterfaceC2503m newOwner, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a kind, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, g0 source) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(source, "source");
        InterfaceC2492b.a aVar = InterfaceC2492b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC2492b.a aVar2 = InterfaceC2492b.a.SYNTHESIZED;
        }
        return new T(this.f3409E, p1(), n0(), this, annotations, aVar, source);
    }

    @Override // Dh.Q
    public InterfaceC2494d n0() {
        return this.f3412H;
    }

    @Override // Dh.AbstractC2608n, Bh.InterfaceC2503m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public k0 b() {
        return p1();
    }

    @Override // Dh.AbstractC2612s, Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public Q a() {
        InterfaceC2515z interfaceC2515zA = super.a();
        AbstractC6492s.g(interfaceC2515zA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC2515zA;
    }

    public k0 p1() {
        return this.f3410F;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z, Bh.i0
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public Q c(G0 substitutor) {
        AbstractC6492s.i(substitutor, "substitutor");
        InterfaceC2515z interfaceC2515zC = super.c(substitutor);
        AbstractC6492s.g(interfaceC2515zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        T t10 = (T) interfaceC2515zC;
        G0 g0F = G0.f(t10.getReturnType());
        AbstractC6492s.h(g0F, "create(...)");
        InterfaceC2494d interfaceC2494dC = n0().a().c(g0F);
        if (interfaceC2494dC == null) {
            return null;
        }
        t10.f3412H = interfaceC2494dC;
        return t10;
    }

    private T(oi.n nVar, k0 k0Var, InterfaceC2494d interfaceC2494d, Q q10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, InterfaceC2492b.a aVar, g0 g0Var) {
        super(k0Var, q10, hVar, Zh.h.f25430j, aVar, g0Var);
        this.f3409E = nVar;
        this.f3410F = k0Var;
        V0(p1().F0());
        this.f3411G = nVar.b(new S(this, interfaceC2494d));
        this.f3412H = interfaceC2494d;
    }
}
