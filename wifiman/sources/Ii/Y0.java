package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public final class Y0 extends Ni.y {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f9295e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public Y0(InterfaceC5384i interfaceC5384i, InterfaceC5380e interfaceC5380e) {
        Z0 z02 = Z0.f9297a;
        super(interfaceC5384i.get(z02) == null ? interfaceC5384i.plus(z02) : interfaceC5384i, interfaceC5380e);
        this.f9295e = new ThreadLocal();
        if (interfaceC5380e.getContext().get(InterfaceC5381f.f46086m0) instanceof J) {
            return;
        }
        Object objI = Ni.J.i(interfaceC5384i, null);
        Ni.J.f(interfaceC5384i, objI);
        U0(interfaceC5384i, objI);
    }

    private final void T0() {
        if (this.threadLocalIsSet) {
            Yg.s sVar = (Yg.s) this.f9295e.get();
            if (sVar != null) {
                Ni.J.f((InterfaceC5384i) sVar.a(), sVar.c());
            }
            this.f9295e.remove();
        }
    }

    @Override // Ni.y, Ii.AbstractC3043a
    protected void N0(Object obj) {
        T0();
        Object objA = D.a(obj, this.f16627d);
        InterfaceC5380e interfaceC5380e = this.f16627d;
        InterfaceC5384i context = interfaceC5380e.getContext();
        Object objI = Ni.J.i(context, null);
        Y0 y0M = objI != Ni.J.f16576a ? H.m(interfaceC5380e, context, objI) : null;
        try {
            this.f16627d.resumeWith(objA);
            Yg.J j10 = Yg.J.f24997a;
        } finally {
            if (y0M == null || y0M.S0()) {
                Ni.J.f(context, objI);
            }
        }
    }

    @Override // Ni.y
    public void R0() {
        T0();
    }

    public final boolean S0() {
        boolean z10 = this.threadLocalIsSet && this.f9295e.get() == null;
        this.f9295e.remove();
        return !z10;
    }

    public final void U0(InterfaceC5384i interfaceC5384i, Object obj) {
        this.threadLocalIsSet = true;
        this.f9295e.set(Yg.z.a(interfaceC5384i, obj));
    }
}
