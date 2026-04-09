package Rh;

import Bh.InterfaceC2495e;
import Bh.s0;
import Jh.C3110d;
import Jh.EnumC3109c;
import Nh.C3383j;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.J0;
import pi.L0;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
final class g0 extends AbstractC3476d {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f19920a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19921b;

    /* renamed from: c, reason: collision with root package name */
    private final Mh.k f19922c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3109c f19923d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19924e;

    public /* synthetic */ g0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Mh.k kVar, EnumC3109c enumC3109c, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, kVar, enumC3109c, (i10 & 16) != 0 ? false : z11);
    }

    @Override // Rh.AbstractC3476d
    public boolean B(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return kotlin.reflect.jvm.internal.impl.builtins.i.e0((pi.S) interfaceC7618i);
    }

    @Override // Rh.AbstractC3476d
    public boolean C() {
        return this.f19921b;
    }

    @Override // Rh.AbstractC3476d
    public boolean D(InterfaceC7618i interfaceC7618i, InterfaceC7618i other) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        AbstractC6492s.i(other, "other");
        return this.f19922c.a().k().b((pi.S) interfaceC7618i, (pi.S) other);
    }

    @Override // Rh.AbstractC3476d
    public boolean E(ri.n nVar) {
        AbstractC6492s.i(nVar, "<this>");
        return nVar instanceof Nh.c0;
    }

    @Override // Rh.AbstractC3476d
    public boolean F(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return ((pi.S) interfaceC7618i).Q0() instanceof C3482j;
    }

    @Override // Rh.AbstractC3476d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(cVar, "<this>");
        return ((cVar instanceof Lh.g) && ((Lh.g) cVar).d()) || ((cVar instanceof C3383j) && !u() && (((C3383j) cVar).m() || q() == EnumC3109c.TYPE_PARAMETER_BOUNDS)) || (interfaceC7618i != null && kotlin.reflect.jvm.internal.impl.builtins.i.q0((pi.S) interfaceC7618i) && m().p(cVar) && !this.f19922c.a().q().c());
    }

    @Override // Rh.AbstractC3476d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C3110d m() {
        return this.f19922c.a().a();
    }

    @Override // Rh.AbstractC3476d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public pi.S v(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return L0.a((pi.S) interfaceC7618i);
    }

    @Override // Rh.AbstractC3476d
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public ri.q A() {
        return kotlin.reflect.jvm.internal.impl.types.checker.s.f52171a;
    }

    @Override // Rh.AbstractC3476d
    public Iterable n(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return ((pi.S) interfaceC7618i).getAnnotations();
    }

    @Override // Rh.AbstractC3476d
    public Iterable p() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f19920a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? AbstractC3689v.l() : annotations;
    }

    @Override // Rh.AbstractC3476d
    public EnumC3109c q() {
        return this.f19923d;
    }

    @Override // Rh.AbstractC3476d
    public Jh.E r() {
        return this.f19922c.b();
    }

    @Override // Rh.AbstractC3476d
    public boolean s() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f19920a;
        return (aVar instanceof s0) && ((s0) aVar).j0() != null;
    }

    @Override // Rh.AbstractC3476d
    protected C3484l t(C3484l c3484l, Jh.w wVar) {
        C3484l c3484lB;
        if (c3484l != null && (c3484lB = C3484l.b(c3484l, EnumC3483k.NOT_NULL, false, 2, null)) != null) {
            return c3484lB;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    @Override // Rh.AbstractC3476d
    public boolean u() {
        return this.f19922c.a().q().d();
    }

    @Override // Rh.AbstractC3476d
    public Zh.d x(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC2495e interfaceC2495eF = J0.f((pi.S) interfaceC7618i);
        if (interfaceC2495eF != null) {
            return bi.i.m(interfaceC2495eF);
        }
        return null;
    }

    @Override // Rh.AbstractC3476d
    public boolean z() {
        return this.f19924e;
    }

    public g0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Mh.k containerContext, EnumC3109c containerApplicabilityType, boolean z11) {
        AbstractC6492s.i(containerContext, "containerContext");
        AbstractC6492s.i(containerApplicabilityType, "containerApplicabilityType");
        this.f19920a = aVar;
        this.f19921b = z10;
        this.f19922c = containerContext;
        this.f19923d = containerApplicabilityType;
        this.f19924e = z11;
    }
}
