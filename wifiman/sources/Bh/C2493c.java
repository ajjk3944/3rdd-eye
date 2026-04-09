package Bh;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.N0;

/* renamed from: Bh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2493c implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f1772a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2503m f1773b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1774c;

    public C2493c(l0 originalDescriptor, InterfaceC2503m declarationDescriptor, int i10) {
        AbstractC6492s.i(originalDescriptor, "originalDescriptor");
        AbstractC6492s.i(declarationDescriptor, "declarationDescriptor");
        this.f1772a = originalDescriptor;
        this.f1773b = declarationDescriptor;
        this.f1774c = i10;
    }

    @Override // Bh.l0
    public boolean G() {
        return this.f1772a.G();
    }

    @Override // Bh.InterfaceC2504n, Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        return this.f1773b;
    }

    @Override // Bh.l0
    public oi.n g0() {
        oi.n nVarG0 = this.f1772a.g0();
        AbstractC6492s.h(nVarG0, "getStorageManager(...)");
        return nVarG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return this.f1772a.getAnnotations();
    }

    @Override // Bh.l0
    public int getIndex() {
        return this.f1774c + this.f1772a.getIndex();
    }

    @Override // Bh.I
    public Zh.f getName() {
        Zh.f name = this.f1772a.getName();
        AbstractC6492s.h(name, "getName(...)");
        return name;
    }

    @Override // Bh.l0
    public List getUpperBounds() {
        List upperBounds = this.f1772a.getUpperBounds();
        AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 g0VarJ = this.f1772a.j();
        AbstractC6492s.h(g0VarJ, "getSource(...)");
        return g0VarJ;
    }

    @Override // Bh.l0, Bh.InterfaceC2498h
    public pi.v0 k() {
        pi.v0 v0VarK = this.f1772a.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return v0VarK;
    }

    @Override // Bh.l0
    public boolean m0() {
        return true;
    }

    @Override // Bh.l0
    public N0 p() {
        N0 n0P = this.f1772a.p();
        AbstractC6492s.h(n0P, "getVariance(...)");
        return n0P;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return this.f1772a.t0(interfaceC2505o, obj);
    }

    public String toString() {
        return this.f1772a + "[inner-copy]";
    }

    @Override // Bh.InterfaceC2498h
    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0U = this.f1772a.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        return abstractC7346d0U;
    }

    @Override // Bh.InterfaceC2503m
    public l0 a() {
        l0 l0VarA = this.f1772a.a();
        AbstractC6492s.h(l0VarA, "getOriginal(...)");
        return l0VarA;
    }
}
