package Dh;

import Bh.InterfaceC2503m;
import Bh.g0;
import di.AbstractC5398g;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class Y extends X {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3426f;

    /* renamed from: g, reason: collision with root package name */
    protected oi.j f3427g;

    /* renamed from: h, reason: collision with root package name */
    protected InterfaceC6824a f3428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, pi.S s10, boolean z10, g0 g0Var) {
        super(interfaceC2503m, hVar, fVar, s10, g0Var);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
        if (g0Var == null) {
            I(3);
        }
        this.f3426f = z10;
    }

    private static /* synthetic */ void I(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(oi.j jVar, InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            I(5);
        }
        this.f3428h = interfaceC6824a;
        if (jVar == null) {
            jVar = (oi.j) interfaceC6824a.invoke();
        }
        this.f3427g = jVar;
    }

    public void L0(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            I(4);
        }
        K0(null, interfaceC6824a);
    }

    @Override // Bh.t0
    public AbstractC5398g V() {
        oi.j jVar = this.f3427g;
        if (jVar != null) {
            return (AbstractC5398g) jVar.invoke();
        }
        return null;
    }

    @Override // Bh.t0
    public boolean h0() {
        return this.f3426f;
    }
}
