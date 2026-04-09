package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.D;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2512w;
import Bh.Y;
import Bh.Z;
import Bh.a0;
import Bh.b0;
import Bh.g0;
import Dh.K;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.G0;
import pi.S;

/* loaded from: classes4.dex */
public final class f implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ K f52185a;

    public f() {
        l lVar = l.f52198a;
        K kO0 = K.O0(lVar.h(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), D.OPEN, AbstractC2509t.f1796e, true, Zh.f.n(b.ERROR_PROPERTY.getDebugText()), InterfaceC2492b.a.DECLARATION, g0.f1784a, false, false, false, false, false, false);
        kO0.b1(lVar.k(), AbstractC3689v.l(), null, null, AbstractC3689v.l());
        this.f52185a = kO0;
    }

    @Override // Bh.t0
    public boolean A() {
        return this.f52185a.A();
    }

    @Override // Bh.C
    public boolean F0() {
        return this.f52185a.F0();
    }

    @Override // Bh.InterfaceC2491a
    public boolean H() {
        return this.f52185a.H();
    }

    @Override // Bh.C
    public boolean L() {
        return this.f52185a.L();
    }

    @Override // Bh.u0
    public boolean N() {
        return this.f52185a.N();
    }

    @Override // Bh.t0
    public AbstractC5398g V() {
        return this.f52185a.V();
    }

    @Override // Bh.InterfaceC2503m
    public Y a() {
        Y yA = this.f52185a.a();
        AbstractC6492s.h(yA, "getOriginal(...)");
        return yA;
    }

    @Override // Bh.InterfaceC2504n, Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        InterfaceC2503m interfaceC2503mB = this.f52185a.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        return interfaceC2503mB;
    }

    @Override // Bh.i0
    public Y c(G0 substitutor) {
        AbstractC6492s.i(substitutor, "substitutor");
        return this.f52185a.c(substitutor);
    }

    @Override // Bh.InterfaceC2492b
    public InterfaceC2492b c0(InterfaceC2503m interfaceC2503m, D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        Y yN0 = this.f52185a.c0(interfaceC2503m, d10, abstractC2510u, aVar, z10);
        AbstractC6492s.h(yN0, "copy(...)");
        return yN0;
    }

    @Override // Bh.Y
    public Z d() {
        return this.f52185a.d();
    }

    @Override // Bh.InterfaceC2491a
    public b0 d0() {
        return this.f52185a.d0();
    }

    @Override // Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a interfaceC0071a) {
        return this.f52185a.e0(interfaceC0071a);
    }

    @Override // Bh.Y, Bh.InterfaceC2492b, Bh.InterfaceC2491a
    public Collection f() {
        Collection collectionF = this.f52185a.f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        return collectionF;
    }

    @Override // Bh.Y
    public a0 g() {
        return this.f52185a.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = this.f52185a.getAnnotations();
        AbstractC6492s.h(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // Bh.I
    public Zh.f getName() {
        Zh.f name = this.f52185a.getName();
        AbstractC6492s.h(name, "getName(...)");
        return name;
    }

    @Override // Bh.InterfaceC2491a
    public S getReturnType() {
        return this.f52185a.getReturnType();
    }

    @Override // Bh.r0
    public S getType() {
        S type = this.f52185a.getType();
        AbstractC6492s.h(type, "getType(...)");
        return type;
    }

    @Override // Bh.InterfaceC2491a
    public List getTypeParameters() {
        List typeParameters = this.f52185a.getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u visibility = this.f52185a.getVisibility();
        AbstractC6492s.h(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // Bh.InterfaceC2492b
    public InterfaceC2492b.a h() {
        InterfaceC2492b.a aVarH = this.f52185a.h();
        AbstractC6492s.h(aVarH, "getKind(...)");
        return aVarH;
    }

    @Override // Bh.t0
    public boolean h0() {
        return this.f52185a.h0();
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        List listI = this.f52185a.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        return listI;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return this.f52185a.isExternal();
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 g0VarJ = this.f52185a.j();
        AbstractC6492s.h(g0VarJ, "getSource(...)");
        return g0VarJ;
    }

    @Override // Bh.InterfaceC2491a
    public b0 k0() {
        return this.f52185a.k0();
    }

    @Override // Bh.C
    public D l() {
        D dL = this.f52185a.l();
        AbstractC6492s.h(dL, "getModality(...)");
        return dL;
    }

    @Override // Bh.Y
    public InterfaceC2512w l0() {
        return this.f52185a.l0();
    }

    @Override // Bh.Y
    public InterfaceC2512w o0() {
        return this.f52185a.o0();
    }

    @Override // Bh.InterfaceC2491a
    public List p0() {
        List listP0 = this.f52185a.p0();
        AbstractC6492s.h(listP0, "getContextReceiverParameters(...)");
        return listP0;
    }

    @Override // Bh.t0
    public boolean q0() {
        return this.f52185a.q0();
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return this.f52185a.t0(interfaceC2505o, obj);
    }

    @Override // Bh.Y
    public List x() {
        List listX = this.f52185a.x();
        AbstractC6492s.h(listX, "getAccessors(...)");
        return listX;
    }

    @Override // Bh.InterfaceC2492b
    public void x0(Collection overriddenDescriptors) {
        AbstractC6492s.i(overriddenDescriptors, "overriddenDescriptors");
        this.f52185a.x0(overriddenDescriptors);
    }
}
