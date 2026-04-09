package Li;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* renamed from: Li.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3217d extends Mi.d {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f11906d;

    public AbstractC3217d(InterfaceC6839p interfaceC6839p, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC5384i, i10, aVar);
        this.f11906d = interfaceC6839p;
    }

    static /* synthetic */ Object p(AbstractC3217d abstractC3217d, Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        Object objInvoke = abstractC3217d.f11906d.invoke(tVar, interfaceC5380e);
        return objInvoke == AbstractC5467b.g() ? objInvoke : Yg.J.f24997a;
    }

    @Override // Mi.d
    protected Object g(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        return p(this, tVar, interfaceC5380e);
    }

    @Override // Mi.d
    public String toString() {
        return "block[" + this.f11906d + "] -> " + super.toString();
    }
}
