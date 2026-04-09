package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
final class C extends AbstractC3214a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f11832a;

    public C(InterfaceC6839p interfaceC6839p) {
        this.f11832a = interfaceC6839p;
    }

    @Override // Li.AbstractC3214a
    public Object e(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        Object objInvoke = this.f11832a.invoke(interfaceC3221h, interfaceC5380e);
        return objInvoke == AbstractC5467b.g() ? objInvoke : Yg.J.f24997a;
    }
}
