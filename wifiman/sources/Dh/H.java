package Dh;

import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.g0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class H extends AbstractC2608n implements Bh.M {

    /* renamed from: e, reason: collision with root package name */
    private final Zh.c f3350e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Bh.G module, Zh.c fqName) {
        super(module, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), fqName.h(), g0.f1784a);
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(fqName, "fqName");
        this.f3350e = fqName;
        this.f3351f = "package " + fqName + " of " + module;
    }

    @Override // Bh.M
    public final Zh.c e() {
        return this.f3350e;
    }

    @Override // Dh.AbstractC2608n, Bh.InterfaceC2506p
    public g0 j() {
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o visitor, Object obj) {
        AbstractC6492s.i(visitor, "visitor");
        return visitor.k(this, obj);
    }

    @Override // Dh.AbstractC2607m
    public String toString() {
        return this.f3351f;
    }

    @Override // Dh.AbstractC2608n, Bh.InterfaceC2503m
    public Bh.G b() {
        InterfaceC2503m interfaceC2503mB = super.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (Bh.G) interfaceC2503mB;
    }
}
