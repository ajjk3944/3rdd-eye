package Ii;

import Yg.u;
import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
final class O0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5380e f9278e;

    public O0(InterfaceC5380e interfaceC5380e) {
        this.f9278e = interfaceC5380e;
    }

    @Override // Ii.C0
    public boolean u() {
        return false;
    }

    @Override // Ii.C0
    public void v(Throwable th2) {
        InterfaceC5380e interfaceC5380e = this.f9278e;
        u.a aVar = Yg.u.f25017b;
        interfaceC5380e.resumeWith(Yg.u.c(Yg.J.f24997a));
    }
}
